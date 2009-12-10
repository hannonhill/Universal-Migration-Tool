/*
 * Created on Dec 9, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * An object that represents a status of migration of a single file into Cascade Server
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class SingleFileMigrationStatus
{
    private final String path;
    // if success is false and errorMessage is null, it means migration of that file is in progress
    // if success is true, it means that migration is completed successfully
    private boolean isSuccess;
    private String errorMessage;

    /**
     * Constructor
     * 
     * @param path
     */
    public SingleFileMigrationStatus(String path)
    {
        this.path = path;
    }

    /**
     * @return Returns the isSuccess.
     */
    public boolean isSuccess()
    {
        return isSuccess;
    }

    /**
     * @param isSuccess the isSuccess to set
     */
    public void setSuccess(boolean isSuccess)
    {
        this.isSuccess = isSuccess;
    }

    /**
     * @return Returns the errorMessage.
     */
    public String getErrorMessage()
    {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    /**
     * @return Returns the path.
     */
    public String getPath()
    {
        return path;
    }
}
