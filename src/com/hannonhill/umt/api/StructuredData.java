/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class StructuredData
{
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

}
