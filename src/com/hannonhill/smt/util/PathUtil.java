/*
 * Created on Dec 3, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.util;

import java.io.File;

/**
 * Utility methods related to path manipulations
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class PathUtil
{
    /**
     * Returns a part of absolute path that starts from the xml directory path (xml directory path is cut off).
     * 
     * @param file
     * @param xmlDirectoryPath
     * @return
     */
    public static String getRelativePath(File file, String xmlDirectoryPath)
    {
        return file.getAbsolutePath().substring(xmlDirectoryPath.length());
    }

    /**
     * Parses the path and returns the name part of it
     * 
     * @param path
     * @return
     */
    public static String getNameFromPath(String path)
    {
        return path.lastIndexOf('/') == -1 ? path : path.substring(path.lastIndexOf('/') + 1);
    }

    /**
     * Truncates the extension of the file name. For example x.html will return x. If there is no extension, the full name will be returned.
     * 
     * @param name
     * @return
     */
    public static String truncateExtension(String name)
    {
        return name.lastIndexOf('.') == -1 ? name : name.substring(0, name.lastIndexOf('.'));
    }

    /**
     * Parses the path and returns the parent folder path part of it or '/' if the path is a the root level.
     * 
     * @param path
     * @return
     */
    public static String getParentFolderPathFromPath(String path)
    {
        return path.lastIndexOf('/') == -1 ? "/" : path.substring(0, path.lastIndexOf('/'));
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
        int correctPartsCounter = correctParts.length - 1; // The counter starts at the last location and goes down
        int oldPartsIndex; // The index for the old parts starts at 0 and goes up

        // For each "../" decrement the counter
        for (oldPartsIndex = 0; oldPartsIndex < oldParts.length; oldPartsIndex++)
        {
            if (!oldParts[oldPartsIndex].equals(".."))
                break;

            correctPartsCounter--;
        }

        // Once we know how many times we went to parent folder using "../", we know the common part of the absolute path so we can build it
        for (int correctPartsIndex = 0; correctPartsIndex < correctPartsCounter; correctPartsIndex++)
            newPath.append("/" + correctParts[correctPartsIndex]);

        // After we have the common part, we get the rest of the relative part (after all the "../")
        for (; oldPartsIndex < oldParts.length; oldPartsIndex++)
            newPath.append("/" + oldParts[oldPartsIndex]);

        return newPath.toString();
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

        return true;
    }
}
