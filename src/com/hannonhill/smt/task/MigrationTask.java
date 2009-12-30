/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.task;

import java.io.PrintWriter;

import com.hannonhill.smt.MigrationStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.Log;
import com.hannonhill.smt.service.Migrator;

/**
 * The background migration task
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MigrationTask extends Thread
{
    public final static String TASK_NAME = "migration";
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
        Log.createFile(projectInformation, projectInformation.getMigrationStatus(), "migration");
        MigrationStatus migrationStatus = new MigrationStatus();
        projectInformation.setMigrationStatus(migrationStatus);
        projectInformation.setCurrentTask(TASK_NAME);

        Migrator.createPages(projectInformation);
        Migrator.alignLinks(projectInformation);
        if (migrationStatus.isShouldStop())
            Log.add("<br/>Migration stopped by the user.<br/>", projectInformation.getMigrationStatus());
        migrationStatus.setCompleted(true);

        // close the log writer
        PrintWriter logWriter = migrationStatus.getLogWriter();
        if (logWriter != null)
            migrationStatus.getLogWriter().close();
    }
}
