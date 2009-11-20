/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.lang.xwork.StringUtils;

import com.hannonhill.smt.ProjectInformation;

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
     * Unzips the contents of the uploaded zip file to a new directory and sets the directory in the project information.
     * 
     * @return
     */
    private String unzip()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String uploadDir = projectInformation.getUploadsDir() + zipFileName.substring(0, zipFileName.lastIndexOf('.')) + "/";

        ZipFile zipFile;
        Enumeration<? extends ZipEntry> entries;

        try
        {
            zipFile = new ZipFile(zip);
            entries = zipFile.entries();
            while (entries.hasMoreElements())
            {
                ZipEntry entry = entries.nextElement();

                if (entry.isDirectory())
                    (new File(uploadDir + entry.getName())).mkdirs();
                else if (entry.getName().endsWith(".xml"))
                    copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(uploadDir + entry.getName())));
            }

            zipFile.close();
        }
        catch (IOException ioe)
        {
            addActionError("Unhandled exception: " + ioe);
            processView();
            return INPUT;
        }

        projectInformation.setXmlDirectory(uploadDir);
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
        String uploadsDir = projectInformation.getUploadsDir();
        File dir = new File(uploadsDir);
        File[] childDirs = dir.listFiles();
        for (File childDir : childDirs)
            availableFolders.add(childDir.getName());
        xmlDirectory = SELECTED_BELOW;
        availableFolders.add(xmlDirectory);

        return INPUT;
    }

    /**
     * Copies the input stream
     * 
     * @param in
     * @param out
     * @throws IOException
     */
    private void copyInputStream(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int len;

        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);

        in.close();
        out.close();
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
