/*
 * Created on Dec 8, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.util.PathUtil;

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
     * Rewrites all the file and page links in the content and metadata fields of the page. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param page
     * @throws Exception
     */
    public static void rewriteLinks(DetailedXmlPageInformation page) throws Exception
    {
        String pagePath = page.getDeployPath();
        rewriteLinks(page.getContentMap(), pagePath);
        rewriteLinks(page.getMetadataMap(), pagePath);
    }

    /**
     * Rewrites all the file and page links in each value of the map. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param map
     * @param pagePath
     * @throws Exception
     */
    private static void rewriteLinks(Map<String, String> map, String pagePath) throws Exception
    {
        for (String fieldIdentifier : map.keySet())
        {
            String content = map.get(fieldIdentifier);
            String newContent = rewriteLinks(content, pagePath);
            map.put(fieldIdentifier, newContent);
        }
    }

    /**
     * Rewrites all the file and page links in the xml. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param xml
     * @param pagePath
     * @return
     * @throws Exception
     */
    private static String rewriteLinks(String xml, String pagePath) throws Exception
    {
        // To make things faster, if it's an empty string, just quit
        if (xml == null || xml.equals(""))
            return "";

        // Wrap content in the root tag so that it is always a valid xml
        xml = "<root>" + xml + "</root>";

        StringBuffer stringBuffer = new StringBuffer(xml);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(stringBuffer.toString().getBytes("UTF-8"));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(inputStream));

        Node rootNode = document.getChildNodes().item(0);
        rewriteLink(rootNode, pagePath);

        // convert document to string
        DOMSource domSource = new DOMSource(document);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.transform(domSource, result);
        String resultWithRoot = writer.toString();

        // Remove the root tags
        String resultWithoutRoot = resultWithRoot.substring(6, resultWithRoot.length() - 7);
        return resultWithoutRoot;
    }

    /**
     * Rewrites the file and page link in the xml tag node and all ancestor nodes. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param node
     * @param pagePath
     */
    private static void rewriteLink(Node node, String pagePath)
    {
        if (node.getNodeName().equals("img"))
            rewriteLink(node, "src", pagePath);
        if (node.getNodeName().equals("script"))
            rewriteLink(node, "src", pagePath);
        else if (node.getNodeName().equals("a"))
            rewriteLink(node, "href", pagePath);
        else if (node.getNodeName().equals("link"))
            rewriteLink(node, "href", pagePath);

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
            rewriteLink(children.item(i), pagePath);
    }

    /**
     * Rewrites a file or page link in the xml tag node's attribute of given attributeName. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped
     * 
     * @param element
     * @param attributeName
     * @param pagePath
     */
    private static void rewriteLink(Node element, String attributeName, String pagePath)
    {
        Node attribute = element.getAttributes().getNamedItem(attributeName);
        if (attribute == null)
            return;

        String oldPath = attribute.getNodeValue();

        if (PathUtil.isLinkRelative(oldPath))
        {
            String newPath = PathUtil.convertRelativeToAbsolute(oldPath, pagePath);

            if (newPath.endsWith(".html"))
                newPath = PathUtil.truncateExtension(newPath);

            attribute.setNodeValue(newPath);
        }
    }
}
