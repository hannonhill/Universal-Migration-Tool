/*
 * Created on Nov 19, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandlerServiceLocator;
import com.hannonhill.www.ws.ns.AssetOperationService.Authentication;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentType;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString;
import com.hannonhill.www.ws.ns.AssetOperationService.Identifier;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet;
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
     * Returns a list of metadata field names of a metadata set that is assigned to a content type with given contentTypePath
     * 
     * @param contentTypePath
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static List<Field> getMetadataFieldsForContentType(String contentTypePath, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = new Authentication(projectInformation.getPassword(), projectInformation.getUsername());
        ContentType contentType = readContentTypeByPath(projectInformation, contentTypePath);
        String metadataSetId = contentType.getMetadataSetId();

        Identifier identifier = new Identifier(metadataSetId, null, EntityTypeString.metadataset);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Metadata Set with id '" + metadataSetId + "': " + readResult.getMessage());

        MetadataSet metadataSet = readResult.getAsset().getMetadataSet();

        // add all the standard fields
        List<Field> resultList = new ArrayList<Field>();
        for (Field field : STANDARD_METADATA_FIELDS)
            resultList.add(field);

        // add the dynamic fields
        for (DynamicMetadataFieldDefinition definition : metadataSet.getDynamicMetadataFieldDefinitions())
            if (!definition.getVisibility().equals(MetadataFieldVisibility.hidden)) // skip hidden fields
                resultList.add(new Field(definition.getName(), definition.getLabel(), FieldType.METADATA));

        return resultList;
    }

    /**
     * Returns a list of data definition field names of a data definition that is assigned to a content type with given contentTypePath
     * 
     * @param contentTypePath
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static List<Field> getDataDefinitionFieldsForContentType(String contentTypePath, ProjectInformation projectInformation) throws Exception
    {
        List<Field> returnList = new ArrayList<Field>();
        Authentication authentication = new Authentication(projectInformation.getPassword(), projectInformation.getUsername());

        // Check if data definition is assign. If it isn't - we just return the XHTML field.
        ContentType contentType = readContentTypeByPath(projectInformation, contentTypePath);
        String dataDefinitionId = contentType.getStructuredDataDefinitionId();
        if (dataDefinitionId == null)
        {
            returnList.add(XHTML_DATA_DEFINITION_FIELD);
            return returnList;
        }

        Identifier identifier = new Identifier(dataDefinitionId, null, EntityTypeString.structureddatadefinition);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Data Definition with id '" + dataDefinitionId + "': " + readResult.getMessage());

        StructuredDataDefinition dataDefinition = readResult.getAsset().getStructuredDataDefinition();
        return XmlAnalyzer.analyzeDataDefinitionXml(dataDefinition.getXml());
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
        Authentication authentication = new Authentication(projectInformation.getPassword(), projectInformation.getUsername());
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
        Authentication authentication = new Authentication(projectInformation.getPassword(), projectInformation.getUsername());
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
        Authentication authentication = new Authentication(projectInformation.getPassword(), projectInformation.getUsername());
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
}
