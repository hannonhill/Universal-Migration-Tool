/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ContentTypeInformation;
import com.hannonhill.smt.DataDefinitionField;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.MetadataSetField;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.LinkRewriter;
import com.hannonhill.smt.service.WebServices;
import com.hannonhill.smt.service.XmlAnalyzer;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField;
import com.hannonhill.www.ws.ns.AssetOperationService.FieldValue;
import com.hannonhill.www.ws.ns.AssetOperationService.Metadata;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredData;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType;

/**
 * Utility class with helper methods related to web services
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class WebServicesUtil
{
    /**
     * Creates a page object based on the information provided in the xmlPage and the mappings in
     * projectInformation.
     * 
     * @param xmlPage
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static Page setupPageObject(DetailedXmlPageInformation xmlPage, ProjectInformation projectInformation) throws Exception
    {
        String path = xmlPage.getDeployPath();
        String pageName = PathUtil.truncateExtension(PathUtil.getNameFromPath(path));
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);

        String assetTypeName = xmlPage.getAssetType();
        AssetType assetType = projectInformation.getAssetTypes().get(assetTypeName);
        String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);
        Set<String> metadataFieldNames = contentType.getMetadataFields().keySet();

        Page page = new Page();
        page.setContentTypePath(contentTypePath);
        page.setName(pageName);
        page.setParentFolderPath(parentFolderPath);
        page.setSiteName(projectInformation.getSiteName());
        page.setMetadata(createPageMetadata(xmlPage, assetType, metadataFieldNames));

        // Create the structured data object with the tree of structured data nodes
        StructuredData structuredData = createPageStructuredData(xmlPage, assetType, projectInformation);

        // If page uses data definition, assign it to the page object
        if (contentType.isUsesDataDefinition())
            page.setStructuredData(structuredData);
        else
        {
            // if page does not use data definition, the tree mapping should contain only a single xhtml field
            StructuredDataNode[] xhtmlNodes = structuredData.getStructuredDataNodes();
            String xhtml = null;
            if (xhtmlNodes.length == 1)
                xhtml = xhtmlNodes[0].getText();
            else if (xhtmlNodes.length == 0)
                ; // do nothing, no mappings
            else
                throw new Exception("The mappings for a page without Data Definition contains more than one field.");
            page.setXhtml(xhtml == null ? "" : xhtml);
        }

        return page;
    }

    /**
     * Creates the page's structured data object with the values from the xmlPage uses the mappings from the
     * assetType.
     * 
     * @param xmlPage
     * @param assetType
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static StructuredData createPageStructuredData(DetailedXmlPageInformation xmlPage, AssetType assetType,
            ProjectInformation projectInformation) throws Exception
    {
        // Create the root group object to which all the information will be attached
        StructuredDataGroup rootGroup = new StructuredDataGroup();

        // For each xml metadata field, find a mapping and assign appropriate value in structured data
        for (String xmlMetadataFieldName : xmlPage.getMetadataMap().keySet())
        {
            Field field = assetType.getMetadataFieldMapping().get(xmlMetadataFieldName);

            if (field == null)
                continue;

            String fieldValue = xmlPage.getMetadataMap().get(xmlMetadataFieldName);
            if (field instanceof DataDefinitionField)
                assignAppropriateFieldValue(rootGroup, (DataDefinitionField) field, fieldValue, projectInformation);
        }

        // For each xml content field, find a mapping and assign appropriate value in structured data
        for (String xmlContentFieldName : xmlPage.getContentMap().keySet())
        {
            Field field = assetType.getContentFieldMapping().get(xmlContentFieldName);

            if (field == null)
                continue;

            String fieldValue = xmlPage.getContentMap().get(xmlContentFieldName);
            if (field instanceof DataDefinitionField)
                assignAppropriateFieldValue(rootGroup, (DataDefinitionField) field, fieldValue, projectInformation);
        }

        // For each static value field, assign the static value in structured data
        for (Field field : assetType.getStaticValueMapping().keySet())
            if (field instanceof DataDefinitionField)
            {
                // Escape ampersands to make it a valid xml
                String fieldValue = assetType.getStaticValueMapping().get(field).replaceAll("&", "&amp;");
                assignAppropriateFieldValue(rootGroup, (DataDefinitionField) field, fieldValue, projectInformation);
            }

        return convertToStructuredData(rootGroup);
    }

    /**
     * Creates the page's metadata object with the values from the xmlPage uses the mappings from the
     * assetType.
     * 
     * @param xmlPage
     * @param assetType
     * @param availableMetadataFieldNames
     * @return
     * @throws Exception
     */
    private static Metadata createPageMetadata(DetailedXmlPageInformation xmlPage, AssetType assetType, Set<String> availableMetadataFieldNames)
            throws Exception
    {
        // Create the metadata object and the list of dynamic fields
        Metadata metadata = new Metadata();
        List<DynamicMetadataField> dynamicFieldsList = new ArrayList<DynamicMetadataField>();

        // A web services bug work-around: supply all dynamic metadata field values as empty strings first
        for (String metadataFieldName : availableMetadataFieldNames)
            if (!WebServices.STANDARD_METADATA_FIELD_IDENTIFIERS.contains(metadataFieldName))
                dynamicFieldsList.add(new DynamicMetadataField(metadataFieldName, new FieldValue[]
                {
                    new FieldValue("")
                }));

        // For each xml metadata field, find a mapping and assign appropriate value in metadata
        for (String xmlMetadataFieldName : xmlPage.getMetadataMap().keySet())
        {
            Field field = assetType.getMetadataFieldMapping().get(xmlMetadataFieldName);

            if (field == null)
                continue;

            String fieldValue = xmlPage.getMetadataMap().get(xmlMetadataFieldName);
            if (field instanceof MetadataSetField)
                assignAppropriateFieldValue(metadata, dynamicFieldsList, (MetadataSetField) field, fieldValue);
        }

        // For each xml content field, find a mapping and assign appropriate value in metadata
        for (String xmlContentFieldName : xmlPage.getContentMap().keySet())
        {
            Field field = assetType.getContentFieldMapping().get(xmlContentFieldName);

            if (field == null)
                continue;

            String fieldValue = xmlPage.getContentMap().get(xmlContentFieldName);
            if (field instanceof MetadataSetField)
                assignAppropriateFieldValue(metadata, dynamicFieldsList, (MetadataSetField) field, fieldValue);
        }

        // For each static value field, assign the static value in the metadata
        for (Field field : assetType.getStaticValueMapping().keySet())
            if (field instanceof MetadataSetField)
            {
                // Escape ampersands to make it a valid xml
                String fieldValue = assetType.getStaticValueMapping().get(field).replaceAll("&", "&amp;");
                assignAppropriateFieldValue(metadata, dynamicFieldsList, (MetadataSetField) field, fieldValue);
            }

        // Convert the list of dynamic field to an array and assign it to the metadata object
        metadata.setDynamicFields(dynamicFieldsList.toArray(new DynamicMetadataField[dynamicFieldsList.size()]));
        return metadata;
    }

    /**
     * Assigns given fieldValue of given fieldName to metadata object if it is a standard metadata field or
     * adds it to the list of
     * dynamicFields.
     * 
     * @param metadata
     * @param dynamicFields
     * @param field
     * @param fieldValue
     * @throws Exception
     */
    private static void assignAppropriateFieldValue(Metadata metadata, List<DynamicMetadataField> dynamicFields, MetadataSetField field,
            String fieldValue) throws Exception
    {
        String fieldName = field.getIdentifier();

        // If it is a standard metadata field, call the appropriate setter
        if (!field.isDynamic())
            Metadata.class.getMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), String.class).invoke(metadata,
                    fieldValue);
        // If it is not a standard metadata field, add a dynamic field
        else
        {
            // Remove the previous assignment
            for (DynamicMetadataField dynamicField : dynamicFields)
                if (dynamicField.getName().equals(fieldName))
                {
                    dynamicFields.remove(dynamicField);
                    break;
                }

            // Add the current one
            dynamicFields.add(new DynamicMetadataField(fieldName, new FieldValue[]
            {
                new FieldValue(fieldValue)
            }));
        }
    }

    /**
     * Assigns given fieldValue of given fieldName as the path to the actual field identifier to structured
     * data object forming
     * a structural tree if necessary.
     * 
     * @param rootGroup
     * @param field
     * @param fieldValue
     * @param projectInformation
     */
    private static void assignAppropriateFieldValue(StructuredDataGroup rootGroup, DataDefinitionField field, String fieldValue,
            ProjectInformation projectInformation) throws Exception
    {
        String fieldName = field.getIdentifier();
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
                    thisGroup = new StructuredDataGroup();
                    currentNode.getGroups().put(group, thisGroup);
                }

                currentNode = thisGroup;
            }
        }

        if (!field.isFileChooser())
        {
            StructuredDataNode textNode = new StructuredDataNode();
            textNode.setIdentifier(identifier);
            textNode.setText(fieldValue);
            textNode.setType(StructuredDataType.text);
            currentNode.getContentFields().put(identifier, textNode);
        }
        else
        {
            String path = fieldValue.startsWith(LinkRewriter.LUMINIS_FILE_PREFIX) ? fieldValue.substring(LinkRewriter.LUMINIS_FILE_PREFIX.length())
                    : XmlAnalyzer.getFirstSrcAttribute(fieldValue);
            StructuredDataNode fileNode = new StructuredDataNode();
            fileNode.setIdentifier(identifier);
            if (WebServices.doesAssetExist(path, projectInformation))
                fileNode.setFilePath(path);
            fileNode.setType(StructuredDataType.asset);
            fileNode.setAssetType(StructuredDataAssetType.file);
            currentNode.getContentFields().put(identifier, fileNode);
        }
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
     * Converts group and its descendants with its contents to an array of StructuredDataNode objects
     * recursively.
     * 
     * @param group
     * @return
     */
    private static StructuredDataNode[] convertToStructuredDataNodes(StructuredDataGroup group)
    {
        StructuredDataNode[] structuredDataNodes = new StructuredDataNode[group.getGroups().size() + group.getContentFields().size()];
        int index = 0;
        for (String contentFieldIdentifier : group.getContentFields().keySet())
        {
            structuredDataNodes[index] = group.getContentFields().get(contentFieldIdentifier);
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

    /**
     * Represents a StructuredDataNode of type group. Using this instead of
     * {@link com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode} of type group because we want
     * to deal with Maps instead of arrays for easy and fast insert and search.
     * 
     * @author Artur Tomusiak
     * @since 1.0
     */
    private static class StructuredDataGroup
    {
        // the fields in the group with their values
        private final Map<String, StructuredDataNode> contentFields = new HashMap<String, StructuredDataNode>();

        // other groups in the group
        private final Map<String, StructuredDataGroup> groups = new HashMap<String, StructuredDataGroup>();

        /**
         * @return Returns the groups.
         */
        public Map<String, StructuredDataGroup> getGroups()
        {
            return groups;
        }

        /**
         * @return Returns the contentFields.
         */
        public Map<String, StructuredDataNode> getContentFields()
        {
            return contentFields;
        }
    }
}
