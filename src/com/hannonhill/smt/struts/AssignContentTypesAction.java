/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ContentType;
import com.hannonhill.smt.Field;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.WebServices;

/**
 * In this action user is assigning the asset types from xml to Content Types in Cascade
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class AssignContentTypesAction extends BaseAction
{
    private static final long serialVersionUID = 3992252452526228826L;

    private final List<String> assetTypes = new ArrayList<String>();
    private final List<String> contentTypes = new ArrayList<String>();

    private String[] selectedAssetTypes;
    private String[] selectedContentTypes;

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
        projectInformation.setContentTypeMap(new HashMap<String, String>());
        if (selectedAssetTypes == null || selectedAssetTypes.length == 0)
        {
            addActionError("You must assign at least one Content Type mapping");
            processView();
            return INPUT;
        }

        try
        {
            projectInformation.setContentTypes(new HashMap<String, ContentType>()); // clear out the existing content types
            for (int i = 0; i < selectedAssetTypes.length; i++)
                createAndAddContentType(selectedContentTypes[i], selectedAssetTypes[i], projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

        // make the asset type names an ordered list because map keeps things out of order
        projectInformation.setAssetTypeNames(new ArrayList<String>(projectInformation.getContentTypeMap().keySet()));

        // clear out the rest of previously entered information
        clearOutUnusedContentTypeFieldMappings();

        return SUCCESS;
    }

    /**
     * Creates a content type object, reads its fields through web services and adds it to the project information. Also adds a mapping
     * to the content type map.
     * 
     * @param contentTypePath
     * @param assetTypeName
     * @param projectInformation
     * @throws Exception
     */
    private void createAndAddContentType(String contentTypePath, String assetTypeName, ProjectInformation projectInformation) throws Exception
    {
        projectInformation.getContentTypeMap().put(assetTypeName, contentTypePath);
        ContentType contentType = new ContentType(contentTypePath);
        contentType.setMetadataFields(WebServices.getMetadataFieldsForContentType(contentTypePath, projectInformation));
        Map<String, Field> dataDefinitionFields = WebServices.getDataDefinitionFieldsForContentType(contentTypePath, projectInformation);
        if (dataDefinitionFields != null)
        {
            contentType.setDataDefinitionFields(dataDefinitionFields);
            contentType.setUsesDataDefinition(true);
        }
        else
        {
            Map<String, Field> returnMap = new HashMap<String, Field>();
            returnMap.put(WebServices.XHTML_DATA_DEFINITION_FIELD.getIdentifier(), WebServices.XHTML_DATA_DEFINITION_FIELD);
            contentType.setDataDefinitionFields(returnMap);
            contentType.setUsesDataDefinition(false);
        }

        projectInformation.getContentTypes().put(contentTypePath, contentType);
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        ProjectInformation projectInformation = getProjectInformation();
        assetTypes.addAll(projectInformation.getAssetTypes().keySet());
        contentTypes.addAll(projectInformation.getContentTypePaths());
        return INPUT;
    }

    /**
     * To save the memory and avoid problems with unnecessary information that causes mess, the unused content types get
     * their field mappings cleared out.
     */
    private void clearOutUnusedContentTypeFieldMappings()
    {
        ProjectInformation projectInformation = getProjectInformation();
        for (AssetType assetType : projectInformation.getAssetTypes().values())
            if (!projectInformation.getAssetTypeNames().contains(assetType.getName()))
            {
                assetType.getMetadataFieldMapping().clear();
                assetType.getContentFieldMapping().clear();
            }
    }

    /**
     * @return Returns the assetTypes.
     */
    public List<String> getAssetTypes()
    {
        return assetTypes;
    }

    /**
     * @return Returns the contentTypes.
     */
    public List<String> getContentTypes()
    {
        return contentTypes;
    }

    /**
     * @return Returns the selectedAssetTypes.
     */
    public String[] getSelectedAssetTypes()
    {
        return selectedAssetTypes;
    }

    /**
     * @param selectedAssetTypes the selectedAssetTypes to set
     */
    public void setSelectedAssetTypes(String[] selectedAssetTypes)
    {
        this.selectedAssetTypes = selectedAssetTypes;
    }

    /**
     * @return Returns the selectedContentTypes.
     */
    public String[] getSelectedContentTypes()
    {
        return selectedContentTypes;
    }

    /**
     * @param selectedContentTypes the selectedContentTypes to set
     */
    public void setSelectedContentTypes(String[] selectedContentTypes)
    {
        this.selectedContentTypes = selectedContentTypes;
    }

    /**
     * @return Returns the contentTypeMap.
     */
    public Map<String, String> getContentTypeMap()
    {
        return getProjectInformation().getContentTypeMap();
    }
}
