/*
 * Created on Dec 8, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.ExternalRootLevelFolderAssignment;
import com.hannonhill.smt.LuminisLink;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.smt.util.XmlUtil;

/**
 * A service responsible for link rewriting
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class LinkRewriter
{
    public static final String LUMINIS_FILE_PREFIX = "[luminis-file]";
    private static final String DEFAULT_FILES_FOLDER = "files"; // Used when there is no webViewUrl to decide
                                                                // where a file should go

    /**
     * Rewrites all the file and page links in the content and metadata fields of the Serena page. If it is a
     * page link (ends with any extension of the extensions in possibleExtensions set and is relative), the
     * extension will be stripped. Also, removes the Serena specific attributes: cmid and collagestyle from
     * all tags.
     * 
     * @param page
     * @param projectInformation
     * @throws Exception
     */
    public static void rewriteLinkAndRemoveSerenaAttributes(DetailedXmlPageInformation page, ProjectInformation projectInformation) throws Exception
    {
        String pagePath = page.getDeployPath();
        rewriteLinkAndRemoveSerenaAttributes(page.getContentMap(), pagePath, projectInformation);
        rewriteLinkAndRemoveSerenaAttributes(page.getMetadataMap(), pagePath, projectInformation);
    }

    /**
     * Rewrites all occurrences of "/id[number]" in the Luminis page to link to actual asset. The information
     * about how to link it should be stored in {@link DetailedXmlPageInformation#getLuminisLinks()}.
     * 
     * @param page
     * @param projectInformation
     */
    public static void rewriteLuminisLinks(DetailedXmlPageInformation page, ProjectInformation projectInformation)
    {
        rewriteLuminisLinks(page.getContentMap(), page, projectInformation);
        rewriteLuminisLinks(page.getMetadataMap(), page, projectInformation);
    }

    /**
     * Rewrites all occurrences of "/id[number]" in the LUminis page's content or metadata map passed as
     * <code>map</code>.
     * 
     * @param map
     * @param page
     * @param projectInformation
     */
    private static void rewriteLuminisLinks(Map<String, String> map, DetailedXmlPageInformation page, ProjectInformation projectInformation)
    {
        for (LuminisLink link : page.getLuminisLinks())
        {
            String regex = "\"/id(" + link.getId() + ")\"";
            String componentRegex = link.getLinkedItemName() + "</sct-component>";
            String webViewUrl = getWebViewUrl(link.getLinkedItemFolder(), projectInformation.getLinkFileUrlToWebviewUrlMap());
            for (String fieldIdentifier : map.keySet())
            {
                String content = map.get(fieldIdentifier);
                String newPath = PathUtil.removeLeadingSlashes(webViewUrl + "/" + link.getLinkedItemName());
                String newContent = content.replaceAll(regex, "\"/" + newPath + "\"");
                if (newContent.startsWith("/id"))
                    newContent = LUMINIS_FILE_PREFIX + newPath;

                newContent = newContent.replaceAll(componentRegex, newPath + "</sct-component>");

                map.put(fieldIdentifier, newContent);
            }
        }
    }

    /**
     * Recursively tries to figure out webViewUrl of a folder by looking for linkFile.xml in that folder and
     * reading webViewUrl from there. If no linkFile.xml is present in that folder, ancestor folders will be
     * checked. Once ancestor folder with linkFile.xml is found, the webViewUrl from that linkFile is
     * retrieved and relative path to <code>folder</code> is appended to it. For example, if folder="/a/b/c"
     * and linkFile.xml is present at /a/b/linkFile.xml, and the linkfile's webViewUrl is "/images", then the
     * returned string from this function will be "/images/c"
     * 
     * @param folder
     * @param linkFileToUrlMap
     * @return
     */
    public static String getWebViewUrl(String folder, Map<String, String> linkFileToUrlMap)
    {
        String parentFolder = PathUtil.getParentFolderPathFromPath(folder);
        if (!parentFolder.equals("/"))
        {
            String webViewUrl = getWebViewUrl(parentFolder, linkFileToUrlMap);
            if (!webViewUrl.equals(DEFAULT_FILES_FOLDER))
                return webViewUrl + "/" + PathUtil.getNameFromPath(folder);
        }

        String webViewUrl = linkFileToUrlMap.get(folder + "/linkFile.xml");
        if (webViewUrl != null)
            return webViewUrl;

        return DEFAULT_FILES_FOLDER;
    }

    /**
     * Rewrites all the file and page links in each value of the map. If it is a page link (ends with .html
     * extension and is a relative), the .html extension will be stripped. Also, removes the Serena specific
     * attributes: cmid and collagestyle from all tags.
     * 
     * @param map
     * @param pagePath
     * @param projectInformation
     * @throws Exception
     */
    private static void rewriteLinkAndRemoveSerenaAttributes(Map<String, String> map, String pagePath, ProjectInformation projectInformation)
            throws Exception
    {
        for (String fieldIdentifier : map.keySet())
        {
            String content = map.get(fieldIdentifier);
            String newContent = rewriteLinkAndRemoveSerenaAttributes(content, pagePath, projectInformation);
            map.put(fieldIdentifier, newContent);
        }
    }

    /**
     * Rewrites all the file and page links in the xml. If it is a page link (ends with .html extension and is
     * a relative), the .html extension will be stripped. Also, removes the Serena specific attributes: cmid
     * and collagestyle from all tags.
     * 
     * @param xml
     * @param pagePath
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static String rewriteLinkAndRemoveSerenaAttributes(String xml, String pagePath, ProjectInformation projectInformation) throws Exception
    {
        // To make things faster, if it's an empty string, just quit
        if (xml == null || xml.equals(""))
            return "";

        // Wrap content in the root tag so that it is always a valid xml
        xml = XmlUtil.addRootTag(xml);

        StringBuffer stringBuffer = new StringBuffer(xml);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(stringBuffer.toString().getBytes("UTF-8"));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(inputStream));

        Node rootNode = document.getChildNodes().item(0);
        rewriteLinkAndRemoveSerenaAttributes(rootNode, pagePath, projectInformation);

        // convert document to string
        DOMSource domSource = new DOMSource(document);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.transform(domSource, result);
        String resultWithRoot = writer.toString();

        // Remove the root tag
        String resultWithoutRoot = XmlUtil.removeRootTag(resultWithRoot);
        return resultWithoutRoot;
    }

    /**
     * Finds absolute links in xhtml blocks and if they point to existing pages but have extensions, their
     * extensions are removed
     * 
     * @param xml
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static String fixXhtmlBlockLinks(String xml, ProjectInformation projectInformation) throws Exception
    {
        // To make things faster, if it's an empty string, just quit
        if (xml == null || xml.equals(""))
            return "";

        // Wrap content in the root tag so that it is always a valid xml
        xml = XmlUtil.addRootTag(xml);

        StringBuffer stringBuffer = new StringBuffer(xml);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(stringBuffer.toString().getBytes("UTF-8"));

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(inputStream));

        Node rootNode = document.getChildNodes().item(0);
        removeExtension(rootNode, projectInformation);

        // convert document to string
        DOMSource domSource = new DOMSource(document);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty("omit-xml-declaration", "yes");
        transformer.transform(domSource, result);
        String resultWithRoot = writer.toString();

        // Remove the root tag
        String resultWithoutRoot = XmlUtil.removeRootTag(resultWithRoot);
        return resultWithoutRoot;
    }

    /**
     * Rewrites the file and page link in the xml tag node and all ancestor nodes. If it is a page link (ends
     * with .html extension and is a relative), the .html extension will be stripped. Also, removes the Serena
     * specific attributes: cmid and collagestyle from all tags.
     * 
     * @param node
     * @param pagePath
     * @param projectInformation
     */
    private static void rewriteLinkAndRemoveSerenaAttributes(Node node, String pagePath, ProjectInformation projectInformation)
    {
        if (node.getNodeName().equals("img"))
            rewriteLink(node, "src", pagePath, projectInformation);
        if (node.getNodeName().equals("script"))
            rewriteLink(node, "src", pagePath, projectInformation);
        else if (node.getNodeName().equals("a"))
            rewriteLink(node, "href", pagePath, projectInformation);
        else if (node.getNodeName().equals("link"))
            rewriteLink(node, "href", pagePath, projectInformation);

        removeSerenaAttributes(node);

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
            rewriteLinkAndRemoveSerenaAttributes(children.item(i), pagePath, projectInformation);
    }

    /**
     * Removes extension if link points to an existing page
     * 
     * @param node
     * @param projectInformation
     */
    private static void removeExtension(Node node, ProjectInformation projectInformation)
    {
        if (node.getNodeName().equals("a"))
            removeExtension(node, "href", projectInformation);
        else if (node.getNodeName().equals("link"))
            removeExtension(node, "href", projectInformation);

        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++)
            removeExtension(children.item(i), projectInformation);
    }

    /**
     * Removes an extension if the link points to an existing page
     * 
     * @param element
     * @param attributeName
     * @param projectInformation
     */
    private static void removeExtension(Node element, String attributeName, ProjectInformation projectInformation)
    {
        Node attribute = element.getAttributes().getNamedItem(attributeName);
        if (attribute == null)
            return;

        String oldPath = attribute.getNodeValue();

        // split between the link part and the anchor part
        String withoutAnchor = PathUtil.getPartWithoutAnchor(oldPath);
        String anchor = PathUtil.getAnchorPart(oldPath);

        if (!withoutAnchor.startsWith("/"))
            return;

        String withoutExtension = PathUtil.truncateExtension(withoutAnchor);
        String pathOnly = PathUtil.removeLeadingSlashes(withoutExtension);
        if (projectInformation.getExistingCascadePages().contains(pathOnly.toLowerCase()))
            attribute.setNodeValue(withoutExtension + anchor);
    }

    /**
     * Removes Serena specific attributes from the node if they exist
     * 
     * @param element
     */
    private static void removeSerenaAttributes(Node node)
    {
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null)
        {
            if (attributes.getNamedItem("cmid") != null)
                attributes.removeNamedItem("cmid");
            if (attributes.getNamedItem("collagestyle") != null)
                attributes.removeNamedItem("collagestyle");
        }
    }

    /**
     * Rewrites a file or page link in the xml tag node's attribute of given attributeName if it is a relative
     * link.
     * If it is a page link (ends with .html extension and is a relative), the .html extension will be
     * stripped. Keeps the anchor.
     * 
     * @param element
     * @param attributeName
     * @param pagePath
     * @param projectInformation
     */
    private static void rewriteLink(Node element, String attributeName, String pagePath, ProjectInformation projectInformation)
    {
        Node attribute = element.getAttributes().getNamedItem(attributeName);
        if (attribute == null)
            return;

        String oldPath = attribute.getNodeValue();

        // split between the link part and the anchor part
        String withoutAnchor = PathUtil.getPartWithoutAnchor(oldPath);
        String anchor = PathUtil.getAnchorPart(oldPath);

        if (!PathUtil.isLinkRelative(withoutAnchor))
            return;

        String newPath = rewriteLink(withoutAnchor, pagePath, projectInformation);

        // add the anchor part
        attribute.setNodeValue(newPath + anchor);
    }

    /**
     * Rewrites the prefix part of the link and if needed, trunkates the extension.
     * For example, for a page with path /folder/page and a link ../folder2/page2.html, the link will be
     * rewritten to /folder2/page2.html.
     * If it goes up to the root level (and example above does), it looks for the root level folder
     * assignments and if it finds one, it rewrites it again
     * with the assignment. For example if there is a site assignment of "folder2" to "site_a", the link will
     * look like this: site://site_a/folder2/page2.html
     * If it is not a external link, also trunkates extension if it is a link to a page, meaning the extension
     * belongs to one of the gathered extensions
     * in project information. So the end result of the example above would be site://site_a/folder2/page2
     * 
     * @param link
     * @param pagePath
     * @param projectInformation
     * @return
     */
    private static String rewriteLink(String link, String pagePath, ProjectInformation projectInformation)
    {
        String newPath = PathUtil.convertRelativeToAbsolute(link, pagePath);
        int deployPathLevels = pagePath.split("/").length - 1;
        int linkLevels = PathUtil.countLevelUps(link);
        // if there are same many link levels as the page path levels, it means the link goes to root
        boolean goesToRoot = linkLevels == deployPathLevels;

        // if it doesn't go to root, nothing more needs to be done
        if (goesToRoot)
        {
            // check the root level folder and see if there is an assignment for it
            String withoutLeadingSlash = newPath.substring(1);
            String rootLevelFolder = withoutLeadingSlash.substring(0, withoutLeadingSlash.indexOf('/'));
            ExternalRootLevelFolderAssignment assignment = projectInformation.getExternalRootLevelFolderAssignemnts().get(rootLevelFolder);

            // if no assignment, leave it as it is, if there is an assignment, rewrite the link
            if (assignment != null)
            {
                // if it is an external link, add the external url and return (skip adding extension)
                if (assignment.getAssignmentType().equals(ExternalRootLevelFolderAssignment.ASSIGNMENT_TYPE_EXTERNAL_LINK))
                    return assignment.getExternalLinkAssignment() + newPath; // converts link /folder/page to
                                                                             // http://domain/com/folder/page

                // if it is not an external link, do a cross site link and keep it for adding the extension
                newPath = "site://" + assignment.getCrossSiteAssignment() + newPath; // converts link
                                                                                     // /folder/page to
                                                                                     // site://sitename/folder/page
            }
        }

        // If the link links to a file with extension that is one of the possible extensions used, that means
        // it is a link to a page
        // and therefore, the extension in the link needs to be stripped
        String extension = PathUtil.getExtension(newPath);
        if (projectInformation.getGatheredExtensions().contains(extension))
            return PathUtil.truncateExtension(newPath);

        return newPath;
    }
}
