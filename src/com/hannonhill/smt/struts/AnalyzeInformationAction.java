/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.hannonhill.smt.AssetType;
import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.service.XmlAnalyzer;

/**
 * This action is responsible for analyzing the project information - the contents of the selected xml folder
 * and Cascade Server's Site's contents.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class AnalyzeInformationAction extends BaseAction
{

    private static final long serialVersionUID = 7319925663582074871L;

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        ProjectInformation projectInformation = getProjectInformation();

        // clear out previous data
        projectInformation.getFilesToProcess().clear();

        // analyze folders recursively
        List<String> errorMessages = new ArrayList<String>();
        projectInformation.setGatheredExtensions(new HashSet<String>()); // clear out existing extensions
        projectInformation.setAssetTypes(new HashMap<String, AssetType>()); // clear out the existing asset types
        projectInformation.setAssetTypeNames(new ArrayList<String>());
        XmlAnalyzer.analyzeFolder(new File(projectInformation.getXmlDirectory()), projectInformation, errorMessages);

        if (errorMessages.size() > 0)
        {
            // display all the error messages
            for (String errorMessage : errorMessages)
                addActionError(errorMessage);
            return INPUT;
        }

        return SUCCESS;
    }
}
