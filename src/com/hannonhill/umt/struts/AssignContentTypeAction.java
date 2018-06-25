/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.struts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.service.MappingPersister;

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

    private String pageExtensions;
    private String blockExtensions;

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
        if (selectedContentType == null || selectedContentType.trim().equals(""))
        {
            addActionError("You must select the content type");
            return processView();
        }

        projectInformation.setContentTypePath(selectedContentType);

        if (pageExtensions == null || pageExtensions.trim().equals(""))
        {
            addActionError("You must at least one page extension");
            return processView();
        }

        projectInformation.getPageExtensions().clear();
        projectInformation.setPageExtensions(pageExtensions);
        projectInformation.getBlockExtensions().clear();
        projectInformation.setBlockExtensions(blockExtensions);

        try
        {
            MappingPersister.persistMappings(projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

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

        pageExtensions = projectInformation.getPageExtensionsString();
        blockExtensions = projectInformation.getBlockExtensionsString();
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
        return "/AssignRootLevelFolders";
    }

    /**
     * @return Returns the pageExtensions.
     */
    public String getPageExtensions()
    {
        return pageExtensions;
    }

    /**
     * @param pageExtensions the pageExtensions to set
     */
    public void setPageExtensions(String pageExtensions)
    {
        this.pageExtensions = pageExtensions;
    }

    /**
     * @return Returns the blockExtensions.
     */
    public String getBlockExtensions()
    {
        return blockExtensions;
    }

    /**
     * @param blockExtensions the blockExtensions to set
     */
    public void setBlockExtensions(String blockExtensions)
    {
        this.blockExtensions = blockExtensions;
    }

}
