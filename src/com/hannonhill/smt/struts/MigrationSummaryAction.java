/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.struts;

/**
 * Action responsible for displaying a migration summary
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MigrationSummaryAction extends BaseAction
{
    private static final long serialVersionUID = 7032693197761936982L;

    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception
    {
        if (isSubmit())
            return SUCCESS;

        return INPUT;
    }

    /**
     * @return Returns the number of asset types
     */
    public int getNAssetTypes()
    {
        return getProjectInformation().getAssetTypeNames().size();
    }
}
