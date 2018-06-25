/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.service;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.xwork.StringUtils;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hannonhill.umt.CascadeAssetInformation;
import com.hannonhill.umt.DataDefinitionField;
import com.hannonhill.umt.Field;
import com.hannonhill.umt.MetadataSetField;
import com.hannonhill.umt.MigrationStatus;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.api.ContentType;
import com.hannonhill.umt.api.DataDefinition;
import com.hannonhill.umt.api.DynamicMetadataFieldDefinition;
import com.hannonhill.umt.api.File;
import com.hannonhill.umt.api.Folder;
import com.hannonhill.umt.api.FolderContainedAsset;
import com.hannonhill.umt.api.Identifier;
import com.hannonhill.umt.api.MetadataSet;
import com.hannonhill.umt.api.Page;
import com.hannonhill.umt.api.Site;
import com.hannonhill.umt.api.XhtmlDataDefinitionBlock;
import com.hannonhill.umt.util.PathUtil;
import com.hannonhill.umt.util.WebServicesUtil;

public class RestApi
{
    private static final long MAX_FILE_SIZE_MB = 500l;

    private static final MetadataSetField[] STANDARD_METADATA_FIELDS = new MetadataSetField[]
    {
            new MetadataSetField("displayName", "Display Name", false), new MetadataSetField("title", "Title", false),
            new MetadataSetField("summary", "Summary", false), new MetadataSetField("teaser", "Teaser", false),
            new MetadataSetField("keywords", "Keywords", false), new MetadataSetField("metaDescription", "Description", false),
            new MetadataSetField("author", "Author", false)
    };

    // Names of metadata fields whose values can be longer than 250 characters
    public static final List<String> LONG_METADATA_FIELDS;

    public static final DataDefinitionField XHTML_DATA_DEFINITION_FIELD = new DataDefinitionField("xhtml", "XHTML", null, false, true);

    // Identifiers of the standard metadata fields
    public static final List<String> STANDARD_METADATA_FIELD_IDENTIFIERS;

    static
    {
        // Assign the identifiers
        STANDARD_METADATA_FIELD_IDENTIFIERS = new ArrayList<>();
        for (Field standardMetadataField : STANDARD_METADATA_FIELDS)
            STANDARD_METADATA_FIELD_IDENTIFIERS.add(standardMetadataField.getIdentifier());

        LONG_METADATA_FIELDS = new ArrayList<>();
        LONG_METADATA_FIELDS.add("keywords");
        LONG_METADATA_FIELDS.add("summary");
        LONG_METADATA_FIELDS.add("teaser");
        LONG_METADATA_FIELDS.add("metaDescription");
    }

    private static Gson gson = new Gson();

    public static Site readSite(String username, String password, String cascadeUrl, String siteName) throws Exception
    {
        JsonObject assetResult = performApiRequest(username, password, cascadeUrl, "read",
                getJsonObjectWithIdentifier(new Identifier(siteName, "", "site"))).getAsJsonObject("asset");
        return getProperty(assetResult, "site", Site.class);
    }

    public static List<String> getSiteNames(String cascadeUrl, String username, String password) throws Exception
    {
        List<String> result = new ArrayList<>();
        JsonObject operationResult = performApiRequest(username, password, cascadeUrl, "listSites", null);
        JsonArray sites = operationResult.getAsJsonArray("sites");
        sites.forEach(site -> result.add(site.getAsJsonObject().getAsJsonObject("path").get("path").getAsString()));
        return result;
    }

    /**
     * Creates a page in Cascade Server based on the information provided in the projectInformation and the
     * actual file from which the Page needs to be created.
     */
    public static CascadeAssetInformation createPage(java.nio.file.Path pageFile, ProjectInformation projectInformation) throws Exception
    {
        String path = PathUtil.createPagePathFromFileSystemFile(pageFile, projectInformation);
        path = path.replace(java.io.File.separator, "/");
        if (!XmlAnalyzer.allCharactersLegal(path))
            path = XmlAnalyzer.removeIllegalCharacters(path);

        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);
        String contentTypePath = projectInformation.getContentTypePath();

        String overwriteBehavior = projectInformation.getOverwriteBehavior();
        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_SKIP_EXISTING))
        {
            String pageId = getAssetId(path, projectInformation);
            if (pageId != null)
                return new CascadeAssetInformation(pageId, path, true);
        }

        // This should be caught before, but just a sanity check
        if (contentTypePath == null)
            return null;

        // Check for duplicate paths
        if (projectInformation.getMigrationStatus().getCreatedAssetPaths().contains(path.toLowerCase()))
            throw new Exception("Duplicate path found - asset with given path already got created during this migration: " + path.toLowerCase());

        // Set up the page object and assign it to the asset object
        Page page = WebServicesUtil.setupPageObject(pageFile, projectInformation);
        JsonObject data = getDataWithAsset("page", page);

        // Check overwrite behavior. If overwrite behavior is to update existing, check if page with given
        // path exists and if so, get its id
        String existingPageId = null;
        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING))
            existingPageId = getPageId(path, projectInformation);
        // If overwite existing is selected, we need to delete the existing page and ignore an error if it did
        // not exists and we attempted to delete it
        else if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING))
            deletePage(path, projectInformation);

        // If page doesn't exist or overwrite behavior is not to update existing, create the page and ancestor
        // folders if necessary
        if (existingPageId == null)
        {
            JsonObject createResult;
            try
            {
                createResult = performApiRequest(projectInformation, "create/page", data);
            }
            catch (Exception e)
            {
                // If the page couldn't be created because parent folder doesn't exist, go ahead and create
                // the parent folder and attempt to create the page again
                String message = e.getMessage();
                if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                        && message.contains("could not be found"))
                {
                    RestApi.createFolder(parentFolderPath, projectInformation);
                    return createPage(pageFile, projectInformation);
                }

                throw new Exception("Page " + path + " could not be created: " + message + " - Parent folder path is: -" + parentFolderPath + "-");

            }

            String createdAssetId = createResult.get("createdAssetId").getAsString();
            projectInformation.getExistingCascadePages().put(path.toLowerCase(), createdAssetId);
            return new CascadeAssetInformation(createdAssetId, path);
        }

        // If page exists, edit it
        page.setId(existingPageId);
        editPage(page, projectInformation);
        return new CascadeAssetInformation(existingPageId, path);
    }

    /**
     * Creates a file asset in Cascade Server with contents from the <code>filesystemFile</code> if one does
     * not exist. The path of the file is figured out using webViewUrl in linkFile.xml in current or ancestor
     * folders. If file with that path already exists, it is left as it is.
     */
    public static void createFile(java.nio.file.Path folderFile, ProjectInformation projectInformation, String metadataSetId) throws Exception
    {
        createFile(folderFile, projectInformation, metadataSetId, true);
    }

    private static void createFile(java.nio.file.Path folderFile, ProjectInformation projectInformation, String metadataSetId,
            boolean logCreatingFile) throws Exception
    {
        String filePath = PathUtil.getRelativePath(folderFile, projectInformation.getXmlDirectory());
        // Added for Windows Paths
        filePath = filePath.replace(java.io.File.separator, "/");
        if (!XmlAnalyzer.allCharactersLegal(filePath))
            filePath = XmlAnalyzer.removeIllegalCharacters(filePath);

        String parentFolderPath = PathUtil.getParentFolderPathFromPath(filePath);
        String fileName = folderFile.getFileName().toString();

        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        if (logCreatingFile)
            Log.add("Creating file in Cascade " + filePath + "... ", migrationStatus);

        if (projectInformation.getExistingCascadeFiles().keySet().contains(filePath.toLowerCase()))
        {
            migrationStatus.incrementAssetsSkipped();
            Log.add("<span style=\"color:blue;\">file already exists</span><br/>", migrationStatus);
            return;
        }

        if (Files.size(folderFile) > (MAX_FILE_SIZE_MB * 1024 * 1024))
            throw new Exception("File is too large. Maximum file size is " + MAX_FILE_SIZE_MB + " MB");

        // Set up the file object and assign it to the asset object
        File file = new File();
        file.setName(fileName);
        file.setParentFolderPath(parentFolderPath);
        file.setSiteName(projectInformation.getSiteName());
        file.setMetadataSetId(metadataSetId);
        file.setShouldBeIndexed(true);
        file.setShouldBePublished(true);
        file.setData(FileSystem.getBytesFromFile(folderFile));

        JsonObject data = getDataWithAsset("file", file);

        JsonObject createResult;
        try
        {
            createResult = performApiRequest(projectInformation, "create/file", data);
        }
        catch (Exception e)
        {

            // If the file couldn't be created because parent folder doesn't exist, go ahead and create the
            // parent folder and attempt to create the file again
            String message = e.getMessage();
            if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                    && message.contains("could not be found"))
            {
                createFolder(parentFolderPath, projectInformation);
                createFile(folderFile, projectInformation, metadataSetId, false);
                return;
            }

            throw new Exception(
                    "File " + filePath + " could not be created: " + e.getMessage() + " - Parent folder path is: -" + parentFolderPath + "-");
        }

        String createdAssetId = createResult.get("createdAssetId").getAsString();
        Identifier cascadeFile = new Identifier(createdAssetId, filePath, projectInformation.getSiteName(), "file");
        projectInformation.getExistingCascadeFiles().put(filePath.toLowerCase(), createdAssetId);

        Log.add(PathUtil.generateFileLink(cascadeFile, projectInformation.getUrl()), migrationStatus);

        migrationStatus.incrementAssetsCreated();
        Log.add("<span style=\"color: green;\">success.</span><br/>", migrationStatus);
    }

    /**
     * Creates a folder with given path. If the parent folder cannot be found, it will create it.
     * 
     * @param path
     * @param projectInformation
     * @throws Exception
     */
    public static void createFolder(String path, ProjectInformation projectInformation) throws Exception
    {
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(path);

        Folder folder = new Folder();
        folder.setName(PathUtil.getNameFromPath(path));
        folder.setParentFolderPath(parentFolderPath);
        folder.setSiteName(projectInformation.getSiteName());

        JsonObject data = getDataWithAsset("folder", folder);

        try
        {
            performApiRequest(projectInformation, "create/file", data);
        }
        catch (Exception e)
        {
            // If the folder couldn't be created because parent folder doesn't exist, go ahead and create the
            // parent folder and attempt to create the folder again
            String message = e.getMessage();
            if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                    && message.contains("could not be found"))
            {
                createFolder(parentFolderPath, projectInformation);
                createFolder(path, projectInformation);
            }
            else
                throw new Exception("Parent folder " + path + " could not be created: " + e.getMessage() + " - Parent folder path is: -"
                        + parentFolderPath + "-");
        }
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
        List<ContentType> contentTypes = new ArrayList<>();
        collectContentTypes(projectInformation, site.getRootContentTypeContainerId(), contentTypes);
        return contentTypes;
    }

    /**
     * Returns a map of metadata field identifiers to actual fields of a metadata set that is assigned to a
     * content type with given contentTypePath
     */
    public static Map<String, MetadataSetField> getMetadataFieldsForContentType(ProjectInformation projectInformation, ContentType contentType)
            throws Exception
    {
        MetadataSet metadataSet = readMetadataSet(projectInformation, contentType.getMetadataSetId());

        // add all the standard fields
        Map<String, MetadataSetField> resultMap = new HashMap<>();
        for (MetadataSetField field : STANDARD_METADATA_FIELDS)
            resultMap.put(field.getIdentifier(), field);

        // add the dynamic fields
        for (DynamicMetadataFieldDefinition definition : metadataSet.getDynamicMetadataFieldDefinitions())
            if (!"hidden".equals(definition.getVisibility())) // skip hidden fields
                resultMap.put(definition.getName(), new MetadataSetField(definition.getName(), definition.getLabel(), true));

        return resultMap;
    }

    /**
     * Returns a map of data definition field identifier to actual fields of a data definition that is
     * assigned to a content type with given contentTypePath. If no data definition is assigned to the content
     * type, returns null.
     */
    public static Map<String, DataDefinitionField> getDataDefinitionFieldsForContentType(ProjectInformation projectInformation,
            ContentType contentType) throws Exception
    {
        DataDefinition dataDefinition = readDataDefinition(projectInformation, contentType.getDataDefinitionId());
        return XmlAnalyzer.analyzeDataDefinitionXml(dataDefinition.getXml());
    }

    /**
     * Reads all files, blocks and pages in selected site and stores their paths in projectInformation so that
     * later it doesn't have to read whole the asset only to see if it exists (as it can be very slow if the
     * asset is big).
     */
    public static void populateExistingCascadeAssets(ProjectInformation projectInformation) throws Exception
    {
        Identifier identifier = new Identifier("/", projectInformation.getSiteName(), "folder");
        populateExistingCascadeAssetsOfFolder(identifier, projectInformation);
    }

    /**
     * Recursively reads all assets from given folder and its descendants and stores their paths in
     * {@link ProjectInformation#getExistingCascadeFiles()},
     * {@link ProjectInformation#getExistingCascadeXhtmlBlocks()} and
     * {@link ProjectInformation#getExistingCascadePages()}
     */
    private static void populateExistingCascadeAssetsOfFolder(Identifier folderIdentifier, ProjectInformation projectInformation) throws Exception
    {
        if (projectInformation.getMigrationStatus().isShouldStop())
            return;

        Folder folder = readFolder(projectInformation, folderIdentifier);
        for (Identifier child : folder.getChildren())
        {
            if ("file".equals(child.getType()))
                projectInformation.getExistingCascadeFiles().put(child.getPath().getPath().toLowerCase(), child.getId());
            else if ("block_XHTML_DATADEFINITION".equals(child.getType()))
                projectInformation.getExistingCascadeXhtmlBlocks().put(child.getPath().getPath().toLowerCase(), child.getId());
            else if ("page".equals(child.getType()))
                projectInformation.getExistingCascadePages().put(child.getPath().getPath().toLowerCase(), child.getId());
            else if ("folder".equals(child.getType()))
                populateExistingCascadeAssetsOfFolder(child, projectInformation);
        }

    }

    /**
     * Adds all ancestor content types of content type container with given id to the contentTypes list
     */
    private static void collectContentTypes(ProjectInformation projectInformation, String containerId, List<ContentType> contentTypes)
            throws Exception
    {
        JsonObject readResult = performApiRequest(projectInformation, "read",
                getJsonObjectWithIdentifier(new Identifier(containerId, null, null, "contenttypecontainer")));
        JsonArray childIdentifiers = readResult.getAsJsonObject("asset").getAsJsonObject("contentTypeContainer").getAsJsonArray("children");
        for (JsonElement childIdentifierJson : childIdentifiers)
        {
            Identifier childIdentifier = gson.fromJson(childIdentifierJson, Identifier.class);
            if ("contenttypecontainer".equals(childIdentifier.getType()))
                collectContentTypes(projectInformation, childIdentifier.getId(), contentTypes);
            else
                contentTypes.add(readContentType(projectInformation, childIdentifier.getId()));
        }
    }

    public static void main(String[] args) throws Exception
    {
        List<String> siteNames = getSiteNames("https://c8.cascadecms.com", "hill", "hill");
        siteNames.forEach(siteName -> System.out.println(siteName));
    }

    private static ContentType readContentType(ProjectInformation projectInformation, String contentTypeId) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, new Identifier(contentTypeId, "", "", "contenttype"));
        return getProperty(assetResult, "contentType", ContentType.class);
    }

    private static MetadataSet readMetadataSet(ProjectInformation projectInformation, String metadataSetId) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, new Identifier(metadataSetId, "", "", "metadataset"));
        return getProperty(assetResult, "metadataSet", MetadataSet.class);
    }

    private static DataDefinition readDataDefinition(ProjectInformation projectInformation, String dataDefinitionId) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, new Identifier(dataDefinitionId, "", "", "datadefinition"));
        return getProperty(assetResult, "dataDefinition", DataDefinition.class);
    }

    private static Folder readFolder(ProjectInformation projectInformation, Identifier folderIdentifier) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, folderIdentifier);
        return getProperty(assetResult, "folder", Folder.class);
    }

    public static Page readPage(String id, ProjectInformation projectInformation) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, new Identifier(id, "", "", "page"));
        return getProperty(assetResult, "page", Page.class);
    }

    public static XhtmlDataDefinitionBlock readXhtmlBlock(String id, ProjectInformation projectInformation) throws Exception
    {
        JsonObject assetResult = readAsset(projectInformation, new Identifier(id, "", "", "block_XHTML_DATADEFINITION"));
        return getProperty(assetResult, "xhtmlDataDefinitionBlock", XhtmlDataDefinitionBlock.class);
    }

    private static JsonObject readAsset(ProjectInformation projectInformation, Identifier identifier) throws Exception
    {
        return performApiRequest(projectInformation, "read", getJsonObjectWithIdentifier(identifier)).getAsJsonObject("asset");
    }

    private static JsonObject performApiRequest(ProjectInformation projectInformation, String path, JsonObject data) throws Exception
    {
        return performApiRequest(projectInformation.getUsername(), projectInformation.getPassword(), projectInformation.getUrl(), path, data);
    }

    private static JsonObject performApiRequest(String username, String password, String cascadeUrl, String path, JsonObject data) throws Exception
    {
        if (data == null)
            data = new JsonObject();

        URL url = new URL(cascadeUrl + "/api/v1/" + path);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("POST");

        JsonObject authentication = new JsonObject();
        authentication.addProperty("username", username);
        authentication.addProperty("password", password);
        data.add("authentication", authentication);

        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(data.toString());
        wr.flush();
        wr.close();

        System.out.println("Sending data " + data + " to URL " + url);

        int responseCode = con.getResponseCode();
        if (responseCode != 200)
            throw new Exception(responseCode + " response code");

        String response = CharStreams.toString(new InputStreamReader(con.getInputStream(), Charsets.UTF_8));
        System.out.println("Got response: " + response);

        if (StringUtils.isEmpty(response) || "null".equals(response))
            return null;

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(response).getAsJsonObject();

        if (!"true".equals(result.get("success").getAsString()))
            throw new Exception(result.get("message").getAsString());

        return result;
    }

    /**
     * Returns id of asset if it exists. Null otherwise.
     */
    public static String getAssetId(String path, ProjectInformation projectInformation) throws Exception
    {
        path = PathUtil.removeLeadingSlashes(path).toLowerCase();
        // Check confirmed paths first
        String fileId = projectInformation.getExistingCascadeFiles().get(path);
        if (fileId != null)
            return fileId;

        String blockId = projectInformation.getExistingCascadeXhtmlBlocks().get(path);
        if (blockId != null)
            return blockId;

        String pageId = projectInformation.getExistingCascadePages().get(path);
        if (pageId != null)
            return pageId;

        // If not found, try reading the asset by path
        Page readPage = readPageByPath(path, projectInformation);
        if (readPage != null)
        {
            projectInformation.getExistingCascadePages().put(path, readPage.getId());
            return readPage.getId();
        }

        File readFile = readFileByPath(path, projectInformation);
        if (readFile != null)
        {
            projectInformation.getExistingCascadeFiles().put(path, readFile.getId());
            return readFile.getId();
        }

        XhtmlDataDefinitionBlock readBlock = readXhtmlBlockByPath(path, projectInformation);
        if (readBlock != null)
        {
            projectInformation.getExistingCascadeXhtmlBlocks().put(path, readBlock.getId());
            return readBlock.getId();
        }

        return null;
    }

    /**
     * Creates XHTML Block in Cascade with the content of the file put through JTidy.
     */
    public static CascadeAssetInformation createXhtmlBlock(java.nio.file.Path file, ProjectInformation projectInformation, String metadataSetId)
            throws Exception
    {
        String blockPath = PathUtil.createPagePathFromFileSystemFile(file, projectInformation);
        blockPath = blockPath.replace(java.io.File.separator, "/");
        if (!XmlAnalyzer.allCharactersLegal(blockPath))
            blockPath = XmlAnalyzer.removeIllegalCharacters(blockPath);
        String parentFolderPath = PathUtil.getParentFolderPathFromPath(blockPath);
        // Don't create static components in the root folder. Instead, create them in
        // "_internal/blocks/static" folder
        if (parentFolderPath.equals("") || parentFolderPath.equals("/"))
            parentFolderPath = "_cascade/blocks/static";
        String blockName = PathUtil.truncateExtension(file.getFileName().toString());

        String overwriteBehavior = projectInformation.getOverwriteBehavior();
        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_SKIP_EXISTING))
        {
            String blockId = getAssetId(blockPath, projectInformation);
            if (blockId != null)
                return new CascadeAssetInformation(blockId, blockPath, true);
        }

        MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
        Log.add("Creating XHTML block in Cascade " + blockPath + "... ", migrationStatus);

        // Check for duplicate paths
        if (projectInformation.getMigrationStatus().getCreatedAssetPaths().contains(blockPath.toLowerCase()))
        {
            blockPath = getUniquePath(blockPath, projectInformation.getMigrationStatus().getCreatedAssetPaths());
            blockName = PathUtil.getNameFromPath(blockPath);
            parentFolderPath = PathUtil.getParentFolderPathFromPath(blockPath);
        }

        String existingBlockId = null;

        if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING))
        {
            if (projectInformation.getExistingCascadeXhtmlBlocks().keySet().contains(blockPath.toLowerCase()))
                existingBlockId = getXhtmlBlockId(blockPath, projectInformation);
        }
        // If overwite existing is selected, we need to delete the existing block and ignore an error if it
        // did not exists and we attempted to delete it
        else if (overwriteBehavior.equals(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING))
        {
            if (projectInformation.getExistingCascadeXhtmlBlocks().keySet().contains(blockPath.toLowerCase()))
                deleteXhtmlBlock(blockPath, projectInformation);
        }

        // Set up the file object and assign it to the asset object
        XhtmlDataDefinitionBlock block = new XhtmlDataDefinitionBlock();
        block.setName(blockName);
        block.setParentFolderPath(parentFolderPath);
        block.setSiteName(projectInformation.getSiteName());
        block.setMetadataSetId(metadataSetId);
        block.setXhtml(
                LinkRewriter.rewriteLinksInXml(JTidy.tidyContentConditionally(FileSystem.getFileContents(file)), blockPath, projectInformation));

        JsonObject data = getDataWithAsset("xhtmlDataDefinitionBlock", block);

        if (existingBlockId == null)
        {
            JsonObject createResult;
            try
            {
                createResult = performApiRequest(projectInformation, "create", data);
            }
            catch (Exception e)
            {
                // If the page couldn't be created because parent folder doesn't exist, go ahead and create
                // the parent folder and attempt to create the page again
                String message = e.getMessage();
                if (message != null && message.contains("folder with path/name: ") && message.contains(parentFolderPath.trim())
                        && message.contains("could not be found"))
                {
                    RestApi.createFolder(parentFolderPath, projectInformation);
                    return createXhtmlBlock(file, projectInformation, metadataSetId);
                }

                throw new Exception("XHTML Block " + blockPath + " could not be created: " + e.getMessage() + " - Parent folder path is: -"
                        + parentFolderPath + "-");
            }

            String createdAssetId = createResult.get("createdAssetId").getAsString();
            projectInformation.getExistingCascadeXhtmlBlocks().put(blockPath.toLowerCase(), createdAssetId);
            return new CascadeAssetInformation(createdAssetId, blockPath);

        }

        // If block exists, edit it
        block.setId(existingBlockId);
        editXhtmlBlock(block, projectInformation);
        return new CascadeAssetInformation(existingBlockId, blockPath);
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
     * Sends an edit request for given XHTML Block through web services
     */
    private static void editXhtmlBlock(XhtmlDataDefinitionBlock block, ProjectInformation projectInformation) throws Exception
    {
        performApiRequest(projectInformation, "edit", getDataWithAsset("xhtmlDataDefinitionBlock", block));
    }

    /**
     * Asks Cascade Server to delete an XHTML Block with given path. If block didn't exist, the error will be
     * ignored. If some other problem occurred, an exception will be thrown.
     */
    private static void deleteXhtmlBlock(String path, ProjectInformation projectInformation) throws Exception
    {
        try
        {
            performApiRequest(projectInformation, "delete",
                    getJsonObjectWithIdentifier(new Identifier(path, projectInformation.getSiteName(), "block_XHTML_DATADEFINITION")));
        }
        catch (Exception e)
        {
            if (e.getMessage() == null || !e.getMessage()
                    .equals("Unable to identify an entity based on provided entity path '" + path + "' and type 'block_XHTML_DATADEFINITION'"))
                throw new Exception("Error occured when deleting an XHTML Block with path '" + path + "': " + e.getMessage());
        }
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
        String cachePath = PathUtil.getCachePathFromPath(path);
        String siteName = PathUtil.getSiteNameFromPath(path);
        if (siteName == null)
            siteName = projectInformation.getSiteName();
        try
        {
            JsonObject assetResult = performApiRequest(projectInformation, "read",
                    getJsonObjectWithIdentifier(new Identifier(cachePath, siteName, "page"))).getAsJsonObject("asset");
            return getProperty(assetResult, "page", Page.class);
        }
        catch (Exception e)
        {
            if (e.getMessage() == null
                    || !e.getMessage().equals("Unable to identify an entity based on provided entity path '" + cachePath + "' and type 'page'"))
                throw new Exception("Error occured when reading a Page with path '" + path + "': " + e.getMessage());

            return null;
        }
    }

    /**
     * Sends an edit request for given page through web services
     */
    private static void editPage(Page page, ProjectInformation projectInformation) throws Exception
    {
        performApiRequest(projectInformation, "edit/page", getDataWithAsset("page", page));
    }

    /**
     * Reads a block with given path and returns its id. If the block doesn't exist, returns null.
     */
    private static String getXhtmlBlockId(String path, ProjectInformation projectInformation) throws Exception
    {
        XhtmlDataDefinitionBlock existingBlock = readXhtmlBlockByPath(path, projectInformation);
        if (existingBlock != null)
            return existingBlock.getId();

        return null;
    }

    /**
     * Reads an XHTML Block with given path from Cascade Server. If the block doesn't exist, returns null.
     */
    private static XhtmlDataDefinitionBlock readXhtmlBlockByPath(String path, ProjectInformation projectInformation) throws Exception
    {
        try
        {
            JsonObject assetResult = performApiRequest(projectInformation, "read",
                    getJsonObjectWithIdentifier(new Identifier(path, projectInformation.getSiteName(), "block_XHTML_DATADEFINITION")))
                            .getAsJsonObject("asset");
            return getProperty(assetResult, "xhtmlDataDefinitionBlock", XhtmlDataDefinitionBlock.class);
        }
        catch (Exception e)
        {
            if (e.getMessage() == null
                    || !e.getMessage().equals("Unable to identify an entity based on provided entity path '" + path + "' and type 'block'"))
                throw new Exception("Error occured when reading a XHTML Block with path '" + path + "': " + e.getMessage());
            return null;
        }
    }

    /**
     * Reads a file with given path from Cascade Server. If the file doesn't exist, returns null.
     */
    private static File readFileByPath(String path, ProjectInformation projectInformation) throws Exception
    {
        String cachePath = PathUtil.getCachePathFromPath(path);
        String siteName = PathUtil.getSiteNameFromPath(path);
        if (siteName == null)
            siteName = projectInformation.getSiteName();

        try
        {
            JsonObject assetResult = performApiRequest(projectInformation, "read",
                    getJsonObjectWithIdentifier(new Identifier(cachePath, siteName, "file"))).getAsJsonObject("asset");
            return getProperty(assetResult, "file", File.class);
        }
        catch (Exception e)
        {
            if (e.getMessage() == null
                    || !e.getMessage().equals("Unable to identify an entity based on provided entity path '" + cachePath + "' and type 'file'"))
                throw new Exception("Error occured when reading a Page with path '" + path + "': " + e.getMessage());
            return null;
        }
    }

    /**
     * Reads a page with given path and returns its id. If the page doesn't exist, returns null.
     */
    private static String getPageId(String path, ProjectInformation projectInformation) throws Exception
    {
        Page existingPage = readPageByPath(path, projectInformation);
        if (existingPage != null)
            return existingPage.getId();

        return null;
    }

    /**
     * Asks Cascade Server to delete a page with given path. If page didn't exist, the error will be ignored.
     * If some other problem occured, an exception will be thrown.
     */
    private static void deletePage(String path, ProjectInformation projectInformation) throws Exception
    {
        try
        {
            performApiRequest(projectInformation, "delete",
                    getJsonObjectWithIdentifier(new Identifier(path, projectInformation.getSiteName(), "page")));
        }
        catch (Exception e)
        {
            if (e.getMessage() == null
                    || !e.getMessage().equals("Unable to identify an entity based on provided entity path '" + path + "' and type 'page'"))
                throw new Exception("Error occured when deleting a Page with path '" + path + "': " + e.getMessage());
        }
    }

    /**
     * Adds a number to the end of given path and if that path doesn't exist in existingPaths, returns it.
     */
    private static String getUniquePath(String path, Set<String> existingPaths)
    {
        String lowerCasePath = path.toLowerCase();

        for (int i = 1; true; i++)
            if (!existingPaths.contains(lowerCasePath + i))
                return lowerCasePath + i;
    }

    private static JsonObject getDataWithAsset(String assetType, FolderContainedAsset assetObject)
    {
        JsonObject data = new JsonObject();
        JsonObject asset = new JsonObject();
        asset.add(assetType, gson.toJsonTree(assetObject));
        data.add("asset", asset);
        return data;
    }

    private static <T> T getProperty(JsonObject object, String propertyName, Class<T> objectClass)
    {
        if (object == null)
            return null;

        return gson.fromJson(object.get(propertyName), objectClass);
    }

    private static JsonObject getJsonObjectWithIdentifier(Identifier identifier)
    {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("identifier", gson.toJsonTree(identifier));
        return jsonObject;
    }
}
