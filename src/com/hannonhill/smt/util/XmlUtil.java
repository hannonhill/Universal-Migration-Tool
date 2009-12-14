/*
 * Created on Dec 14, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/**
 * Utility class with methods related to XML modifications
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class XmlUtil
{
    /**
     * Converts the xml from given input source into a structure of Node elements, returning the root node. If the source comes from a String, use 
     * new InputSource(new StringReader(xmlString)). If the source comes from a File, use new InputSource(new FileInputStream(file)).
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
}
