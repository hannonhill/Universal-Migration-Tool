/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 *
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.service;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.hannonhill.umt.api.SharedField;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.umt.ChooserType;
import com.hannonhill.umt.DataDefinitionField;
import com.hannonhill.umt.ExternalRootLevelFolderAssignment;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.util.PathUtil;
import com.hannonhill.umt.util.XmlUtil;

/**
 * This class contains service methods for analyzing the xml file contents
 *
 * @author Artur Tomusiak
 * @since 1.0
 */
public class XmlAnalyzer
{
    /**
     * Analyzes a folder by going through each file in the folder and subfolders using
     * {@link #analyzeFile(File, ProjectInformation)}.
     *
     * @param folder
     * @param assetTypes
     */
    public static void analyzeFolder(Path folder, ProjectInformation projectInformation)
    {
        // Skip files with invalid characters in their path
        String folderPath = PathUtil.getRelativePath(folder, projectInformation.getXmlDirectory());
        String folderName = PathUtil.getNameFromPath(folderPath);
        if (!allCharactersLegal(folderName))
        {
            String newPath = removeIllegalCharacters(folderPath);

            ExternalRootLevelFolderAssignment rootFolderAssignment = new ExternalRootLevelFolderAssignment(folderPath, newPath, null);
            projectInformation.getExternalRootLevelFolderAssignemnts().put(folderPath, rootFolderAssignment);
        }

        try (DirectoryStream<Path> files = Files.newDirectoryStream(folder))
        {
            for (Path file : files)
                analyzeFile(file, projectInformation);
        }
        catch (IOException x)
        {
            System.out.println(x);
        }
    }

    /**
     * Analyzes the data definition xml and returns a map of text fields and file chooser fields
     *
     * @param xml
     * @return
     * @throws Exception
     */
    public static Map<String, DataDefinitionField> analyzeDataDefinitionXml(String xml, ProjectInformation projectInformation) throws Exception
    {
        Map<String, DataDefinitionField> returnMap = new HashMap<>();
        Node rootNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new StringReader(xml)));
        NodeList children = rootNode.getChildNodes();
        analyzeDataDefinitionGroup(children, "", "", returnMap, projectInformation);
        return returnMap;
    }

    /**
     * Returns the value of the first "src" attribute found in given xml
     *
     * @param xml
     * @return
     * @throws Exception
     */
    public static String getFirstSrcAttribute(String xml) throws Exception
    {
        // Add root tag to make it a valid xml
        String xmlWithRoot = XmlUtil.addRootTag(xml);
        Node rootNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new StringReader(xmlWithRoot)));
        return getFirstSrcAttribute(rootNode);
    }

    /**
     * Checks if current node contains an src attribute and if not, then recursively checks all the ancestor
     * nodes and returns the values first one that contains.
     *
     * @param node
     * @return
     */
    private static String getFirstSrcAttribute(Node node)
    {
        if (node.getAttributes() != null && node.getAttributes().getNamedItem("src") != null)
            return node.getAttributes().getNamedItem("src").getTextContent();

        if (node.getChildNodes() != null)
            for (int i = 0; i < node.getChildNodes().getLength(); i++)
            {
                String src = getFirstSrcAttribute(node.getChildNodes().item(i));
                if (src != null)
                    return src;
            }

        return null;
    }

    /**
     * Adds all the text fields to the returnMap recursively
     *
     * @param children
     * @param identifierPrefix
     * @param labelPrefix
     * @param returnMap
     */
    private static void analyzeDataDefinitionGroup(NodeList children, String identifierPrefix, String labelPrefix,
            Map<String, DataDefinitionField> returnMap, ProjectInformation projectInformation)
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

            String newIdentifier = identifierPrefix + identifier;
            String newLabel = labelPrefix + label;

            // If group - go recursively, if text - add to the field list. Ignore asset choosers.
            if (node.getNodeName().equals("group"))
                analyzeDataDefinitionGroup(node.getChildNodes(), identifierPrefix + identifier + "/", labelPrefix + label + "/", returnMap, projectInformation);
            else if (node.getNodeName().equals("text"))
                returnMap.put(newIdentifier, new DataDefinitionField(newIdentifier, newLabel, null, isMultiple(node), isWysiwyg(node)));
            else if (node.getNodeName().equals("asset") && node.getAttributes().getNamedItem("type") != null
                    && node.getAttributes().getNamedItem("type").getTextContent().equals("file"))
                returnMap.put(newIdentifier, new DataDefinitionField(newIdentifier, newLabel, ChooserType.FILE, isMultiple(node), false));
            else if (node.getNodeName().equals("asset") && node.getAttributes().getNamedItem("type") != null
                    && node.getAttributes().getNamedItem("type").getTextContent().equals("block"))
                returnMap.put(newIdentifier, new DataDefinitionField(newIdentifier, newLabel, ChooserType.BLOCK, isMultiple(node), false));
            else if (node.getNodeName().equals("shared-field"))
            {
                try {
                    SharedField sharedField = RestApi.readSharedField(node.getAttributes().getNamedItem("field-id").getNodeValue(), projectInformation);
                    Node sharedFieldNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new StringReader(sharedField.getXml())));

                    analyzeDataDefinitionGroup(sharedFieldNode.getChildNodes(), identifierPrefix + identifier + "/", labelPrefix + label + "/", returnMap, projectInformation);
                }
                catch (Exception e)
                {
                    //Failed to retrieve shared field
                }
            }
        }
    }

    /**
     * Returns true if provided node has a multiple="true" attribute
     *
     * @param node
     * @return
     */
    private static boolean isMultiple(Node node)
    {
        return node.getAttributes().getNamedItem("multiple") != null && node.getAttributes().getNamedItem("multiple").getTextContent().equals("true");
    }

    /**
     * Returns true if provided node is a text node with wysiwyg="true" attribute
     *
     * @param node
     * @return
     */
    private static boolean isWysiwyg(Node node)
    {
        return node.getNodeName().equals("text") && node.getAttributes().getNamedItem("wysiwyg") != null
                && node.getAttributes().getNamedItem("wysiwyg").getTextContent().equals("true");
    }

    /**
     * Adds the file to the list of files to process and collects the extension
     *
     * @param file
     * @param projectInformation
     */
    private static void analyzeFile(Path file, ProjectInformation projectInformation)
    {
        // Skip hidden files and folders
        if (file.getFileName().toString().startsWith("."))
            return;

        // Recursively analyze sub-folders
        try
        {
            if ((Boolean) Files.getAttribute(file, "isDirectory"))
            {
                analyzeFolder(file, projectInformation);
                return;
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Skip files with invalid characters in their name
        String fileName = file.getFileName().toString();
        if (!allCharactersLegal(fileName))
            return;

        String fileNameWihtoutXmlExtension = PathUtil.truncateExtension(fileName);
        String extension = PathUtil.getExtension(fileNameWihtoutXmlExtension);
        projectInformation.getGatheredExtensions().add(extension);
        projectInformation.getFilesToProcess().add(file);
    }

    /**
     * Returns true if all the characters in a name are legal
     *
     * @param name
     * @return
     */
    public static final boolean allCharactersLegal(String name)
    {
        for (char c : name.toCharArray())
        {
            if (!isLegalCharacter(c))
            {
                return false;
            }
        }
        // No bad chars found
        return true;
    }

    /**
     * Removes illegal characters from provided string
     *
     * @param name
     * @return
     */
    public static final String removeIllegalCharacters(String name)
    {
        StringBuilder result = new StringBuilder();
        for (char c : name.toCharArray())
        {
            if (isLegalCharacter(c))
                result.append(c);
        }
        return result.toString();
    }

    /**
     * Wrapper for easily changing how we identify a "legal" character.
     *
     * @param c
     * @return
     */
    private static final boolean isLegalCharacter(char c)
    {
        return Character.isUnicodeIdentifierPart(c) || Character.isWhitespace(c) || c == '.' || c == ',' || c == '-' || c == '+' || c == '/';
    }
}
