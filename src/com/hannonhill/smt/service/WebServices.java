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
import java.util.Set;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;
import com.hannonhill.smt.util.WebServicesUtil;
import com.hannonhill.www.ws.ns.AssetOperationService.Asset;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler;
import com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandlerServiceLocator;
import com.hannonhill.www.ws.ns.AssetOperationService.Authentication;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentType;
import com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer;
import com.hannonhill.www.ws.ns.AssetOperationService.CreateResult;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString;
import com.hannonhill.www.ws.ns.AssetOperationService.Folder;
import com.hannonhill.www.ws.ns.AssetOperationService.Identifier;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet;
import com.hannonhill.www.ws.ns.AssetOperationService.OperationResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.Path;
import com.hannonhill.www.ws.ns.AssetOperationService.ReadResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Site;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredData;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode;

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

    public static final Field XHTML_DATA_DEFINITION_FIELD = new Field("xhtml", "XHTML", FieldType.DATA_DEFINITION);

    // Identifiers of the standard metadata fields
    public static final List<String> STANDARD_METADATA_FIELD_IDENTIFIERS;

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
     * Returns a map of data definition field identifier to actual fields of a data definition that is assigned to a content type with given contentTypePath.
     * If no data definition is assigned to the content type, returns null.
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
            return null;

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
     * @return Returns the created page's id.
     * @throws Exception
     */
    public static String createPage(DetailedXmlPageInformation xmlPage, ProjectInformation projectInformation) throws Exception
    {
        String path = xmlPage.getDeployPath();
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);

        String assetTypeName = xmlPage.getAssetType();
        AssetType assetType = projectInformation.getAssetTypes().get(assetTypeName);
        String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);
        com.hannonhill.smt.ContentType contentType = projectInformation.getContentTypes().get(contentTypePath);
        Set<String> metadataFieldNames = contentType.getMetadataFields().keySet();

        // This should be caught before, but just a sanity check
        if (contentTypePath == null)
            return null;

        Page page = new Page();
        page.setContentTypePath(contentTypePath);
        page.setName(PathUtil.truncateExtension(PathUtil.getNameFromPath(path)));
        page.setParentFolderPath(parentFolderPath);
        page.setSiteName(projectInformation.getSiteName());
        page.setMetadata(WebServicesUtil.createPageMetadata(xmlPage, assetType, metadataFieldNames));

        // Create the structured data object with the tree of structured data nodes
        StructuredData structuredData = WebServicesUtil.createPageStructuredData(xmlPage, assetType);

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

        Asset asset = new Asset();
        asset.setPage(page);

        Authentication authentication = getAuthentication(projectInformation);
        CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

        // If the page couldn't be create because parent folder doesn't exist, go ahead and create the parent folder and attempt to create the page again
        if (!createResult.getSuccess().equals("true")
                && createResult.getMessage().equals("Parent folder with path '" + parentFolderPath + "' cannot be found."))
        {
            createFolder(parentFolderPath, projectInformation);
            return createPage(xmlPage, projectInformation);
        }

        return createResult.getCreatedAssetId();
    }

    /**
     * Reads and edits the page so that the links are realigned
     * 
     * @param id
     * @param projectInformation
     * @throws Exception
     */
    public static void realignLinks(String id, ProjectInformation projectInformation) throws Exception
    {
        Page page = readPage(id, projectInformation);
        WebServicesUtil.nullPageValues(page);
        editPage(page, projectInformation);
    }

    /**
     * Reads a page with given id from Cascade Server
     * 
     * @param id
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static Page readPage(String id, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(id, null, EntityTypeString.page);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Page with id '" + id + "': " + readResult.getMessage());

        return readResult.getAsset().getPage();
    }

    /**
     * Sends an edit request for given page through web services
     * 
     * @param page
     * @param projectInformation
     * @throws Exception
     */
    private static void editPage(Page page, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Asset asset = new Asset();
        asset.setPage(page);
        OperationResult operationResult = getServer(projectInformation.getUrl()).edit(authentication, asset);

        if (!operationResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Page with id '" + page.getId() + "': " + operationResult.getMessage());
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
