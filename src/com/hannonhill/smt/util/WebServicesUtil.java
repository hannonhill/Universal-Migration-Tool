/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ContentTypeInformation;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.StructuredDataGroup;
import com.hannonhill.smt.StructuredDataText;
import com.hannonhill.smt.service.WebServices;
import com.hannonhill.www.ws.ns.AssetOperationService.BaseAsset;
import com.hannonhill.www.ws.ns.AssetOperationService.DublinAwareAsset;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField;
import com.hannonhill.www.ws.ns.AssetOperationService.ExpiringAsset;
import com.hannonhill.www.ws.ns.AssetOperationService.FieldValue;
import com.hannonhill.www.ws.ns.AssetOperationService.FolderContainedAsset;
import com.hannonhill.www.ws.ns.AssetOperationService.Metadata;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration;
import com.hannonhill.www.ws.ns.AssetOperationService.PageRegion;
import com.hannonhill.www.ws.ns.AssetOperationService.PublishableAsset;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredData;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType;
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
     * Code copied from the Web Services Test Suite.
     * 
     * Because of a limitation with Apache Axis, the data received when doing
     * a read on an asset is not able to be directly sent back to the server
     * as-is because the server actually sends more data than necessary. This
     * function will go through a page asset and null out the unnecessary items,
     * making the asset able to be sent back to the server.
     * 
     * In essence, the server sends both the id and path information for a relationship,
     * however the server will only accept either the id or the path, but not both. This
     * method nulls out the applicable relationship paths in favor of the ids. 
     * 
     * @param page the page whose data will be intelligently nulled out to ensure
     *      it can be sent back to the server.
     */
    public static final void nullPageValues(Page page)
    {
        nullPublishableValues(page);

        // If the page has a content type, null out the configuration set
        if ((page.getContentTypeId() != null) || (page.getContentTypePath() != null))
        {
            page.setConfigurationSetId(null);
            page.setConfigurationSetPath(null);
            if (page.getContentTypeId() != null)
                page.setContentTypePath(null);
        }
        else
        {
            if (page.getConfigurationSetId() != null)
                page.setConfigurationSetPath(null);
        }

        //If the page has structured data, null out the structured data
        //relationships as well
        StructuredData sData = page.getStructuredData();
        if (sData != null)
        {
            if (sData.getDefinitionId() != null)
                sData.setDefinitionPath(null);
            StructuredDataNode[] nodes = sData.getStructuredDataNodes();

            if (nodes != null)
            {
                nullStructuredData(nodes);
            }
        }

        nullPageConfigurationValues(page.getPageConfigurations());
    }

    /**
     * Creates a page object based on the information provided in the xmlPage and the mappings in projectInformation.
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
        StructuredData structuredData = createPageStructuredData(xmlPage, assetType);

        // If page uses data definition, assign it to the page object
        if (contentType.isUsesDataDefinition())
            page.setStructuredData(structuredData);
        else
        {
            // if page does not use data definition, the tree mapping should contain only a single xhtml field
            StructuredDataNode[] xhtmlNodes = structuredData.getStructuredDataNodes();
            if (xhtmlNodes.length == 1)
                page.setXhtml(xhtmlNodes[0].getText());
            else if (xhtmlNodes.length == 0)
                ; // do nothing, no mappings
            else
                throw new Exception("The mappings for a page without Data Definition contains more than one field.");
        }

        return page;
    }

    /**
     * Creates the page's structured data object with the values from the xmlPage uses the mappings from the assetType. 
     * 
     * @param xmlPage
     * @param assetType
     * @return
     * @throws Exception
     */
    private static StructuredData createPageStructuredData(DetailedXmlPageInformation xmlPage, AssetType assetType) throws Exception
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
     * Creates the page's metadata object with the values from the xmlPage uses the mappings from the assetType. 
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
     * Nulls out the page configuration values
     * 
     * @param configs
     */
    private static void nullPageConfigurationValues(PageConfiguration[] configs)
    {
        //Null out all the page configuration relationship information
        if (configs != null)
        {
            for (int i = 0; i < configs.length; i++)
            {
                if (configs[i].getFormatId() != null)
                    configs[i].setFormatPath(null);
                if (configs[i].getTemplateId() != null)
                    configs[i].setTemplatePath(null);
                configs[i].setEntityType(null);

                // fix page regions
                nullPageRegionValues(configs[i].getPageRegions());
            }
        }
    }

    /**
     * Nulls out page region values
     * 
     * @param pRegs
     */
    private static void nullPageRegionValues(PageRegion[] pRegs)
    {
        if (pRegs != null)
        {
            for (int j = 0; j < pRegs.length; j++)
            {
                if (pRegs[j].getBlockId() != null)
                    pRegs[j].setBlockPath(null);
                if (pRegs[j].getFormatId() != null)
                    pRegs[j].setFormatPath(null);
                pRegs[j].setEntityType(null);
            }
        }
    }

    /**
     * Nulls out unneeded values in an array of StructuredDataNode
     * objects
     *
     * @param sDataNodes
     */
    private static final void nullStructuredData(StructuredDataNode[] sDataNodes)
    {
        if (sDataNodes != null)
        {
            for (int k = 0; k < sDataNodes.length; k++)
            {
                if (StructuredDataType.fromString(StructuredDataType._asset) == sDataNodes[k].getType())
                {
                    sDataNodes[k].setText(null);

                    if (sDataNodes[k].getAssetType() == StructuredDataAssetType.fromString(StructuredDataAssetType._block))
                    {
                        if (sDataNodes[k].getBlockId() == null && sDataNodes[k].getBlockPath() == null)
                        {
                            sDataNodes[k].setBlockPath("");
                        }
                        else
                        {
                            sDataNodes[k].setBlockId(null);
                        }
                    }
                    else if (sDataNodes[k].getAssetType() == StructuredDataAssetType.fromString(StructuredDataAssetType._file))
                    {
                        if (sDataNodes[k].getFileId() == null && sDataNodes[k].getFilePath() == null)
                        {
                            sDataNodes[k].setFilePath("");
                        }
                        else
                        {
                            sDataNodes[k].setFileId(null);
                        }
                    }
                    else if (sDataNodes[k].getAssetType() == StructuredDataAssetType.fromString(StructuredDataAssetType._page))
                    {
                        if (sDataNodes[k].getPageId() == null && sDataNodes[k].getPagePath() == null)
                        {
                            sDataNodes[k].setPagePath("");
                        }
                        else
                        {
                            sDataNodes[k].setPageId(null);
                        }
                    }
                    else if (sDataNodes[k].getAssetType() == StructuredDataAssetType.fromString(StructuredDataAssetType._symlink))
                    {
                        if (sDataNodes[k].getSymlinkId() == null && sDataNodes[k].getSymlinkPath() == null)
                        {
                            sDataNodes[k].setSymlinkPath("");
                        }
                        else
                        {
                            sDataNodes[k].setSymlinkId(null);
                        }
                    }
                }
                else if (StructuredDataType.fromString(StructuredDataType._group) == sDataNodes[k].getType())
                {
                    StructuredDataNode[] sDataNodeArray = sDataNodes[k].getStructuredDataNodes();
                    nullStructuredData(sDataNodeArray);
                    sDataNodes[k].setText(null);
                    sDataNodes[k].setAssetType(null);
                }
                else if (StructuredDataType.fromString(StructuredDataType._text) == sDataNodes[k].getType())
                {
                    sDataNodes[k].setAssetType(null);
                    sDataNodes[k].setStructuredDataNodes(null);
                    if (sDataNodes[k].getText() == null)
                    {
                        sDataNodes[k].setText("");
                    }
                }
                else
                {
                    sDataNodes[k].setAssetType(null);
                    sDataNodes[k].setText(null);
                }
            }
        }
    }

    /**
     * Nulls out publishable asset's values
     * 
     * @param publishable
     */
    private static final void nullPublishableValues(PublishableAsset publishable)
    {
        nullExpiringValues(publishable);
        if (publishable.getExpirationFolderId() != null)
            publishable.setExpirationFolderPath(null);
    }

    /**
     * Nulls out expiring values
     * 
     * @param expiring
     */
    private static final void nullExpiringValues(ExpiringAsset expiring)
    {
        nullDublinAwareValues(expiring);
        if (expiring.getExpirationFolderId() != null)
            expiring.setExpirationFolderPath(null);
    }

    /**
     * Nulls out dublin aware values
     * 
     * @param dublinAware
     */
    private static final void nullDublinAwareValues(DublinAwareAsset dublinAware)
    {
        nullFolderContainedValues(dublinAware);
        if (dublinAware.getMetadataSetId() != null)
            dublinAware.setMetadataSetPath(null);
    }

    /**
     * Nulls out folder contained asset's values
     * 
     * @param folderContained
     */
    private static final void nullFolderContainedValues(FolderContainedAsset folderContained)
    {
        nullAssetValues(folderContained);
        //Null out the various relationship paths in favor of the ids 
        if (folderContained.getParentFolderId() != null)
            folderContained.setParentFolderPath(null);
        if (folderContained.getId() != null)
            folderContained.setPath(null);
        if (folderContained.getSiteId() != null)
            folderContained.setSiteName(null);
    }

    /**
     * Nulls out base asset's values
     * 
     * @param baseAsset
     */
    private static final void nullAssetValues(BaseAsset baseAsset)
    {
        //Never, ever send an entity type. This will lead to an error.
        baseAsset.setEntityType(null);
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
        {
            // Remove the previous assignment
            for (DynamicMetadataField field : dynamicFields)
                if (field.getName().equals(fieldName))
                {
                    dynamicFields.remove(field);
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
