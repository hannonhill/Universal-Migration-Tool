/*
 * Created on Nov 18, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt;

import java.nio.file.Path;
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
    public static final String OVERWRITE_BEHAVIOR_SKIP_EXISTING = "Skip existing (does nothing if asset already exists, always on for files)";

    // user entered information
    private String url;
    private String username;
    private String password;
    private String siteName;
    private String xmlDirectory;
    private String contentTypePath;
    private String overwriteBehavior; // Matches one of the constants
                                      // ProjectInformation.OVERWRITE_BEHAVIOR_???
    private Map<String, ExternalRootLevelFolderAssignment> externalRootLevelFolderAssignemnts;
    private final List<FieldMapping> fieldMappings = new ArrayList<>();
    private final Map<Field, String> staticValueMapping = new HashMap<>(); // this mapping maps from a Cascade
                                                                           // field to its static value it
                                                                           // should get

    // analyzed information
    private Map<String, ContentTypeInformation> contentTypes; // content type path and the actual content type
                                                              // information (with the available metadata and
                                                              // dd fields)
    private final Set<Path> filesToProcess; // All the files that need to be processed during migration -
                                            // it is a set to avoid duplicates and because order doesn't
                                            // really matter
    Set<String> gatheredExtensions = new HashSet<>();

    // path to id map
    private final Map<String, String> existingCascadeFiles;
    private final Map<String, String> existingCascadeXhtmlBlocks;
    private final Map<String, String> existingCascadePages;
    private final Map<String, String> existingCascadeFolders;
    private final Set<String> existingAssetPaths;

    private final Set<String> pageExtensions; // Extensions of files that need to be converted to pages
    private final Set<String> blockExtensions; // Extensions of files that need to be converted to xhtml
                                               // blocks

    // other useful information
    private MigrationStatus migrationStatus;
    private LinkCheckingStatus linkCheckingStatus;
    private String currentTask;
    private final String uploadsDir;
    private final String logsDir;

    // Original path and path the asset will be moved to (used for moving pages with conflicting paths by
    // appending "/index" to their paths)
    private final Map<String, String> pathMapping;

    /**
     * Constructor
     */
    public ProjectInformation()
    {
        // this is supposed to be the bin folder (or eclipse folder if runnign from Eclipse)
        String tomcatDir = System.getProperty("catalina.base");
        uploadsDir = tomcatDir + "/" + UPLOADS_DIR + "/";
        logsDir = tomcatDir + "/" + LOGS_DIR + "/";
        overwriteBehavior = OVERWRITE_BEHAVIOR_KEEP_EXISTING;
        migrationStatus = new MigrationStatus();
        linkCheckingStatus = new LinkCheckingStatus();
        currentTask = null;
        filesToProcess = new HashSet<>();
        contentTypes = new HashMap<>();
        externalRootLevelFolderAssignemnts = new HashMap<>();
        existingCascadeFiles = new HashMap<>();
        existingCascadeXhtmlBlocks = new HashMap<>();
        existingCascadePages = new HashMap<>();
        existingCascadeFolders = new HashMap<>();
        existingAssetPaths = new HashSet<>();
        pageExtensions = new HashSet<>();
        blockExtensions = new HashSet<>();
        pathMapping = new HashMap<>();

        setDefaultExtensions();
    }

    /**
     * Sets the default extensions
     */
    public void setDefaultExtensions()
    {
        pageExtensions.clear();
        pageExtensions.add(".html");
        pageExtensions.add(".php");
        pageExtensions.add(".jsp");
        pageExtensions.add(".htm");
        pageExtensions.add(".asp");

        blockExtensions.clear();
        blockExtensions.add(".inc");
        blockExtensions.add(".txt");
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
    public Set<Path> getFilesToProcess()
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
     * @return Returns the existingCascadeFiles.
     */
    public Map<String, String> getExistingCascadeFiles()
    {
        return existingCascadeFiles;
    }

    public void addExistingFile(String filePath, String fileId)
    {
        filePath = filePath.toLowerCase();
        existingCascadeFiles.put(filePath, fileId);
        existingAssetPaths.add(filePath);
    }

    /**
     * @return Returns the existingCascadeXhtmlBlocks.
     */
    public Map<String, String> getExistingCascadeXhtmlBlocks()
    {
        return existingCascadeXhtmlBlocks;
    }

    public void addExistingXhtmlBlock(String blockPath, String blockId)
    {
        blockPath = blockPath.toLowerCase();
        existingCascadeXhtmlBlocks.put(blockPath, blockId);
        existingAssetPaths.add(blockPath);
    }

    /**
     * @return Returns the existingCascadePages.
     */
    public Map<String, String> getExistingCascadePages()
    {
        return existingCascadePages;
    }

    public void addExistingPage(String pagePath, String pageId)
    {
        pagePath = pagePath.toLowerCase();
        existingCascadePages.put(pagePath, pageId);
        existingAssetPaths.add(pagePath);
    }

    /**
     * @return Returns the existingCascadeFolders.
     */
    public Map<String, String> getExistingCascadeFolders()
    {
        return existingCascadeFolders;
    }

    public void addExistingFolder(String folderPath, String folderId)
    {
        folderPath = folderPath.toLowerCase();
        existingCascadeFolders.put(folderPath, folderId);
        existingAssetPaths.add(folderPath);
    }

    /**
     * @return Returns the existingAssetPaths.
     */
    public Set<String> getExistingAssetPaths()
    {
        return existingAssetPaths;
    }

    /**
     * @return Returns the contentTypePath.
     */
    public String getContentTypePath()
    {
        return contentTypePath;
    }

    /**
     * @param contentTypePath the contentTypePath to set
     */
    public void setContentTypePath(String contentTypePath)
    {
        this.contentTypePath = contentTypePath;
    }

    /**
     * @return Returns the fieldMappings.
     */
    public List<FieldMapping> getFieldMappings()
    {
        return fieldMappings;
    }

    /**
     * @return Returns the staticValueMapping.
     */
    public Map<Field, String> getStaticValueMapping()
    {
        return staticValueMapping;
    }

    /**
     * @return Returns the pageExtensions.
     */
    public Set<String> getPageExtensions()
    {
        return pageExtensions;
    }

    /**
     * @return Returns a comma separated list of page extensions
     */
    public String getPageExtensionsString()
    {
        return convertSetToExtensions(pageExtensions);
    }

    /**
     * Sets the page extensions from a comma separated list
     * 
     * @param extensions
     */
    public void setPageExtensions(String extensions)
    {
        pageExtensions.clear();
        pageExtensions.addAll(convertExtensionsToSet(extensions));
    }

    /**
     * @return Returns the blockExtensions.
     */
    public Set<String> getBlockExtensions()
    {
        return blockExtensions;
    }

    /**
     * @return Returns a comma separated list of block extensions
     */
    public String getBlockExtensionsString()
    {
        return convertSetToExtensions(blockExtensions);
    }

    /**
     * Sets the block extensions from a comma separated list
     * 
     * @param extensions
     */
    public void setBlockExtensions(String extensions)
    {
        blockExtensions.clear();
        blockExtensions.addAll(convertExtensionsToSet(extensions));
    }

    /**
     * Converts a set of extensions into a comma separated list
     * 
     * @param set
     * @return
     */
    private String convertSetToExtensions(Set<String> set)
    {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (String extension : set)
        {
            if (!first)
                result.append(", ");
            first = false;
            result.append(extension);
        }
        return result.toString();
    }

    /**
     * Converts a comma separated list of extensions into a set
     * 
     * @param extensions
     * @return
     */
    private Set<String> convertExtensionsToSet(String extensions)
    {
        Set<String> result = new HashSet<>();

        if (extensions == null || extensions.trim().equals(""))
            return result;

        String[] extensionsArray = extensions.split(",");
        for (String extension : extensionsArray)
            result.add(extension.trim());

        return result;
    }

    /**
     * @return Returns the pathMapping.
     */
    public Map<String, String> getPathMapping()
    {
        return pathMapping;
    }
}
