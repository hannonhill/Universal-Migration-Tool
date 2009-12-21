/*
 * Created on Dec 8, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.smt.util.XmlUtil;

/**
 * A service responsible for link rewriting
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class LinkRewriter
{
    /**
     * Rewrites all the file and page links in the content and metadata fields of the page. If it is a page link (ends with any extension of the 
     * extensions in possibleExtensions set and is relative), the extension will be stripped. Also, removes the Serena specific attributes: 
     * cmid and collagestyle from all tags.
     * 
     * @param page
     * @param possibleExtensions
     * @throws Exception
     */
    public static void rewriteLinkAndRemoveSerenaAttributes(DetailedXmlPageInformation page, Set<String> possibleExtensions) throws Exception
    {
        String pagePath = page.getDeployPath();
        rewriteLinkAndRemoveSerenaAttributes(page.getContentMap(), pagePath, possibleExtensions);
        rewriteLinkAndRemoveSerenaAttributes(page.getMetadataMap(), pagePath, possibleExtensions);
    }

    /**
     * Rewrites all the file and page links in each value of the map. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped. Also, removes the Serena specific attributes: cmid and collagestyle from all tags.
     * 
     * @param map
     * @param pagePath
     * @param possibleExtensions
     * @throws Exception
     */
    private static void rewriteLinkAndRemoveSerenaAttributes(Map<String, String> map, String pagePath, Set<String> possibleExtensions)
            throws Exception
    {
        for (String fieldIdentifier : map.keySet())
        {
            String content = map.get(fieldIdentifier);
            String newContent = rewriteLinkAndRemoveSerenaAttributes(content, pagePath, possibleExtensions);
            map.put(fieldIdentifier, newContent);
        }
    }

    /**
     * Rewrites all the file and page links in the xml. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped. Also, removes the Serena specific attributes: cmid and collagestyle from all tags.
     * 
     * @param xml
     * @param pagePath
     * @param possibleExtensions
     * @return
     * @throws Exception
     */
    private static String rewriteLinkAndRemoveSerenaAttributes(String xml, String pagePath, Set<String> possibleExtensions) throws Exception
    {
        // To make things faster, if it's an empty string, just quit
        if (xml == null || xml.equals(""))
            return "";

        // Wrap content in the root tag so that it is always a valid xml
        xml = XmlUtil.addRootTag(xml);

        StringBuffer stringBuffer = new StringBuffer(xml);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(stringBuffer.toString().getBytes("UTF-8"));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(inputStream));

        Node rootNode = document.getChildNodes().item(0);
        rewriteLinkAndRemoveSerenaAttributes(rootNode, pagePath, possibleExtensions);

        // convert document to string
        DOMSource domSource = new DOMSource(document);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.transform(domSource, result);
        String resultWithRoot = writer.toString();

        // Remove the root tag
        String resultWithoutRoot = XmlUtil.removeRootTag(resultWithRoot);
        return resultWithoutRoot;
    }

    /**
     * Rewrites the file and page link in the xml tag node and all ancestor nodes. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped. Also, removes the Serena specific attributes: cmid and collagestyle from all tags.
     * 
     * @param node
     * @param pagePath
     * @param possibleExtensions
     */
    private static void rewriteLinkAndRemoveSerenaAttributes(Node node, String pagePath, Set<String> possibleExtensions)
    {
        if (node.getNodeName().equals("img"))
            rewriteLink(node, "src", pagePath, possibleExtensions);
        if (node.getNodeName().equals("script"))
            rewriteLink(node, "src", pagePath, possibleExtensions);
        else if (node.getNodeName().equals("a"))
            rewriteLink(node, "href", pagePath, possibleExtensions);
        else if (node.getNodeName().equals("link"))
            rewriteLink(node, "href", pagePath, possibleExtensions);

        removeSerenaAttributes(node);

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
            rewriteLinkAndRemoveSerenaAttributes(children.item(i), pagePath, possibleExtensions);
    }

    /**
     * Removes Serena specific attributes from the node if they exist
     * 
     * @param element
     */
    private static void removeSerenaAttributes(Node node)
    {
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null)
        {
            if (attributes.getNamedItem("cmid") != null)
                attributes.removeNamedItem("cmid");
            if (attributes.getNamedItem("collagestyle") != null)
                attributes.removeNamedItem("collagestyle");
        }
    }

    /**
     * Rewrites a file or page link in the xml tag node's attribute of given attributeName. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param element
     * @param attributeName
     * @param pagePath
     * @param possibleExtensions
     */
    private static void rewriteLink(Node element, String attributeName, String pagePath, Set<String> possibleExtensions)
    {
        Node attribute = element.getAttributes().getNamedItem(attributeName);
        if (attribute == null)
            return;

        String oldPath = attribute.getNodeValue();

        // split between the link part and the anchor part
        String withoutAnchor = PathUtil.getPartWithoutAnchor(oldPath);
        String anchor = PathUtil.getAnchorPart(oldPath);

        if (PathUtil.isLinkRelative(withoutAnchor))
        {
            String newPath = PathUtil.convertRelativeToAbsolute(withoutAnchor, pagePath);

            // If the link links to a file with extension that is one of the possible extensions used, that means it is a link to a page
            // and therefore, the extension in the link needs to be stripped
            String extension = PathUtil.getExtension(newPath);
            if (possibleExtensions.contains(extension))
                newPath = PathUtil.truncateExtension(newPath);

            // add the anchor part
            attribute.setNodeValue(newPath + anchor);
        }
    }
}
