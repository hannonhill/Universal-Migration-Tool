/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.File;
import java.nio.file.FileSystems;
import java.util.HashSet;

import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.XmlAnalyzer;

/**
 * This action is responsible for analyzing the project information - the contents of the selected xml folder
 * and Cascade Server's Site's contents.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AnalyzeInformationAction extends BaseAction
{
    private static final long serialVersionUID = 7319925663582074871L;

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

        // clear out previous data
        projectInformation.getFilesToProcess().clear();
        projectInformation.setGatheredExtensions(new HashSet<String>()); // clear out existing extensions

        // analyze folders recursively
        try
        {
            XmlAnalyzer.analyzeFolder(FileSystems.getDefault().getPath(projectInformation.getXmlDirectory()), projectInformation);
             }
        catch (Exception e)
        {

            addActionError("Error occurred when analyzing the folder: " + e.getMessage());
            LOG.error("Error occurred wen analyzing the folder: ", e);
            return INPUT;
        }

        return SUCCESS;
    }
}
