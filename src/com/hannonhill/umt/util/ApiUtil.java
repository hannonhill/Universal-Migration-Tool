/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.util;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hannonhill.umt.ChooserType;
import com.hannonhill.umt.ContentTypeInformation;
import com.hannonhill.umt.DataDefinitionField;
import com.hannonhill.umt.Field;
import com.hannonhill.umt.MetadataSetField;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.TaskStatus;
import com.hannonhill.umt.api.DynamicMetadataField;
import com.hannonhill.umt.api.Metadata;
import com.hannonhill.umt.api.Page;
import com.hannonhill.umt.api.StructuredData;
import com.hannonhill.umt.api.StructuredDataNode;
import com.hannonhill.umt.service.FileSystem;
import com.hannonhill.umt.service.JTidy;
import com.hannonhill.umt.service.LinkRewriter;
import com.hannonhill.umt.service.Log;
import com.hannonhill.umt.service.RestApi;
import com.hannonhill.umt.service.XmlAnalyzer;

/**
 * Utility class with helper methods related to REST API
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class ApiUtil
{
    /**
     * Creates a Page object based on the information provided in the projectInformation and the actual file
     * from which the Page needs to be created.
     */
    public static Page setupPageObject(Path pageFile, String path, ProjectInformation projectInformation) throws Exception
    {
        String pageName = PathUtil.truncateExtension(PathUtil.getNameFromPath(path));
        String parentFolderPath = PathUtil.getParentFolderPathCascade(path);
        String pageFileContents = JTidy.tidyContentConditionallyFullHtml(FileSystem.getFileContents(pageFile));
        if (parentFolderPath.equals(""))
            parentFolderPath = "/";

        String contentTypePath = projectInformation.getContentTypePath();
        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);
        Set<String> metadataFieldNames = contentType.getMetadataFields().keySet();

        Page page = new Page();
        page.setContentTypePath(contentTypePath);
        page.setName(pageName);
        page.setParentFolderPath(parentFolderPath);
        page.setSiteName(projectInformation.getSiteName());
        page.setMetadata(createPageMetadata(projectInformation, pageFileContents, metadataFieldNames, projectInformation.getMigrationStatus()));

        // Create the structured data object with the tree of structured data nodes
        StructuredData structuredData = createPageStructuredData(projectInformation, pageFileContents, parentFolderPath + "/" + pageName);

        // If page uses data definition, assign it to the page object
        if (contentType.isUsesDataDefinition())
            page.setStructuredData(structuredData);
        else
        {
            // if page does not use data definition, the tree mapping should contain only a single xhtml field
            List<StructuredDataNode> xhtmlNodes = structuredData.getStructuredDataNodes();
            String xhtml = null;
            if (xhtmlNodes.size() == 1)
                xhtml = xhtmlNodes.get(0).getText();
            else if (xhtmlNodes.size() == 0)
                ; // do nothing, no mappings
            else
                throw new Exception("The mappings for a page without Data Definition contains more than one field.");
            page.setXhtml(xhtml == null ? "" : xhtml);
        }

        return page;
    }

    /**
     * Creates the page's structured data object with the values from the fileContents.
     */
    private static StructuredData createPageStructuredData(ProjectInformation projectInformation, String fileContents, String assetPath)
            throws Exception
    {
        // Create the root group object to which all the information will be attached
        StructuredDataGroup rootGroup = new StructuredDataGroup();

        // For each field mapping assign appropriate value in structured data
        for (String xPath : projectInformation.getFieldMapping().keySet())
        {
            Field field = projectInformation.getFieldMapping().get(xPath);

            if (field == null || !(field instanceof DataDefinitionField))
                continue;

            DataDefinitionField ddField = (DataDefinitionField) field;
            List<String> fieldValues;
            if (ddField.isMultiple())
                fieldValues = XmlUtil.evaluateXPathExpressionForMultipleField(fileContents, xPath);
            else
                fieldValues = convertToList(XmlUtil.evaluateXPathExpression(fileContents, xPath));
            if (ddField.isWysiwyg())
            {
                for (int i = 0; i < fieldValues.size(); i++)
                    fieldValues.set(i, LinkRewriter.rewriteLinksInXml(fieldValues.get(i), assetPath, projectInformation));
            }
            else if (ddField.getChooserType() == ChooserType.FILE)
            {
                List<String> tempValues = new ArrayList<>(fieldValues);
                fieldValues = new ArrayList<>();
                for (String tempValue : tempValues)
                {
                    // For a file chooser, get the passed <img> tag, get path from its src attribute, convert
                    // the relative path to absolute, find an asset with corresponding path and use that
                    // asset's id as field value
                    tempValue = JTidy.tidyContentConditionally(tempValue);
                    String relativePath = XmlAnalyzer.getFirstSrcAttribute(tempValue);

                    if (relativePath != null && !relativePath.trim().equals(""))
                    {
                        String absolutePath = PathUtil.convertRelativeToAbsolute(relativePath.trim(), assetPath);
                        String fileId = RestApi.getFileId(absolutePath, projectInformation);
                        if (fileId != null)
                            fieldValues.add(fileId);
                        else
                            System.out.println("File with path " + absolutePath + " not found");
                    }
                }
            }

            assignAppropriateFieldValue(rootGroup, (DataDefinitionField) field, fieldValues);
        }

        // For each static value field, assign the static value in structured data
        for (Field field : projectInformation.getStaticValueMapping().keySet())
            if (field instanceof DataDefinitionField)
            {
                // Escape ampersands to make it a valid xml
                String fieldValue = projectInformation.getStaticValueMapping().get(field).replaceAll("&", "&amp;");
                assignAppropriateFieldValue(rootGroup, (DataDefinitionField) field, convertToList(fieldValue));
            }

        return convertToStructuredData(rootGroup);
    }

    private static List<String> convertToList(String value)
    {
        List<String> result = new ArrayList<>();
        result.add(value);
        return result;
    }

    /**
     * Creates the page's metadata object with the values from the xmlPage uses the mappings from the
     * assetType.
     * 
     * @param projectInformation
     * @param fileContents
     * @param availableMetadataFieldNames
     * @param taskStatus
     * @return
     * @throws Exception
     */
    private static Metadata createPageMetadata(ProjectInformation projectInformation, String fileContents, Set<String> availableMetadataFieldNames,
            TaskStatus taskStatus) throws Exception
    {
        // Create the metadata object and the list of dynamic fields
        Metadata metadata = new Metadata();
        List<DynamicMetadataField> dynamicFieldsList = new ArrayList<>();

        // A REST API bug work-around: supply all dynamic metadata field values as empty strings first
        for (String metadataFieldName : availableMetadataFieldNames)
            if (!RestApi.STANDARD_METADATA_FIELD_IDENTIFIERS.contains(metadataFieldName))
                dynamicFieldsList.add(new DynamicMetadataField(metadataFieldName));

        // For each field mapping assign appropriate value in metadata
        for (String xPath : projectInformation.getFieldMapping().keySet())
        {
            Field field = projectInformation.getFieldMapping().get(xPath);

            if (field == null)
                continue;

            if (field instanceof MetadataSetField)
            {
                String fieldValue = XmlUtil.evaluateXPathExpression(fileContents, xPath);
                fieldValue = trimMetadataFieldValue(field.getIdentifier(), fieldValue, taskStatus);
                assignAppropriateFieldValue(metadata, dynamicFieldsList, (MetadataSetField) field, fieldValue);
            }
        }

        // For each static value field, assign the static value in the metadata
        for (Field field : projectInformation.getStaticValueMapping().keySet())
            if (field instanceof MetadataSetField)
            {
                // Escape ampersands to make it a valid xml
                String fieldValue = trimMetadataFieldValue(field.getIdentifier(),
                        projectInformation.getStaticValueMapping().get(field).replaceAll("&", "&amp;"), taskStatus);
                assignAppropriateFieldValue(metadata, dynamicFieldsList, (MetadataSetField) field, fieldValue);
            }

        // Convert the list of dynamic field to an array and assign it to the metadata object
        metadata.setDynamicFields(dynamicFieldsList);
        return metadata;
    }

    /**
     * Checks if given field value has more than 250 characters and if so, returns only the first 250 and
     * outputs a warning in the log.
     * 
     * @param fieldName used for logging purposes
     * @param fieldValue field value to check
     * @param taskStatus used for logging purposes
     * @return
     */
    private static String trimMetadataFieldValue(String fieldName, String fieldValue, TaskStatus taskStatus)
    {
        int maxLength = 250;

        if (RestApi.LONG_METADATA_FIELDS.contains(fieldName))
            maxLength = 65535;

        if (fieldValue == null || fieldValue.length() <= maxLength)
            return fieldValue;

        Log.add("<span style=\"color:orange;\">Cascade metadata field \"" + fieldName + "\" contains " + fieldValue.length()
                + " characters. Trimming to " + maxLength + ".</span>", taskStatus);
        return fieldValue.substring(0, maxLength);
    }

    /**
     * Assigns given fieldValue of given fieldName to metadata object if it is a standard metadata field or
     * adds it to the list of dynamicFields.
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
            dynamicFields.add(new DynamicMetadataField(fieldName, fieldValue));
        }
    }

    /**
     * Assigns given fieldValues of given fieldName as the path to the actual field identifier to structured
     * data object forming a structural tree if necessary.
     */
    private static void assignAppropriateFieldValue(StructuredDataGroup rootGroup, DataDefinitionField field, List<String> fieldValues)
            throws Exception
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

        if (field.getChooserType() == null)
        {
            List<StructuredDataNode> textNodes = new ArrayList<>();
            for (String fieldValue : fieldValues)
            {
                fieldValue = JTidy.tidyContentConditionally(fieldValue);
                StructuredDataNode textNode = new StructuredDataNode();
                textNode.setIdentifier(identifier);
                textNode.setText(fieldValue);
                textNode.setType("text");
                textNodes.add(textNode);
            }
            currentNode.getContentFields().put(identifier, textNodes);
        }
        else if (field.getChooserType() == ChooserType.FILE)
        {
            List<StructuredDataNode> fileNodes = new ArrayList<>();
            for (String fieldValue : fieldValues)
            {
                StructuredDataNode fileNode = new StructuredDataNode();
                fileNode.setIdentifier(identifier);
                fileNode.setFileId(fieldValue);
                fileNode.setType("asset");
                fileNode.setAssetType("file");
                fileNodes.add(fileNode);
            }
            currentNode.getContentFields().put(identifier, fileNodes);
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
     */
    private static List<StructuredDataNode> convertToStructuredDataNodes(StructuredDataGroup group)
    {
        List<StructuredDataNode> result = new ArrayList<>();

        for (String contentFieldIdentifier : group.getContentFields().keySet())
            for (StructuredDataNode structuredDataNode : group.getContentFields().get(contentFieldIdentifier))
                result.add(structuredDataNode);

        for (String groupIdentifier : group.getGroups().keySet())
        {
            StructuredDataGroup groupNode = group.getGroups().get(groupIdentifier);
            StructuredDataNode structuredDataNode = new StructuredDataNode();
            structuredDataNode.setIdentifier(groupIdentifier);
            structuredDataNode.setType("group");
            structuredDataNode.setStructuredDataNodes(convertToStructuredDataNodes(groupNode));
            result.add(structuredDataNode);
        }
        return result;
    }

    /**
     * Represents a StructuredDataNode of type group. Using this instead of {@link StructuredDataNode} of type
     * group because we want to deal with Maps instead of lists for easy and fast insert and search.
     */
    private static class StructuredDataGroup
    {
        // the fields in the group with their values
        private final Map<String, List<StructuredDataNode>> contentFields = new HashMap<>();

        // other groups in the group
        private final Map<String, StructuredDataGroup> groups = new HashMap<>();

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
        public Map<String, List<StructuredDataNode>> getContentFields()
        {
            return contentFields;
        }
    }
}
