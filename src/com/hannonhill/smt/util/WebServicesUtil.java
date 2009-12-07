/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.util;

import java.util.ArrayList;
import java.util.List;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.StructuredDataGroup;
import com.hannonhill.smt.StructuredDataText;
import com.hannonhill.smt.service.WebServices;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField;
import com.hannonhill.www.ws.ns.AssetOperationService.FieldValue;
import com.hannonhill.www.ws.ns.AssetOperationService.Metadata;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredData;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType;

/**
 * Utility class with helper methods related to web services
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class WebServicesUtil
{
    /**
     * Creates the page's metadata object with the values from the xmlPage uses the mappings from the assetType. 
     * 
     * @param xmlPage
     * @param assetType
     * @return
     * @throws Exception
     */
    public static Metadata createPageMetadata(DetailedXmlPageInformation xmlPage, AssetType assetType) throws Exception
    {
        // Create the metadata object and the list of dynamic fields
        Metadata metadata = new Metadata();
        List<DynamicMetadataField> dynamicFieldsList = new ArrayList<DynamicMetadataField>();

        // For each xml metadata field, find a mapping and assign appropriate value in metadata
        for (String xmlMetadataFieldName : xmlPage.getMetadataMap().keySet())
        {
            Field field = assetType.getMetadataFieldMapping().get(xmlMetadataFieldName);

            if (field == null)
                continue;

            String fieldName = field.getIdentifier();
            String fieldValue = xmlPage.getMetadataMap().get(xmlMetadataFieldName);
            if (field.getFieldType() == FieldType.METADATA)
                assignAppropriateFieldValue(metadata, dynamicFieldsList, fieldName, fieldValue);
        }

        // For each xml content field, find a mapping and assign appropriate value in metadata
        for (String xmlContentFieldName : xmlPage.getContentMap().keySet())
        {
            Field field = assetType.getContentFieldMapping().get(xmlContentFieldName);

            if (field == null)
                continue;

            String fieldName = field.getIdentifier();
            String fieldValue = xmlPage.getContentMap().get(xmlContentFieldName);
            if (field.getFieldType() == FieldType.METADATA)
                assignAppropriateFieldValue(metadata, dynamicFieldsList, fieldName, fieldValue);
        }

        // Convert the list of dynamic field to an array and assign it to the metadata object
        metadata.setDynamicFields(dynamicFieldsList.toArray(new DynamicMetadataField[dynamicFieldsList.size()]));
        return metadata;
    }

    /**
     * Creates the page's structured data object with the values from the xmlPage uses the mappings from the assetType. 
     * 
     * @param xmlPage
     * @param assetType
     * @return
     * @throws Exception
     */
    public static StructuredData createPageStructuredData(DetailedXmlPageInformation xmlPage, AssetType assetType) throws Exception
    {
        // Create the root group object to which all the information will be attached
        StructuredDataGroup rootGroup = new StructuredDataGroup("root");

        // For each xml metadata field, find a mapping and assign appropriate value in structured data
        for (String xmlMetadataFieldName : xmlPage.getMetadataMap().keySet())
        {
            Field field = assetType.getMetadataFieldMapping().get(xmlMetadataFieldName);

            if (field == null)
                continue;

            String fieldName = field.getIdentifier();
            String fieldValue = xmlPage.getMetadataMap().get(xmlMetadataFieldName);
            if (field.getFieldType() == FieldType.DATA_DEFINITION)
                assignAppropriateFieldValue(rootGroup, fieldName, fieldValue);
        }

        // For each xml content field, find a mapping and assign appropriate value in metadata
        for (String xmlContentFieldName : xmlPage.getContentMap().keySet())
        {
            Field field = assetType.getContentFieldMapping().get(xmlContentFieldName);

            if (field == null)
                continue;

            String fieldName = field.getIdentifier();
            String fieldValue = xmlPage.getContentMap().get(xmlContentFieldName);
            if (field.getFieldType() == FieldType.DATA_DEFINITION)
                assignAppropriateFieldValue(rootGroup, fieldName, fieldValue);
        }

        return convertToStructuredData(rootGroup);
    }

    /**
     * Assigns given fieldValue of given fieldName to metadata object if it is a standard metadata field or adds it to the list of
     * dynamicFields.
     * 
     * @param metadata
     * @param dynamicFields
     * @param fieldName
     * @param fieldValue
     * @throws Exception
     */
    private static void assignAppropriateFieldValue(Metadata metadata, List<DynamicMetadataField> dynamicFields, String fieldName, String fieldValue)
            throws Exception
    {
        // If it is a standard metadata field, call the appropriate setter
        if (WebServices.STANDARD_METADATA_FIELD_IDENTIFIERS.contains(fieldName))
            Metadata.class.getMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), String.class).invoke(metadata,
                    fieldValue);
        // If it is not a standard metadata field, add a dynamic field
        else
            dynamicFields.add(new DynamicMetadataField(fieldName, new FieldValue[]
            {
                new FieldValue(fieldValue)
            }));
    }

    /**
     * Assigns given fieldValue of given fieldName as the path to the actual field identifier to structured data object forming
     * a structural tree if necessary. 
     * 
     * @param rootGroup
     * @param fieldName
     * @param fieldValue
     */
    private static void assignAppropriateFieldValue(StructuredDataGroup rootGroup, String fieldName, String fieldValue)
    {
        int lastSlashIdx = fieldName.lastIndexOf('/');
        String identifier = lastSlashIdx == -1 ? fieldName : fieldName.substring(lastSlashIdx + 1);
        String groupsPath = lastSlashIdx == -1 ? "" : fieldName.substring(0, lastSlashIdx);
        StructuredDataGroup currentNode = rootGroup;

        if (!groupsPath.equals(""))
        {
            String[] groups = groupsPath.split("/");
            for (String group : groups)
            {
                StructuredDataGroup thisGroup = currentNode.getGroups().get(group);
                if (thisGroup == null)
                {
                    thisGroup = new StructuredDataGroup(group);
                    currentNode.getGroups().put(group, thisGroup);
                }

                currentNode = thisGroup;
            }
        }

        currentNode.getTextFields().put(identifier, new StructuredDataText(identifier, fieldValue));
    }

    /**
     * Converts elements from rootGroup to StructuredData object with all the ancestry (hierarchy)
     * 
     * @param rootGroup
     * @return
     */
    private static StructuredData convertToStructuredData(StructuredDataGroup rootGroup)
    {
        StructuredData sturcturedData = new StructuredData();
        sturcturedData.setStructuredDataNodes(convertToStructuredDataNodes(rootGroup));
        return sturcturedData;
    }

    /**
     * Converts group and ancestry with its contents to an array of StructuredDataNode objects recursively.
     * 
     * @param group
     * @return
     */
    private static StructuredDataNode[] convertToStructuredDataNodes(StructuredDataGroup group)
    {
        StructuredDataNode[] structuredDataNodes = new StructuredDataNode[group.getGroups().size() + group.getTextFields().size()];
        int index = 0;
        for (String textFieldIdentifier : group.getTextFields().keySet())
        {
            structuredDataNodes[index] = new StructuredDataNode();
            structuredDataNodes[index].setIdentifier(textFieldIdentifier);
            structuredDataNodes[index].setText(group.getTextFields().get(textFieldIdentifier).getValue());
            structuredDataNodes[index].setType(StructuredDataType.text);
            index++;
        }

        for (String groupIdentifier : group.getGroups().keySet())
        {
            StructuredDataGroup groupNode = group.getGroups().get(groupIdentifier);
            structuredDataNodes[index] = new StructuredDataNode();
            structuredDataNodes[index].setIdentifier(groupIdentifier);
            structuredDataNodes[index].setType(StructuredDataType.group);
            structuredDataNodes[index].setStructuredDataNodes(convertToStructuredDataNodes(groupNode));
            index++;
        }
        return structuredDataNodes;
    }
}
