/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.json.JSONObject;

import com.hannonhill.smt.MigrationStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.Migrator;

/**
 * Action reponsible for starting the migration and for displaying an ajax-enabled log screen.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MigrationAction extends BaseAction
{
    private static final long serialVersionUID = 7623856132054947522L;
    private InputStream inputStream;

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        getProjectInformation().setMigrationStatus(new MigrationStatus());
        Migrator.startMigration(getProjectInformation());
        return super.execute();
    }

    /**
     * @return Returns the input stream for AJAX
     */
    public InputStream getInputStream()
    {
        return inputStream;
    }

    /**
     * Handles an AJAX request and sends the information to the input stream
     * 
     * @return
     */
    public String handleAjax()
    {
        try
        {
            ProjectInformation projectInformation = getProjectInformation();
            int totalProgress = projectInformation.getFilesToProcess().size() * 2;

            MigrationStatus migrationStatus = getProjectInformation().getMigrationStatus();
            JSONObject object = new JSONObject();
            object.put("log", migrationStatus.getLog().toString());

            // clean up the log
            migrationStatus.setLog(new StringBuilder());

            object.put("progress", 1000.0 * migrationStatus.getProgress() / totalProgress);
            object.put("completed", migrationStatus.isCompleted());

            object.put("pagesCreated", migrationStatus.getPagesCreated());
            object.put("pagesSkipped", migrationStatus.getPagesSkipped());
            object.put("pagesWithErrors", migrationStatus.getPagesWithErrors());
            object.put("pagesAligned", migrationStatus.getPagesAligned());
            object.put("pagesNotAligned", migrationStatus.getPagesNotAligned());

            String returnString = object.toString();
            inputStream = new ByteArrayInputStream(returnString.getBytes("UTF-8"));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
