/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.ArrayList;
import java.util.List;

/**
 * An object that stores information from an XML page
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class XmlPageInformation
{
    private final String localPath;
    private String assetTypeName;
    private final List<String> metadataFields = new ArrayList<String>();
    private final List<String> contentFields = new ArrayList<String>();

    /**
     * Constructor
     * 
     * @param localPath
     */
    public XmlPageInformation(String localPath)
    {
        this.localPath = localPath;
    }

    /**
     * @return Returns the assetTypeName.
     */
    public String getAssetTypeName()
    {
        return assetTypeName;
    }

    /** 
     * @param assetTypeName the assetTypeName to set
     */
    public void setAssetTypeName(String assetTypeName)
    {
        this.assetTypeName = assetTypeName;
    }

    /**
     * @return Returns the metadataFields.
     */
    public List<String> getMetadataFields()
    {
        return metadataFields;
    }

    /**
     * @return Returns the contentFields.
     */
    public List<String> getContentFields()
    {
        return contentFields;
    }

    /**
     * @return Returns the localPath.
     */
    public String getLocalPath()
    {
        return localPath;
    }
}
