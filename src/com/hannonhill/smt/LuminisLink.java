/*
 * Created on Jun 8, 2011 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2011 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt;

/**
 * An object holding information about a link found in Luminis linkFile.xml file's &lt;linked_item&gt; tag.
 * 
 * @author Artur Tomusiak
 * @since 1.1
 */
public class LuminisLink
{
    private final String id;
    private final String linkedItemFolder;
    private final String linkedItemName;

    public LuminisLink(String id, String linkedItemFolder, String linkedItemName)
    {
        this.id = id;
        this.linkedItemFolder = linkedItemFolder;
        this.linkedItemName = linkedItemName;
    }

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return Returns the linkedItemFolder.
     */
    public String getLinkedItemFolder()
    {
        return linkedItemFolder;
    }

    /**
     * @return Returns the linkedItemName.
     */
    public String getLinkedItemName()
    {
        return linkedItemName;
    }

}
