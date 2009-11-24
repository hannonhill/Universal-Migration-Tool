/*
 * Created on Nov 20, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

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
    private String assetType;
    private List<String> metadataFields;
    private List<String> contentFields;

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
     * @return Returns the assetType.
     */
    public String getAssetType()
    {
        return assetType;
    }

    /**
     * @param assetType the assetType to set
     */
    public void setAssetType(String assetType)
    {
        this.assetType = assetType;
    }

    /**
     * @return Returns the metadataFields.
     */
    public List<String> getMetadataFields()
    {
        return metadataFields;
    }

    /**
     * @param metadataFields the metadataFields to set
     */
    public void setMetadataFields(List<String> metadataFields)
    {
        this.metadataFields = metadataFields;
    }

    /**
     * @return Returns the contentFields.
     */
    public List<String> getContentFields()
    {
        return contentFields;
    }

    /**
     * @param contentFields the contentFields to set
     */
    public void setContentFields(List<String> contentFields)
    {
        this.contentFields = contentFields;
    }

    /**
     * @return Returns the localPath.
     */
    public String getLocalPath()
    {
        return localPath;
    }
}
