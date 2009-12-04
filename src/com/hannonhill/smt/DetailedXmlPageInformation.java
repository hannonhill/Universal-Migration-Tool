/*
 * Created on Dec 3, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * An object containing detailed information about the XML page useful for migration of the page into Cascade Server.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class DetailedXmlPageInformation
{
    private String deployPath;
    private String assetType;

    /**
     * @return Returns the deployPath.
     */
    public String getDeployPath()
    {
        return deployPath;
    }

    /**
     * @param deployPath the deployPath to set
     */
    public void setDeployPath(String deployPath)
    {
        this.deployPath = deployPath;
    }

    /**
     * @return Returns the assetType.
     */
    public String getAssetType()
    {
        return assetType;
    }

    /**
     * @param assetType the assetType to set
     */
    public void setAssetType(String assetType)
    {
        this.assetType = assetType;
    }
}
