/*
 * Created on Dec 3, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.util;

import java.io.File;
import java.nio.file.Path;

import com.hannonhill.umt.CascadeAssetInformation;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.api.Identifier;
import com.hannonhill.umt.service.XmlAnalyzer;

/**
 * Utility methods related to path manipulations
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class PathUtil
{
    /**
     * Returns a part of absolute path that starts from the xml directory path (xml directory path is cut
     * off).
     * 
     * @param pageFile
     * @param xmlDirectoryPath
     * @return
     */
    public static String getRelativePath(Path pageFile, String xmlDirectoryPath)
    {
        return removeLeadingSlashes(pageFile.toString().substring(xmlDirectoryPath.length()));
    }

    /**
     * Parses the path and returns the name part of it
     * 
     * @param path
     * @return
     */
    public static String getNameFromPath(String path)
    {
        if (path.contains(File.separator))
            return removeLeadingSlashes(path.lastIndexOf(File.separator) == -1 ? path : path.substring(path.lastIndexOf(File.separator) + 1));

        return removeLeadingSlashes(path.lastIndexOf('/') == -1 ? path : path.substring(path.lastIndexOf('/') + 1));
    }

    /**
     * Truncates the extension of the file name. For example x.html will return x. If there is no extension,
     * the full name will be returned.
     * 
     * @param name
     * @return
     */
    public static String truncateExtension(String name)
    {
        return name.lastIndexOf('.') == -1 ? name : name.substring(0, name.lastIndexOf('.'));
    }

    /**
     * Returns the extension of the file name. For example x.html will return .html. If there is no extension,
     * an empty string will be returned.
     * 
     * @param name
     * @return
     */
    public static String getExtension(String name)
    {
        return name.lastIndexOf('.') == -1 ? "" : name.substring(name.lastIndexOf('.'));
    }

    /**
     * Parses the path and returns the parent folder path part of it or {@link File#separator} if the path is
     * a the root level.
     */
    public static String getParentFolderPathFilesystem(String path)
    {
        if (path.contains(File.separator))
            return path.lastIndexOf(File.separator) == -1 ? File.separator
                    : removeLeadingSlashes(path.substring(0, path.lastIndexOf(File.separator)));

        return path.lastIndexOf(File.separator) == -1 ? File.separator : removeLeadingSlashes(path.substring(0, path.lastIndexOf('/')));
    }

    /**
     * Parses the path and returns the parent folder path part of it or "/" if the path is a the root level.
     */
    public static String getParentFolderPathCascade(String path)
    {
        path = PathUtil.removeLeadingSlashes(path);
        int lastSlashIndex = path.lastIndexOf('/');
        if (lastSlashIndex == -1)
            return "/";

        return path.substring(0, lastSlashIndex);
    }

    /**
     * Converts a relative path starting from currentLocation to an absolute path
     * 
     * @param relative
     * @param currentLocation
     * @return
     */
    public static String convertRelativeToAbsolute(String relative, String currentLocation)
    {
        // Don't convert empty strings
        if (relative.equals(""))
            return "";

        // Divide the relative path and current location into parts by slashes
        String[] oldParts = relative.split("/");
        String[] correctParts = currentLocation.split("/");

        StringBuilder newPath = new StringBuilder();
        int correctPartsCounter = correctParts.length - 1; // The counter starts at the last location and goes
                                                           // down
        int oldPartsIndex; // The index for the old parts starts at 0 and goes up

        // For each "../" decrement the counter
        for (oldPartsIndex = 0; oldPartsIndex < oldParts.length; oldPartsIndex++)
        {
            if (!oldParts[oldPartsIndex].equals(".."))
                break;

            correctPartsCounter--;
        }

        // Once we know how many times we went to parent folder using "../", we know the common part of the
        // absolute path so we can build it
        for (int correctPartsIndex = 0; correctPartsIndex < correctPartsCounter; correctPartsIndex++)
            newPath.append("/" + correctParts[correctPartsIndex]);

        // After we have the common part, we get the rest of the relative part (after all the "../")
        for (; oldPartsIndex < oldParts.length; oldPartsIndex++)
            newPath.append("/" + oldParts[oldPartsIndex]);

        return "/" + removeLeadingSlashes(newPath.toString());
    }

    /**
     * Returns true if the link is relative, meaning it doesn't start with "/" or protocol (like "http://")
     * 
     * @param link
     * @return
     */
    public static boolean isLinkRelative(String link)
    {
        // Ignore empty links
        if (link.equals(""))
            return false;

        if (link.startsWith("/"))
            return false;

        if (link.contains("://"))
            return false;

        if (link.startsWith("mailto:"))
            return false;

        return true;
    }

    /**
     * Returns true if the link is Cascade type, meaning in a form of /path/to/asset (starts with "/")
     * 
     * @param link
     * @return
     */
    public static boolean isLinkCascade(String link)
    {
        return link.startsWith("/") || link.startsWith("site://");
    }

    /**
     * Recursively removes leading slashes (one or more) if they are there. Leaves leading slash if link is
     * only the leading slash ("/").
     */
    public static String removeLeadingSlashes(String link)
    {
        if (link == null)
            return "";
        return (link.startsWith(File.separator) || link.startsWith("/")) ? removeLeadingSlashes(link.substring(1)) : link;
    }

    /**
     * Returns the part of the link that does not include the anchor part
     * 
     * @param link
     * @return
     */
    public static String getPartWithoutAnchor(String link)
    {
        return link.indexOf('#') == -1 ? link : link.substring(0, link.indexOf('#'));
    }

    /**
     * Returns the anchor part of the link
     * 
     * @param link
     * @return
     */
    public static String getAnchorPart(String link)
    {
        return link.indexOf('#') == -1 ? "" : link.substring(link.indexOf('#'));
    }

    /**
     * Adds "http://" in front if necessary. Strips "/ws/services/AssetOperationService?wsdl" from the end if
     * it was there from previous versions of the tool.
     * 
     * @param url a url in format "localhost:8080" or "http://localhost:8080" or
     *        "localhost:8080/ws/services/AssetOperationService" or
     *        "localhost:8080/ws/services/AssetOperationService?wsdl" or
     *        "http://localhost:8080/ws/services/AssetOperationService" or
     *        "http://localhost:8080/ws/services/AssetOperationService?wsdl"
     * @return a url in format "http://localhost:8080"
     */
    public static String convertToFullCascadeInstanceURL(String url)
    {
        if (!url.startsWith("http"))
            url = "http://" + url;

        if (url.contains("/ws/services/AssetOperationService"))
            url = url.substring(0, url.indexOf("/ws/services/AssetOperationService"));

        return url;
    }

    /**
     * Generates a link to the page in Cascade Server
     * 
     * @param cascadePage
     * @param cascadeUrl
     * @return
     */
    public static String generatePageLink(CascadeAssetInformation cascadePage, String cascadeUrl)
    {
        return "<a href=\"" + convertToFullCascadeInstanceURL(cascadeUrl) + "/entity/open.act?id=" + cascadePage.getId()
                + "&amp;type=page\" target=\"_blank\">/" + cascadePage.getPath() + "</a> ";
    }

    public static String generateFileLink(Identifier cascadeFile, String cascadeUrl)
    {
        return "<a href=\"" + convertToFullCascadeInstanceURL(cascadeUrl) + "/entity/open.act?id=" + cascadeFile.getId()
                + "&amp;type=file\" target=\"_blank\">/" + cascadeFile.getPath().getPath() + "</a> ";
    }

    /**
     * Generates a link to the block in Cascade Servicer
     * 
     * @param cascadeBlock
     * @param cascadeUrl
     * @return
     */
    public static String generateBlockLink(CascadeAssetInformation cascadeBlock, String cascadeUrl)
    {
        return "<a href=\"" + convertToFullCascadeInstanceURL(cascadeUrl) + "/entity/open.act?id=" + cascadeBlock.getId()
                + "&amp;type=block\" target=\"_blank\">/" + cascadeBlock.getPath() + "</a> ";
    }

    /**
     * Removes the root folder from the path. For example /A/B/c.html gets converted to /B/c.html
     * 
     * @param path
     * @return
     */
    public static String skipRootFolder(String path)
    {
        if (path.startsWith("/"))
            path = path.substring(1);

        return path.substring(path.indexOf('/'));
    }

    /**
     * Checks how many ../ are there in the link
     * 
     * @param link
     * @return
     */
    public static int countLevelUps(String link)
    {
        int counter = 0;
        while (link.startsWith("../"))
        {
            counter++;
            link = link.substring(3);
        }
        return counter;
    }

    /**
     * Creates a Cascade path using a file system file path
     * 
     * @param file
     * @param projectInformation
     * @return
     */
    public static String createPagePathFromFileSystemFile(Path file, ProjectInformation projectInformation)
    {
        return PathUtil.truncateExtension(PathUtil.getRelativePath(file, projectInformation.getXmlDirectory()));
    }

    /**
     * Returns the SITENAME part of site://SITENAME/path/to/asset path. If the path does not contain site
     * name, returns null.
     * 
     * @param path
     * @return
     */
    public static String getSiteNameFromPath(String path)
    {
        if (path == null)
            return null;

        if (!path.startsWith("site://"))
            return null;

        String start = path.substring(7);
        return start.substring(0, start.indexOf('/'));
    }

    /**
     * Returns the path/to/asset part of site://SITENAME/path/to/asset path. If the path does not contain site
     * name, returns full path.
     * 
     * @param path
     * @return
     */
    public static String getCachePathFromPath(String path)
    {
        if (path == null)
            return null;

        if (!path.startsWith("site://"))
            return path;

        String site = path.substring(7);
        return site.substring(site.indexOf('/') + 1);
    }

    public static String convertFilesystemPathToCascade(Path filesystemPath, boolean truncateExtension, ProjectInformation projectInformation)
    {
        String path = truncateExtension ? PathUtil.createPagePathFromFileSystemFile(filesystemPath, projectInformation)
                : PathUtil.getRelativePath(filesystemPath, projectInformation.getXmlDirectory());
        path = path.replace(java.io.File.separator, "/");
        if (!XmlAnalyzer.allCharactersLegal(path))
            path = XmlAnalyzer.removeIllegalCharacters(path);

        return path;
    }
}
