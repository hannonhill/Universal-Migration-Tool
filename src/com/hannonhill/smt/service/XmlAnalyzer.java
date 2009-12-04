/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.XmlPageInformation;
import com.hannonhill.smt.util.PathUtil;

/**
 * This class contains service methods for analyzing the xml file contents
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class XmlAnalyzer
{
    private static final String ASSET_TYPE_XPATH = "/asset/coreData/assetType/text()";
    private static final String METADATA_FIELDS_XPATH = "/asset/metaData/field";
    private static final String CONTENT_FIELDS_XPATH = "/asset/content/field";
    private static final String FILE_PROBLEM_MESSAGE = "There were problems with analyzing file ";

    /**
     * Analyzes a folder by going through each file in the folder and subfolders and calling {@link XmlAnalyzer#analyzeContentsOfXmlFile(File)}
     * on each xml file
     * 
     * @param folder
     * @param assetTypes
     * @param errorMessages
     */
    public static void analyzeFolder(File folder, ProjectInformation projectInformation, List<String> errorMessages)
    {
        List<File> files = getAllFiles(folder);
        for (File file : files)
            analyzeFile(file, projectInformation, errorMessages);
    }

    /**
     * Analyzes the data definition xml and returns a list of text fields
     * 
     * @param xml
     * @return
     * @throws Exception
     */
    public static List<Field> analyzeDataDefinitionXml(String xml) throws Exception
    {
        List<Field> returnList = new ArrayList<Field>();
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new InputSource(new StringReader(xml)));
        Node rootNode = doc.getChildNodes().item(0);
        NodeList children = rootNode.getChildNodes();
        analyzeDataDefinitionGroup(children, "", "", returnList);
        return returnList;
    }

    /**
     * Returns all the xml files in the folder and all sub-folders
     * 
     * @param projectInformation
     * @return
     */
    public static List<File> getAllFiles(File folder)
    {
        List<File> files = new ArrayList<File>();
        for (String fileString : folder.list())
        {
            File file = new File(folder.getAbsolutePath() + "/" + fileString);

            if (!file.isFile())
                files.addAll(getAllFiles(file));
            else if (file.getName().endsWith(".xml"))
                files.add(file);
        }
        return files;
    }

    /**
     * Parses an XML file and returns a Page object that contains all the necessary information for migration of that page into Cascade Server
     * 
     * @param file
     * @return
     * @throws Exception
     */
    public static DetailedXmlPageInformation parseXmlFile(File file) throws Exception
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new FileInputStream(file)));

        DetailedXmlPageInformation page = new DetailedXmlPageInformation();

        Node rootNode = document.getChildNodes().item(0);
        NodeList rootChildNodes = rootNode.getChildNodes();
        for (int i = 0; i < rootChildNodes.getLength(); i++)
        {
            Node rootChildNode = rootChildNodes.item(i);
            String rootChildNodeName = rootChildNode.getNodeName();
            if (rootChildNodeName.equals("coreData"))
                parseCoreData(rootChildNode, page);
        }

        return page;
    }

    /**
     * Parses the information contained in the xml file's &lt;coreData&gt; tag
     * 
     * @param coreDataNode
     * @param page
     */
    private static void parseCoreData(Node coreDataNode, DetailedXmlPageInformation page)
    {
        NodeList nodes = coreDataNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++)
        {
            Node node = nodes.item(i);
            String nodeName = node.getNodeName();
            if (nodeName.equals("deployPath"))
                page.setDeployPath(getCDataContent(node));
            else if (nodeName.equals("assetType"))
                page.setAssetType(getCDataContent(node));
        }
    }

    /**
     * Returns contents of the CDATA section or an empty string if no CDATA section was found.
     * 
     * @param nodeWithCData
     * @return
     */
    private static String getCDataContent(Node nodeWithCData)
    {
        NodeList nodes = nodeWithCData.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++)
        {
            Node node = nodes.item(i);
            String nodeName = node.getNodeName();
            if (nodeName.equals("#cdata-section"))
                return node.getNodeValue();
        }
        return "";
    }

    /**
     * Adds all the text fields to the returnList recursively
     * 
     * @param children
     * @param identifierPrefix
     * @param labelPrefix
     * @param returnList
     */
    private static void analyzeDataDefinitionGroup(NodeList children, String identifierPrefix, String labelPrefix, List<Field> returnList)
    {
        for (int i = 0; i < children.getLength(); i++)
        {
            Node node = children.item(i);

            // if node has no attributes, it must be a text node or comment node - ignore these
            if (node.getAttributes() == null)
                continue;

            // figure out the identifier
            String identifier = "";
            Node identifierNode = node.getAttributes().getNamedItem("identifier");
            if (identifierNode != null)
                identifier = identifierNode.getTextContent();

            // figure out the identifier - or use label if identifier doesn't exist
            String label = "";
            Node labelNode = node.getAttributes().getNamedItem("label");
            if (labelNode != null)
                label = labelNode.getTextContent();
            else
                label = identifier;

            // If group - go recursively, if text - add to the field list. Ignore asset choosers.
            if (node.getNodeName().equals("group"))
                analyzeDataDefinitionGroup(node.getChildNodes(), identifierPrefix + identifier + "/", labelPrefix + label + "/", returnList);
            else if (node.getNodeName().equals("text"))
                returnList.add(new Field(identifierPrefix + identifier, labelPrefix + label, FieldType.DATA_DEFINITION));
        }
    }

    /**
     * Analyzes a file using the {@link XmlAnalyzer#analyzeContentsOfXmlFile(File)} method. If exception occurs, adds
     * an error message to the existing list of error messages. Adds the information that was analyzed to the project information.
     * 
     * @param file
     * @param projectInformation
     * @param errorMessages
     */
    private static void analyzeFile(File file, ProjectInformation projectInformation, List<String> errorMessages)
    {
        try
        {
            XmlPageInformation xmlPageInformation = XmlAnalyzer.analyzeContentsOfXmlFile(file);

            // get existing asset type from the map or create a new one and add it to the map
            AssetType assetType = projectInformation.getAssetTypes().get(xmlPageInformation.getAssetTypeName());
            if (assetType == null)
            {
                String assetTypeName = xmlPageInformation.getAssetTypeName();
                assetType = new AssetType(assetTypeName);
                projectInformation.getAssetTypes().put(assetTypeName, assetType);
            }

            assetType.getMetadataFields().addAll(xmlPageInformation.getMetadataFields()); // adds unique field names only
            assetType.getContentFields().addAll(xmlPageInformation.getContentFields()); // adds unique field names only
        }
        catch (Exception e)
        {
            // To build the file path that needs to be displayed, we show only the part of the abosute path after the xml directory 
            String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            errorMessages.add(FILE_PROBLEM_MESSAGE + relativePath + ": " + message);
        }
    }

    /**
     * Parses the contents of an XML file and returns the XmlPageInformation object with the information gathered from that file
     * 
     * @param file
     * @return
     */
    private static XmlPageInformation analyzeContentsOfXmlFile(File file) throws Exception
    {
        XmlPageInformation xmlPageInformation = new XmlPageInformation();

        findAssetType(file, xmlPageInformation);
        findMetadataFields(file, xmlPageInformation);
        findContentFields(file, xmlPageInformation);

        return xmlPageInformation;
    }

    /**
     * Analyzes the XML file and finds the Content Type name in it and assigns it to the XmlPageInformation object.
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findAssetType(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        String assetTypeName = xpath.evaluate(ASSET_TYPE_XPATH, inputSource);

        if (assetTypeName == null)
            throw new Exception("Asset type element could not be found");

        assetTypeName = assetTypeName.trim();
        xmlPageInformation.setAssetTypeName(assetTypeName);
    }

    /**
     * Analyzes the XML file and finds the Metadata field names in it and assigns them to the XmlPageInformation object.
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findMetadataFields(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList metadataFields = (NodeList) xpath.evaluate(METADATA_FIELDS_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < metadataFields.getLength(); i++)
        {
            Node metadataFieldNameNode = metadataFields.item(i).getAttributes().getNamedItem("name");
            if (metadataFieldNameNode == null)
                throw new Exception("The metadata <field> tag has no \"name\" attribute.");

            xmlPageInformation.getMetadataFields().add(metadataFieldNameNode.getNodeValue());
        }
    }

    /**
     * Analyzes the XML file and finds the Content filed names in it and assigns them to the XmlPageinformation object
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findContentFields(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList contentFields = (NodeList) xpath.evaluate(CONTENT_FIELDS_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < contentFields.getLength(); i++)
        {
            Node contentFieldNameNode = contentFields.item(i).getAttributes().getNamedItem("name");
            if (contentFieldNameNode == null)
                throw new Exception("The content <field> tag has no \"name\" attribute.");

            xmlPageInformation.getContentFields().add(contentFieldNameNode.getNodeValue());
        }
    }
}
