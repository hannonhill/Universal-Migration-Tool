/*
 * Created on Jun 25, 2018 by tomusiaka
 * 
 * Copyright(c) 2000-2010 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.umt.api;

import java.util.List;

public class Metadata
{
    private String author;
    private String displayName;
    private String keywords;
    private String metaDescription;
    private String summary;
    private String teaser;
    private String title;
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

    /**
     * @return Returns the author.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    /**
     * @return Returns the displayName.
     */
    public String getDisplayName()
    {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    /**
     * @return Returns the keywords.
     */
    public String getKeywords()
    {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords)
    {
        this.keywords = keywords;
    }

    /**
     * @return Returns the metaDescription.
     */
    public String getMetaDescription()
    {
        return metaDescription;
    }

    /**
     * @param metaDescription the metaDescription to set
     */
    public void setMetaDescription(String metaDescription)
    {
        this.metaDescription = metaDescription;
    }

    /**
     * @return Returns the summary.
     */
    public String getSummary()
    {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    /**
     * @return Returns the teaser.
     */
    public String getTeaser()
    {
        return teaser;
    }

    /**
     * @param teaser the teaser to set
     */
    public void setTeaser(String teaser)
    {
        this.teaser = teaser;
    }

    /**
     * @return Returns the title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
}
