/*
 * Created on Nov 17, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.Map;

import com.hannonhill.smt.ProjectInformation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Base action
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class BaseAction extends ActionSupport
{
    private static final long serialVersionUID = 7366642925401627376L;
    private static final String PROJECT_INFORMATION = "projectInformation";
    private String submitButton;

    /**
     * @return Returns the project information object
     */
    protected ProjectInformation getProjectInformation()
    {
        Map<String, Object> session = ActionContext.getContext().getSession();
        Object projectInformationObject = session.get(PROJECT_INFORMATION);
        if (projectInformationObject == null)
        {
            ProjectInformation projectInformation = new ProjectInformation();
            session.put(PROJECT_INFORMATION, projectInformation);
            return projectInformation;
        }

        return (ProjectInformation) projectInformationObject;
    }

    /**
     * @return Returns the submitButton.
     */
    public String getSubmitButton()
    {
        return submitButton;
    }

    /**
     * @param submitButton the submitButton to set
     */
    public void setSubmitButton(String submitButton)
    {
        this.submitButton = submitButton;
    }

    /**
     * @return Returns true if the action was submitted by a form
     */
    protected boolean isSubmit()
    {
        return submitButton != null;
    }
}
