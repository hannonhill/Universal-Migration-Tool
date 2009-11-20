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
import java.util.Enumeration;
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
            return INPUT;
        }

        projectInformation.setXmlDirectory(uploadDir);
        return SUCCESS;
    }

    /**
     * Copies the input stream
     * 
     * @param in
     * @param out
     * @throws IOException
     */
    public static final void copyInputStream(InputStream in, OutputStream out) throws IOException
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
}
