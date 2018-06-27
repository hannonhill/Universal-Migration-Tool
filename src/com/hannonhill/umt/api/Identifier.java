/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

public class Identifier
{
    private Path path;
    private String id;
    private String type;
    private boolean recycled;

    public Identifier(String id, String type)
    {
        this.id = id;
        this.type = type;
    }

    public Identifier(String path, String siteName, String type)
    {
        this.path = new Path();
        this.path.setPath(path);
        this.path.setSiteName(siteName);
        this.type = type;
    }

    public Identifier(String id, String path, String siteName, String type)
    {
        this.id = id;
        this.path = new Path();
        this.path.setPath(path);
        this.path.setSiteName(siteName);
        this.type = type;
    }

    /**
     * @return Returns the path.
     */
    public Path getPath()
    {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(Path path)
    {
        this.path = path;
    }

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
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
     * @return Returns the recycled.
     */
    public boolean isRecycled()
    {
        return recycled;
    }

    /**
     * @param recycled the recycled to set
     */
    public void setRecycled(boolean recycled)
    {
        this.recycled = recycled;
    }

}
