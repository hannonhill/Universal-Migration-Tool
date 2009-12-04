/*
 * Created on Nov 18, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This object holds all the current project information
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class ProjectInformation
{
    private static final String UPLOADS_DIR = "uploads";
    public static final String OVERWRITE_BEHAVIOR_KEEP_EXISTING = "Keep existing (adds numbers to the end of new asset names)";
    public static final String OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING = "Overwrite existing (deletes and re-creates them)";
    public static final String OVERWRITE_BEHAVIOR_UPDATE_EXISTING = "Update existing (edits existing assets)";

    // user entered information
    private String url;
    private String username;
    private String password;
    private String siteName;
    private String xmlDirectory;
    private Map<String, String> contentTypeMap;
    private List<String> assetTypeNames; // repeated information - an ordered list of asset type names (the map above holds things that are not ordered)
    private String overwriteBehavior;

    // analyzed information - asset type name and the actual asset type
    private Map<String, AssetType> assetTypes;

    // Cascade information
    private Set<String> contentTypePaths;

    private final List<String> errors;

    private final String uploadsDir;

    /**
     * Constructor
     */
    public ProjectInformation()
    {
        // this is supposed to be the bin folder (or eclipse folder if runnign from Eclipse)
        String currentDir = System.getProperty("user.dir");
        int lastSlash = currentDir.lastIndexOf('/') == -1 ? currentDir.lastIndexOf('\\') : currentDir.lastIndexOf('/');
        String parentToCurrentDir = currentDir.substring(0, lastSlash);
        uploadsDir = parentToCurrentDir + "/" + UPLOADS_DIR + "/";
        overwriteBehavior = OVERWRITE_BEHAVIOR_KEEP_EXISTING;
        errors = new ArrayList<String>();
    }

    /**
     * @return Returns the url.
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    /**
     * @return Returns the username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return Returns the password.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return Returns the siteName.
     */
    public String getSiteName()
    {
        return siteName;
    }

    /**
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName)
    {
        this.siteName = siteName;
    }

    /**
     * @return Returns the uploadsDir - this is the directory that contains multiple upload folders.
     */
    public String getUploadsDir()
    {
        return uploadsDir;
    }

    /**
     * @return Returns the xmlDirectory - this is the directory where the xml files reside for a specific folder.
     */
    public String getXmlDirectory()
    {
        return xmlDirectory;
    }

    /**
     * @param xmlDirectory the xmlDirectory to set
     */
    public void setXmlDirectory(String xmlDirectory)
    {
        this.xmlDirectory = xmlDirectory;
    }

    /**
     * @return Returns the contentTypePaths.
     */
    public Set<String> getContentTypePaths()
    {
        return contentTypePaths;
    }

    /**
     * @return Returns the contentTypeMap.
     */
    public Map<String, String> getContentTypeMap()
    {
        return contentTypeMap;
    }

    /**
     * @param contentTypeMap the contentTypeMap to set
     */
    public void setContentTypeMap(Map<String, String> contentTypeMap)
    {
        this.contentTypeMap = contentTypeMap;
    }

    /**
     * @param contentTypePaths the contentTypePaths to set
     */
    public void setContentTypePaths(Set<String> contentTypePaths)
    {
        this.contentTypePaths = contentTypePaths;
    }

    /**
     * @return Returns the assetTypes.
     */
    public Map<String, AssetType> getAssetTypes()
    {
        return assetTypes;
    }

    /**
     * @param assetTypes the assetTypes to set
     */
    public void setAssetTypes(Map<String, AssetType> assetTypes)
    {
        this.assetTypes = assetTypes;
    }

    /**
     * @return Returns the assetTypeNames.
     */
    public List<String> getAssetTypeNames()
    {
        return assetTypeNames;
    }

    /**
     * @param assetTypeNames the assetTypeNames to set
     */
    public void setAssetTypeNames(List<String> assetTypeNames)
    {
        this.assetTypeNames = assetTypeNames;
    }

    /**
     * @return Returns the overwriteBehavior.
     */
    public String getOverwriteBehavior()
    {
        return overwriteBehavior;
    }

    /**
     * @param overwriteBehavior the overwriteBehavior to set
     */
    public void setOverwriteBehavior(String overwriteBehavior)
    {
        this.overwriteBehavior = overwriteBehavior;
    }

    /**
     * @return Returns the errors.
     */
    public List<String> getErrors()
    {
        return errors;
    }
}
