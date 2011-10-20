/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ContentTypeInformation;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.MappingPersister;

/**
 * Action responsible for assigning metadata and structured data fields.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AssignFieldsAction extends BaseAction
{
    private static final long serialVersionUID = -4363153939547280598L;

    private int assetType = 0;
    private String assetTypeName;
    private String contentTypePath;

    // These are the available xml and Cascade fields
    private final List<String> xmlMetadataFieldNames = new ArrayList<String>(); // a list of available XML
                                                                                // Metadata field names
    private final List<String> xmlContentFieldNames = new ArrayList<String>(); // a list of available XML
                                                                               // Content field names
    private final List<Field> cascadeMetadataFields = new ArrayList<Field>(); // a list of available Cascade
                                                                              // Metadata Set field
                                                                              // identifiers
    private final List<Field> cascadeDataDefinitionFields = new ArrayList<Field>(); // a list of available
                                                                                    // Cascade Data
                                                                                    // Definitnion field paths

    // These are the hidden fields that are generated automatically by javascript. For each assignment, all 5
    // arrays have one element added.
    private String[] selectedXmlMetadataFields = new String[0];
    private String[] selectedXmlContentFields = new String[0];
    private String[] staticValues = new String[0];
    private String[] selectedCascadeMetadataFields = new String[0];
    private String[] selectedCascadeDataDefinitionFields = new String[0];

    @Override
    public String execute() throws Exception
    {
        if (isSubmit())
            return processSubmit();

        return processView();
    }

    /**
     * Processes the form submission
     * 
     * @return
     */
    private String processSubmit()
    {
        ProjectInformation projectInformation = getProjectInformation();
        AssetType assetTypeObject = getCurrentAssetType();

        // Clear out the old information
        assetTypeObject.getMetadataFieldMapping().clear();
        assetTypeObject.getContentFieldMapping().clear();
        assetTypeObject.getStaticValueMapping().clear();

        String contentTypePath = projectInformation.getContentTypeMap().get(projectInformation.getAssetTypeNames().get(assetType));
        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);

        // Go through each field assignment submitted by the form
        try
        {
            for (int i = 0; i < selectedXmlMetadataFields.length; i++)
                addFieldMapping(i, contentType, assetTypeObject);
            MappingPersister.persistMappings(projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

        // Increment the current asset type and prepare the view information
        assetType++;
        // If all the asset types are through, we go to the next screen (summary)
        if (assetType == projectInformation.getAssetTypeNames().size())
            return SUCCESS;

        return processView();
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        ProjectInformation projectInformation = getProjectInformation();
        assetTypeName = projectInformation.getAssetTypeNames().get(assetType);
        contentTypePath = projectInformation.getContentTypeMap().get(assetTypeName);

        xmlMetadataFieldNames.addAll(projectInformation.getAssetTypes().get(assetTypeName).getMetadataFields());
        xmlContentFieldNames.addAll(projectInformation.getAssetTypes().get(assetTypeName).getContentFields());
        Collections.sort(xmlMetadataFieldNames);
        Collections.sort(xmlContentFieldNames);

        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);
        cascadeMetadataFields.addAll(contentType.getMetadataFields().values());
        cascadeDataDefinitionFields.addAll(contentType.getDataDefinitionFields().values());

        return INPUT;
    }

    /**
     * Given field identifiers of fields with given index i (selectedXmlMetadataFields,
     * selectedXmlContentFields, selectedCascadeMetadataFields,
     * selectedCascadeDataDefinitionFields) it picks two that are not "null" and creates a mapping for them.
     * The mapping is
     * xml field identifier -> cascade field or cascade field -> static value.
     * The cascade field is retrieved from the contentType. The created mapping is added to the
     * assetTypeObject.
     * 
     * @param i
     * @param contentType
     * @param assetTypeObject
     * @throws Exception
     */
    private void addFieldMapping(int i, ContentTypeInformation contentType, AssetType assetTypeObject) throws Exception
    {
        String xmlMetadataFieldIdentifier = selectedXmlMetadataFields[i];
        String xmlContentFieldIdentifier = selectedXmlContentFields[i];
        String staticValue = staticValues[i];
        String cascadeMetadataFieldIdentifier = selectedCascadeMetadataFields[i];
        String cascadeDataDefinitionFieldIdentifier = selectedCascadeDataDefinitionFields[i];

        // JavaScript generates word "null" for null assignments, so we get the Cascade field name and field
        // type by looking for the "null" word
        boolean isDataDefinition = cascadeMetadataFieldIdentifier.equals("null");
        boolean isContent = !xmlContentFieldIdentifier.equals("null");
        boolean isMetadata = !xmlMetadataFieldIdentifier.equals("null");
        String cascadeFieldIdentifier = isDataDefinition ? cascadeDataDefinitionFieldIdentifier : cascadeMetadataFieldIdentifier;

        // Get the actual field from the content type
        Field field = isDataDefinition ? contentType.getDataDefinitionFields().get(cascadeFieldIdentifier) : contentType.getMetadataFields().get(
                cascadeFieldIdentifier);

        if (field == null)
            throw new Exception("Data Definition or Metadata has been updated in meantime. Please re-assign Content Types again.");

        // Similar way, by checking which field is "null", we can add the mapping to correct type of map
        if (isContent)
            assetTypeObject.getContentFieldMapping().put(xmlContentFieldIdentifier, field);
        else if (isMetadata)
            assetTypeObject.getMetadataFieldMapping().put(xmlMetadataFieldIdentifier, field);
        else
            assetTypeObject.getStaticValueMapping().put(field, staticValue);
    }

    /**
     * @return Returns the assetType.
     */
    public int getAssetType()
    {
        return assetType;
    }

    /**
     * @param assetType the assetType to set
     */
    public void setAssetType(int assetType)
    {
        this.assetType = assetType;
    }

    /**
     * @return Returns the assetTypeName.
     */
    public String getAssetTypeName()
    {
        return assetTypeName;
    }

    /**
     * @param assetTypeName the assetTypeName to set
     */
    public void setAssetTypeName(String assetTypeName)
    {
        this.assetTypeName = assetTypeName;
    }

    /**
     * @return Returns the contentTypePath.
     */
    public String getContentTypePath()
    {
        return contentTypePath;
    }

    /**
     * @param contentTypePath the contentTypePath to set
     */
    public void setContentTypePath(String contentTypePath)
    {
        this.contentTypePath = contentTypePath;
    }

    /**
     * @return Returns the selectedXmlMetadataFields.
     */
    public String[] getSelectedXmlMetadataFields()
    {
        return selectedXmlMetadataFields;
    }

    /**
     * @param selectedXmlMetadataFields the selectedXmlMetadataFields to set
     */
    public void setSelectedXmlMetadataFields(String[] selectedXmlMetadataFields)
    {
        this.selectedXmlMetadataFields = selectedXmlMetadataFields;
    }

    /**
     * @return Returns the selectedCascadeMetadataFields.
     */
    public String[] getSelectedCascadeMetadataFields()
    {
        return selectedCascadeMetadataFields;
    }

    /**
     * @param selectedCascadeMetadataFields the selectedCascadeMetadataFields to set
     */
    public void setSelectedCascadeMetadataFields(String[] selectedCascadeMetadataFields)
    {
        this.selectedCascadeMetadataFields = selectedCascadeMetadataFields;
    }

    /**
     * @return Returns the xmlMetadataFieldNames.
     */
    public List<String> getXmlMetadataFieldNames()
    {
        return xmlMetadataFieldNames;
    }

    /**
     * @return Returns the cascadeMetadataFields.
     */
    public List<Field> getCascadeMetadataFields()
    {
        return cascadeMetadataFields;
    }

    /**
     * @return Returns the cascadeDataDefinitionFields.
     */
    public List<Field> getCascadeDataDefinitionFields()
    {
        return cascadeDataDefinitionFields;
    }

    /**
     * @return Returns the xmlContentFieldNames.
     */
    public List<String> getXmlContentFieldNames()
    {
        return xmlContentFieldNames;
    }

    /**
     * @return Returns the selectedXmlContentFields.
     */
    public String[] getSelectedXmlContentFields()
    {
        return selectedXmlContentFields;
    }

    /**
     * @param selectedXmlContentFields the selectedXmlContentFields to set
     */
    public void setSelectedXmlContentFields(String[] selectedXmlContentFields)
    {
        this.selectedXmlContentFields = selectedXmlContentFields;
    }

    /**
     * @return Returns the selectedCascadeDataDefinitionFields.
     */
    public String[] getSelectedCascadeDataDefinitionFields()
    {
        return selectedCascadeDataDefinitionFields;
    }

    /**
     * @param selectedCascadeDataDefinitionFields the selectedCascadeDataDefinitionFields to set
     */
    public void setSelectedCascadeDataDefinitionFields(String[] selectedCascadeDataDefinitionFields)
    {
        this.selectedCascadeDataDefinitionFields = selectedCascadeDataDefinitionFields;
    }

    /**
     * @return Returns the metadataFieldMap.
     */
    public Map<String, Field> getMetadataFieldMap()
    {
        return getCurrentAssetType().getMetadataFieldMapping();
    }

    /**
     * @return Returns the contentFieldMap
     */
    public Map<String, Field> getContentFieldMap()
    {
        return getCurrentAssetType().getContentFieldMapping();
    }

    /**
     * @return Returns the staticValueMap
     */
    public Map<Field, String> getStaticValueMap()
    {
        return getCurrentAssetType().getStaticValueMapping();
    }

    /**
     * @return Returns the staticValues.
     */
    public String[] getStaticValues()
    {
        return staticValues;
    }

    /**
     * @param staticValues the staticValues to set
     */
    public void setStaticValues(String[] staticValues)
    {
        this.staticValues = staticValues;
    }

    /**
     * @return Returns the current asset type object based on the assetType int
     */
    private AssetType getCurrentAssetType()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String assetTypeName = projectInformation.getAssetTypeNames().get(assetType);
        return projectInformation.getAssetTypes().get(assetTypeName);
    }

    /**
     * Returns the appropriate width of the bottom bar
     * 
     * @return
     */
    public String getBarWidthPercent()
    {
        return (100.0 / getProjectInformation().getAssetTypeNames().size()) + "%";
    }

    /**
     * Returns the appropriate left margin of the bottom bar
     * 
     * @return
     */
    public String getMarginLeftPercent()
    {
        return (100.0 * assetType / getProjectInformation().getAssetTypeNames().size()) + "%";
    }
}
