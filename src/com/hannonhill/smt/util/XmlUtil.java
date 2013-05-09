/*
 * Created on Dec 14, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.util;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/**
 * Utility class with methods related to XML modifications
 * 
 * @author Artur Tomusiak
 * @version $Id$
 * @since 1.0
 */
public class XmlUtil
{
    /**
     * Converts the xml from given input source into a structure of Node elements, returning the root node. If
     * the source comes from a String, use
     * new InputSource(new StringReader(xmlString)). If the source comes from a File, use new InputSource(new
     * FileInputStream(file)).
     * 
     * @param inputSource
     * @return
     * @throws Exception
     */
    public static Node convertXmlToNodeStructure(InputSource inputSource) throws Exception
    {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
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
     * doesn't exist, returns null
     * (instead of NPE).
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
        XPath xPath = XPathFactory.newInstance().newXPath();
        InputSource inputSource = new InputSource(new ByteArrayInputStream(xmlContents.getBytes("UTF-8")));
        return xPath.evaluate(xPathExpression, inputSource);
    }
}
