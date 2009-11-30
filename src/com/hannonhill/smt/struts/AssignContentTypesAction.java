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

import com.hannonhill.smt.ProjectInformation;

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

        for (int i = 0; i < selectedAssetTypes.length; i++)
            projectInformation.getContentTypeMap().put(selectedAssetTypes[i], selectedContentTypes[i]);

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
        assetTypes.addAll(projectInformation.getAssetTypes().keySet());
        contentTypes.addAll(projectInformation.getContentTypePaths());
        return INPUT;
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
