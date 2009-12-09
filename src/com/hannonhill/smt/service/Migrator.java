/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hannonhill.smt.DetailedXmlPageInformation;
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
            List<String> pageIds = createPages();
            alignLinks(pageIds);
        }

        /**
         * Creates the pages and their parent folders if needed
         * 
         * @return Returns the created page ids
         */
        private List<String> createPages()
        {
            File folder = new File(projectInformation.getXmlDirectory());
            List<File> files = XmlAnalyzer.getAllFiles(folder);
            List<String> pageIds = new ArrayList<String>();

            for (File file : files)
            {
                try
                {
                    DetailedXmlPageInformation page = XmlAnalyzer.parseXmlFile(file);

                    // If the asset type wasn't mapped, skip this page
                    String assetTypeName = page.getAssetType();
                    String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
                    if (contentTypePath == null)
                        continue;

                    LinkRewriter.rewriteLinks(page);
                    String pageId = WebServices.createPage(page, projectInformation);

                    // Add the path of the page to the list because links will need to be realigned.
                    pageIds.add(pageId);
                }
                catch (Exception e)
                {
                    // To build the file path that needs to be displayed, we show only the part of the abosute path after the xml directory 
                    String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());

                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    projectInformation.getErrors().add("Could not create page " + relativePath + ": " + message);
                }
            }

            return pageIds;
        }

        /**
         * Re-edits each page to align the links to make them tracked by Cascade Server
         * 
         * @param pageIds
         */
        private void alignLinks(List<String> pageIds)
        {
            for (String pageId : pageIds)
            {
                try
                {
                    WebServices.realignLinks(pageId, projectInformation);
                }
                catch (Exception e)
                {
                    // Sometimes the exception message is null, so we get the message from the parent exception
                    String message = e.getMessage();
                    if (message == null && e.getCause() != null)
                        message = e.getCause().getMessage();

                    projectInformation.getErrors().add("Could realign link in page with id " + pageId + ": " + message);
                }
            }
        }
    }
}
