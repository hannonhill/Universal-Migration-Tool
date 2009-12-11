/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.xwork.StringUtils;

import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.FileSystem;

/**
 * Action that displays and processes form with zip archive
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class UploadZipAction extends BaseAction
{
    private static final long serialVersionUID = 8203612105339164717L;
    private static final String SELECTED_BELOW = "Selected Below";

    private File zip;
    private String zipFileName;
    private String xmlDirectory;

    private final List<String> availableFolders = new ArrayList<String>();

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
        // if user selected the xml directory, just set it in project information and go to next action
        if (!xmlDirectory.equals(SELECTED_BELOW))
        {
            ProjectInformation projectInformation = getProjectInformation();
            projectInformation.setXmlDirectory(projectInformation.getUploadsDir() + xmlDirectory);
            return SUCCESS;
        }

        // if not, then validate the form, unzip to a new directory, and then set it in project information and go to next action
        validateForm();
        if (getActionErrors().size() > 0)
        {
            processView();
            return INPUT;
        }

        return unzip();
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        try
        {
            ProjectInformation projectInformation = getProjectInformation();
            String uploadsDir = projectInformation.getUploadsDir();
            File dir = new File(uploadsDir);
            FileSystem.createFolderIfDoesNotExist(uploadsDir);
            File[] childDirs = dir.listFiles();
            for (File childDir : childDirs)
                availableFolders.add(childDir.getName());
            xmlDirectory = SELECTED_BELOW;
            availableFolders.add(xmlDirectory);

            // If the xml directory was already selected (for example we are going back using "Previous" button,
            // get it from the project information and use it instead of using SELECTED_BELOW
            String xmlDir = projectInformation.getXmlDirectory();
            if (xmlDir != null)
                xmlDirectory = xmlDir.substring(xmlDir.lastIndexOf('/') + 1);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
        }
        return INPUT;
    }

    /**
     * Unzips the contents of the uploaded zip file to a new directory and sets the directory in the project information.
     * 
     * @return
     */
    private String unzip()
    {
        ProjectInformation projectInformation = getProjectInformation();

        try
        {
            String uploadDir = FileSystem.unzip(zip, zipFileName, projectInformation);
            projectInformation.setXmlDirectory(uploadDir);
        }
        catch (Exception e)
        {
            addActionError("Unhandled exception: " + e);
            processView();
            return INPUT;
        }

        return SUCCESS;
    }

    /**
     * Validates the information entered into the form
     */
    private void validateForm()
    {
        if (StringUtils.isEmpty(zipFileName))
        {
            addActionError("Please select a file to upload");
            return;
        }

        if (!zipFileName.endsWith(".zip"))
            addActionError("Only zip files are allowed");
    }

    /**
     * @return Returns the zip.
     */
    public File getZip()
    {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(File zip)
    {
        this.zip = zip;
    }

    /**
     * @return Returns the zipFileName.
     */
    public String getZipFileName()
    {
        return zipFileName;
    }

    /**
     * @param zipFileName the zipFileName to set
     */
    public void setZipFileName(String zipFileName)
    {
        this.zipFileName = zipFileName;
    }

    /**
     * @return Returns the xmlDirectory.
     */
    public String getXmlDirectory()
    {
        return xmlDirectory;
    }

    /**
     * @param xmlDirectory the xmlDirectory to set
     */
    public void setXmlDirectory(String xmlDirectory)
    {
        this.xmlDirectory = xmlDirectory;
    }

    /**
     * @return Returns the availableFolders.
     */
    public List<String> getAvailableFolders()
    {
        return availableFolders;
    }
}
