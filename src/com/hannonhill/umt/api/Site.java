/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class Site
{
    private String defaultMetadataSetId;
    private String rootContentTypeContainerId;

    /**
     * @return Returns the defaultMetadataSetId.
     */
    public String getDefaultMetadataSetId()
    {
        return defaultMetadataSetId;
    }

    /**
     * @param defaultMetadataSetId the defaultMetadataSetId to set
     */
    public void setDefaultMetadataSetId(String defaultMetadataSetId)
    {
        this.defaultMetadataSetId = defaultMetadataSetId;
    }

    /**
     * @return Returns the rootContentTypeContainerId.
     */
    public String getRootContentTypeContainerId()
    {
        return rootContentTypeContainerId;
    }

    /**
     * @param rootContentTypeContainerId the rootContentTypeContainerId to set
     */
    public void setRootContentTypeContainerId(String rootContentTypeContainerId)
    {
        this.rootContentTypeContainerId = rootContentTypeContainerId;
    }
}
