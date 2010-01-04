/*
 * Created on Dec 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import org.apache.commons.lang.xwork.StringUtils;

/**
 * Represents a root level folder assignment when the folder is mapped to an external location - either to a different site or an external url 
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class ExternalRootLevelFolderAssignment
{
    public static final String ASSIGNMENT_TYPE_CROSS_SITE = "cross-site";
    public static final String ASSIGNMENT_TYPE_EXTERNAL_LINK = "external-link";

    private final String folder;
    private final String crossSiteAssignment;
    private final String externalLinkAssignment;

    /**
     * Constructor
     * 
     * @param folder
     * @param crossSiteAssignment
     * @param externalLinkAssignment
     */
    public ExternalRootLevelFolderAssignment(String folder, String crossSiteAssignment, String externalLinkAssignment)
    {
        this.folder = folder;
        this.crossSiteAssignment = crossSiteAssignment;
        this.externalLinkAssignment = externalLinkAssignment;
    }

    /**
     * @return Returns the folder.
     */
    public String getFolder()
    {
        return folder;
    }

    /**
     * @return Returns the assignmentType.
     */
    public String getAssignmentType()
    {
        return StringUtils.isEmpty(crossSiteAssignment) ? ASSIGNMENT_TYPE_EXTERNAL_LINK : ASSIGNMENT_TYPE_CROSS_SITE;
    }

    /**
     * @return Returns the crossSiteAssignment.
     */
    public String getCrossSiteAssignment()
    {
        return crossSiteAssignment;
    }

    /**
     * @return Returns the externalLinkAssignment.
     */
    public String getExternalLinkAssignment()
    {
        return externalLinkAssignment;
    }
}
