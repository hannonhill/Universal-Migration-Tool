/*
 * Created on Dec 11, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * Object that stores information about a Cascade data definition field
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class DataDefinitionField extends Field
{
    private final boolean isFileChooser;

    /**
     * Constructor for data defintion field
     * 
     * @param identifier
     * @param label
     * @param fieldType
     */
    public DataDefinitionField(String identifier, String label, boolean isFileChooser)
    {
        super(identifier, label);
        this.isFileChooser = isFileChooser;
    }

    /**
     * @return Returns the isFileChooser.
     */
    public boolean isFileChooser()
    {
        return isFileChooser;
    }
}
