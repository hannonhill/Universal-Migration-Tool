/*
 * Created on Nov 30, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * Represents a Cascade field (metadata or data definition)
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class Field
{
    private final String identifier;
    private final String label;
    private final FieldType fieldType;

    /**
     * Constructor
     * 
     * @param identifier
     * @param label
     * @param fieldType
     */
    public Field(String identifier, String label, FieldType fieldType)
    {
        this.identifier = identifier;
        this.label = label;
        this.fieldType = fieldType;
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

    /**
     * @return Returns the fieldType.
     */
    public FieldType getFieldType()
    {
        return fieldType;
    }
}
