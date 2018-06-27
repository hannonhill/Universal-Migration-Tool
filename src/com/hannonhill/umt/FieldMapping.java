/*
 * Created on Jun 27, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt;

public class FieldMapping
{
    private final String xPath;
    private final Field field;

    public FieldMapping(String xPath, Field field)
    {
        this.xPath = xPath;
        this.field = field;
    }

    /**
     * @return Returns the xPath.
     */
    public String getXPath()
    {
        return xPath;
    }

    /**
     * @return Returns the field.
     */
    public Field getField()
    {
        return field;
    }
}
