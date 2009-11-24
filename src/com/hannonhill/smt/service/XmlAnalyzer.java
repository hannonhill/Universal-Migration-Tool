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
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

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
            projectInformation.getAssetTypes().add(xmlPageInformation.getAssetType()); // this adds unique values only
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

        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        String assetType = xpath.evaluate(ASSET_TYPE_XPATH, inputSource);

        if (assetType == null)
            throw new Exception("Asset type element could not be found");

        assetType = assetType.trim();
        xmlPageInformation.setAssetType(assetType);

        return xmlPageInformation;
    }
}
