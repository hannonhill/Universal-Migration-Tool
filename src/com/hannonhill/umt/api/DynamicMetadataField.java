/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.ArrayList;
import java.util.List;

public class DynamicMetadataField
{
    private String name;
    private List<FieldValue> fieldValues;

    public DynamicMetadataField()
    {
    }

    public DynamicMetadataField(String name)
    {
        this.name = name;
        this.fieldValues = new ArrayList<>();
        FieldValue fieldValue = new FieldValue();
        fieldValue.setValue("");
        this.fieldValues.add(fieldValue);
    }

    public DynamicMetadataField(String name, String value)
    {
        this.name = name;
        this.fieldValues = new ArrayList<>();
        FieldValue fieldValue = new FieldValue();
        fieldValue.setValue(value);
        this.fieldValues.add(fieldValue);
    }

    /**
     * @return Returns the name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
