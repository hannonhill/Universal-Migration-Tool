/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.hannonhill.smt.CascadeAssetInformation;
import com.hannonhill.smt.MigrationStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;

/**
 * A service responsible for the actual migration
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class Migrator
{

    /**
     * Re-edits each page to align the links to make them tracked by Cascade Server
     */
    public static void alignLinks(ProjectInformation projectInformation)
    {
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        List<CascadeAssetInformation> blocks = migrationStatus.getCreatedBlocks();
        List<CascadeAssetInformation> pages = migrationStatus.getCreatedPages();

        for (CascadeAssetInformation block : blocks)
        {
            if (migrationStatus.isShouldStop())
                return;

            try
            {
                Log.add("Aligning links in block " + PathUtil.generateBlockLink(block, projectInformation.getUrl()) + "... ", migrationStatus);
                WebServices.realignXhtmlBlockLinks(block.getId(), projectInformation);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsAligned();
                Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsNotAligned();
                Log.add("<span style=\"color: red;\">Error: " + message + "</span><br/>", migrationStatus);
                e.printStackTrace();
            }
        }

        for (CascadeAssetInformation page : pages)
        {
            if (migrationStatus.isShouldStop())
                return;

            try
            {
                Log.add("Aligning links in page " + PathUtil.generatePageLink(page, projectInformation.getUrl()) + "... ", migrationStatus);
                WebServices.realignLinks(page.getId(), projectInformation);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsAligned();
                Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsNotAligned();
                Log.add("<span style=\"color: red;\">Error: " + message + "</span><br/>", migrationStatus);
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates files in Cascade that do not end with {@link XmlAnalyzer#FILE_TO_PAGE_EXTENSIONS} or
     * {@link XmlAnalyzer#FILE_TO_BLOCK_EXTENSIONS} extension and are not hidden (do not start with "."). Uses
     * {@link ProjectInformation#getFilesToProcess()} to get the actual files.
     * 
     * @param files
     * @param projectInformation
     * @param metadataSetId
     */
    private static void createFiles(ProjectInformation projectInformation, String metadataSetId)
    {
        for (File folderFile : projectInformation.getFilesToProcess())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String name = folderFile.getName();

            // Skip hidden files and folders
            if (name.startsWith("."))
                continue;

            String extension = PathUtil.getExtension(name);
            if (XmlAnalyzer.FILE_TO_PAGE_EXTENSIONS.contains(extension) || XmlAnalyzer.FILE_TO_BLOCK_EXTENSIONS.contains(extension))
                continue;

            createFile(folderFile, projectInformation, metadataSetId);
        }
    }

    /**
     * Goes through a set of files to process and creates Cascade Blocks out of them if the file ends with any
     * of the {@link XmlAnalyzer#FILE_TO_BLOCK_EXTENSIONS} extensions.
     * 
     * @param projectInformation
     * @param metadataSetId
     */
    public static void createXhtmlBlocks(ProjectInformation projectInformation, String metadataSetId)
    {
        for (File file : projectInformation.getFilesToProcess())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String extension = PathUtil.getExtension(file.getName());
            if (XmlAnalyzer.FILE_TO_BLOCK_EXTENSIONS.contains(extension))
                createXhtmlBlock(file, projectInformation, metadataSetId);
        }
    }

    /**
     * Creates a file asset in Cascade based on the information from the passed filesystem {@link File}.
     * 
     * @param folderFile
     * @param projectInformation
     * @param metadataSetId
     */
    private static void createFile(File folderFile, ProjectInformation projectInformation, String metadataSetId)
    {
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        try
        {
            WebServices.createFile(folderFile, projectInformation, metadataSetId);
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent
            // exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span style=\"color: red;\">Error when creating a file: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
        }
    }

    /**
     * Creates XHTML Block in Cascade with the content of the file put through JTidy.
     * 
     * @param file
     * @param projectInformation
     * @param metadataSetId
     */
    private static void createXhtmlBlock(File file, ProjectInformation projectInformation, String metadataSetId)
    {
        // web services create xhtml block
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        try
        {
            CascadeAssetInformation cascadeBlock = WebServices.createXhtmlBlock(file, projectInformation, metadataSetId);
            Log.add(PathUtil.generateBlockLink(cascadeBlock, projectInformation.getUrl()), migrationStatus);
            migrationStatus.addCreatedBlock(cascadeBlock);
            migrationStatus.incrementAssetsCreated();
            migrationStatus.incrementProgress(1);
            Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span style=\"color: red;\">Error: " + message + "</span><br/>", migrationStatus);

            // Increment progress by 2, because no link alignment will be needed for it
            migrationStatus.incrementProgress(2);
            migrationStatus.incrementAssetsWithErrors();

            e.printStackTrace();
        }
    }

    /**
     * Creates pages based on the information provided in {@link ProjectInformation}
     * 
     * @param projectInformation
     */
    public static void createPages(ProjectInformation projectInformation)
    {
        Set<File> filesToProcess = projectInformation.getFilesToProcess();
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        String metadataSetId = null;

        // Get site's default metadata set id
        try
        {
            String siteName = projectInformation.getSiteName();
            metadataSetId = WebServices.readSite(projectInformation.getUsername(), projectInformation.getPassword(), projectInformation.getUrl(),
                    siteName).getDefaultMetadataSetId();
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span style=\"color: red;\">Error when reading site's metadata set: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
            return;
        }

        // Create file assets
        try
        {
            // Store existing file paths first to speed up creation of files
            Log.add("Reading Cascade folder structure...<br/>", migrationStatus);
            WebServices.populateExistingCascadeAssets(projectInformation);

            // Create files that do not exist in Cascade
            createFiles(projectInformation, metadataSetId);
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span style=\"color: red;\">Error when uploading files: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
        }

        // Create XHTML Blocks
        createXhtmlBlocks(projectInformation, metadataSetId);

        for (File file : filesToProcess)
        {
            if (migrationStatus.isShouldStop())
                return;

            String name = file.getName();
            String extension = PathUtil.getExtension(name);

            if (!XmlAnalyzer.FILE_TO_PAGE_EXTENSIONS.contains(extension))
                continue;

            try
            {
                // To build the file path that needs to be displayed, we show only the part of the abosute
                // path after the xml directory
                String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                Log.add("Creating a page from file " + relativePath + "... ", migrationStatus);

                CascadeAssetInformation cascadePage = WebServices.createPage(file, projectInformation);

                Log.add(PathUtil.generatePageLink(cascadePage, projectInformation.getUrl()), migrationStatus);

                // Add the page to the list because links will need to be realigned.
                migrationStatus.addCreatedPage(cascadePage);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsCreated();
                Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                Log.add("<span style=\"color: red;\">Error: " + message + "</span><br/>", migrationStatus);

                // Increment progress by 2, because no link alignment will be needed for it
                migrationStatus.incrementProgress(2);
                migrationStatus.incrementAssetsWithErrors();

                e.printStackTrace();
            }
        }
    }
}
