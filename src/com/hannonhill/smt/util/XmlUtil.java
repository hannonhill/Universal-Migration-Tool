/*
 * Created on Dec 14, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.util;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Text;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/**
 * Utility class with methods related to XML modifications
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class XmlUtil
{
    /**
     * Converts the xml from given input source into a structure of Node elements, returning the root node. If
     * the source comes from a String, use new InputSource(new StringReader(xmlString)). If the source comes
     * from a File, use new InputSource(new FileInputStream(file)).
     * 
     * @param inputSource
     * @return
     * @throws Exception
     */
    public static Node convertXmlToNodeStructure(InputSource inputSource) throws Exception
    {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        docBuilder.setErrorHandler(new EmptyErrorHandler());
        return docBuilder.parse(inputSource).getChildNodes().item(0);
    }

    /**
     * Adds a <root> tag around the given xml string
     * 
     * @param xml
     * @return
     */
    public static String addRootTag(String xml)
    {
        return "<root>" + xml + "</root>";
    }

    /**
     * Removes a <root> tag from around the given xml string.
     * 
     * @param xmlWithRoot
     * @return
     */
    public static String removeRootTag(String xmlWithRoot)
    {
        return xmlWithRoot.substring(6, xmlWithRoot.length() - 7);
    }

    /**
     * A safe way of getting attribute value of attribute with given name. If attribute with given name
     * doesn't exist, returns null (instead of NPE).
     * 
     * @param node
     * @param attributeName
     * @return
     */
    public static String getAttribute(Node node, String attributeName)
    {
        if (node == null)
            return null;

        NamedNodeMap attributes = node.getAttributes();
        if (attributes == null)
            return null;

        Node attribute = attributes.getNamedItem(attributeName);
        if (attribute == null)
            return null;

        return attribute.getTextContent();
    }

    /**
     * Evaluates given xPathExpression on given xmlContents
     * 
     * @param xmlContents
     * @param xPathExpression
     * @return
     * @throws Exception
     */
    public static String evaluateXPathExpression(String xmlContents, String xPathExpression) throws Exception
    {
        // JTidy adds a namespace, which causes many issues with xpath
        xmlContents = xmlContents.replaceAll("xmlns=\"http://www.w3.org/1999/xhtml\"", "");

        SAXBuilder builder = new SAXBuilder();
        InputSource inputSource = new InputSource(new ByteArrayInputStream(xmlContents.getBytes("UTF-8")));
        Document doc = builder.build(inputSource);

        List<?> result = XPath.selectNodes(doc, xPathExpression);

        if (result.size() == 0)
            return "";

        // If the result contains Strings output them
        if (result.get(0) instanceof String)
            return outputStrings(result);

        // If the result contains Attributes output their values
        if (result.get(0) instanceof Attribute)
            return outputAttributes(result);

        // If the xpath expression expects a text (ends with "/text()"), output the Text objects using
        // getText() method since XMLOutputter fails to unescape XML entities
        if (xPathExpression.endsWith("/text()"))
            return outputTexts(result);

        // Otherwise, let the XMLOutputter handle outputting (it can't handle Attributes or Strings)
        return new XMLOutputter().outputString(result);
    }

    /**
     * Converts a list of {@link Text} objects to String
     * 
     * @param texts
     * @return
     */
    private static String outputTexts(List<?> texts)
    {
        StringBuilder builder = new StringBuilder();
        for (Object text : texts)
            // Verify that this is an attribute first, if it is not, ignore it
            if (text instanceof Text)
                builder.append(((Text) text).getText());

        return builder.toString();
    }

    /**
     * Converts a list of Strings to a single String
     * 
     * @param strings
     * @return
     */
    private static String outputStrings(List<?> strings)
    {
        StringBuilder builder = new StringBuilder();
        for (Object string : strings)
            builder.append(string);

        return builder.toString();
    }

    /**
     * Converts a list of Attributes to a String containing attribute values
     * 
     * @param attributes
     * @return
     */
    private static String outputAttributes(List<?> attributes)
    {
        StringBuilder builder = new StringBuilder();
        for (Object attribute : attributes)
            // Verify that this is an attribute first, if it is not, ignore it
            if (attribute instanceof Attribute)
                builder.append(((Attribute) attribute).getValue());

        return builder.toString();
    }
}
