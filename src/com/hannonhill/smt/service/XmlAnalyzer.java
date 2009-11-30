/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.XmlPageInformation;

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
        for (String fileString : folder.list())
        {
            File file = new File(folder.getAbsolutePath() + "/" + fileString);

            if (!file.isFile())
                analyzeFolder(file, projectInformation, errorMessages);
            else if (file.getName().endsWith(".xml"))
                analyzeFile(file, projectInformation, errorMessages);
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
            String relativePath = file.getAbsolutePath().substring(projectInformation.getXmlDirectory().length());

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
        XmlPageInformation xmlPageInformation = new XmlPageInformation(file.getAbsolutePath());

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
