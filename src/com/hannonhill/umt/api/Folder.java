/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class Folder extends FolderContainedAsset
{
    private List<Identifier> children;

    /**
     * @return Returns the children.
     */
    public List<Identifier> getChildren()
    {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<Identifier> children)
    {
        this.children = children;
    }
}
