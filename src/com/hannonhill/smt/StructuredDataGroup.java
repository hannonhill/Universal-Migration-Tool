/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a StructuredDataNode of type group
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class StructuredDataGroup
{
    private final String identifier;
    private final Map<String, StructuredDataText> textFields = new HashMap<String, StructuredDataText>(); // the text fields in the group
    private final Map<String, StructuredDataGroup> groups = new HashMap<String, StructuredDataGroup>(); // other groups in the group

    /**
     * Constructor
     * 
     * @param identifier
     */
    public StructuredDataGroup(String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * @return Returns the identifier.
     */
    public String getIdentifier()
    {
        return identifier;
    }

    /**
     * @return Returns the groups.
     */
    public Map<String, StructuredDataGroup> getGroups()
    {
        return groups;
    }

    /**
     * @return Returns the textFields.
     */
    public Map<String, StructuredDataText> getTextFields()
    {
        return textFields;
    }
}
