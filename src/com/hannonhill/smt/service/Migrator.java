/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hannonhill.smt.CascadeAssetInformation;
import com.hannonhill.smt.DetailedXmlPageInformation;
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

    private static final List<String> ignorableLuminisFileNames;

    static
    {
        ignorableLuminisFileNames = new ArrayList<String>();

        ignorableLuminisFileNames.add("linkFile.xml");
        ignorableLuminisFileNames.add("VarAndMetaTagValues.xml");
        ignorableLuminisFileNames.add("sct_nav_node.xml");
        ignorableLuminisFileNames.add("sct_page_layout.xml");
    }

    /**
     * Creates the pages and their parent folders if needed
     */
    public static void createPages(ProjectInformation projectInformation)
    {
        if (projectInformation.getLuminisFolder() != null)
            createLuminisPages(projectInformation);
        else
            createSerenaPages(projectInformation);

    }

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
     * Creates Serena pages based on the information provided in {@link ProjectInformation}
     * 
     * @param projectInformation
     */
    private static void createSerenaPages(ProjectInformation projectInformation)
    {
        List<File> files = projectInformation.getFilesToProcess();
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();

        for (File file : files)
        {
            if (migrationStatus.isShouldStop())
                return;

            try
            {
                // To build the file path that needs to be displayed, we show only the part of the abosute
                // path after the xml directory
                String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                Log.add("Creating a page from file " + relativePath + "... ", migrationStatus);
                DetailedXmlPageInformation page = XmlAnalyzer.parseSerenaXmlFile(file);

                // If the asset type wasn't mapped, skip this page
                String assetTypeName = page.getAssetType();
                String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
                if (contentTypePath == null)
                {
                    Log.add("<span style=\"color: blue;\">Asset type " + page.getAssetType() + " was not mapped. Skipping the file.</span><br/>",
                            migrationStatus);

                    // Increment progress by 2, because no link alignment will be needed for it
                    migrationStatus.incrementProgress(2);
                    migrationStatus.incrementPagesSkipped();
                    continue;
                }

                LinkRewriter.rewriteLinkAndRemoveSerenaAttributes(page, projectInformation);
                CascadeAssetInformation cascadePage = WebServices.createPage(page, projectInformation);

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

    /**
     * Recursively creates files in Cascade - out of passed {@link File} objects, creates cascade file assets
     * for the {@link File} objects that actually are files, are not hidden (do not start with "."), are not
     * ignorableLuminisFileNames and do not belong to filesToProcess list (as those will be pages in Cascade).
     * 
     * @param folderFiles
     * @param projectInformation
     * @param metadataSetId
     */
    private static void createLuminisFiles(List<File> folderFiles, ProjectInformation projectInformation, String metadataSetId)
    {
        List<File> filesToProcess = projectInformation.getFilesToProcess();
        for (File folderFile : folderFiles)
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String name = folderFile.getName();

            // Skip hidden files and folders
            if (name.startsWith("."))
                continue;

            // If it's a folder, recursively create files from it but skip hidden folders
            if (folderFile.isDirectory())
            {
                createLuminisFiles(FileSystem.getFolderContents(folderFile), projectInformation, metadataSetId);
                continue;
            }

            // skip filesToProcess
            if (!filesToProcess.contains(folderFile))
            {
                // .xhtml files are processed as XHTML Blocks separately
                if (name.endsWith(".xhtml"))
                    continue;

                // Create a file, but skip if it's one of ignorableLuminisFileNames
                if (!ignorableLuminisFileNames.contains(name))
                    createLuminisFile(folderFile, projectInformation, metadataSetId);
            }
        }
    }

    /**
     * Goes through gathered list of xhtml files to process and creates corresponding XHTML Blocks in Cascade
     * 
     * @param projectInformation
     * @param metadataSetId
     */
    public static void createLuminisXhtmlBlocks(ProjectInformation projectInformation, String metadataSetId)
    {
        for (File file : projectInformation.getXhtmlFiles())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            createLuminisXhtmlBlock(file, projectInformation, metadataSetId);
        }
    }

    /**
     * Creates a file asset in Cascade based on the information from the passed filesystem {@link File}.
     * 
     * @param folderFile
     * @param projectInformation
     * @param metadataSetId
     */
    private static void createLuminisFile(File folderFile, ProjectInformation projectInformation, String metadataSetId)
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
    private static void createLuminisXhtmlBlock(File file, ProjectInformation projectInformation, String metadataSetId)
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
     * Creates Luminis pages based on the information provided in {@link ProjectInformation}
     * 
     * @param projectInformation
     */
    private static void createLuminisPages(ProjectInformation projectInformation)
    {
        List<File> filesToProcess = projectInformation.getFilesToProcess();
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
            List<File> folderFiles = FileSystem.getFolderContents(projectInformation.getLuminisFolder());

            // Store existing file paths first to speed up creation of files
            Log.add("Reading Cascade folder structure...<br/>", migrationStatus);
            WebServices.populateExistingCascadeAssets(projectInformation);

            // Create files that do not exist in Cascade
            createLuminisFiles(folderFiles, projectInformation, metadataSetId);
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
        createLuminisXhtmlBlocks(projectInformation, metadataSetId);

        for (File file : filesToProcess)
        {
            if (migrationStatus.isShouldStop())
                return;

            try
            {
                // To build the file path that needs to be displayed, we show only the part of the abosute
                // path after the xml directory
                String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                Log.add("Creating a page from file " + relativePath + "... ", migrationStatus);
                DetailedXmlPageInformation page = projectInformation.getPagesToProcess().get(file);
                XmlAnalyzer.parseLuminisXmlFile(file, page, projectInformation);

                // If the asset type wasn't mapped, skip this page
                String assetTypeName = page.getAssetType();
                String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
                if (contentTypePath == null)
                {
                    Log.add("<span style=\"color: blue;\">Asset type " + page.getAssetType() + " was not mapped. Skipping the file.</span><br/>",
                            migrationStatus);

                    // Increment progress by 2, because no link alignment will be needed for it
                    migrationStatus.incrementProgress(2);
                    migrationStatus.incrementPagesSkipped();
                    continue;
                }

                LinkRewriter.rewriteLuminisLinks(page, projectInformation);
                CascadeAssetInformation cascadePage = WebServices.createPage(page, projectInformation);

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
