/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.struts;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;
import org.apache.commons.lang.xwork.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.hannonhill.umt.ContentTypeInformation;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.api.ContentType;
import com.hannonhill.umt.api.Site;
import com.hannonhill.umt.service.RestApi;
import com.hannonhill.umt.util.PathUtil;

/**
 * Action that displays and processes form with cascade url, username, password and site name
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class ProjectPropertiesAction extends BaseAction
{
    private static final long serialVersionUID = -845484679818107782L;

    private static final List<String> urls = new ArrayList<>();

    private String url = "";
    private String username = "";
    private String password = "";
    private String siteName = "";
    private List<String> availableSites = new ArrayList<>();
    private InputStream inputStream;

    @Override
    public String execute() throws Exception
    {
        if (isSubmit())
            return processSubmit();

        return processView();
    }

    /**
     * @return Returns the input stream for AJAX
     */
    public InputStream getInputStream()
    {
        return inputStream;
    }

    /**
     * Reads available sites through REST API if all the necessary properties have been provided
     * 
     * @return
     * @throws Exception
     */
    public List<String> readAvailableSites() throws Exception
    {
        if (StringUtils.isEmpty(url) || StringUtils.isEmpty(username) || StringUtils.isEmpty(password))
            return new ArrayList<>();

        url = PathUtil.convertToFullCascadeInstanceURL(url);
        return RestApi.getSiteNames(url, username, password);
    }

    /**
     * Returns a semicolon separated list of site names through AJAX
     * 
     * @return
     * @throws Exception
     */
    public String getAvailableSiteNamesByAjax() throws Exception
    {
        JSONObject result = new JSONObject();
        JSONArray siteNames = new JSONArray();
        List<String> availableSiteNames = null;

        // Read the site names through REST API
        try
        {
            availableSiteNames = readAvailableSites();
        }
        catch (Exception e)
        {
            // If there was an error, output it to JSON
            result.put("error", e.getMessage());
        }

        // If there was no error, output site names to JSON
        if (availableSiteNames != null)
        {
            for (String siteName : availableSiteNames)
                siteNames.put(siteName);
            result.put("siteNames", siteNames);
        }

        // Output JSON to the inputStream
        try
        {
            String returnString = result.toString();
            inputStream = new ByteArrayInputStream(returnString.getBytes("UTF-8"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * Processes the form submission
     * 
     * @return
     */
    private String processSubmit()
    {
        validateForm();
        if (getActionErrors().size() > 0)
            return INPUT;

        url = PathUtil.convertToFullCascadeInstanceURL(url);

        verifyConnectivity();
        if (getActionErrors().size() > 0)
            return INPUT;

        ProjectInformation projectInformation = getProjectInformation();
        projectInformation.setUrl(url);
        projectInformation.setUsername(username);
        projectInformation.setPassword(password);
        projectInformation.setSiteName(siteName);

        loadContentTypes();
        if (getActionErrors().size() > 0)
            return INPUT;

        return SUCCESS;
    }

    /**
     * Loads content types from site with a site name that is specified in the projectInformation
     */
    private void loadContentTypes()
    {
        ProjectInformation projectInformation = getProjectInformation();
        List<ContentType> contentTypes = null;

        // Get all the content types from given site through REST API
        try
        {
            contentTypes = RestApi.getContentTypesFromSite(projectInformation);
        }
        catch (Exception e)
        {
            addActionError(e.getMessage());
            return;
        }

        if (contentTypes == null || contentTypes.size() == 0)
        {
            addActionError("Site with given name has no available Content Types");
            return;
        }

        // Clear the map in the projectInformation in case if it had some old data
        projectInformation.setContentTypes(new HashMap<String, ContentTypeInformation>());
        // Convert each ContentType to the ContentTypeInformation object and add to the map in the
        // projectInformation
        for (ContentType contentType : contentTypes)
            try
            {
                projectInformation.getContentTypes().put(contentType.getPath(), new ContentTypeInformation(contentType, projectInformation));
            }
            catch (Exception e)
            {
                addActionError(e.getMessage());
            }
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        ProjectInformation projectInformation = getProjectInformation();
        url = projectInformation.getUrl();
        username = projectInformation.getUsername();
        password = projectInformation.getPassword();
        siteName = projectInformation.getSiteName();
        try
        {
            availableSites = readAvailableSites();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return INPUT;
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
     * Verifies that: - the URL is a valid URL - it is possible to connect - the username and password
     * authenticate - the user can read site objects - the site with given site name exists - the site can be
     * actually read
     */
    private void verifyConnectivity()
    {
        Site site = null;
        try
        {
            site = RestApi.readSite(username, password, url, siteName);
        }
        catch (MalformedURLException e)
        {
            addActionError("The given URL is malformed");
            return;
        }
        catch (ServiceException e)
        {
            addActionError("Could not locate Cascade CMS with given URL.");
            return;
        }
        catch (RemoteException e)
        {
            addActionError("A problem occurred when connecting to Cascade CMS: " + e.getMessage());
            return;
        }
        catch (Exception e)
        {
            addActionError("An error occurred when reading a site with given Site Name: " + e.getMessage());
            return;
        }

        if (site == null)
            addActionError("Could not read a site for unknown reason");
    }

    public String addUrl() {
        urls.add(url);
        return toJson();
    }

    public String getUrls() {
        return toJson();
    }

    public String updateUrl() {
        String[] parts = url.split(" ");
        urls.remove(parts[0].trim());
        urls.add(parts[1].trim());
        return toJson();
    }

    public String deleteUrl() {
        urls.remove(url);
        return toJson();
    }

    private String toJson() {
        Gson gson = new Gson();
        String json = gson.toJson(ProjectPropertiesAction.urls);
        inputStream = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
        return SUCCESS;
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

    /**
     * @return Returns the availableSites.
     */
    public List<String> getAvailableSites()
    {

        return availableSites;
    }

    /**
     * @param availableSites the availableSites to set
     */
    public void setAvailableSites(List<String> availableSites)
    {
        this.availableSites = availableSites;
    }
}
