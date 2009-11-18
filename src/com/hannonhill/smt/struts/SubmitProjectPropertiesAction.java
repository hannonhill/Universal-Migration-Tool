/*
 * Created on Nov 17, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import org.apache.commons.lang.xwork.StringUtils;

import com.hannonhill.smt.ProjectInformation;

/**
 * Action that processes the information submitted in the project properties screen.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class SubmitProjectPropertiesAction extends BaseAction
{
    private static final long serialVersionUID = -845484679818107782L;

    private String url = "";
    private String username = "";
    private String password = "";
    private String siteName = "";

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        validateForm();
        if (getActionErrors().size() > 0)
            return INPUT;

        if (!url.startsWith("http"))
            url = "http://" + url;

        if (!url.endsWith("/ws/services/AssetOperationService?wsdl"))
            url = url + "/ws/services/AssetOperationService?wsdl";

        ProjectInformation projectInformation = getProjectInformation();
        projectInformation.setUrl(url);
        projectInformation.setUsername(username);
        projectInformation.setPassword(password);
        projectInformation.setSiteName(siteName);

        return super.execute();
    }

    /**
     * Validates the information entered into the form
     */
    private void validateForm()
    {
        if (StringUtils.isEmpty(url))
            addActionError("URL is required");

        if (StringUtils.isEmpty(username))
            addActionError("Username is required");

        if (StringUtils.isEmpty(password))
            addActionError("Password is required");

        if (StringUtils.isEmpty(siteName))
            addActionError("Site Name is required");
    }

    /**
     * @return Returns the url.
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url)
    {
        this.url = url == null ? "" : url.trim();
    }

    /**
     * @return Returns the username.
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username == null ? "" : username.trim();
    }

    /**
     * @return Returns the password.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password == null ? "" : password.trim();
    }

    /**
     * @return Returns the siteName.
     */
    public String getSiteName()
    {
        return siteName;
    }

    /**
     * @param siteName the siteName to set
     */
    public void setSiteName(String siteName)
    {
        this.siteName = siteName == null ? "" : siteName.trim();
    }

}
