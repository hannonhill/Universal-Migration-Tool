/*
 * Created on Nov 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2008 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
    private String name; // name of the asset type
    private final Set<String> metadataFields = new HashSet<String>(); // a set of metadata field names that are present in the xml for this asset type
    private final Set<String> contentFields = new HashSet<String>(); // a set of content field names that are present in the xml for this asset type

    private final Map<String, Field> metadataFieldMapping = new HashMap<String, Field>(); // a mapping from a metadata field name to a Cascade field
    private final Map<String, Field> contentFieldMapping = new HashMap<String, Field>(); // a mapping from a content field name to a Cascade field 

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

    /**
     * @return Returns the metadataFieldMapping.
     */
    public Map<String, Field> getMetadataFieldMapping()
    {
        return metadataFieldMapping;
    }

    /**
     * @return Returns the contentFieldMapping.
     */
    public Map<String, Field> getContentFieldMapping()
    {
        return contentFieldMapping;
    }
}
