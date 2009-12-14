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
public class ContentTypeInformation
{
    private final String path;
    private Map<String, MetadataSetField> metadataFields;
    private Map<String, DataDefinitionField> dataDefinitionFields;
    private boolean usesDataDefinition;

    /**
     * Constructor
     * 
     * @param path
     */
    public ContentTypeInformation(String path)
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
    public Map<String, MetadataSetField> getMetadataFields()
    {
        return metadataFields;
    }

    /**
     * @return Returns the dataDefinitionFields.
     */
    public Map<String, DataDefinitionField> getDataDefinitionFields()
    {
        return dataDefinitionFields;
    }

    /**
     * @param metadataFields the metadataFields to set
     */
    public void setMetadataFields(Map<String, MetadataSetField> metadataFields)
    {
        this.metadataFields = metadataFields;
    }

    /**
     * @param dataDefinitionFields the dataDefinitionFields to set
     */
    public void setDataDefinitionFields(Map<String, DataDefinitionField> dataDefinitionFields)
    {
        this.dataDefinitionFields = dataDefinitionFields;
    }

    /**
     * @return Returns the usesDataDefinition.
     */
    public boolean isUsesDataDefinition()
    {
        return usesDataDefinition;
    }

    /**
     * @param usesDataDefinition the usesDataDefinition to set
     */
    public void setUsesDataDefinition(boolean usesDataDefinition)
    {
        this.usesDataDefinition = usesDataDefinition;
    }
}
