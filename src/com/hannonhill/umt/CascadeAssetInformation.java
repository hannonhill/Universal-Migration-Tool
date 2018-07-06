/*
 * Created on Dec 9, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt;

/**
 * Object containing necessary information about page or block for logging purposes
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class CascadeAssetInformation
{
    private final String id;
    private final String path;
    private final boolean alreadyExisted;

    /**
     * Constructor
     * 
     * @param id
     * @param path
     */
    public CascadeAssetInformation(String id, String path)
    {
        this.id = id;
        this.path = path;
        this.alreadyExisted = false;
    }

    /**
     * Constructor with alreadyExisted param
     * 
     * @param id
     * @param path
     * @param alreadyExisted
     */
    public CascadeAssetInformation(String id, String path, boolean alreadyExisted)
    {
        this.id = id;
        this.path = path;
        this.alreadyExisted = alreadyExisted;
    }

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return Returns the path.
     */
    public String getPath()
    {
        return path;
    }

    /**
     * @return Returns the alreadyExisted.
     */
    public boolean isAlreadyExisted()
    {
        return alreadyExisted;
    }
}
