/*
 * Created on Nov 19, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.CascadeAssetInformation;
import com.hannonhill.smt.DataDefinitionField;
import com.hannonhill.smt.DetailedXmlPageInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.MetadataSetField;
import com.hannonhill.smt.MigrationStatus;
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
import com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock;

/**
 * This class contains service methods for web services
 * 
 * @author Artur Tomusiak
 * @since 1.0
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

    public static final DataDefinitionField XHTML_DATA_DEFINITION_FIELD = new DataDefinitionField("xhtml", "XHTML", null, false);

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
        Site site = readSite(projectInformation.getUsername(), projectInformation.getPassword(), projectInformation.getUrl(),
                projectInformation.getSiteName());

        // Recursively collect all ancestor content types
        List<ContentType> contentTypes = new ArrayList<ContentType>();
        collectContentTypes(projectInformation, site.getRootContentTypeContainerId(), contentTypes);
        return contentTypes;
    }

    /**
     * Returns a map of metadata field identifiers to actual fields of a metadata set that is assigned to a
     * content type with given contentTypePath
     * 
     * @param projectInformation
     * @param contentType
     * @return
     * @throws Exception
     */
    public static Map<String, MetadataSetField> getMetadataFieldsForContentType(ProjectInformation projectInformation, ContentType contentType)
            throws Exception
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
     * Returns a map of data definition field identifier to actual fields of a data definition that is
     * assigned to a content type with given contentTypePath.
     * If no data definition is assigned to the content type, returns null.
     * 
     * @param projectInformation
     * @param contentType
     * @return
     * @throws Exception
     */
    public static Map<String, DataDefinitionField> getDataDefinitionFieldsForContentType(ProjectInformation projectInformation,
            ContentType contentType) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);

        // Check if data definition is assigned. If it isn't, return null (we will just create the XHTML
        // field).
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
     * Creates a page in Cascade Server using information provided in the DetailedXmlPageInformation object.
     * If the parent folder cannot be found,
     * it will create it.
     * 
     * @param xmlPage
     * @param projectInformation
     * @return Returns the created page's id.
     * @throws Exception
     */
    public static CascadeAssetInformation createPage(DetailedXmlPageInformation xmlPage, ProjectInformation projectInformation) throws Exception
    {
        String path = xmlPage.getDeployPath();
        String pageName = PathUtil.truncateExtension(PathUtil.getNameFromPath(path));
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);
        String pagePath = PathUtil.removeLeadingSlashes(parentFolderPath + "/" + pageName);
        String assetTypeName = xmlPage.getAssetType();
        String contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);

        // This should be caught before, but just a sanity check
        if (contentTypePath == null)
            return null;

        // Check for duplicate paths
        if (projectInformation.getMigrationStatus().getCreatedAssetPaths().contains(pagePath.toLowerCase()))
            throw new Exception("Duplicate path found - asset with given path already got created during this migration.");

        // Set up the page object and assign it to the asset object
        Page page = WebServicesUtil.setupPageObject(xmlPage, projectInformation);
        Asset asset = new Asset();
        asset.setPage(page);

        // Check overwrite behavior. If overwrite behavior is to update existing, check if page with given
        // path exists and if so, get its id
        String overwriteBehavior = projectInformation.getOverwriteBehavior();
        String existingPageId = null;
        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING))
            existingPageId = getPageId(pagePath, projectInformation);
        // If overwite existing is selected, we need to delete the existing page and ignore an error if it did
        // not exists and we attempted to delete it
        else if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING))
            deletePage(pagePath, projectInformation);

        // If page doesn't exist or overwrite behavior is not to update existing, create the page and ancestor
        // folders if necessary
        if (existingPageId == null)
        {
            Authentication authentication = getAuthentication(projectInformation);
            CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

            // If the page couldn't be created because parent folder doesn't exist, go ahead and create the
            // parent folder and attempt to create the page again
            if (!createResult.getSuccess().equals("true"))
            {
                String message = createResult.getMessage();
                if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                        && message.contains("could not be found"))
                {
                    createFolder(parentFolderPath, projectInformation);
                    return createPage(xmlPage, projectInformation);
                }

                throw new Exception("Page " + pagePath + " could not be created: " + createResult.getMessage() + " - Parent folder path is: -"
                        + parentFolderPath + "-");
            }

            projectInformation.getExistingCascadePages().add(pagePath.toLowerCase());
            return new CascadeAssetInformation(createResult.getCreatedAssetId(), pagePath);
        }

        // If page exists, edit it
        page.setId(existingPageId);
        editPage(page, projectInformation);
        return new CascadeAssetInformation(existingPageId, pagePath);
    }

    /**
     * Creates XHTML Block in Cascade with the content of the file put through JTidy.
     * 
     * @param file
     * @param projectInformation
     * @param metadataSetId
     * @return
     * @throws Exception
     */
    public static CascadeAssetInformation createXhtmlBlock(java.io.File file, ProjectInformation projectInformation, String metadataSetId)
            throws Exception
    {
        String parentFolderPath = PathUtil
                .removeLeadingSlashes(LinkRewriter.getWebViewUrl(file.getParent().substring(projectInformation.getLuminisLinkRootPath().length()),
                        projectInformation.getLinkFileUrlToWebviewUrlMap()));
        // Don't create static components in the root folder. Instead, create them in
        // "_internal/blocks/static" folder
        if (parentFolderPath.equals("") || parentFolderPath.equals("/"))
            parentFolderPath = "_cascade/blocks/static";
        String blockName = PathUtil.truncateExtension(file.getName());
        String blockPath = PathUtil.removeLeadingSlashes(parentFolderPath + "/" + blockName);

        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        String relativePath = PathUtil.getRelativePath(file, projectInformation.getXmlDirectory());
        Log.add("Creating XHTML block in Cascade " + relativePath + "... ", migrationStatus);

        // Check for duplicate paths
        if (projectInformation.getMigrationStatus().getCreatedAssetPaths().contains(blockPath.toLowerCase()))
            throw new Exception("Duplicate path found - asset with given path already got created during this migration.");

        String overwriteBehavior = projectInformation.getOverwriteBehavior();
        String existingBlockId = null;

        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING))
        {
            if (projectInformation.getExistingCascadeXhtmlBlocks().contains(blockPath.toLowerCase()))
                existingBlockId = getXhtmlBlockId(blockPath, projectInformation);
        }
        // If overwite existing is selected, we need to delete the existing block and ignore an error if it
        // did not exists and we attempted to delete it
        else if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING))
        {
            if (projectInformation.getExistingCascadeXhtmlBlocks().contains(blockPath.toLowerCase()))
                deleteXhtmlBlock(blockPath, projectInformation);
        }

        // Set up the file object and assign it to the asset object
        XhtmlDataDefinitionBlock block = new XhtmlDataDefinitionBlock();
        block.setName(blockName);
        block.setParentFolderPath(parentFolderPath);
        block.setSiteName(projectInformation.getSiteName());
        block.setMetadataSetId(metadataSetId);
        block.setXhtml(JTidy.tidyContent(FileSystem.getFileContents(file)));

        Asset asset = new Asset();
        asset.setXhtmlDataDefinitionBlock(block);

        Authentication authentication = getAuthentication(projectInformation);
        if (existingBlockId == null)
        {
            CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

            // If the page couldn't be created because parent folder doesn't exist, go ahead and create the
            // parent folder and attempt to create the page again
            if (!createResult.getSuccess().equals("true"))
            {
                String message = createResult.getMessage();
                if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                        && message.contains("could not be found"))
                {
                    createFolder(parentFolderPath, projectInformation);
                    return createXhtmlBlock(file, projectInformation, metadataSetId);
                }

                throw new Exception("XHTML Block " + blockPath + " could not be created: " + createResult.getMessage()
                        + " - Parent folder path is: -" + parentFolderPath + "-");
            }

            projectInformation.getExistingCascadeXhtmlBlocks().add(blockPath.toLowerCase());
            return new CascadeAssetInformation(createResult.getCreatedAssetId(), blockPath);
        }

        // If block exists, edit it
        block.setId(existingBlockId);
        editXhtmlBlock(block, projectInformation);
        return new CascadeAssetInformation(existingBlockId, blockPath);
    }

    /**
     * Creates a file asset in Cascade Server with contents from the <code>filesystemFile</code> if one does
     * not exist. The path of the file is figured out using webViewUrl in linkFile.xml in current or ancestor
     * folders. If file with that path already exists, it is left as it is.
     * 
     * @param filesystemFile
     * @param projectInformation
     * @param metadataSetId
     * @throws Exception
     */
    public static void createFile(java.io.File filesystemFile, ProjectInformation projectInformation, String metadataSetId) throws Exception
    {
        createFile(filesystemFile, projectInformation, metadataSetId, true);
    }

    /**
     * See {@link #createFile(java.io.File, ProjectInformation, String)}
     * 
     * @param filesystemFile
     * @param projectInformation
     * @param metadataSetId
     * @param logCreatingFile whether or not the "Creating file ..." message should be logged
     * @throws Exception
     */
    private static void createFile(java.io.File filesystemFile, ProjectInformation projectInformation, String metadataSetId, boolean logCreatingFile)
            throws Exception
    {
        String parentFolderPath = PathUtil.removeLeadingSlashes(LinkRewriter.getWebViewUrl(
                filesystemFile.getParent().substring(projectInformation.getLuminisLinkRootPath().length()),
                projectInformation.getLinkFileUrlToWebviewUrlMap()));

        // Do not create files in root folder. Instead, put them in "files" folder
        if (parentFolderPath.equals(""))
            parentFolderPath = "files";
        String fileName = filesystemFile.getName();
        String filePath = PathUtil.removeLeadingSlashes(parentFolderPath + "/" + fileName);

        if (projectInformation.getExistingCascadeFiles().contains(filePath.toLowerCase()))
            return;

        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        String relativePath = PathUtil.getRelativePath(filesystemFile, projectInformation.getXmlDirectory());
        if (logCreatingFile)
            Log.add("Creating file in Cascade " + relativePath + "... ", migrationStatus);

        // Set up the file object and assign it to the asset object
        File file = new File();
        file.setName(fileName);
        file.setParentFolderPath(parentFolderPath);
        file.setSiteName(projectInformation.getSiteName());
        file.setMetadataSetId(metadataSetId);
        file.setShouldBeIndexed(true);
        file.setShouldBePublished(true);
        file.setData(FileSystem.getBytesFromFile(filesystemFile));

        Asset asset = new Asset();
        asset.setFile(file);

        Authentication authentication = getAuthentication(projectInformation);
        CreateResult createResult = getServer(projectInformation.getUrl()).create(authentication, asset);

        // If the page couldn't be created because parent folder doesn't exist, go ahead and create the
        // parent folder and attempt to create the page again
        if (!createResult.getSuccess().equals("true"))
        {
            String message = createResult.getMessage();
            if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                    && message.contains("could not be found"))
            {
                createFolder(parentFolderPath, projectInformation);
                createFile(filesystemFile, projectInformation, metadataSetId, false);
                return;
            }

            throw new Exception("File " + filePath + " could not be created: " + createResult.getMessage() + " - Parent folder path is: -"
                    + parentFolderPath + "-");
        }
        Identifier cascadeFile = new Identifier(createResult.getCreatedAssetId(), new Path(filePath, null, projectInformation.getSiteName()),
                EntityTypeString.file, false);

        projectInformation.getExistingCascadeFiles().add(filePath.toLowerCase());

        Log.add(PathUtil.generateFileLink(cascadeFile, projectInformation.getUrl()), migrationStatus);
        Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
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
        editPage(page, projectInformation);
    }

    /**
     * Reads and edits the XHTML Block - fixes the links and makes them realigned
     * 
     * @param id
     * @param projectInformation
     * @throws Exception
     */
    public static void realignXhtmlBlockLinks(String id, ProjectInformation projectInformation) throws Exception
    {
        XhtmlDataDefinitionBlock block = readXhtmlBlock(id, projectInformation);
        block.setXhtml(LinkRewriter.fixXhtmlBlockLinks(block.getXhtml(), projectInformation));
        editXhtmlBlock(block, projectInformation);
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
     * Reads an XHTML Block with given id from Cascade Server
     * 
     * @param id
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static XhtmlDataDefinitionBlock readXhtmlBlock(String id, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(id, null, EntityTypeString.block_XHTML_DATADEFINITION, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading an XHTML Block with id '" + id + "': " + readResult.getMessage());

        return readResult.getAsset().getXhtmlDataDefinitionBlock();
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
        path = PathUtil.removeLeadingSlashes(path).toLowerCase();
        // Check confirmed paths first
        if (projectInformation.getExistingCascadeFiles().contains(path))
            return true;
        if (projectInformation.getExistingCascadeXhtmlBlocks().contains(path))
            return true;
        if (projectInformation.getExistingCascadePages().contains(path))
            return true;

        // If not found, try reading the asset by path
        if (readPageByPath(path, projectInformation) != null)
            return true;

        if (readFileByPath(path, projectInformation) != null)
            return true;

        if (readXhtmlBlockByPath(path, projectInformation) != null)
            return true;

        return false;
    }

    /**
     * Reads all files, blocks and pages in selected site and stores their paths in projectInformation so that
     * later it doesn't have to read whole the asset only to see if it exists (as it can be very slow if the
     * asset is big).
     * 
     * @param projectInformation
     * @throws Exception
     */
    public static void populateExistingCascadeAssets(ProjectInformation projectInformation) throws Exception
    {
        Identifier identifier = new Identifier(null, new Path("/", null, projectInformation.getSiteName()), EntityTypeString.folder, false);
        populateExistingCascadeAssetsOfFolder(identifier, projectInformation);
    }

    /**
     * Recursively reads all assets from given folder and its descendants and stores their paths in
     * {@link ProjectInformation#getExistingCascadeFiles()},
     * {@link ProjectInformation#getExistingCascadeXhtmlBlocks()} and
     * {@link ProjectInformation#getExistingCascadePages()}
     * 
     * @param folderIdentifier
     * @param projectInformation
     * @throws Exception
     */
    private static void populateExistingCascadeAssetsOfFolder(Identifier folderIdentifier, ProjectInformation projectInformation) throws Exception
    {
        if (projectInformation.getMigrationStatus().isShouldStop())
            return;

        ReadResult readResult = getServer(projectInformation.getUrl()).read(getAuthentication(projectInformation), folderIdentifier);
        if (!readResult.getSuccess().equals("true"))
            throw new Exception("Error occured when reading a Cascade Folder with path '" + folderIdentifier.getPath().getPath() + "': "
                    + readResult.getMessage());

        Folder folder = readResult.getAsset().getFolder();
        Identifier[] children = folder.getChildren();
        for (Identifier child : children)
        {
            if (child.getType().equals(EntityTypeString.file))
                projectInformation.getExistingCascadeFiles().add(child.getPath().getPath().toLowerCase());
            else if (child.getType().equals(EntityTypeString.block_XHTML_DATADEFINITION))
                projectInformation.getExistingCascadeXhtmlBlocks().add(child.getPath().getPath().toLowerCase());
            else if (child.getType().equals(EntityTypeString.page))
                projectInformation.getExistingCascadePages().add(child.getPath().getPath().toLowerCase());
            else if (child.getType().equals(EntityTypeString.folder))
                populateExistingCascadeAssetsOfFolder(child, projectInformation);
        }

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
     * Reads a block with given path and returns its id. If the block doesn't exist, returns null.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static String getXhtmlBlockId(String path, ProjectInformation projectInformation) throws Exception
    {
        XhtmlDataDefinitionBlock existingBlock = readXhtmlBlockByPath(path, projectInformation);
        if (existingBlock != null)
            return existingBlock.getId();

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
     * Reads an XHTML Block with given path from Cascade Server. If the block doesn't exist, returns null.
     * 
     * @param path
     * @param projectInformation
     * @return
     * @throws Exception
     */
    private static XhtmlDataDefinitionBlock readXhtmlBlockByPath(String path, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(null, new Path(path, null, projectInformation.getSiteName()),
                EntityTypeString.block_XHTML_DATADEFINITION, false);
        ReadResult readResult = getServer(projectInformation.getUrl()).read(authentication, identifier);
        if (!readResult.getSuccess().equals("true")
                && (readResult.getMessage() == null || !readResult.getMessage().equals(
                        "Unable to identify an entity based on provided entity path '" + path + "' and type 'block'")))
            throw new Exception("Error occured when reading a XHTML Block with path '" + path + "': " + readResult.getMessage());

        return readResult.getSuccess().equals("true") ? readResult.getAsset().getXhtmlDataDefinitionBlock() : null;
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
            throw new Exception("Error occured when editing a Page with id '" + page.getId() + "': " + operationResult.getMessage());
    }

    /**
     * Sends an edit request for given XHTML Block through web services
     * 
     * @param block
     * @param projectInformation
     * @throws Exception
     */
    private static void editXhtmlBlock(XhtmlDataDefinitionBlock block, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Asset asset = new Asset();
        asset.setXhtmlDataDefinitionBlock(block);
        OperationResult operationResult = getServer(projectInformation.getUrl()).edit(authentication, asset);

        if (!operationResult.getSuccess().equals("true"))
            throw new Exception("Error occured when editing an XHTML BLOCK with id '" + block.getId() + "': " + operationResult.getMessage());
    }

    /**
     * Asks Cascade Server to delete a page with given path. If page didn't exist, the error will be ignored.
     * If
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
     * Asks Cascade Server to delete an XHTML Block with given path. If block didn't exist, the error will be
     * ignored. If some other problem occurred, an exception will be thrown.
     * 
     * @param path
     * @param projectInformation
     * @throws Exception
     */
    private static void deleteXhtmlBlock(String path, ProjectInformation projectInformation) throws Exception
    {
        Authentication authentication = getAuthentication(projectInformation);
        Identifier identifier = new Identifier(null, new Path(path, null, projectInformation.getSiteName()),
                EntityTypeString.block_XHTML_DATADEFINITION, false);
        OperationResult deleteResult = getServer(projectInformation.getUrl()).delete(authentication, identifier);

        if (!deleteResult.getSuccess().equals("true")
                && (deleteResult.getMessage() == null || !deleteResult.getMessage().equals(
                        "Unable to identify an entity based on provided entity path '" + path + "' and type 'block_XHTML_DATADEFINITION'")))
            throw new Exception("Error occured when deleting an XHTML Block with path '" + path + "': " + deleteResult.getMessage());
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

        // If the folder couldn't be create because parent folder doesn't exist, go ahead and create the
        // parent folder and attempt to create the page again
        if (!createResult.getSuccess().equals("true"))
        {
            String message = createResult.getMessage();
            if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                    && message.contains("could not be found"))
            {
                createFolder(parentFolderPath, projectInformation);
                createFolder(path, projectInformation);
            }
            else
                throw new Exception("Parent folder " + path + " could not be created: " + createResult.getMessage() + " - Parent folder path is: -"
                        + parentFolderPath + "-");
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
