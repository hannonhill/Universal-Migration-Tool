/*
 * Created on Nov 19, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.www.ws.ns.AssetOperationService.Asset;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandlerServiceLocator;
import com.hannonhill.www.ws.ns.AssetOperationService.Authentication;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentType;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer;
import com.hannonhill.www.ws.ns.AssetOperationService.CreateResult;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString;
import com.hannonhill.www.ws.ns.AssetOperationService.FieldValue;
import com.hannonhill.www.ws.ns.AssetOperationService.Folder;
import com.hannonhill.www.ws.ns.AssetOperationService.Identifier;
import com.hannonhill.www.ws.ns.AssetOperationService.Metadata;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.Path;
import com.hannonhill.www.ws.ns.AssetOperationService.ReadResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Site;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataDefinition;

/**
 * This class contains service methods for web services
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class WebServices
{
    private static final Field[] STANDARD_METADATA_FIELDS = new Field[]
    {
            new Field("displayName", "Display Name", FieldType.METADATA), new Field("title", "Title", FieldType.METADATA),
            new Field("summary", "Summary", FieldType.METADATA), new Field("teaser", "Teaser", FieldType.METADATA),
            new Field("keywords", "Keywords", FieldType.METADATA), new Field("metaDescription", "Description", FieldType.METADATA),
            new Field("author", "Author", FieldType.METADATA)
    };

    private static final Field XHTML_DATA_DEFINITION_FIELD = new Field("xhtml", "XHTML", FieldType.DATA_DEFINITION);

    // Identifiers of the standard metadata fields
    private static final List<String> STANDARD_METADATA_FIELD_IDENTIFIERS;

    static
    {
        // Assign the identifiers
        STANDARD_METADATA_FIELD_IDENTIFIERS = new ArrayList<String>();
        for (Field standardMetadataField : STANDARD_METADATA_FIELDS)
            STANDARD_METADATA_FIELD_IDENTIFIERS.add(standardMetadataField.getIdentifier());
    }

    /**
     * Reads a site object
     * 
     * @param username
     * @param password
     * @param url
     * @param siteName
     * @return
     * @throws Exception
     */
    public static Site readSite(String username, String password, String url, String siteName) throws Exception
    {
        Authentication authentication = new Authentication(password, username);
        Path path = new Path(siteName, null, siteName);
        Identifier identifier = new Identifier(null, path, EntityTypeString.site);
        ReadResult readResult = getServer(url).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception(readResult.getMessage());

        return readResult.getAsset().getSite();
    }

    /**
     * Gets all content types from given site
     * 
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static List<ContentType> getContentTypesFromSite(ProjectInformation projectInformation) throws Exception
    {
        Site site = readSite(projectInformation.getUsername(), projectInformation.getPassword(), projectInformation.getUrl(), projectInformation
                .getSiteName());

        // Recursively collect all ancestor content types
        List<ContentType> contentTypes = new ArrayList<ContentType>();
        collectContentTypes(projectInformation, site.getRootContentTypeContainerId(), contentTypes);
        return contentTypes;
    }

    /**
     * Returns a map of metadata field identifiers to actual fields of a metadata set that is assigned to a content type with given contentTypePath
     * 
     * @param contentTypePath
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static Map<String, Field> getMetadataFieldsForContentType(String contentTypePath, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        ContentType contentType = readContentTypeByPath(projectInformation, contentTypePath);
        String metadataSetId = contentType.getMetadataSetId();

        Identifier identifier = new Identifier(metadataSetId, null, EntityTypeString.metadataset);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Metadata Set with id '" + metadataSetId + "': " + readResult.getMessage());

        MetadataSet metadataSet = readResult.getAsset().getMetadataSet();

        // add all the standard fields
        Map<String, Field> resultMap = new HashMap<String, Field>();
        for (Field field : STANDARD_METADATA_FIELDS)
            resultMap.put(field.getIdentifier(), field);

        // add the dynamic fields
        for (DynamicMetadataFieldDefinition definition : metadataSet.getDynamicMetadataFieldDefinitions())
            if (!definition.getVisibility().equals(MetadataFieldVisibility.hidden)) // skip hidden fields
                resultMap.put(definition.getName(), new Field(definition.getName(), definition.getLabel(), FieldType.METADATA));

        return resultMap;
    }

    /**
     * Returns a map of data definition field identifier to actual fields of a data definition that is assigned to a content type with given contentTypePath
     * 
     * @param contentTypePath
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static Map<String, Field> getDataDefinitionFieldsForContentType(String contentTypePath, ProjectInformation projectInformation)
            throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);

        // Check if data definition is assign. If it isn't - we just return the XHTML field.
        ContentType contentType = readContentTypeByPath(projectInformation, contentTypePath);
        String dataDefinitionId = contentType.getStructuredDataDefinitionId();
        if (dataDefinitionId == null)
        {
            Map<String, Field> returnMap = new HashMap<String, Field>();
            returnMap.put(XHTML_DATA_DEFINITION_FIELD.getIdentifier(), XHTML_DATA_DEFINITION_FIELD);
            return returnMap;
        }

        Identifier identifier = new Identifier(dataDefinitionId, null, EntityTypeString.structureddatadefinition);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Data Definition with id '" + dataDefinitionId + "': " + readResult.getMessage());

        StructuredDataDefinition dataDefinition = readResult.getAsset().getStructuredDataDefinition();
        return XmlAnalyzer.analyzeDataDefinitionXml(dataDefinition.getXml());
    }

    /**
     * Creates a page in Cascade Server using information provided in the DetailedXmlPageInformation object. If the parent folder cannot be found,
     * it will create it.
     * 
     * @param xmlPage
     * @param projectInformation
     * @throws Exception
     */
    public static void createPage(DetailedXmlPageInformation xmlPage, ProjectInformation projectInformation) throws Exception
    {
        String path = xmlPage.getDeployPath();
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);

        String assetTypeName = xmlPage.getAssetType();
        AssetType assetType = projectInformation.getAssetTypes().get(assetTypeName);
        String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);

        // Do not create a page for which the asset type wasn't mapped to content type
        if (contentTypePath == null)
            return;

        Page page = new Page();
        page.setContentTypePath(contentTypePath);
        page.setName(PathUtil.truncateExtension(PathUtil.getNameFromPath(path)));
        page.setParentFolderPath(parentFolderPath);
        page.setSiteName(projectInformation.getSiteName());
        page.setXhtml("Test");
        page.setMetadata(createPageMetadata(xmlPage, assetType));

        Asset asset = new Asset();
        asset.setPage(page);

        Authentication authentication = getAuthentication(projectInformation);
        CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

        // If the page couldn't be create because parent folder doesn't exist, go ahead and create the parent folder and attempt to create the page again
        if (!createResult.getSuccess().equals("true")
                && createResult.getMessage().equals("Parent folder with path '" + parentFolderPath + "' cannot be found."))
        {
            createFolder(parentFolderPath, projectInformation);
            createPage(xmlPage, projectInformation);
        }
    }

    /**
     * Creates the page's metadata object with the values from the xmlPage uses the mappings from the assetType. 
     * 
     * @param xmlPage
     * @param assetType
     * @return
     * @throws Exception
     */
    private static Metadata createPageMetadata(DetailedXmlPageInformation xmlPage, AssetType assetType) throws Exception
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
        if (STANDARD_METADATA_FIELD_IDENTIFIERS.contains(fieldName))
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
     * Creates a folder with given path. If the parent folder cannot be found, it will create it.
     * 
     * @param path
     * @param projectInformation
     * @throws Exception
     */
    private static void createFolder(String path, ProjectInformation projectInformation) throws Exception
    {
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);

        Folder folder = new Folder();
        folder.setName(PathUtil.getNameFromPath(path));
        folder.setParentFolderPath(parentFolderPath);
        folder.setSiteName(projectInformation.getSiteName());

        Asset asset = new Asset();
        asset.setFolder(folder);

        Authentication authentication = getAuthentication(projectInformation);
        CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

        // If the folder couldn't be create because parent folder doesn't exist, go ahead and create the parent folder and attempt to create the page again
        if (!createResult.getSuccess().equals("true")
                && createResult.getMessage().equals("Parent folder with path '" + parentFolderPath + "' cannot be found."))
        {
            createFolder(parentFolderPath, projectInformation);
            createFolder(path, projectInformation);
        }
    }

    /**
     * Adds all ancestor content types of content type container with given id to the contentTypes list
     * 
     * @param projectInformation
     * @param containerId
     * @param contentTypes
     * @throws Exception
     */
    private static void collectContentTypes(ProjectInformation projectInformation, String containerId, List<ContentType> contentTypes)
            throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(containerId, null, EntityTypeString.contenttypecontainer);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when getting a list of available Content Types in the Site: " + readResult.getMessage());

        ContentTypeContainer container = readResult.getAsset().getContentTypeContainer();
        Identifier[] childIdentifiers = container.getChildren();
        for (Identifier childIdentifier : childIdentifiers)
            if (childIdentifier.getType().equals(EntityTypeString.contenttypecontainer))
                collectContentTypes(projectInformation, childIdentifier.getId(), contentTypes);
            else
                contentTypes.add(readContentType(projectInformation, childIdentifier.getId()));
    }

    /**
     * Reads a content type with given id
     * 
     * @param projectInformation
     * @param contentTypeId
     * @return
     * @throws Exception
     */
    private static ContentType readContentType(ProjectInformation projectInformation, String contentTypeId) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(contentTypeId, null, EntityTypeString.contenttype);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Content Type with id '" + contentTypeId + "': " + readResult.getMessage());

        return readResult.getAsset().getContentType();
    }

    /**
     * Reads a content type with given path from a site specified in the projectInformation
     * 
     * @param projectInformation
     * @param contentTypePath
     * @return
     * @throws Exception
     */
    private static ContentType readContentTypeByPath(ProjectInformation projectInformation, String contentTypePath) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        String siteName = projectInformation.getSiteName();
        Identifier identifier = new Identifier(null, new Path(contentTypePath, null, siteName), EntityTypeString.contenttype);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Content Type with path '" + contentTypePath + "' from site '" + siteName + "': "
                    + readResult.getMessage());

        return readResult.getAsset().getContentType();
    }

    /**
     * Returns the AssetOperationHandler object based on given url
     * 
     * @param urlString
     * @return
     * @throws Exception
     */
    private static AssetOperationHandler getServer(String urlString) throws Exception
    {
        URL url = new URL(urlString);
        return new AssetOperationHandlerServiceLocator().getAssetOperationService(url);
    }

    /**
     * Returns the Authentication object based on the project information provided
     * 
     * @param projectInformation
     * @return
     */
    private static Authentication getAuthentication(ProjectInformation projectInformation)
    {
        return new Authentication(projectInformation.getPassword(), projectInformation.getUsername());
    }

}
