/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.MappingPersister;

/**
 * In this action user is assigning the asset types from xml to Content Types in Cascade
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AssignContentTypeAction extends BaseAction
{
    private static final long serialVersionUID = 3992252452526228826L;

    private final List<String> contentTypes = new ArrayList<String>(); // a list of available Cascade Content
                                                                       // Type paths in given site

    private String selectedContentType; // the Cascade Content Type path selected by the user after the form
                                        // submission

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
        if (selectedContentType == null || selectedContentType.equals(""))
        {
            addActionError("You must select the content type");
            return processView();
        }

        projectInformation.setContentTypePath(selectedContentType);

        try
        {
            MappingPersister.persistMappings(projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

        // clear out the rest of previously entered information that was stored in the session
        projectInformation.getFieldMapping().clear();

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

        contentTypes.addAll(projectInformation.getContentTypes().keySet());
        selectedContentType = projectInformation.getContentTypePath();
        Collections.sort(contentTypes);
        return INPUT;
    }

    /**
     * @return Returns the contentTypes.
     */
    public List<String> getContentTypes()
    {
        return contentTypes;
    }

    /**
     * @return Returns the selectedContentType.
     */
    public String getSelectedContentType()
    {
        return selectedContentType;
    }

    /**
     * @param selectedContentType the selectedContentType to set
     */
    public void setSelectedContentType(String selectedContentType)
    {
        this.selectedContentType = selectedContentType;
    }

    /**
     * @return Returns an action that should be used for the "Previous" button
     */
    public String getPreviousLink()
    {
        return "/UploadZip";
    }
}
