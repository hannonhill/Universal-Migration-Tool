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

import com.hannonhill.smt.CascadePageInformation;
import com.hannonhill.smt.DataDefinitionField;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.MetadataSetField;
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
import com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition;
import com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString;
import com.hannonhill.www.ws.ns.AssetOperationService.File;
import com.hannonhill.www.ws.ns.AssetOperationService.Folder;
import com.hannonhill.www.ws.ns.AssetOperationService.Identifier;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility;
import com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet;
import com.hannonhill.www.ws.ns.AssetOperationService.OperationResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Page;
import com.hannonhill.www.ws.ns.AssetOperationService.Path;
import com.hannonhill.www.ws.ns.AssetOperationService.ReadResult;
import com.hannonhill.www.ws.ns.AssetOperationService.Site;

/**
 * This class contains service methods for web services
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class WebServices
{
    private static final MetadataSetField[] STANDARD_METADATA_FIELDS = new MetadataSetField[]
    {
            new MetadataSetField("displayName", "Display Name", false), new MetadataSetField("title", "Title", false),
            new MetadataSetField("summary", "Summary", false), new MetadataSetField("teaser", "Teaser", false),
            new MetadataSetField("keywords", "Keywords", false), new MetadataSetField("metaDescription", "Description", false),
            new MetadataSetField("author", "Author", false)
    };

    public static final DataDefinitionField XHTML_DATA_DEFINITION_FIELD = new DataDefinitionField("xhtml", "XHTML", false);

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
        Identifier identifier = new Identifier(null, path, EntityTypeString.site, false);
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
     * @param contentType
     * @return
     * @throws Exception
     */
    public static Map<String, MetadataSetField> getMetadataFieldsForContentType(String contentTypePath, ProjectInformation projectInformation,
            ContentType contentType) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        String metadataSetId = contentType.getMetadataSetId();

        Identifier identifier = new Identifier(metadataSetId, null, EntityTypeString.metadataset, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Metadata Set with id '" + metadataSetId + "': " + readResult.getMessage());

        MetadataSet metadataSet = readResult.getAsset().getMetadataSet();

        // add all the standard fields
        Map<String, MetadataSetField> resultMap = new HashMap<String, MetadataSetField>();
        for (MetadataSetField field : STANDARD_METADATA_FIELDS)
            resultMap.put(field.getIdentifier(), field);

        // add the dynamic fields
        for (DynamicMetadataFieldDefinition definition : metadataSet.getDynamicMetadataFieldDefinitions())
            if (!definition.getVisibility().equals(MetadataFieldVisibility.hidden)) // skip hidden fields
                resultMap.put(definition.getName(), new MetadataSetField(definition.getName(), definition.getLabel(), true));

        return resultMap;
    }

    /**
     * Returns a map of data definition field identifier to actual fields of a data definition that is assigned to a content type with given contentTypePath.
     * If no data definition is assigned to the content type, returns null.
     * 
     * @param contentTypePath
     * @param projectInformation
     * @param contentType
     * @return
     * @throws Exception
     */
    public static Map<String, DataDefinitionField> getDataDefinitionFieldsForContentType(String contentTypePath,
            ProjectInformation projectInformation, ContentType contentType) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);

        // Check if data definition is assigned. If it isn't, return null (we will just create the XHTML field).
        String dataDefinitionId = contentType.getDataDefinitionId();
        if (dataDefinitionId == null)
            return null;

        Identifier identifier = new Identifier(dataDefinitionId, null, EntityTypeString.datadefinition, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Data Definition with id '" + dataDefinitionId + "': " + readResult.getMessage());

        DataDefinition dataDefinition = readResult.getAsset().getDataDefinition();
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
    public static CascadePageInformation createPage(DetailedXmlPageInformation xmlPage, ProjectInformation projectInformation) throws Exception
    {
        String path = xmlPage.getDeployPath();
        String pageName = PathUtil.truncateExtension(PathUtil.getNameFromPath(path));
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);
        String pagePath = parentFolderPath + "/" + pageName;
        String assetTypeName = xmlPage.getAssetType();
        String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);

        // This should be caught before, but just a sanity check
        if (contentTypePath == null)
            return null;

        // Set up the page object and assign it to the asset object
        Page page = WebServicesUtil.setupPageObject(xmlPage, projectInformation);
        Asset asset = new Asset();
        asset.setPage(page);

        // Check overwrite behavior. If overwrite behavior is to update existing, check if page with given path exists and if so, get its id
        String overwriteBehavior = projectInformation.getOverwriteBehavior();
        String existingPageId = null;
        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING))
            existingPageId = getPageId(pagePath, projectInformation);
        // If overwite existing is selected, we need to delete the existing page and ignore an error if it did not exists and we attempted to delete it
        else if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING))
            deletePage(pagePath, projectInformation);

        // If page doesn't exist or overwrite behavior is not to update existing, create the page and ancestor folders if necessary
        if (existingPageId == null)
        {
            Authentication authentication = getAuthentication(projectInformation);
            CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

            // If the page couldn't be created because parent folder doesn't exist, go ahead and create the parent folder and attempt to create the page again
            if (!createResult.getSuccess().equals("true"))
            {
                if (createResult.getMessage().equals("Parent folder with path '" + parentFolderPath + "' cannot be found."))
                {
                    createFolder(parentFolderPath, projectInformation);
                    return createPage(xmlPage, projectInformation);
                }

                throw new Exception("Page " + pagePath + " could not be created: " + createResult.getMessage());
            }
            return new CascadePageInformation(createResult.getCreatedAssetId(), pagePath);
        }

        // If page exists, edit it
        page.setId(existingPageId);
        editPage(page, projectInformation);
        return new CascadePageInformation(existingPageId, pagePath);
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
    public static Page readPage(String id, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(id, null, EntityTypeString.page, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Page with id '" + id + "': " + readResult.getMessage());

        return readResult.getAsset().getPage();
    }

    /**
     * Returns true if either a page or file with given path exists in Cascade.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static boolean doesAssetExist(String path, ProjectInformation projectInformation) throws Exception
    {
        if (readPageByPath(path, projectInformation) != null)
            return true;

        if (readFileByPath(path, projectInformation) != null)
            return true;

        return false;
    }

    /**
     * Reads a page with given path and returns its id. If the page doesn't exist, returns null.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static String getPageId(String path, ProjectInformation projectInformation) throws Exception
    {
        Page existingPage = readPageByPath(path, projectInformation);
        if (existingPage != null)
            return existingPage.getId();

        return null;
    }

    /**
     * Reads a page with given path from Cascade Server. If the page doesn't exist, returns null.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static Page readPageByPath(String path, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(null, new Path(path, null, projectInformation.getSiteName()), EntityTypeString.page, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true")
                && (readResult.getMessage() == null || !readResult.getMessage().equals(
                        "Unable to identify an entity based on provided entity path '" + path + "' and type 'page'")))
            throw new Exception("Error occured when reading a Page with path '" + path + "': " + readResult.getMessage());

        return readResult.getSuccess().equals("true") ? readResult.getAsset().getPage() : null;
    }

    /**
     * Reads a file with given path from Cascade Server. If the file doesn't exist, returns null.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static File readFileByPath(String path, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(null, new Path(path, null, projectInformation.getSiteName()), EntityTypeString.file, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true")
                && (readResult.getMessage() == null || !readResult.getMessage().equals(
                        "Unable to identify an entity based on provided entity path '" + path + "' and type 'file'")))
            throw new Exception("Error occured when reading a Page with path '" + path + "': " + readResult.getMessage());

        return readResult.getSuccess().equals("true") ? readResult.getAsset().getFile() : null;
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
     * Asks Cascade Server to delete a page with given path. If page didn't exist, the error will be ignored. If 
     * some other problem occured, an exception will be thrown.
     * 
     * @param path
     * @param projectInformation
     * @throws Exception
     */
    private static void deletePage(String path, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(null, new Path(path, null, projectInformation.getSiteName()), EntityTypeString.page, false);
        OperationResult deleteResult = getServer(projectInformation.getUrl()).delete(authentication, identifier);

        if (!deleteResult.getSuccess().equals("true")
                && (deleteResult.getMessage() == null || !deleteResult.getMessage().equals(
                        "Unable to identify an entity based on provided entity path '" + path + "' and type 'page'")))
            throw new Exception("Error occured when deleting a Page with path '" + path + "': " + deleteResult.getMessage());
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
        if (!createResult.getSuccess().equals("true"))
        {
            if (createResult.getMessage() != null
                    && createResult.getMessage().equals("Parent folder with path '" + parentFolderPath + "' cannot be found."))
            {
                createFolder(parentFolderPath, projectInformation);
                createFolder(path, projectInformation);
            }
            else
                throw new Exception("Parent folder " + path + " could not be created: " + createResult.getMessage());
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
        Identifier identifier = new Identifier(containerId, null, EntityTypeString.contenttypecontainer, false);
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
        Identifier identifier = new Identifier(contentTypeId, null, EntityTypeString.contenttype, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Content Type with id '" + contentTypeId + "': " + readResult.getMessage());

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
