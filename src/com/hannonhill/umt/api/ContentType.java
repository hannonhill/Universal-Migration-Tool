/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class ContentType
{
    private String name;
    private String path;
    private String metadataSetId;
    private String dataDefinitionId;

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
     * @return Returns the path.
     */
    public String getPath()
    {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path)
    {
        this.path = path;
    }

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
     * @return Returns the dataDefinitionId.
     */
    public String getDataDefinitionId()
    {
        return dataDefinitionId;
    }

    /**
     * @param dataDefinitionId the dataDefinitionId to set
     */
    public void setDataDefinitionId(String dataDefinitionId)
    {
        this.dataDefinitionId = dataDefinitionId;
    }
}
