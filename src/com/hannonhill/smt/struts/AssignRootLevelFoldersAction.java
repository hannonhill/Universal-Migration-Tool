/*
 * Created on Dec 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.HashMap;
import java.util.List;

import com.hannonhill.smt.ExternalRootLevelFolderAssignment;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.MappingPersister;

/**
 * Allows the user to assign the external root level folders to either a cross site link, external site or
 * nothing (link will be rewritten the regular way)
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AssignRootLevelFoldersAction extends BaseAction
{
    private static final long serialVersionUID = 7905922901588823503L;
    private List<String> selectedRootLevelFolders;
    private List<String> selectedCrossSiteTexts;
    private List<String> selectedExternalLinkTexts;

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
        projectInformation.setExternalRootLevelFolderAssignemnts(new HashMap<String, ExternalRootLevelFolderAssignment>());

        // selectedRootLevelFolders is null when there are no assignments
        if (selectedRootLevelFolders == null)
            return SUCCESS;

        try
        {
            // For each mapping, add it to the project information
            for (int i = 0; i < selectedRootLevelFolders.size(); i++)
            {
                String folder = selectedRootLevelFolders.get(i);
                String crossSite = selectedCrossSiteTexts.get(i);
                String externalLink = selectedExternalLinkTexts.get(i);

                crossSite = crossSite.equals("null") ? null : crossSite;
                externalLink = externalLink.equals("null") ? null : externalLink;

                ExternalRootLevelFolderAssignment assignment = new ExternalRootLevelFolderAssignment(folder, crossSite, externalLink);
                projectInformation.getExternalRootLevelFolderAssignemnts().put(folder, assignment);
            }

            // After mappings are added to the project information, save it to the filesystem
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

        return INPUT;
    }

    /**
     * @return Returns the selectedRootLevelFolders.
     */
    public List<String> getSelectedRootLevelFolders()
    {
        return selectedRootLevelFolders;
    }

    /**
     * @param selectedRootLevelFolders the selectedRootLevelFolders to set
     */
    public void setSelectedRootLevelFolders(List<String> selectedRootLevelFolders)
    {
        this.selectedRootLevelFolders = selectedRootLevelFolders;
    }

    /**
     * @return Returns the selectedCrossSiteTexts.
     */
    public List<String> getSelectedCrossSiteTexts()
    {
        return selectedCrossSiteTexts;
    }

    /**
     * @param selectedCrossSiteTexts the selectedCrossSiteTexts to set
     */
    public void setSelectedCrossSiteTexts(List<String> selectedCrossSiteTexts)
    {
        this.selectedCrossSiteTexts = selectedCrossSiteTexts;
    }

    /**
     * @return Returns the selectedExternalLinkTexts.
     */
    public List<String> getSelectedExternalLinkTexts()
    {
        return selectedExternalLinkTexts;
    }

    /**
     * @param selectedExternalLinkTexts the selectedExternalLinkTexts to set
     */
    public void setSelectedExternalLinkTexts(List<String> selectedExternalLinkTexts)
    {
        this.selectedExternalLinkTexts = selectedExternalLinkTexts;
    }
}
