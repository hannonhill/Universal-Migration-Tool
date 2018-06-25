/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class XhtmlDataDefinitionBlock extends FolderContainedAsset
{
    private String metadataSetId;
    private String xhtml;

    /**
     * @return Returns the metadataSetId.
     */
    public String getMetadataSetId()
    {
        return metadataSetId;
    }

    /**
     * @param metadataSetId the metadataSetId to set
     */
    public void setMetadataSetId(String metadataSetId)
    {
        this.metadataSetId = metadataSetId;
    }

    /**
     * @return Returns the xhtml.
     */
    public String getXhtml()
    {
        return xhtml;
    }

    /**
     * @param xhtml the xhtml to set
     */
    public void setXhtml(String xhtml)
    {
        this.xhtml = xhtml;
    }
}
