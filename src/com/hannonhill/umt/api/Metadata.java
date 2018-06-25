/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class Metadata
{
    private List<DynamicMetadataField> dynamicFields;

    /**
     * @return Returns the dynamicFields.
     */
    public List<DynamicMetadataField> getDynamicFields()
    {
        return dynamicFields;
    }

    /**
     * @param dynamicFields the dynamicFields to set
     */
    public void setDynamicFields(List<DynamicMetadataField> dynamicFields)
    {
        this.dynamicFields = dynamicFields;
    }
}
