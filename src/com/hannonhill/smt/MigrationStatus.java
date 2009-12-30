/*
 * Created on Dec 9, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.ArrayList;
import java.util.List;

/**
 * An object containing information about the current status of the actual migration process
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MigrationStatus extends TaskStatus
{
    private int pagesCreated;
    private int pagesSkipped;
    private int pagesWithErrors;

    private int pagesAligned;
    private int pagesNotAligned;

    private final List<CascadePageInformation> createdPages; // a list of ids and paths of created pages

    /**
     * Constructor
     */
    public MigrationStatus()
    {
        super();

        pagesCreated = 0;
        pagesSkipped = 0;
        pagesWithErrors = 0;

        pagesAligned = 0;
        pagesNotAligned = 0;

        createdPages = new ArrayList<CascadePageInformation>();
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
     * @return Returns the createdPages.
     */
    public List<CascadePageInformation> getCreatedPages()
    {
        return createdPages;
    }
}
