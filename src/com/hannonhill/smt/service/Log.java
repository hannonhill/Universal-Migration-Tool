/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2008 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.TaskStatus;

/**
 * A service responsible for log related functionality
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class Log
{
    /**
     * Escapes \ and ' characters in the logMessage and adds that message to the log for the task status and in the file system.
     * 
     * @param logMessage
     * @param taskStatus
     */
    public static void add(String logMessage, TaskStatus taskStatus)
    {
        logMessage = logMessage.replaceAll("\\\\", "\\\\\\\\");
        logMessage = logMessage.replaceAll("'", "\\\\'");
        taskStatus.getLog().append(logMessage);

        PrintWriter logWriter = taskStatus.getLogWriter();
        if (logWriter != null)
            logWriter.print(logMessage);
    }

    /**
     * Creates a log html file in the logs folder and assigns the log writer to the migration status object. Later on, the writer
     * will need to be closed. 
     * 
     * If problem occurs, the eror message will be added to the log which will be only accessible through the web interface
     * at this point. Also, the log writer will be null and at that point it won't need to be closed.
     * 
     * @param projectInformation
     * @param taskStatus
     * @param prefix
     */
    public static void createFile(ProjectInformation projectInformation, TaskStatus taskStatus, String prefix)
    {
        String logFilePath = "";
        try
        {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            String datetime = sdf.format(cal.getTime());
            logFilePath = projectInformation.getLogsDir() + prefix + " " + datetime + ".log.html";

            FileWriter outFile = new FileWriter(logFilePath);
            PrintWriter printWriter = new PrintWriter(outFile);
            taskStatus.setLogWriter(printWriter);
        }
        catch (Exception e)
        {
            add("<span style=\"color:red;\">Could not create the log file with path: " + logFilePath + ": " + e.getMessage() + "</span><br/>",
                    projectInformation.getMigrationStatus());
        }
    }

    /**
     * Closes the log writer. Must be called at the end of the task.
     * 
     * @param taskStatus
     */
    public static void close(TaskStatus taskStatus)
    {
        PrintWriter logWriter = taskStatus.getLogWriter();
        if (logWriter != null)
            taskStatus.getLogWriter().close();
    }
}
