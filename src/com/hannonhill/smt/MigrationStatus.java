/*
 * Created on Dec 9, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.io.PrintWriter;

/**
 * An object containing information about the current status of the actual migration process
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MigrationStatus
{
    private StringBuilder log; // this is only the part of the log that did not get loaded through AJAX yet - it appears on the screen
    private PrintWriter logWriter; // this is a log writer for the log html file saved to the logs folder on the file system
    private int progress; // this means number of files that need to be migrated times 2 (one for migration, one for link alignment)
    private boolean completed;
    private boolean shouldStop;

    private int pagesCreated;
    private int pagesSkipped;
    private int pagesWithErrors;

    private int pagesAligned;
    private int pagesNotAligned;

    /**
     * Constructor
     */
    public MigrationStatus()
    {
        log = new StringBuilder();
        progress = 0;
        completed = false;
        shouldStop = false;

        pagesCreated = 0;
        pagesSkipped = 0;
        pagesWithErrors = 0;

        pagesAligned = 0;
        pagesNotAligned = 0;
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
     * @return Returns the pagesCreated.
     */
    public int getPagesCreated()
    {
        return pagesCreated;
    }

    /**
     * Increments the number of pages created by 1
     */
    public void incrementPagesCreated()
    {
        pagesCreated++;
    }

    /**
     * @return Returns the pagesSkipped.
     */
    public int getPagesSkipped()
    {
        return pagesSkipped;
    }

    /**
     * Increments the number of pages skipped by 1
     */
    public void incrementPagesSkipped()
    {
        pagesSkipped++;
    }

    /**
     * @return Returns the pagesWithErrors.
     */
    public int getPagesWithErrors()
    {
        return pagesWithErrors;
    }

    /**
     * Increments the number of pages with errors by 1
     */
    public void incrementPagesWithErrors()
    {
        pagesWithErrors++;
    }

    /**
     * @return Returns the pagesAligned.
     */
    public int getPagesAligned()
    {
        return pagesAligned;
    }

    /**
     * Increments the number of pages aligned by 1
     */
    public void incrementPagesAligned()
    {
        pagesAligned++;
    }

    /**
     * @return Returns the pagesNotAligned.
     */
    public int getPagesNotAligned()
    {
        return pagesNotAligned;
    }

    /**
     * Increments the number of pages not aligned by 1
     */
    public void incrementPagesNotAligned()
    {
        pagesNotAligned++;
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
