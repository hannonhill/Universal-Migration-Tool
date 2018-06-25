/*
 * Created on Dec 28, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt;

import java.util.HashSet;
import java.util.Set;

/**
 * An object containing information about the current status of the actual link checking process
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class LinkCheckingStatus extends TaskStatus
{
    private int assetsChecked; // number of assets that were already checked for broken links
    private int assetsWithErrors; // number of assets that couldn't be read or whose XML couldn't be parsed
                                  // (or/ any other major problem occurred)

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

        assetsChecked = 0;
        assetsWithErrors = 0;

        correctLinks = 0;
        brokenLinks = 0;

        validLinkCache = new HashSet<String>();
        invalidLinkCache = new HashSet<String>();
    }

    /**
     * @return Returns the assetsChecked.
     */
    public int getAssetsChecked()
    {
        return assetsChecked;
    }

    /**
     * Increments the number of assets checked by 1
     */
    public void incrementAssetsChecked()
    {
        assetsChecked++;
    }

    /**
     * @return Returns the assetsWithErrors.
     */
    public int getAssetsWithErrors()
    {
        return assetsWithErrors;
    }

    /**
     * Increments the number of asset with errors by 1
     */
    public void incrementAssetsWithErrors()
    {
        assetsWithErrors++;
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
