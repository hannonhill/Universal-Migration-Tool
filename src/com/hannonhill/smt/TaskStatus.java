/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.io.PrintWriter;

/**
 * An object containing basic information about the current status of a task
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public abstract class TaskStatus
{
    private StringBuilder log; // this is only the part of the log that did not get loaded through AJAX yet - it appears on the screen
    private PrintWriter logWriter; // this is a log writer for the log html file saved to the logs folder on the file system
    private int progress; // number of progress points, total number of progress points depends on the actual task

    private boolean completed; // indicates whether or not the task has finished working
    private boolean shouldStop; // if true, the task should stop running as soon as it can

    /**
     * Constructor
     */
    public TaskStatus()
    {
        log = new StringBuilder();
        progress = 0;
        completed = false;
        shouldStop = false;
    }

    /**
     * @return Returns the log.
     */
    public StringBuilder getLog()
    {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(StringBuilder log)
    {
        this.log = log;
    }

    /**
     * @return Returns the progress.
     */
    public int getProgress()
    {
        return progress;
    }

    /**
     *  Increments the progress by given amount
     * 
     * @param progress
     */
    public void incrementProgress(int progress)
    {
        this.progress += progress;
    }

    /**
     * @return Returns the completed.
     */
    public boolean isCompleted()
    {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    /**
     * @return Returns the shouldStop.
     */
    public boolean isShouldStop()
    {
        return shouldStop;
    }

    /**
     * @param shouldStop the shouldStop to set
     */
    public void setShouldStop(boolean shouldStop)
    {
        this.shouldStop = shouldStop;
    }

    /**
     * @return Returns the logWriter.
     */
    public PrintWriter getLogWriter()
    {
        return logWriter;
    }

    /**
     * @param logWriter the logWriter to set
     */
    public void setLogWriter(PrintWriter logWriter)
    {
        this.logWriter = logWriter;
    }
}
