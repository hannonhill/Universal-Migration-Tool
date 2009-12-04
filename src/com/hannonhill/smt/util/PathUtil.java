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
}
