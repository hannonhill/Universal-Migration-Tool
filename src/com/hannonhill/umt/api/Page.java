/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class Page extends FolderContainedAsset
{
    private String contentTypePath;
    private Metadata metadata;
    private StructuredData structuredData;
    private String xhtml;

    /**
     * @return Returns the contentTypePath.
     */
    public String getContentTypePath()
    {
        return contentTypePath;
    }

    /**
     * @param contentTypePath the contentTypePath to set
     */
    public void setContentTypePath(String contentTypePath)
    {
        this.contentTypePath = contentTypePath;
    }

    /**
     * @return Returns the metadata.
     */
    public Metadata getMetadata()
    {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(Metadata metadata)
    {
        this.metadata = metadata;
    }

    /**
     * @return Returns the structuredData.
     */
    public StructuredData getStructuredData()
    {
        return structuredData;
    }

    /**
     * @param structuredData the structuredData to set
     */
    public void setStructuredData(StructuredData structuredData)
    {
        this.structuredData = structuredData;
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
