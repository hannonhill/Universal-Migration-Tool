/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang.xwork.StringUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.DataDefinitionField;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.LuminisLink;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.XmlPageInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.smt.util.XmlUtil;

/**
 * This class contains service methods for analyzing the xml file contents
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class XmlAnalyzer
{
    private static final String ASSET_TYPE_XPATH = "/asset/coreData/assetType/text()";
    private static final String SERENA_METADATA_FIELDS_XPATH = "/asset/metaData/field";
    private static final String SERENA_CONTENT_FIELDS_XPATH = "/asset/content/field";
    private static final String LUMINIS_METADATA_FIELD_NAMES_REGEX = "<sct:meta name=\"([^\"]*)\"";
    private static final String LUMINIS_CONTENT_FIELD_NAMES_REGEX = "<sct:(field|xhtml|img|ckeditor|eoprong) name=\"([^\"]*)\"";
    private static final String LUMINIS_WEBVIEW_URL_XPATH = "/root/@webviewurl";
    private static final String LUMINIS_SCT_WEB_PAGE_XPATH = "/root/sct_web_page";
    private static final String FILE_PROBLEM_MESSAGE = "There were problems with analyzing file ";
    private static final String LINK_XPATH = "//a/@href | //img/@src | //script/@src | //link/@href ";
    private static final String DEPLOY_PATH_XPATH = "/asset/coreData/deployPath";
    private static final String FIELDS_XPATH = "//field";
    private static final String ROOT_SITE_FOLDER_NAME = "Root Site";
    private static final String LINK_FILE_NAME = "linkFile.xml";
    private static final String LINKED_ITEM_TAG_NAME = "linked_item";

    /**
     * Analyzes a folder by going through each file in the folder and subfolders and calling appropriate
     * method to analyze it depending on whether it is a Luminis dump or a Serena dump
     * 
     * @param folder
     * @param assetTypes
     * @param errorMessages
     */
    public static void analyzeFolder(File folder, ProjectInformation projectInformation, List<String> errorMessages)
    {
        File luminisFolder = findLuminisRootSiteFolder(folder);

        // If Luminis folder is found, mark it as luminis migration and analyze the Luminis files
        if (luminisFolder != null)
        {
            projectInformation.setLuminisFolder(luminisFolder);
            projectInformation.setLuminisLinkRootPath(new File(luminisFolder.getParent()).getParent());
            List<File> xmlFiles = FileSystem.getAllFiles(luminisFolder, ".xml");
            for (File xmlFile : xmlFiles)
                analyzeLuminisXmlFile(xmlFile, projectInformation, errorMessages);
            List<File> xhtmlFiles = FileSystem.getAllFiles(luminisFolder, ".xhtml");
            for (File xhtmlFile : xhtmlFiles)
                projectInformation.getXhtmlFiles().add(xhtmlFile);
        }
        // Otherwise analyze Serena files
        else
        {
            List<File> files = FileSystem.getAllFiles(folder, ".xml");
            for (File file : files)
                analyzeSerenaFile(file, projectInformation, errorMessages);
        }
    }

    /**
     * Analyzes the data definition xml and returns a map of text fields and file chooser fields
     * 
     * @param xml
     * @return
     * @throws Exception
     */
    public static Map<String, DataDefinitionField> analyzeDataDefinitionXml(String xml) throws Exception
    {
        Map<String, DataDefinitionField> returnMap = new HashMap<String, DataDefinitionField>();
        Node rootNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new StringReader(xml)));
        NodeList children = rootNode.getChildNodes();
        analyzeDataDefinitionGroup(children, "", "", returnMap);
        return returnMap;
    }

    /**
     * Parses a Serena XML file and returns a Page object that contains all the necessary information for
     * migration of that page into Cascade Server
     * 
     * @param file
     * @return
     * @throws Exception
     */
    public static DetailedXmlPageInformation parseSerenaXmlFile(File file) throws Exception
    {
        DetailedXmlPageInformation page = new DetailedXmlPageInformation();
        Node rootNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new FileInputStream(file)));
        NodeList rootChildNodes = rootNode.getChildNodes();
        for (int i = 0; i < rootChildNodes.getLength(); i++)
        {
            Node rootChildNode = rootChildNodes.item(i);
            String rootChildNodeName = rootChildNode.getNodeName();
            if (rootChildNodeName.equals("coreData"))
                parseSerenaCoreData(rootChildNode, page);
            else if (rootChildNodeName.equals("metaData"))
                parseSerenaMetaData(rootChildNode, page);
            else if (rootChildNodeName.equals("content"))
                parseSerenaContent(rootChildNode, page);
        }

        return page;
    }

    /**
     * Parses a Luminis XML file and returns a Page object that contains all the necessary information for
     * migration of that page into Cascade Server
     * 
     * @param file file on the file system containing the xml information
     * @param page information about the page that data will be added to
     * @return
     * @throws Exception
     */
    public static void parseLuminisXmlFile(File file, DetailedXmlPageInformation page) throws Exception
    {
        String fileContent = FileSystem.getFileContents(file);
        int objectIndex = fileContent.indexOf("<object>");
        if (objectIndex == -1)
            throw new Exception("Error when parsing Luminis XML File: file content does not contain &lt;object&gt; tag");

        String text = fileContent.substring(objectIndex);
        Node rootNode = XmlUtil.convertXmlToNodeStructure(new InputSource(new ByteArrayInputStream(text.getBytes())));
        NodeList rootChildNodes = rootNode.getChildNodes();
        for (int i = 0; i < rootChildNodes.getLength(); i++)
        {
            Node rootChildNode = rootChildNodes.item(i);

            // Because we do not know if the field belongs to content or metadata, we assign it to both maps
            page.getContentMap().put(rootChildNode.getNodeName(), JTidy.tidyContent(rootChildNode.getTextContent()));
            page.getMetadataMap().put(rootChildNode.getNodeName(), JTidy.tidyContent(rootChildNode.getTextContent()));
        }
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
     * nodes and returns
     * the values first one that contains.
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
     * Parses the information contained in the xml file's &lt;coreData&gt; tag and assigns it to the page
     * 
     * @param coreDataNode
     * @param page
     */
    private static void parseSerenaCoreData(Node coreDataNode, DetailedXmlPageInformation page)
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
     * Parses the information contained in the xml file's &lt;metaData&gt; tag and assigns it to the page
     * 
     * @param coreDataNode
     * @param page
     */
    private static void parseSerenaMetaData(Node coreDataNode, DetailedXmlPageInformation page)
    {
        NodeList nodes = coreDataNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++)
        {
            Node node = nodes.item(i);
            String nodeName = node.getNodeName();

            // Nodes without attributes are text and comments so we skip them
            if (node.getAttributes() == null)
                continue;

            Node isUserMetadataAttribute = node.getAttributes().getNamedItem("isUserMetaData");
            Node nameAttribute = node.getAttributes().getNamedItem("name");

            // only <field> tags count and they must have "name" and "isUserMetaData" attributes the
            // "isUserMetadata" attribute must say "true"
            if (nodeName.equals("field") && nameAttribute != null && isUserMetadataAttribute != null
                    && isUserMetadataAttribute.getNodeValue().equals("true"))
                page.getMetadataMap().put(nameAttribute.getNodeValue(), XmlAnalyzer.getCDataContent(node));
        }
    }

    /**
     * Parses the information contained in the xml file's &lt;content&gt; tag and assigns it to the page
     * 
     * @param coreDataNode
     * @param page
     */
    private static void parseSerenaContent(Node coreDataNode, DetailedXmlPageInformation page)
    {
        NodeList nodes = coreDataNode.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++)
        {
            Node node = nodes.item(i);
            String nodeName = node.getNodeName();

            // Nodes without attributes are text and comments so we skip them
            if (node.getAttributes() == null)
                continue;

            Node nameAttribute = node.getAttributes().getNamedItem("name");

            // only <field> tags count and they must have "name" attribute the
            if (nodeName.equals("field") && nameAttribute != null)
                page.getContentMap().put(nameAttribute.getNodeValue(), XmlAnalyzer.getCDataContent(node));
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
                // Always tidy cdata section. Trim because jtidy leaves a new line character at the end.
                return JTidy.tidyContent(node.getNodeValue()).trim();
        }
        return "";
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
            Map<String, DataDefinitionField> returnMap)
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
                analyzeDataDefinitionGroup(node.getChildNodes(), identifierPrefix + identifier + "/", labelPrefix + label + "/", returnMap);
            else if (node.getNodeName().equals("text"))
            {
                String newIdentifier = identifierPrefix + identifier;
                String newLabel = labelPrefix + label;
                returnMap.put(newIdentifier, new DataDefinitionField(newIdentifier, newLabel, false));
            }
            else if (node.getNodeName().equals("asset") && node.getAttributes().getNamedItem("type") != null
                    && node.getAttributes().getNamedItem("type").getTextContent().equals("file"))
            {
                String newIdentifier = identifierPrefix + identifier;
                String newLabel = labelPrefix + label;
                returnMap.put(newIdentifier, new DataDefinitionField(newIdentifier, newLabel, true));
            }
        }
    }

    /**
     * Stores the jsp template name
     * 
     * @param jspFile
     * @param assetTypeName
     * @param projectInformation
     * @param errorMessages
     */
    private static void analyzeLuminisJspFile(File jspFile, String assetTypeName, ProjectInformation projectInformation, List<String> errorMessages)
    {
        try
        {
            AssetType assetType = new AssetType(assetTypeName);
            projectInformation.getAssetTypes().put(assetTypeName, assetType);

            // <sct:meta/>
            assetType.getMetadataFields().addAll(findLuminisMetadataFields(jspFile));

            // <sct:field/>, <sct:img/> and <sct:xhtml/>
            assetType.getContentFields().addAll(findLuminisContentFields(jspFile));
        }
        catch (Exception e)
        {
            // To build the file path that needs to be displayed, we show only the part of the abosute path
            // after the xml directory
            String relativePath = PathUtil.getRelativePath(jspFile, projectInformation.getXmlDirectory());

            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            errorMessages.add(FILE_PROBLEM_MESSAGE + relativePath + ": " + message);
        }
    }

    /**
     * Returns all &lt;sct:meta/&gt; fields in the given <code>jspFile</code> and returns a list of their
     * names (name attributes)
     * 
     * @param jspFile
     * @return
     */
    private static List<String> findLuminisMetadataFields(File jspFile) throws Exception
    {
        String jsp = FileSystem.getFileContents(jspFile);
        return getRegexMatches(jsp, LUMINIS_METADATA_FIELD_NAMES_REGEX, 1);
    }

    /**
     * Returns all &lt;sct:field/&gt;, &lt;sct:xhtml/&gt; and &lt;sct:img/&gt; fields in the given
     * <code>jspFile</code> and returns a list of their names (name attributes)
     * 
     * @param jspFile
     * @return
     */
    private static List<String> findLuminisContentFields(File jspFile) throws Exception
    {
        String jsp = FileSystem.getFileContents(jspFile);
        return getRegexMatches(jsp, LUMINIS_CONTENT_FIELD_NAMES_REGEX, 2);
    }

    /**
     * Applies given <code>regEx</code> regular expression to given <code>text</code> and returns all
     * occurrences from group with number provided in <code>group</group> parameter.
     * 
     * @param jsp
     * @param regEx
     * @param group the group number
     * @return
     */
    private static List<String> getRegexMatches(String text, String regEx, int group)
    {
        List<String> result = new ArrayList<String>();

        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);
        boolean r = m.find();
        while (r)
        {
            result.add(m.group(group));
            r = m.find();
        }

        return result;
    }

    /**
     * Adds non-linkFile files to the list of files to process. Adds .jsp files found in linkFile.xml files to
     * list of asset types.
     * 
     * @param xmlFile
     * @param projectInformation
     * @param errorMessages
     */
    private static void analyzeLuminisXmlFile(File xmlFile, ProjectInformation projectInformation, List<String> errorMessages)
    {
        try
        {
            if (xmlFile.getName().equals(LINK_FILE_NAME))
                analyzeLuminisLinkfile(xmlFile, projectInformation, errorMessages);
        }
        catch (Exception e)
        {
            // To build the file path that needs to be displayed, we show only the part of the abosute path
            // after the xml directory
            String relativePath = PathUtil.getRelativePath(xmlFile, projectInformation.getXmlDirectory());

            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            errorMessages.add(FILE_PROBLEM_MESSAGE + relativePath + ": " + message);
        }
    }

    /**
     * Analyzes the contents of linkFile.xml provided as <code>linkFile</code>. Stores the webview url
     * provided and analyzes each &lt;sct_web_page&gt; in the file by calling
     * {@link #analyzeLuminisSctWebPage(Node, String, File, ProjectInformation, List)} on each found tag.
     * 
     * @param linkFile
     * @param projectInformation
     * @param errorMessages
     * @throws Exception
     */
    private static void analyzeLuminisLinkfile(File linkFile, ProjectInformation projectInformation, List<String> errorMessages) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(linkFile));
        String webviewUrl = xpath.evaluate(LUMINIS_WEBVIEW_URL_XPATH, inputSource);

        if (webviewUrl == null)
            webviewUrl = "";

        projectInformation.getLinkFileUrlToWebviewUrlMap().put(
                linkFile.getAbsolutePath().substring(projectInformation.getLuminisLinkRootPath().length()), webviewUrl);

        inputSource = new InputSource(new FileInputStream(linkFile));
        xpath = XPathFactory.newInstance().newXPath();

        NodeList sctWebPageNodes = (NodeList) xpath.evaluate(LUMINIS_SCT_WEB_PAGE_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < sctWebPageNodes.getLength(); i++)
            analyzeLuminisSctWebPage(sctWebPageNodes.item(i), webviewUrl, linkFile, projectInformation, errorMessages);
    }

    /**
     * Analyzes the contents of &lt;sct_web_page&gt; tag: figures out the Luminis page's name, template used,
     * deploy path (by putting together given <code>webviewUrl</code> with page's name. Stores the page as
     * {@link File} object to be included in migration. Analyzes links provided as &lt;linked_item&gt;s by
     * calling {@link #analyzeLuminisLinkedItem(Node, DetailedXmlPageInformation)} on each found tag.
     * 
     * Also calls {@link #analyzeLuminisJspFile(File, String, ProjectInformation, List)} if found .jsp
     * template hasn't been analyzed yet.
     * 
     * @param sctWebPageNode
     * @param webviewUrl
     * @param linkFile
     * @param projectInformation
     * @param errorMessages
     * @throws Exception
     */
    private static void analyzeLuminisSctWebPage(Node sctWebPageNode, String webviewUrl, File linkFile, ProjectInformation projectInformation,
            List<String> errorMessages) throws Exception
    {
        DetailedXmlPageInformation sctWebPage = new DetailedXmlPageInformation();

        Node objectNameNode = sctWebPageNode.getAttributes().getNamedItem("object_name");
        if (objectNameNode == null)
            throw new Exception("The <sct_web_page> tag has no \"object_name\" tag.");

        Node templateUsedNode = sctWebPageNode.getAttributes().getNamedItem("template_used");
        if (templateUsedNode == null)
            throw new Exception("The <sct_web_page> tag has no \"template_used\" tag.");

        sctWebPage.setDeployPath(PathUtil.removeLeadingSlashes(webviewUrl + "/" + objectNameNode.getTextContent()));

        // Template path starts with "/dumpname/Root Site/..." - 2 unnecessary folders that are always the
        // same - remove the 2 levels from assetTypeName to get accurate path.
        String assetTypeName = PathUtil.skipRootFolder(PathUtil.skipRootFolder(templateUsedNode.getTextContent()));
        sctWebPage.setAssetType(assetTypeName);

        // If we didn't save a template with this name yet, let's analyze the template file and save it
        if (projectInformation.getAssetTypes().get(assetTypeName) == null)
        {
            String jspFilePath = projectInformation.getLuminisFolder().getAbsolutePath() + assetTypeName;
            File jspFile = new File(jspFilePath);
            analyzeLuminisJspFile(jspFile, assetTypeName, projectInformation, errorMessages);
        }

        // Store <linked_item>s as LuminisLinks
        NodeList childNodes = sctWebPageNode.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++)
            if (childNodes.item(i).getNodeName().equals(LINKED_ITEM_TAG_NAME))
                analyzeLuminisLinkedItem(childNodes.item(i), sctWebPage);

        String xmlFileName = objectNameNode.getTextContent();
        if (!xmlFileName.endsWith(".xml"))
            xmlFileName += ".xml";
        String xmlFilePath = linkFile.getParent() + "/" + xmlFileName;
        File xmlFile = new File(xmlFilePath);

        projectInformation.getPagesToProcess().put(xmlFile, sctWebPage);
        projectInformation.getFilesToProcess().add(xmlFile);
    }

    /**
     * Reads contents of &lt;linked_item&gt; tag and stores the i_chronicle_id, object_name and r_folder_path
     * as {@link LuminisLink} and adds it to the {@link DetailedXmlPageInformation}
     * 
     * @param linkedItemNode
     * @param sctWebPage
     */
    private static void analyzeLuminisLinkedItem(Node linkedItemNode, DetailedXmlPageInformation sctWebPage)
    {
        String rObjectId = null;
        String objectName = null;
        String rFolderPath = null;

        NodeList grandchildNodes = linkedItemNode.getChildNodes();
        for (int i = 0; i < grandchildNodes.getLength(); i++)
        {
            Node grandchildNode = grandchildNodes.item(i);
            if (grandchildNode.getNodeName().equals("i_chronicle_id"))
                rObjectId = grandchildNode.getTextContent().trim();
            else if (grandchildNode.getNodeName().equals("object_name"))
                objectName = grandchildNode.getTextContent().trim();
            else if (grandchildNode.getNodeName().equals("r_folder_path"))
                rFolderPath = grandchildNode.getTextContent().trim();
        }

        if (rObjectId != null && objectName != null && rFolderPath != null)
            sctWebPage.getLuminisLinks().add(new LuminisLink(rObjectId, rFolderPath, objectName));
    }

    /**
     * Analyzes a file for Serena dump using the {@link XmlAnalyzer#analyzeContentsOfSerenaXmlFile(File)}
     * method. If
     * exception occurs, adds an error message to the existing list of error messages. Adds the information
     * that was analyzed to the project information.
     * 
     * @param file
     * @param projectInformation
     * @param errorMessages
     */
    private static void analyzeSerenaFile(File file, ProjectInformation projectInformation, List<String> errorMessages)
    {
        try
        {
            XmlPageInformation xmlPageInformation = analyzeContentsOfSerenaXmlFile(file);
            if (xmlPageInformation == null)
                return;

            String fileNameWihtoutXmlExtension = PathUtil.truncateExtension(file.getName());
            String extension = PathUtil.getExtension(fileNameWihtoutXmlExtension);
            projectInformation.getGatheredExtensions().add(extension);

            // get existing asset type from the map or create a new one and add it to the map
            AssetType assetType = projectInformation.getAssetTypes().get(xmlPageInformation.getAssetTypeName());
            if (assetType == null)
            {
                String assetTypeName = xmlPageInformation.getAssetTypeName();
                assetType = new AssetType(assetTypeName);
                projectInformation.getAssetTypes().put(assetTypeName, assetType);
            }

            // adds unique field names only
            assetType.getMetadataFields().addAll(xmlPageInformation.getMetadataFields());

            // adds unique field names only
            assetType.getContentFields().addAll(xmlPageInformation.getContentFields());

            // adds unique folder name only
            projectInformation.getGatheredRootLevelFolders().add(xmlPageInformation.getRootLevelFolder());

            // adds unique folder names only
            projectInformation.getGatheredLinkedRootLevelFolders().addAll(xmlPageInformation.getLinkedToRootLevelFolders());

            // add only if no exception was thrown,
            projectInformation.getFilesToProcess().add(file);
        }
        catch (Exception e)
        {
            // To build the file path that needs to be displayed, we show only the part of the abosute path
            // after the xml directory
            String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            errorMessages.add(FILE_PROBLEM_MESSAGE + relativePath + ": " + message);
        }
    }

    /**
     * Parses the contents of an XML file and returns the XmlPageInformation object with the information
     * gathered from that file
     * 
     * @param file
     * @return
     */
    private static XmlPageInformation analyzeContentsOfSerenaXmlFile(File file) throws Exception
    {
        XmlPageInformation xmlPageInformation = new XmlPageInformation();

        findSerenaAssetType(file, xmlPageInformation);

        // Skip this file if the asset type couldn't be found
        if (StringUtils.isEmpty(xmlPageInformation.getAssetTypeName()))
            return null;

        findSerenaMetadataFields(file, xmlPageInformation);
        findSerenaContentFields(file, xmlPageInformation);
        findSerenaLinkedRootLevelFolders(file, xmlPageInformation);

        return xmlPageInformation;
    }

    /**
     * Analyzes the XML file and finds the Asset Type name in it and assigns it to the XmlPageInformation
     * object.
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findSerenaAssetType(File file, XmlPageInformation xmlPageInformation) throws Exception
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
     * Analyzes the XML file and finds the Metadata field names in it and assigns them to the
     * XmlPageInformation object.
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findSerenaMetadataFields(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList metadataFields = (NodeList) xpath.evaluate(SERENA_METADATA_FIELDS_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < metadataFields.getLength(); i++)
        {
            Node metadataFieldNameNode = metadataFields.item(i).getAttributes().getNamedItem("name");
            if (metadataFieldNameNode == null)
                throw new Exception("The metadata <field> tag has no \"name\" attribute.");

            xmlPageInformation.getMetadataFields().add(metadataFieldNameNode.getNodeValue());
        }
    }

    /**
     * Analyzes the XML file and finds the Content filed names in it and assigns them to the
     * XmlPageinformation object
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findSerenaContentFields(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList contentFields = (NodeList) xpath.evaluate(SERENA_CONTENT_FIELDS_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < contentFields.getLength(); i++)
        {
            Node contentFieldNameNode = contentFields.item(i).getAttributes().getNamedItem("name");
            if (contentFieldNameNode == null)
                throw new Exception("The content <field> tag has no \"name\" attribute.");

            xmlPageInformation.getContentFields().add(contentFieldNameNode.getNodeValue());
        }
    }

    /**
     * Analyzes the XML file and finds the linked to root level folders
     * 
     * @param file
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findSerenaLinkedRootLevelFolders(File file, XmlPageInformation xmlPageInformation) throws Exception
    {
        String deployPath = getDeployPath(file).trim();
        xmlPageInformation.setRootLevelFolder(deployPath.substring(0, deployPath.indexOf('/')));
        int deployPathLevels = deployPath.split("/").length - 1;

        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList fieldNodes = (NodeList) xpath.evaluate(FIELDS_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < fieldNodes.getLength(); i++)
            findLinkedRootLevelFolders(fieldNodes.item(i), deployPathLevels, xmlPageInformation);
    }

    /**
     * Analyzes given field tag node, strips the cdata content and finds all link tags (a, img, link, script)
     * and if these are root level
     * folder links (go ../ as many times as the page is deep from deplyPathLevels), then the folder is added
     * to the list
     * linkedToRootLevelFolders in xmlPageInformation
     * 
     * @param fieldNode
     * @param deployPathLevels
     * @param xmlPageInformation
     * @throws Exception
     */
    private static void findLinkedRootLevelFolders(Node fieldNode, int deployPathLevels, XmlPageInformation xmlPageInformation) throws Exception
    {
        String fieldXml = XmlUtil.addRootTag(getCDataContent(fieldNode));

        XPath xpath = XPathFactory.newInstance().newXPath();

        InputSource inputSource = new InputSource(new StringReader(fieldXml));
        NodeList linkNodes = (NodeList) xpath.evaluate(LINK_XPATH, inputSource, XPathConstants.NODESET);

        for (int i = 0; i < linkNodes.getLength(); i++)
        {
            Node linkNode = linkNodes.item(i);
            String link = linkNode.getTextContent();

            // If it doesn't start with ../ then it will never be a relative link that goes to the root level
            // folder
            if (!link.startsWith("../"))
                continue;

            int linkLevels = PathUtil.countLevelUps(link);
            if (linkLevels == deployPathLevels)
            {
                String strippedLink = link.substring(link.lastIndexOf("../") + 3);
                String rootLevelFolder = strippedLink.substring(0, strippedLink.indexOf('/'));
                xmlPageInformation.getLinkedToRootLevelFolders().add(rootLevelFolder);
            }
        }
    }

    /**
     * Analyzes an XML file and finds the &lt;deployPath&gt; tag and returns its contents.
     * 
     * @param file
     * @return
     * @throws Exception
     */
    private static String getDeployPath(File file) throws Exception
    {
        XPath xpath = XPathFactory.newInstance().newXPath();
        InputSource inputSource = new InputSource(new FileInputStream(file));
        NodeList deployPathNodes = (NodeList) xpath.evaluate(DEPLOY_PATH_XPATH, inputSource, XPathConstants.NODESET);
        return deployPathNodes.item(0).getTextContent();
    }

    /**
     * Assumming it is a Luminis dump, it will return the second or third level "Root Site" folder if it is
     * the only sub-folder of its parent. If not found, returns null.
     * 
     * @param rootfolder Root folder of the zip file uploaded
     * @return
     */
    private static File findLuminisRootSiteFolder(File rootfolder)
    {
        for (String firstLevelFileString : rootfolder.list())
        {
            File firstLevelFile = new File(rootfolder.getAbsolutePath() + "/" + firstLevelFileString);

            // If it's a file (meaning not a folder), skip
            if (firstLevelFile.isFile())
                continue;

            File foundFolder = findOnlyRootSiteFolder(firstLevelFile);
            if (foundFolder != null)
                return foundFolder;

            for (String secondLevelFileString : firstLevelFile.list())
            {
                File secondLevelFile = new File(firstLevelFile.getAbsolutePath() + "/" + secondLevelFileString);

                // If it's a file (meaning not a folder), skip
                if (secondLevelFile.isFile())
                    continue;

                // Find the "Root Site" folder and make sure it's the only folder. If found - return it.
                foundFolder = findOnlyRootSiteFolder(secondLevelFile);
                if (foundFolder != null)
                    return foundFolder;

                // If not found, continue search
            }
        }

        return null;
    }

    /**
     * Returns the child "Root Site" folder if it is the only child folder of it's provided parent. If not
     * found, returns null.
     * 
     * @param parentFolder
     * @return
     */
    private static File findOnlyRootSiteFolder(File parentFolder)
    {
        int nFolders = 0;
        File foundFolder = null;

        for (String childFileString : parentFolder.list())
        {
            File childFile = new File(parentFolder.getAbsolutePath() + "/" + childFileString);

            // If it's a file, skip (Can be .DS_Store or something else, so just ignore it)
            if (childFile.isFile())
                continue;

            // If it's a folder, count it in
            nFolders++;

            // If it's a Root Site folder, store it
            if (ROOT_SITE_FOLDER_NAME.equals(childFileString))
                foundFolder = childFile;
        }

        // If there was Root Site folder and it was the only folder, we found it - return
        if (nFolders == 1 && foundFolder != null)
            return foundFolder;

        return null;
    }
}
