/*
 * Created on Nov 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2008 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashSet;
import java.util.Set;

/**
 * An object that stores information about Asset Type
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class AssetType
{
    private String name;
    private final Set<String> metadataFields = new HashSet<String>();
    private final Set<String> contentFields = new HashSet<String>();

    /**
     * Constructor
     * 
     * @param name
     */
    public AssetType(String name)
    {
        this.name = name;
    }

    /**
     * @return Returns the name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return Returns the metadataFields.
     */
    public Set<String> getMetadataFields()
    {
        return metadataFields;
    }

    /**
     * @return Returns the contentFields.
     */
    public Set<String> getContentFields()
    {
        return contentFields;
    }
}
