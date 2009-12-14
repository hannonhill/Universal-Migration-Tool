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
            List<CascadePageInformation> pages = createPages();
            alignLinks(pages);
            if (projectInformation.getMigrationStatus().isShouldStop())
                addToLog("<br/>Migration stopped by the user.<br/>");
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
                if (migrationStatus.isShouldStop())
                    return new ArrayList<CascadePageInformation>();

                try
                {
                    // To build the file path that needs to be displayed, we show only the part of the abosute path after the xml directory 
                    String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                    addToLog("Creating a page from file " + relativePath + "... ");
                    DetailedXmlPageInformation page = XmlAnalyzer.parseXmlFile(file);

                    // If the asset type wasn't mapped, skip this page
                    String assetTypeName = page.getAssetType();
                    String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
                    if (contentTypePath == null)
                    {
                        addToLog("<span style=\"color: blue;\">Asset type " + page.getAssetType() + " was not mapped. Skipping the file.</span><br/>");

                        // Increment progress by 2, because no link alignment will be needed for it
                        migrationStatus.incrementProgress(2);
                        migrationStatus.incrementPagesSkipped();
                        continue;
                    }

                    LinkRewriter.rewriteLinks(page);
                    CascadePageInformation cascadePage = WebServices.createPage(page, projectInformation);

                    addToLog(generatePageLink(cascadePage));

                    // Add the page to the list because links will need to be realigned.
                    pages.add(cascadePage);
                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesCreated();
                    addToLog("<span style=\"color: green;\">success.</span><br/>");
                }
                catch (Exception e)
                {
                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    addToLog("<span style=\"color: red;\">Error: " + message + "</span><br/>");

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
                if (migrationStatus.isShouldStop())
                    return;

                try
                {
                    addToLog("Aligning links in page " + generatePageLink(page) + "... ");
                    WebServices.realignLinks(page.getId(), projectInformation);
                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesAligned();
                    addToLog("<span style=\"color: green;\">success.</span><br/>");
                }
                catch (Exception e)
                {
                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    migrationStatus.incrementProgress(1);
                    migrationStatus.incrementPagesNotAligned();
                    addToLog("<span style=\"color: red;\">Error: " + message + "</span><br/>");
                    e.printStackTrace();
                }
            }
        }

        /**
         * Generates a link to the page in Cascade Server
         * 
         * @param cascadePage
         * @return
         */
        private String generatePageLink(CascadePageInformation cascadePage)
        {
            return "<a href=\"" + PathUtil.getURLWithoutAssetOperationPart(projectInformation.getUrl()) + "/entity/open.act?id="
                    + cascadePage.getId() + "&amp;type=page\" target=\"_blank\">/" + cascadePage.getPath() + "</a> ";
        }

        /**
         * Escapes \ and ' characters in the logMessage and adds that message to the log.
         * 
         * @param logMessage
         */
        private void addToLog(String logMessage)
        {
            logMessage = logMessage.replaceAll("\\\\", "\\\\\\\\");
            logMessage = logMessage.replaceAll("'", "\\\\'");
            projectInformation.getMigrationStatus().getLog().append(logMessage);
        }
    }
}
