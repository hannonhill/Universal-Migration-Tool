/*
 * Created on Nov 18, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This object holds all the current project information
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class ProjectInformation
{
    private static final String UPLOADS_DIR = "uploads";
    private static final String LOGS_DIR = "logs";
    public static final String OVERWRITE_BEHAVIOR_KEEP_EXISTING = "Keep existing (adds numbers to the end of new asset names)";
    public static final String OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING = "Overwrite existing (deletes and re-creates them)";
    public static final String OVERWRITE_BEHAVIOR_UPDATE_EXISTING = "Update existing (edits existing assets)";

    // user entered information
    private String url;
    private String username;
    private String password;
    private String siteName;
    private String xmlDirectory;
    private Map<String, String> contentTypeMap; // the mapping from XML Asset Type name to Cascade Content
                                                // Type path
    private List<String> assetTypeNames; // repeated information - an ordered list of XML Asset Type names
                                         // (the map above holds things that are not ordered)
    private Map<String, AssetType> assetTypes; // All XML Asset Type names and the actual XML Asset Type which
                                               // contains user entered field mappings (if mapped)
    private String overwriteBehavior; // Matches one of the constants
                                      // ProjectInformation.OVERWRITE_BEHAVIOR_???
    private Map<String, ExternalRootLevelFolderAssignment> externalRootLevelFolderAssignemnts;

    // analyzed information
    private boolean luminis = false;
    private Map<String, ContentTypeInformation> contentTypes; // content type path and the actual content type
                                                              // information (with the available metadata and
                                                              // dd fields)
    private final List<File> filesToProcess; // All the XML files that need to be processed during migration
    private Set<String> gatheredExtensions; // a set of extensions found for pages (for example ".html",
                                            // ".htm")
    private Set<String> gatheredRootLevelFolders; // a set of root level folders of XML pages
    private Set<String> gatheredLinkedRootLevelFolders; // a set of root level folders in links in the XML
                                                        // that link to assets
    private final Map<File, DetailedXmlPageInformation> pagesToProcess; // a map of a filesToProcess file
                                                                        // to detailed information about the
                                                                        // page coming from linkFile.xml in
                                                                        // Luminis dump
    // detailed information of the page in
    // that file

    // other useful information
    private MigrationStatus migrationStatus;
    private LinkCheckingStatus linkCheckingStatus;
    private String currentTask;
    private final String uploadsDir;
    private final String logsDir;

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
        logsDir = parentToCurrentDir + "/" + LOGS_DIR + "/";
        overwriteBehavior = OVERWRITE_BEHAVIOR_KEEP_EXISTING;
        migrationStatus = new MigrationStatus();
        linkCheckingStatus = new LinkCheckingStatus();
        currentTask = null;
        filesToProcess = new ArrayList<File>();
        gatheredExtensions = new HashSet<String>();
        gatheredRootLevelFolders = new HashSet<String>();
        gatheredLinkedRootLevelFolders = new HashSet<String>();
        contentTypes = new HashMap<String, ContentTypeInformation>();
        contentTypeMap = new HashMap<String, String>();
        externalRootLevelFolderAssignemnts = new HashMap<String, ExternalRootLevelFolderAssignment>();
        pagesToProcess = new HashMap<File, DetailedXmlPageInformation>();
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
     * @return Returns the xmlDirectory - this is the directory where the xml files reside for a specific
     *         folder.
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
     * @return Returns the contentTypeMap - the mapping from XML Asset Type name to Cascade Content Type path
     */
    public Map<String, String> getContentTypeMap()
    {
        return contentTypeMap;
    }

    /**
     * @param contentTypeMap the contentTypeMap to set - the mapping from XML Asset Type name to Cascade
     *        Content Type path
     */
    public void setContentTypeMap(Map<String, String> contentTypeMap)
    {
        this.contentTypeMap = contentTypeMap;
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
     * @return Returns the assetTypeNames - an ordered list of XML Asset Type names that exist in the
     *         contentTypeMap
     */
    public List<String> getAssetTypeNames()
    {
        return assetTypeNames;
    }

    /**
     * @param assetTypeNames the assetTypeNames to set - an ordered list of XML Asset Type names that exist in
     *        the contentTypeMap
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
     * @return Returns the contentTypes.
     */
    public Map<String, ContentTypeInformation> getContentTypes()
    {
        return contentTypes;
    }

    /**
     * @param contentTypes the contentTypes to set
     */
    public void setContentTypes(Map<String, ContentTypeInformation> contentTypes)
    {
        this.contentTypes = contentTypes;
    }

    /**
     * @return Returns the migrationStatus.
     */
    public MigrationStatus getMigrationStatus()
    {
        return migrationStatus;
    }

    /**
     * @return Returns the filesToProcess.
     */
    public List<File> getFilesToProcess()
    {
        return filesToProcess;
    }

    /**
     * @param migrationStatus the migrationStatus to set
     */
    public void setMigrationStatus(MigrationStatus migrationStatus)
    {
        this.migrationStatus = migrationStatus;
    }

    /**
     * @return Returns the gatheredExtensions.
     */
    public Set<String> getGatheredExtensions()
    {
        return gatheredExtensions;
    }

    /**
     * @param gatheredExtensions the gatheredExtensions to set
     */
    public void setGatheredExtensions(Set<String> gatheredExtensions)
    {
        this.gatheredExtensions = gatheredExtensions;
    }

    /**
     * @return Returns the logsDir.
     */
    public String getLogsDir()
    {
        return logsDir;
    }

    /**
     * @return Returns the linkCheckingStatus.
     */
    public LinkCheckingStatus getLinkCheckingStatus()
    {
        return linkCheckingStatus;
    }

    /**
     * @param linkCheckingStatus the linkCheckingStatus to set
     */
    public void setLinkCheckingStatus(LinkCheckingStatus linkCheckingStatus)
    {
        this.linkCheckingStatus = linkCheckingStatus;
    }

    /**
     * @return Returns the currentTask.
     */
    public String getCurrentTask()
    {
        return currentTask;
    }

    /**
     * @param currentTask the currentTask to set
     */
    public void setCurrentTask(String currentTask)
    {
        this.currentTask = currentTask;
    }

    /**
     * @return Returns the gatheredRootLevelFolders.
     */
    public Set<String> getGatheredRootLevelFolders()
    {
        return gatheredRootLevelFolders;
    }

    /**
     * @param gatheredRootLevelFolders the gatheredRootLevelFolders to set
     */
    public void setGatheredRootLevelFolders(Set<String> gatheredRootLevelFolders)
    {
        this.gatheredRootLevelFolders = gatheredRootLevelFolders;
    }

    /**
     * @return Returns the gatheredLinkedRootLevelFolders.
     */
    public Set<String> getGatheredLinkedRootLevelFolders()
    {
        return gatheredLinkedRootLevelFolders;
    }

    /**
     * @param gatheredLinkedRootLevelFolders the gatheredLinkedRootLevelFolders to set
     */
    public void setGatheredLinkedRootLevelFolders(Set<String> gatheredLinkedRootLevelFolders)
    {
        this.gatheredLinkedRootLevelFolders = gatheredLinkedRootLevelFolders;
    }

    /**
     * @return Returns the externalRootLevelFolderAssignemnts.
     */
    public Map<String, ExternalRootLevelFolderAssignment> getExternalRootLevelFolderAssignemnts()
    {
        return externalRootLevelFolderAssignemnts;
    }

    /**
     * @param externalRootLevelFolderAssignemnts the externalRootLevelFolderAssignemnts to set
     */
    public void setExternalRootLevelFolderAssignemnts(Map<String, ExternalRootLevelFolderAssignment> externalRootLevelFolderAssignemnts)
    {
        this.externalRootLevelFolderAssignemnts = externalRootLevelFolderAssignemnts;
    }

    /**
     * @return Returns the luminis.
     */
    public boolean isLuminis()
    {
        return luminis;
    }

    /**
     * @param luminis the luminis to set
     */
    public void setLuminis(boolean luminis)
    {
        this.luminis = luminis;
    }

    /**
     * @return Returns the pagesToProcess.
     */
    public Map<File, DetailedXmlPageInformation> getPagesToProcess()
    {
        return pagesToProcess;
    }
}
