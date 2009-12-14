/*
 * Created on Dec 11, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * An object that stores information about a Cascade metadata set field
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class MetadataSetField extends Field
{
    private final boolean isDynamic;

    /**
     * Constructor for metadata set filed
     * 
     * @param identifier
     * @param label
     * @param isDyanmic
     */
    public MetadataSetField(String identifier, String label, boolean isDynamic)
    {
        super(identifier, label);
        this.isDynamic = isDynamic;
    }

    /**
     * @return Returns the isDynamic.
     */
    public boolean isDynamic()
    {
        return isDynamic;
    }
}
