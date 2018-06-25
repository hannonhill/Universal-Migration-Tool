/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.struts;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.xwork.StringUtils;

import com.hannonhill.umt.ProjectInformation;

/**
 * Action responsible for displaying a migration summary
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class MigrationSummaryAction extends BaseAction
{
    private static final long serialVersionUID = 7032693197761936982L;

    private final List<String> overwriteBehaviorList = new ArrayList<String>();
    private String overwriteBehavior;

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
        if (StringUtils.isEmpty(overwriteBehavior))
        {
            addActionError("The Overwrite Behavior must be selected.");
            return processView();
        }

        getProjectInformation().setOverwriteBehavior(overwriteBehavior);
        return SUCCESS;
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        overwriteBehaviorList.add(ProjectInformation.OVERWRITE_BEHAVIOR_KEEP_EXISTING);
        overwriteBehaviorList.add(ProjectInformation.OVERWRITE_BEHAVIOR_OVERWRITE_EXISTING);
        overwriteBehaviorList.add(ProjectInformation.OVERWRITE_BEHAVIOR_UPDATE_EXISTING);
        overwriteBehaviorList.add(ProjectInformation.OVERWRITE_BEHAVIOR_SKIP_EXISTING);
        overwriteBehavior = getProjectInformation().getOverwriteBehavior();

        return INPUT;
    }

    /**
     * @return Returns the overwriteBehaviorList
     */
    public List<String> getOverwriteBehaviorList()
    {
        return overwriteBehaviorList;
    }

    /**
     * @return Returns the overwriteBehavior.
     */
    public String getOverwriteBehavior()
    {
        return overwriteBehavior;
    }

    /**
     * @param overwriteBehavior the overwriteBehavior to set
     */
    public void setOverwriteBehavior(String overwriteBehavior)
    {
        this.overwriteBehavior = overwriteBehavior;
    }
}
