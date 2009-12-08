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
     * Rewrites all the file links in the content and metadata fields of the page.
     * 
     * @param page
     * @throws Exception
     */
    public static void rewriteFileLinks(DetailedXmlPageInformation page) throws Exception
    {
        String pagePath = page.getDeployPath();
        rewriteFileLinks(page.getContentMap(), pagePath);
        rewriteFileLinks(page.getMetadataMap(), pagePath);
    }

    /**
     * Rewrites all the file links in each value of the map.
     * 
     * @param map
     * @param pagePath
     * @throws Exception
     */
    private static void rewriteFileLinks(Map<String, String> map, String pagePath) throws Exception
    {
        for (String fieldIdentifier : map.keySet())
        {
            String content = map.get(fieldIdentifier);
            String newContent = rewriteFileLinks(content, pagePath);
            map.put(fieldIdentifier, newContent);
        }
    }

    /**
     * Rewrites all the file links in the xml.
     * 
     * @param xml
     * @param pagePath
     * @return
     * @throws Exception
     */
    private static String rewriteFileLinks(String xml, String pagePath) throws Exception
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
        rewriteFileLink(rootNode, pagePath);

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
     * Rewrites the file link in the xml tag node and all ancestor nodes
     * 
     * @param node
     * @param pagePath
     */
    private static void rewriteFileLink(Node node, String pagePath)
    {
        if (node.getNodeName().equals("img"))
            rewriteFileLink(node, "src", pagePath);
        if (node.getNodeName().equals("script"))
            rewriteFileLink(node, "src", pagePath);
        else if (node.getNodeName().equals("a"))
            rewriteFileLink(node, "href", pagePath);
        else if (node.getNodeName().equals("link"))
            rewriteFileLink(node, "href", pagePath);

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
            rewriteFileLink(children.item(i), pagePath);
    }

    /**
     * Rewrites a file link in the xml tag node's attribute of given attributeName
     * 
     * @param element
     * @param attributeName
     * @param pagePath
     */
    private static void rewriteFileLink(Node element, String attributeName, String pagePath)
    {
        Node attribute = element.getAttributes().getNamedItem(attributeName);
        if (attribute == null)
            return;

        String oldPath = attribute.getNodeValue();
        String newPath = convertRelativeToAbsolute(oldPath, pagePath);
        attribute.setNodeValue(newPath);
    }

    /**
     * Converts a relative path starting from currentLocation to an absolute path
     * 
     * @param relative
     * @param currentLocation
     * @return
     */
    private static String convertRelativeToAbsolute(String relative, String currentLocation)
    {
        // Don't convert empty strings
        if (relative.equals(""))
            return "";

        // Divide the relative path and current location into parts by slashes
        String[] oldParts = relative.split("/");
        String[] correctParts = currentLocation.split("/");

        StringBuilder newPath = new StringBuilder();
        int correctPartsCounter = correctParts.length - 1; // The counter starts at the last location and goes down
        int oldPartsIndex; // The index for the old parts starts at 0 and goes up

        // For each "../" decrement the counter
        for (oldPartsIndex = 0; oldPartsIndex < oldParts.length; oldPartsIndex++)
        {
            if (!oldParts[oldPartsIndex].equals(".."))
                break;

            correctPartsCounter--;
        }

        // Once we know how many times we went to parent folder using "../", we know the common part of the absolute path so we can build it
        for (int correctPartsIndex = 0; correctPartsIndex < correctPartsCounter; correctPartsIndex++)
            newPath.append("/" + correctParts[correctPartsIndex]);

        // After we have the common part, we get the rest of the relative part (after all the "../")
        for (; oldPartsIndex < oldParts.length; oldPartsIndex++)
            newPath.append("/" + oldParts[oldPartsIndex]);

        return newPath.toString();
    }
}
