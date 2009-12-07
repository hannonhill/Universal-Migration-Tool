/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.Map;

/**
 * Stores necessary information about Cascade Content Type
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   6.0
 */
public class ContentType
{
    private final String path;
    private Map<String, Field> metadataFields;
    private Map<String, Field> dataDefinitionFields;

    /**
     * Constructor
     * 
     * @param path
     */
    public ContentType(String path)
    {
        this.path = path;
    }

    /**
     * @return Returns the path.
     */
    public String getPath()
    {
        return path;
    }

    /**
     * @return Returns the metadataFields.
     */
    public Map<String, Field> getMetadataFields()
    {
        return metadataFields;
    }

    /**
     * @return Returns the dataDefinitionFields.
     */
    public Map<String, Field> getDataDefinitionFields()
    {
        return dataDefinitionFields;
    }

    /**
     * @param metadataFields the metadataFields to set
     */
    public void setMetadataFields(Map<String, Field> metadataFields)
    {
        this.metadataFields = metadataFields;
    }

    /**
     * @param dataDefinitionFields the dataDefinitionFields to set
     */
    public void setDataDefinitionFields(Map<String, Field> dataDefinitionFields)
    {
        this.dataDefinitionFields = dataDefinitionFields;
    }
}
