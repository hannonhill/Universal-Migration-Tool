/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.MappingPersister;

/**
 * In this action user is assigning the asset types from xml to Content Types in Cascade
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AssignContentTypesAction extends BaseAction
{
    private static final long serialVersionUID = 3992252452526228826L;

    private final List<String> assetTypes = new ArrayList<String>(); // a list of available XML Asset Type
                                                                     // names
    private final List<String> contentTypes = new ArrayList<String>(); // alist of available Cascade Content
                                                                       // Type paths in given site

    private String[] selectedAssetTypes; // the XML Asset Type names selected by the user after the form
                                         // submission
    private String[] selectedContentTypes; // the Cascade Content Type paths selected by the user after the
                                           // form submission

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

        // Clear out the information
        projectInformation.setContentTypeMap(new HashMap<String, String>()); // clear out the mappings

        // Make sure that at least one mapping has been created
        if (selectedAssetTypes == null || selectedAssetTypes.length == 0)
        {
            addActionError("You must assign at least one Content Type mapping");
            return processView();
        }

        try
        {
            // For each mapping, add it to the project information and load the content type throgh web
            // services
            for (int i = 0; i < selectedAssetTypes.length; i++)
                projectInformation.getContentTypeMap().put(selectedAssetTypes[i], selectedContentTypes[i]);

            // After mappings are added to the project information, save it to the filesystem
            MappingPersister.persistMappings(projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

        // make the asset type names an ordered list because map keeps things out of order
        projectInformation.setAssetTypeNames(new ArrayList<String>(projectInformation.getContentTypeMap().keySet()));

        // clear out the rest of previously entered information that was stored in the session
        clearOutUnusedContentTypeFieldMappings();

        return SUCCESS;
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        ProjectInformation projectInformation = getProjectInformation();
        MappingPersister.loadMappings(projectInformation);
        assetTypes.addAll(projectInformation.getAssetTypes().keySet());
        contentTypes.addAll(projectInformation.getContentTypes().keySet());
        Collections.sort(assetTypes);
        Collections.sort(contentTypes);
        return INPUT;
    }

    /**
     * To save the memory and avoid problems with unnecessary information that causes mess, the unused content
     * types get
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

    /**
     * @return Returns an action that should be used for the "Previous" button
     */
    public String getPreviousLink()
    {
        return getProjectInformation().getLuminisFolder() != null ? "/UploadZip" : "/ProjectProperties";
    }
}
