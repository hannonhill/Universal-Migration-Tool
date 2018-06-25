/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class File extends FolderContainedAsset
{
    private String metadataSetId;
    private Boolean shouldBeIndexed;
    private Boolean shouldBePublished;
    private byte[] data;

    /**
     * @return Returns the metadataSetId.
     */
    public String getMetadataSetId()
    {
        return metadataSetId;
    }

    /**
     * @param metadataSetId the metadataSetId to set
     */
    public void setMetadataSetId(String metadataSetId)
    {
        this.metadataSetId = metadataSetId;
    }

    /**
     * @return Returns the shouldBeIndexed.
     */
    public Boolean getShouldBeIndexed()
    {
        return shouldBeIndexed;
    }

    /**
     * @param shouldBeIndexed the shouldBeIndexed to set
     */
    public void setShouldBeIndexed(Boolean shouldBeIndexed)
    {
        this.shouldBeIndexed = shouldBeIndexed;
    }

    /**
     * @return Returns the shouldBePublished.
     */
    public Boolean getShouldBePublished()
    {
        return shouldBePublished;
    }

    /**
     * @param shouldBePublished the shouldBePublished to set
     */
    public void setShouldBePublished(Boolean shouldBePublished)
    {
        this.shouldBePublished = shouldBePublished;
    }

    /**
     * @return Returns the data.
     */
    public byte[] getData()
    {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(byte[] data)
    {
        this.data = data;
    }
}
