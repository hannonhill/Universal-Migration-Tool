/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * Represents a StructuredDataNode of type text
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class StructuredDataText
{
    private String identifier;
    private String value;

    public StructuredDataText(String identifier, String value)
    {
        this.identifier = identifier;
        this.value = value;
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
     * @return Returns the value.
     */
    public String getValue()
    {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value)
    {
        this.value = value;
    }
}
