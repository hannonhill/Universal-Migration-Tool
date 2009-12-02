/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.FieldType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.WebServices;

/**
 * Action responsible for assigning metadata and structured data fields.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class AssignFieldsAction extends BaseAction
{
    private static final long serialVersionUID = -4363153939547280598L;

    private int assetType = 0;
    private String assetTypeName;
    private String contentTypePath;

    // These are the available xml and Cascade fields
    private final List<String> xmlMetadataFieldNames = new ArrayList<String>();
    private final List<String> xmlContentFieldNames = new ArrayList<String>();
    private final List<Field> cascadeMetadataFields = new ArrayList<Field>();
    private final List<Field> cascadeDataDefinitionFields = new ArrayList<Field>();

    // These are the hidden fields that are generated automatically by javascript. For each assignment, all 4 arrays have one element added.
    private String[] selectedXmlMetadataFields = new String[0];
    private String[] selectedXmlContentFields = new String[0];
    private String[] selectedCascadeMetadataFields = new String[0];
    private String[] selectedCascadeDataDefinitionFields = new String[0];

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
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

        // Go through each field assignment submitted by the form
        for (int i = 0; i < selectedXmlMetadataFields.length; i++)
        {
            // JavaScript generates word "null" for null assignments, so we get the Cascade field name and field type by looking for the "null" word
            String cascadeFieldName = selectedCascadeMetadataFields[i].equals("null") ? selectedCascadeDataDefinitionFields[i]
                    : selectedCascadeMetadataFields[i];
            FieldType fieldType = selectedCascadeMetadataFields[i].equals("null") ? FieldType.DATA_DEFINITION : FieldType.METADATA;

            // Similary way, by checking which field is "null", we can add the mapping to correct type of map
            if (!selectedXmlMetadataFields[i].equals("null"))
                assetTypeObject.getMetadataFieldMapping().put(selectedXmlMetadataFields[i], new Field(cascadeFieldName, null, fieldType));
            else
                assetTypeObject.getContentFieldMapping().put(selectedXmlContentFields[i], new Field(cascadeFieldName, null, fieldType));
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
        try
        {
            cascadeMetadataFields.addAll(WebServices.getMetadataFieldsForContentType(contentTypePath, projectInformation));
            cascadeDataDefinitionFields.addAll(WebServices.getDataDefinitionFieldsForContentType(contentTypePath, projectInformation));
        }
        catch (Exception e)
        {
            addActionError(e.getMessage());
            return INPUT;
        }

        return INPUT;
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
     * @return Returns the current asset type object based on the assetType int
     */
    private AssetType getCurrentAssetType()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String assetTypeName = projectInformation.getAssetTypeNames().get(assetType);
        return projectInformation.getAssetTypes().get(assetTypeName);
    }
}
