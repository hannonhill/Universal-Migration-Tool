/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;

import com.hannonhill.umt.api.ContentType;
import com.hannonhill.umt.service.RestApi;

/**
 * Stores necessary information about Cascade Content Type. Also, reads that information through web services
 * when initialized.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class ContentTypeInformation
{
    private final Map<String, MetadataSetField> metadataFields; // mapping from the metadata field identifier
                                                                // to the actual field
    private final Map<String, DataDefinitionField> dataDefinitionFields; // mapping from the data definition
                                                                         // field "path" to actual field
    private final boolean usesDataDefinition;

    /**
     * Constructor. Reads the necessary information of given content type (Metadata Set, Data Definition)
     * through web services and populates necessary fields
     */
    public ContentTypeInformation(ContentType contentType, ProjectInformation projectInformation) throws Exception
    {
        metadataFields = RestApi.getMetadataFieldsForContentType(projectInformation, contentType);
        Map<String, DataDefinitionField> dataDefinitionFields = null;

        if (StringUtils.isNotEmpty(contentType.getDataDefinitionId()))
            dataDefinitionFields = RestApi.getDataDefinitionFieldsForContentType(projectInformation, contentType);

        if (dataDefinitionFields != null)
        {
            this.dataDefinitionFields = dataDefinitionFields;
            usesDataDefinition = true;
        }
        else
        {
            Map<String, DataDefinitionField> returnMap = new HashMap<>();
            returnMap.put(RestApi.XHTML_DATA_DEFINITION_FIELD.getIdentifier(), RestApi.XHTML_DATA_DEFINITION_FIELD);
            this.dataDefinitionFields = returnMap;
            usesDataDefinition = false;
        }
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
