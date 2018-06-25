/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class StructuredDataNode
{
    private String text;
    private String identifier;
    private String fileId;
    private String type;
    private String assetType;
    private List<StructuredDataNode> structuredDataNodes;

    /**
     * @return Returns the structuredDataNodes.
     */
    public List<StructuredDataNode> getStructuredDataNodes()
    {
        return structuredDataNodes;
    }

    /**
     * @param structuredDataNodes the structuredDataNodes to set
     */
    public void setStructuredDataNodes(List<StructuredDataNode> structuredDataNodes)
    {
        this.structuredDataNodes = structuredDataNodes;
    }

    /**
     * @return Returns the text.
     */
    public String getText()
    {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * @return Returns the identifier.
     */
    public String getIdentifier()
    {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * @return Returns the fileId.
     */
    public String getFileId()
    {
        return fileId;
    }

    /**
     * @param fileId the fileId to set
     */
    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    /**
     * @return Returns the type.
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
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

}
