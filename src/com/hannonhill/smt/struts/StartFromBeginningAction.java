/*
 * Created on Dec 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.util.Map;

import com.hannonhill.smt.ProjectInformation;
import com.opensymphony.xwork2.ActionContext;

/**
 * Creates a new ProjectInformation object and assigns it to the session so that the user can start a new migration while the
 * old one keeps running (if it is running).
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class StartFromBeginningAction extends BaseAction
{
    private static final long serialVersionUID = 5577479870745328245L;

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        Map<String, Object> session = ActionContext.getContext().getSession();
        ProjectInformation old = getProjectInformation();
        ProjectInformation projectInformation = new ProjectInformation();
        session.put(PROJECT_INFORMATION, projectInformation);
        projectInformation.setUrl(old.getUrl());
        projectInformation.setUsername(old.getUsername());
        projectInformation.setSiteName(old.getSiteName());
        return SUCCESS;
    }
}
