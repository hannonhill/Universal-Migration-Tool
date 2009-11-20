/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.File;

import org.apache.commons.lang.xwork.StringUtils;

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

    private File zip;
    private String zipFileName;

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        if (isSubmit())
            return processSubmit();

        return INPUT;
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

        // Unzip code goes here

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
}
