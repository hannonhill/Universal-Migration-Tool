/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.service;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

import com.hannonhill.umt.CascadeAssetInformation;
import com.hannonhill.umt.MigrationStatus;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.util.PathUtil;

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
                RestApi.realignXhtmlBlockLinks(block.getId(), projectInformation);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsAligned();
                Log.add("<span class=\"text-success\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsNotAligned();
                Log.add("<span class=\"text-error\">Error: " + message + "</span><br/>", migrationStatus);
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
                RestApi.realignLinks(page.getId(), projectInformation);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsAligned();
                Log.add("<span class=\"text-success\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                migrationStatus.incrementProgress(1);
                migrationStatus.incrementAssetsNotAligned();
                Log.add("<span class=\"text-error\">Error: " + message + "</span><br/>", migrationStatus);
                e.printStackTrace();
            }
        }
    }

    private static void createFolders(ProjectInformation projectInformation) throws Exception
    {
        for (Path folderFile : projectInformation.getFilesToProcess())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String name = folderFile.getFileName().toString();

            // Skip hidden files and folders
            if (name.startsWith("."))
                continue;

            RestApi.createParentFolder(folderFile, projectInformation);
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
        for (Path folderFile : projectInformation.getFilesToProcess())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String name = folderFile.getFileName().toString();

            // Skip hidden files and folders
            if (name.startsWith("."))
                continue;

            String extension = PathUtil.getExtension(name);
            if (projectInformation.getPageExtensions().contains(extension) || projectInformation.getBlockExtensions().contains(extension))
                continue;

            createFile(folderFile, projectInformation, metadataSetId);
            projectInformation.getMigrationStatus().incrementProgress(2);
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
        for (Path file : projectInformation.getFilesToProcess())
        {
            if (projectInformation.getMigrationStatus().isShouldStop())
                return;

            String extension = PathUtil.getExtension(file.getFileName().toString());
            if (projectInformation.getBlockExtensions().contains(extension))
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
    private static void createFile(Path folderFile, ProjectInformation projectInformation, String metadataSetId)
    {
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        try
        {
            RestApi.createFile(folderFile, projectInformation, metadataSetId);
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent
            // exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span class=\"text-error\">Error when creating a file: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
            migrationStatus.incrementAssetsWithErrors();
        }
    }

    /**
     * Creates XHTML Block in Cascade with the content of the file put through JTidy.
     */
    private static void createXhtmlBlock(Path file, ProjectInformation projectInformation, String metadataSetId)
    {
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        try
        {
            CascadeAssetInformation cascadeBlock = RestApi.createXhtmlBlock(file, projectInformation, metadataSetId);
            Log.add(PathUtil.generateBlockLink(cascadeBlock, projectInformation.getUrl()), migrationStatus);
            migrationStatus.incrementProgress(1);
            migrationStatus.addCreatedBlock(cascadeBlock);
            if (cascadeBlock.isAlreadyExisted())
            {
                Log.add("<span class=\"text-warning\">already existed.</span><br/>", migrationStatus);
                migrationStatus.incrementAssetsSkipped();
            }
            else
            {
                migrationStatus.incrementAssetsCreated();
                Log.add("<span class=\"text-success\">success.</span><br/>", migrationStatus);
            }
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span class=\"text-error\">Error: " + message + "</span><br/>", migrationStatus);

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
        Set<Path> filesToProcess = projectInformation.getFilesToProcess();
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        String metadataSetId = null;

        // Get site's default metadata set id
        try
        {
            String siteName = projectInformation.getSiteName();
            metadataSetId = RestApi
                    .readSite(projectInformation.getUsername(), projectInformation.getPassword(), projectInformation.getUrl(), siteName)
                    .getDefaultMetadataSetId();
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span class=\"text-error\">Error when reading site's metadata set: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
            return;
        }

        // Create file assets
        try
        {
            // Store existing file paths first to speed up creation of files
            Log.add("Reading Cascade folder structure...<br/>", migrationStatus);
            RestApi.populateExistingCascadeAssets(projectInformation);

            // Create folders ahead of time so that the tool knows if there will be conflicts when creating
            // pages (pages having same path as folders)
            Log.add("Creating missing folders<br/>", projectInformation.getMigrationStatus());
            createFolders(projectInformation);
        }
        catch (Exception e)
        {
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span class=\"text-error\">Error: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
            return;
        }

        try
        {
            // Create files that do not exist in Cascade
            createFiles(projectInformation, metadataSetId);
        }
        catch (Exception e)
        {
            // Sometimes the exception message is null, so we get the message from the parent exception
            String message = e.getMessage();
            if (message == null && e.getCause() != null)
                message = e.getCause().getMessage();

            Log.add("<span class=\"text-error\">Error when uploading files: " + message + "</span><br/>", migrationStatus);
            e.printStackTrace();
        }

        // Create XHTML Blocks
        createXhtmlBlocks(projectInformation, metadataSetId);

        for (Path file : filesToProcess)
        {
            if (migrationStatus.isShouldStop())
                return;

            String name = file.getFileName().toString();
            String extension = PathUtil.getExtension(name);

            if (!projectInformation.getPageExtensions().contains(extension))
                continue;

            try
            {
                // To build the file path that needs to be displayed, we show only the part of the abosute
                // path after the xml directory
                String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());
                relativePath = relativePath.replace(java.io.File.separator, "/");
                if (!XmlAnalyzer.allCharactersLegal(relativePath))
                    relativePath = XmlAnalyzer.removeIllegalCharacters(relativePath);

                Log.add("Creating a page from file " + relativePath + "... ", migrationStatus);

                CascadeAssetInformation cascadePage = RestApi.createPage(file, projectInformation);

                Log.add(PathUtil.generatePageLink(cascadePage, projectInformation.getUrl()), migrationStatus);

                migrationStatus.incrementProgress(1);
                migrationStatus.addCreatedPage(cascadePage);

                // Add the page to the list because links will need to be realigned.
                if (cascadePage.isAlreadyExisted())
                {
                    migrationStatus.incrementAssetsSkipped();
                    Log.add("<span class=\"text-warning\">already existed.</span><br/>", migrationStatus);
                }
                else
                {
                    migrationStatus.incrementAssetsCreated();
                    Log.add("<span class=\"text-success\">success.</span><br/>", migrationStatus);
                }
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                Log.add("<span class=\"text-error\">Error: " + message + "</span><br/>", migrationStatus);

                // Increment progress by 2, because no link alignment will be needed for it
                migrationStatus.incrementProgress(2);
                migrationStatus.incrementAssetsWithErrors();

                e.printStackTrace();
            }
        }
    }
}
