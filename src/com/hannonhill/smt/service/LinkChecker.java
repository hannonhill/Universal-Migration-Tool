/*
 * Created on Dec 21, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.StringReader;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang.xwork.StringUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.CascadeAssetInformation;
import com.hannonhill.smt.LinkCheckingStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.smt.util.XmlUtil;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType;
import com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock;

/**
 * Supplies methods related to link checking
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class LinkChecker
{
    private static final String LINK_XPATH = "//a | //img | //script | //link ";

    /**
     * Checks all the links in the pages that were created during migration
     * (projectInformation.getMigrationStatus().getCreatedPages())
     * 
     * @param projectInformation
     */
    public static void checkLinks(ProjectInformation projectInformation)
    {
        LinkCheckingStatus linkCheckingStatus = projectInformation.getLinkCheckingStatus();

        for (CascadeAssetInformation block : projectInformation.getMigrationStatus().getCreatedBlocks())
        {
            if (linkCheckingStatus.isShouldStop())
                return;

            Log.add("Checking links for block " + PathUtil.generateBlockLink(block, projectInformation.getUrl()) + "<br/>", linkCheckingStatus);

            try
            {
                checkLinksForXhtmlBlock(block.getId(), projectInformation);
                linkCheckingStatus.incrementAssetsChecked();
            }
            catch (Exception e)
            {
                Log.add("<span style=\"color: red;\">Error: " + e.getMessage() + "</span><br/>", linkCheckingStatus);
                e.printStackTrace();
                linkCheckingStatus.incrementAssetsWithErrors();
            }

            linkCheckingStatus.incrementProgress(1);
        }

        for (CascadeAssetInformation page : projectInformation.getMigrationStatus().getCreatedPages())
        {
            if (linkCheckingStatus.isShouldStop())
                return;

            Log.add("Checking links for page " + PathUtil.generatePageLink(page, projectInformation.getUrl()) + "<br/>", linkCheckingStatus);

            try
            {
                checkLinks(page.getId(), projectInformation);
                linkCheckingStatus.incrementAssetsChecked();
            }
            catch (Exception e)
            {
                Log.add("<span style=\"color: red;\">Error: " + e.getMessage() + "</span><br/>", linkCheckingStatus);
                e.printStackTrace();
                linkCheckingStatus.incrementAssetsWithErrors();
            }

            linkCheckingStatus.incrementProgress(1);
        }
    }

    /**
     * Checks the links in a page with given id.
     * 
     * @param pageId
     * @param projectInformation
     * @throws Exception
     */
    private static void checkLinks(String pageId, ProjectInformation projectInformation) throws Exception
    {
        Page cascadePage = WebServices.readPage(pageId, projectInformation);
        String xhtml = cascadePage.getXhtml();
        if (xhtml != null)
            checkLinksFromXml(projectInformation, xhtml);
        else
            checkLinks(projectInformation, cascadePage.getStructuredData().getStructuredDataNodes());
    }

    /**
     * Checks the links in an XHTML Block with given id.
     * 
     * @param pageId
     * @param projectInformation
     * @throws Exception
     */
    private static void checkLinksForXhtmlBlock(String blockId, ProjectInformation projectInformation) throws Exception
    {
        XhtmlDataDefinitionBlock block = WebServices.readXhtmlBlock(blockId, projectInformation);
        String xhtml = block.getXhtml();
        if (xhtml != null)
            checkLinksFromXml(projectInformation, xhtml);
    }

    /**
     * Checks links in all the structured data text nodes recursively
     * 
     * @param projectInformation
     * @param nodes
     * @throws Exception
     */
    private static void checkLinks(ProjectInformation projectInformation, StructuredDataNode[] nodes) throws Exception
    {
        for (StructuredDataNode node : nodes)
        {
            StructuredDataType nodeType = node.getType();
            if (StructuredDataType.group.equals(nodeType))
                checkLinks(projectInformation, node.getStructuredDataNodes());
            else if (StructuredDataType.text.equals(nodeType))
                checkLinksFromXml(projectInformation, node.getText());
        }
    }

    /**
     * Checks links in the provided XML
     * 
     * @param projectInformation
     * @param xml
     * @throws Exception
     */
    private static void checkLinksFromXml(ProjectInformation projectInformation, String xml) throws Exception
    {
        // To make things faster, if it's an empty string, just quit
        if (xml == null || xml.equals(""))
            return;

        // Wrap XML in the root tags
        xml = XmlUtil.addRootTag(xml);

        // Evaluate an XPath
        XPath xpath = XPathFactory.newInstance().newXPath();
        InputSource inputSource = new InputSource(new StringReader(xml));
        NodeList nodes = (NodeList) xpath.evaluate(LINK_XPATH, inputSource, XPathConstants.NODESET);

        if (nodes == null)
            return;

        // Check link for each node that the XPath returned
        for (int i = 0; i < nodes.getLength(); i++)
            checkLink(projectInformation, nodes.item(i));
    }

    /**
     * Checks the link in provided Node if it is a Cascade link
     * 
     * @param projectInformation
     * @param node
     * @throws Exception
     */
    private static void checkLink(ProjectInformation projectInformation, Node node) throws Exception
    {
        String path = getPath(node);

        if (StringUtils.isEmpty(path))
            return;

        if (!PathUtil.isLinkCascade(path))
            return;

        // strip an anchor if exists
        path = PathUtil.getPartWithoutAnchor(path);

        String label = getLabel(node);
        LinkCheckingStatus linkCheckingStatus = projectInformation.getLinkCheckingStatus();

        // Check if the link is valid by looking into the cache first
        boolean validLink;
        if (linkCheckingStatus.getValidLinkCache().contains(path))
            validLink = true;
        else if (linkCheckingStatus.getInvalidLinkCache().contains(path))
            validLink = false;
        else
        {
            // If cache doesn't contain the link, check if it is a valid link through web services and then
            // add it to the cache
            validLink = WebServices.getAssetId(path, projectInformation) != null;

            if (validLink)
                linkCheckingStatus.getValidLinkCache().add(path);
            else
                linkCheckingStatus.getInvalidLinkCache().add(path);
        }

        // Update the status depending on whether or not the link is valid
        if (validLink)
            linkCheckingStatus.incrementsCorrectLinks();
        else
        {
            linkCheckingStatus.incrementBrokenLinks();
            Log.add("<span style=\"padding-left: 20px;color:orange;\">Broken link " + label + " pointing to " + path + "</span><br/>",
                    linkCheckingStatus);
        }
    }

    /**
     * Gets the link's path from the XML node. If it is a &ltimg&gt; or &lt;script&gt; tag, it looks into the
     * "src" attribute.
     * In other tags, it looks into the "href" attribute.
     * 
     * @param node
     * @return
     */
    private static String getPath(Node node)
    {
        String tagName = node.getNodeName();

        // img and script tags have src attribute
        if (tagName.equals("img") || tagName.equals("script"))
            return XmlUtil.getAttribute(node, "src");

        // others have href attribute
        return XmlUtil.getAttribute(node, "href");
    }

    /**
     * Gets the link's label from the XML node. If it is a &ltimg&gt; tag, it looks into the "alt" attribute.
     * If it's &lt;a&gt; tag, it looks into the body of the tag. For other tags, it returns an empty string.
     * 
     * @param node
     * @return
     */
    private static String getLabel(Node node)
    {
        String tagName = node.getNodeName();

        if (tagName.equals("img"))
            return XmlUtil.getAttribute(node, "alt");
        else if (tagName.equals("a"))
            return node.getTextContent();

        return "";
    }

}
