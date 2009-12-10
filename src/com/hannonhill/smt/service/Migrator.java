/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hannonhill.smt.CascadePageInformation;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.MigrationStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;

/**
 * A service responsible for the actual migration
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class Migrator
{
    /**
     * Starts the migration in a background with provided project information
     * 
     * @param projectInformation
     */
    public static void startMigration(ProjectInformation projectInformation)
    {
        new MigrationTask(projectInformation).start();
    }

    /**
     * The background migration task
     * 
     * @author  Artur Tomusiak
     * @version $Id$
     * @since   1.0
     */
    private static class MigrationTask extends Thread
    {
        private final ProjectInformation projectInformation;

        /**
         * Constructor
         * 
         * @param projectInformation
         */
        public MigrationTask(ProjectInformation projectInformation)
        {
            this.projectInformation = projectInformation;
        }

        /**
         * Runs the migration
         */
        @Override
        public void run()
        {
            List<CascadePageInformation> pageIds = createPages();
            alignLinks(pageIds);
            projectInformation.getMigrationStatus().setCompleted(true);
        }

        /**
         * Creates the pages and their parent folders if needed
         * 
         * @return Returns the created page ids
         */
        private List<CascadePageInformation> createPages()
        {
            List<File> files = projectInformation.getFilesToProcess();
            List<CascadePageInformation> pages = new ArrayList<CascadePageInformation>();
            MigrationStatus migrationStatus = projectInformation.getMigrationStatus();

            for (File file : files)
            {
                try
                {
                    // To build the file path that needs to be displayed, we show only the part of the abosute path after the xml directory 
                    String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                    migrationStatus.getLog().append("Creating a page from file " + relativePath.replaceAll("\\\\", "\\\\\\\\") + "... ");
                    DetailedXmlPageInformation page = XmlAnalyzer.parseXmlFile(file);

                    // If the asset type wasn't mapped, skip this page
                    String assetTypeName = page.getAssetType();
                    String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
                    if (contentTypePath == null)
                    {
                        migrationStatus.getLog().append(
                                "<span style=\"color: blue;\">Asset type " + page.getAssetType() + " was not mapped. Skipping the file.</span><br/>");

                        // Increment progress by 2, because no link alignment will be needed for it
                        migrationStatus.incrementProgress(2);
                        migrationStatus.incrementPagesSkipped();
                        continue;
                    }

                    LinkRewriter.rewriteLinks(page);
                    CascadePageInformation cascadePage = WebServices.createPage(page, projectInformation);

                    // Add the path of the page to the list because links will need to be realigned.
                    pages.add(cascadePage);
                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesCreated();
                    migrationStatus.getLog().append("<span style=\"color: green;\">success.</span><br/>");
                }
                catch (Exception e)
                {
                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    migrationStatus.getLog().append("<span style=\"color: red;\">Error: " + message + "</span><br/>");

                    // Increment progress by 2, because no link alignment will be needed for it
                    migrationStatus.incrementProgress(2);
                    migrationStatus.incrementPagesWithErrors();

                    e.printStackTrace();
                }
            }

            return pages;
        }

        /**
         * Re-edits each page to align the links to make them tracked by Cascade Server
         * 
         * @param pageIds
         */
        private void alignLinks(List<CascadePageInformation> pages)
        {
            MigrationStatus migrationStatus = projectInformation.getMigrationStatus();

            for (CascadePageInformation page : pages)
            {
                try
                {
                    migrationStatus.getLog().append("Aligning links in page " + page.getPath() + "... ");
                    WebServices.realignLinks(page.getId(), projectInformation);
                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesAligned();
                    migrationStatus.getLog().append("<span style=\"color: green;\">success.</span><br/>");
                }
                catch (Exception e)
                {
                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesNotAligned();
                    migrationStatus.getLog().append("<span style=\"color: red;\">Error: " + message + "</span><br/>");
                    e.printStackTrace();
                }
            }
        }
    }
}
