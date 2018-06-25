/*
 * Created on Nov 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt;

/**
 * Represents a Cascade field (metadata or data definition)
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public abstract class Field
{
    private final String identifier;
    private final String label;

    /**
     * Constructor
     * 
     * @param identifier
     * @param label
     */
    public Field(String identifier, String label)
    {
        this.identifier = identifier;
        this.label = label;
    }

    /**
     * @return Returns the identifier.
     */
    public String getIdentifier()
    {
        return identifier;
    }

    /**
     * @return Returns the label.
     */
    public String getLabel()
    {
        return label;
    }

}
