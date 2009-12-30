/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.task;

import java.io.PrintWriter;

import com.hannonhill.smt.LinkCheckingStatus;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.LinkChecker;
import com.hannonhill.smt.service.Log;

/**
 * The background link checking task
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class LinkCheckingTask extends Thread
{
    public final static String TASK_NAME = "link-checker";
    private final ProjectInformation projectInformation;

    /**
     * Constructor
     * 
     * @param projectInformation
     */
    public LinkCheckingTask(ProjectInformation projectInformation)
    {
        this.projectInformation = projectInformation;
    }

    /**
     * Runs the link checker
     */
    @Override
    public void run()
    {
        LinkCheckingStatus status = new LinkCheckingStatus();
        projectInformation.setLinkCheckingStatus(status);
        projectInformation.setCurrentTask(TASK_NAME);
        Log.createFile(projectInformation, status, "linkchecker");

        LinkChecker.checkLinks(projectInformation);
        if (status.isShouldStop())
            Log.add("<br/>Link checker stopped by the user.<br/>", status);

        status.setCompleted(true);

        // close the log writer
        PrintWriter logWriter = status.getLogWriter();
        if (logWriter != null)
            status.getLogWriter().close();
    }
}
