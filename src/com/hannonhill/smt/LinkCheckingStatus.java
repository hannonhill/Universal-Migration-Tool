/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashSet;
import java.util.Set;

/**
 * An object containing information about the current status of the actual link checking process
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class LinkCheckingStatus extends TaskStatus
{
    private int pagesChecked; // number of pages that were already checked for broken links
    private int pagesWithErrors; // number of pages that couldn't be read or whose XML couldn't be parsed (or any other major problem occured)

    private int correctLinks; // number of valid links total
    private int brokenLinks; // number of broken links total

    private final Set<String> validLinkCache; // A cache containing a set of valid links
    private final Set<String> invalidLinkCache; // A cache containing a set of broken links

    /**
     * Constructor
     */
    public LinkCheckingStatus()
    {
        super();

        pagesChecked = 0;
        pagesWithErrors = 0;

        correctLinks = 0;
        brokenLinks = 0;

        validLinkCache = new HashSet<String>();
        invalidLinkCache = new HashSet<String>();
    }

    /**
     * @return Returns the pagesChecked.
     */
    public int getPagesChecked()
    {
        return pagesChecked;
    }

    /**
     * Increments the number of pages checked by 1
     */
    public void incrementPagesChecked()
    {
        pagesChecked++;
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
     * @return Returns the correctLinks.
     */
    public int getCorrectLinks()
    {
        return correctLinks;
    }

    /**
     * Increments the number of correct links by 1
     */
    public void incrementsCorrectLinks()
    {
        correctLinks++;
    }

    /**
     * @return Returns the brokenLinks.
     */
    public int getBrokenLinks()
    {
        return brokenLinks;
    }

    /**
     * Increments the number of broken links by 1
     */
    public void incrementBrokenLinks()
    {
        brokenLinks++;
    }

    /**
     * @return Returns the validLinkCache.
     */
    public Set<String> getValidLinkCache()
    {
        return validLinkCache;
    }

    /**
     * @return Returns the invalidLinkCache.
     */
    public Set<String> getInvalidLinkCache()
    {
        return invalidLinkCache;
    }
}
