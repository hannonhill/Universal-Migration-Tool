/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashMap;
import java.util.Map;

import com.hannonhill.smt.service.WebServices;

/**
 * Stores necessary information about Cascade Content Type. Also, reads that information through web services when initialized.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class ContentTypeInformation
{
    private final String path;
    private final Map<String, MetadataSetField> metadataFields;
    private final Map<String, DataDefinitionField> dataDefinitionFields;
    private final boolean usesDataDefinition;

    /**
     * Returns either a pre-loaded content type with given path or loads a new content type through web services and returns it.
     * 
     * @param path
     * @param projectInformation
     * @return
     */
    public static ContentTypeInformation get(String path, ProjectInformation projectInformation)
    {
        ContentTypeInformation existing = projectInformation.getContentTypes().get(path);
        if (existing != null)
            return existing;

        try
        {
            ContentTypeInformation newContentType = new ContentTypeInformation(path, projectInformation);
            projectInformation.getContentTypes().put(path, newContentType);
            return newContentType;
        }
        catch (Exception e)
        {
            // content type with given path could not be found
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Private constructor. Reads the necessary information of a content type with given path through web services and 
     * populates necessary fields
     * 
     * @param path
     * @param projectInformation
     * @throws Exception
     */
    private ContentTypeInformation(String path, ProjectInformation projectInformation) throws Exception
    {
        this.path = path;

        metadataFields = WebServices.getMetadataFieldsForContentType(path, projectInformation);
        Map<String, DataDefinitionField> dataDefinitionFields = WebServices.getDataDefinitionFieldsForContentType(path, projectInformation);
        if (dataDefinitionFields != null)
        {
            this.dataDefinitionFields = dataDefinitionFields;
            usesDataDefinition = true;
        }
        else
        {
            Map<String, DataDefinitionField> returnMap = new HashMap<String, DataDefinitionField>();
            returnMap.put(WebServices.XHTML_DATA_DEFINITION_FIELD.getIdentifier(), WebServices.XHTML_DATA_DEFINITION_FIELD);
            this.dataDefinitionFields = returnMap;
            usesDataDefinition = false;
        }
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
     * @return Returns the usesDataDefinition.
     */
    public boolean isUsesDataDefinition()
    {
        return usesDataDefinition;
    }
}
