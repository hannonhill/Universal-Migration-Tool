/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.util.List;

import com.hannonhill.smt.CascadePageInformation;
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
    /**
     * Creates the pages and their parent folders if needed
     */
    public static void createPages(ProjectInformation projectInformation)
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
                CascadePageInformation cascadePage = WebServices.createPage(page, projectInformation);

                Log.add(PathUtil.generatePageLink(cascadePage, projectInformation.getUrl()), migrationStatus);

                // Add the page to the list because links will need to be realigned.
                migrationStatus.getCreatedPages().add(cascadePage);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementPagesCreated();
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
                migrationStatus.incrementPagesWithErrors();

                e.printStackTrace();
            }
        }
    }

    /**
     * Re-edits each page to align the links to make them tracked by Cascade Server
     */
    public static void alignLinks(ProjectInformation projectInformation)
    {
        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        List<CascadePageInformation> pages = migrationStatus.getCreatedPages();

        for (CascadePageInformation page : pages)
        {
            if (migrationStatus.isShouldStop())
                return;

            try
            {
                Log.add("Aligning links in page " + PathUtil.generatePageLink(page, projectInformation.getUrl()) + "... ", migrationStatus);
                WebServices.realignLinks(page.getId(), projectInformation);
                migrationStatus.incrementProgress(1);
                migrationStatus.incrementPagesAligned();
                Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
            }
            catch (Exception e)
            {
                // Sometimes the exception message is null, so we get the message from the parent exception
                String message = e.getMessage();
                if (message == null && e.getCause() != null)
                    message = e.getCause().getMessage();

                migrationStatus.incrementProgress(1);
                migrationStatus.incrementPagesNotAligned();
                Log.add("<span style=\"color: red;\">Error: " + message + "</span><br/>", migrationStatus);
                e.printStackTrace();
            }
        }
    }
}
