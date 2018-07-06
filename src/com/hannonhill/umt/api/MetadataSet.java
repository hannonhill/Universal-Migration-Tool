/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class MetadataSet
{
    private String name;
    private List<DynamicMetadataFieldDefinition> dynamicMetadataFieldDefinitions;

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
     * @return Returns the dynamicMetadataFieldDefinitions.
     */
    public List<DynamicMetadataFieldDefinition> getDynamicMetadataFieldDefinitions()
    {
        return dynamicMetadataFieldDefinitions;
    }

    /**
     * @param dynamicMetadataFieldDefinitions the dynamicMetadataFieldDefinitions to set
     */
    public void setDynamicMetadataFieldDefinitions(List<DynamicMetadataFieldDefinition> dynamicMetadataFieldDefinitions)
    {
        this.dynamicMetadataFieldDefinitions = dynamicMetadataFieldDefinitions;
    }

}
