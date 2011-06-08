/*
 * Created on Dec 3, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * An object containing detailed information about the XML page useful for migration of the page into Cascade
 * Server.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class DetailedXmlPageInformation
{
    private String deployPath;
    private String assetType;
    private final Map<String, String> metadataMap = new HashMap<String, String>();
    private final Map<String, String> contentMap = new HashMap<String, String>();
    private final Set<LuminisLink> luminisLinks = new HashSet<LuminisLink>();

    /**
     * @return Returns the deployPath.
     */
    public String getDeployPath()
    {
        return deployPath;
    }

    /**
     * @param deployPath the deployPath to set
     */
    public void setDeployPath(String deployPath)
    {
        this.deployPath = deployPath;
    }

    /**
     * @return Returns the assetType.
     */
    public String getAssetType()
    {
        return assetType;
    }

    /**
     * @param assetType the assetType to set
     */
    public void setAssetType(String assetType)
    {
        this.assetType = assetType;
    }

    /**
     * @return Returns the metadataMap.
     */
    public Map<String, String> getMetadataMap()
    {
        return metadataMap;
    }

    /**
     * @return Returns the contentMap.
     */
    public Map<String, String> getContentMap()
    {
        return contentMap;
    }

    /**
     * @return Returns the luminisLinks.
     */
    public Set<LuminisLink> getLuminisLinks()
    {
        return luminisLinks;
    }

}
