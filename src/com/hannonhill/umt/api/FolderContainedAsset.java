/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class FolderContainedAsset
{
    private String id;
    private String name;
    private String parentFolderPath;
    private String siteName;

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return Returns the name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return Returns the parentFolderPath.
     */
    public String getParentFolderPath()
    {
        return parentFolderPath;
    }

    /**
     * @param parentFolderPath the parentFolderPath to set
     */
    public void setParentFolderPath(String parentFolderPath)
    {
        this.parentFolderPath = parentFolderPath;
    }

    /**
     * @return Returns the siteName.
     */
    public String getSiteName()
    {
        return siteName;
    }

    /**
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName)
    {
        this.siteName = siteName;
    }

}
