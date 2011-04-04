/**
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Site  extends com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset  implements java.io.Serializable {
    private java.lang.String url;

    private java.lang.String defaultMetadataSetId;

    private java.lang.String defaultMetadataSetPath;

    private java.lang.String cssFileId;

    private java.lang.String cssFilePath;

    private java.lang.Boolean cssFileRecycled;

    private java.lang.String siteAssetFactoryContainerId;

    private java.lang.String siteAssetFactoryContainerPath;

    private java.lang.String siteStartingPageId;

    private java.lang.String siteStartingPagePath;

    private java.lang.Boolean siteStartingPageRecycled;

    private java.lang.String cssClasses;

    private com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignments;

    private java.lang.Boolean usesScheduledPublishing;

    private org.apache.axis.types.Time timeToPublish;

    private org.apache.axis.types.NonNegativeInteger publishIntervalHours;

    private com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek;

    private java.lang.String cronExpression;

    private com.hannonhill.www.ws.ns.AssetOperationService.RecycleBinExpiration recycleBinExpiration;

    private java.lang.String rootFolderId;

    private java.lang.String rootAssetFactoryContainerId;

    private java.lang.String rootPageConfigurationSetContainerId;

    private java.lang.String rootContentTypeContainerId;

    private java.lang.String rootConnectorContainerId;

    private java.lang.String rootDataDefinitionContainerId;

    private java.lang.String rootMetadataSetContainerId;

    private java.lang.String rootPublishSetContainerId;

    private java.lang.String rootSiteDestinationContainerId;

    private java.lang.String rootTransportContainerId;

    private java.lang.String rootWorkflowDefinitionContainerId;

    public Site() {
    }

    public Site(
           java.lang.String id,
           java.lang.String name,
           java.lang.String url,
           java.lang.String defaultMetadataSetId,
           java.lang.String defaultMetadataSetPath,
           java.lang.String cssFileId,
           java.lang.String cssFilePath,
           java.lang.Boolean cssFileRecycled,
           java.lang.String siteAssetFactoryContainerId,
           java.lang.String siteAssetFactoryContainerPath,
           java.lang.String siteStartingPageId,
           java.lang.String siteStartingPagePath,
           java.lang.Boolean siteStartingPageRecycled,
           java.lang.String cssClasses,
           com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignments,
           java.lang.Boolean usesScheduledPublishing,
           org.apache.axis.types.Time timeToPublish,
           org.apache.axis.types.NonNegativeInteger publishIntervalHours,
           com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek,
           java.lang.String cronExpression,
           com.hannonhill.www.ws.ns.AssetOperationService.RecycleBinExpiration recycleBinExpiration,
           java.lang.String rootFolderId,
           java.lang.String rootAssetFactoryContainerId,
           java.lang.String rootPageConfigurationSetContainerId,
           java.lang.String rootContentTypeContainerId,
           java.lang.String rootConnectorContainerId,
           java.lang.String rootDataDefinitionContainerId,
           java.lang.String rootMetadataSetContainerId,
           java.lang.String rootPublishSetContainerId,
           java.lang.String rootSiteDestinationContainerId,
           java.lang.String rootTransportContainerId,
           java.lang.String rootWorkflowDefinitionContainerId) {
        super(
            id,
            name);
        this.url = url;
        this.defaultMetadataSetId = defaultMetadataSetId;
        this.defaultMetadataSetPath = defaultMetadataSetPath;
        this.cssFileId = cssFileId;
        this.cssFilePath = cssFilePath;
        this.cssFileRecycled = cssFileRecycled;
        this.siteAssetFactoryContainerId = siteAssetFactoryContainerId;
        this.siteAssetFactoryContainerPath = siteAssetFactoryContainerPath;
        this.siteStartingPageId = siteStartingPageId;
        this.siteStartingPagePath = siteStartingPagePath;
        this.siteStartingPageRecycled = siteStartingPageRecycled;
        this.cssClasses = cssClasses;
        this.roleAssignments = roleAssignments;
        this.usesScheduledPublishing = usesScheduledPublishing;
        this.timeToPublish = timeToPublish;
        this.publishIntervalHours = publishIntervalHours;
        this.publishDaysOfWeek = publishDaysOfWeek;
        this.cronExpression = cronExpression;
        this.recycleBinExpiration = recycleBinExpiration;
        this.rootFolderId = rootFolderId;
        this.rootAssetFactoryContainerId = rootAssetFactoryContainerId;
        this.rootPageConfigurationSetContainerId = rootPageConfigurationSetContainerId;
        this.rootContentTypeContainerId = rootContentTypeContainerId;
        this.rootConnectorContainerId = rootConnectorContainerId;
        this.rootDataDefinitionContainerId = rootDataDefinitionContainerId;
        this.rootMetadataSetContainerId = rootMetadataSetContainerId;
        this.rootPublishSetContainerId = rootPublishSetContainerId;
        this.rootSiteDestinationContainerId = rootSiteDestinationContainerId;
        this.rootTransportContainerId = rootTransportContainerId;
        this.rootWorkflowDefinitionContainerId = rootWorkflowDefinitionContainerId;
    }


    /**
     * Gets the url value for this Site.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Site.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the defaultMetadataSetId value for this Site.
     * 
     * @return defaultMetadataSetId
     */
    public java.lang.String getDefaultMetadataSetId() {
        return defaultMetadataSetId;
    }


    /**
     * Sets the defaultMetadataSetId value for this Site.
     * 
     * @param defaultMetadataSetId
     */
    public void setDefaultMetadataSetId(java.lang.String defaultMetadataSetId) {
        this.defaultMetadataSetId = defaultMetadataSetId;
    }


    /**
     * Gets the defaultMetadataSetPath value for this Site.
     * 
     * @return defaultMetadataSetPath
     */
    public java.lang.String getDefaultMetadataSetPath() {
        return defaultMetadataSetPath;
    }


    /**
     * Sets the defaultMetadataSetPath value for this Site.
     * 
     * @param defaultMetadataSetPath
     */
    public void setDefaultMetadataSetPath(java.lang.String defaultMetadataSetPath) {
        this.defaultMetadataSetPath = defaultMetadataSetPath;
    }


    /**
     * Gets the cssFileId value for this Site.
     * 
     * @return cssFileId
     */
    public java.lang.String getCssFileId() {
        return cssFileId;
    }


    /**
     * Sets the cssFileId value for this Site.
     * 
     * @param cssFileId
     */
    public void setCssFileId(java.lang.String cssFileId) {
        this.cssFileId = cssFileId;
    }


    /**
     * Gets the cssFilePath value for this Site.
     * 
     * @return cssFilePath
     */
    public java.lang.String getCssFilePath() {
        return cssFilePath;
    }


    /**
     * Sets the cssFilePath value for this Site.
     * 
     * @param cssFilePath
     */
    public void setCssFilePath(java.lang.String cssFilePath) {
        this.cssFilePath = cssFilePath;
    }


    /**
     * Gets the cssFileRecycled value for this Site.
     * 
     * @return cssFileRecycled
     */
    public java.lang.Boolean getCssFileRecycled() {
        return cssFileRecycled;
    }


    /**
     * Sets the cssFileRecycled value for this Site.
     * 
     * @param cssFileRecycled
     */
    public void setCssFileRecycled(java.lang.Boolean cssFileRecycled) {
        this.cssFileRecycled = cssFileRecycled;
    }


    /**
     * Gets the siteAssetFactoryContainerId value for this Site.
     * 
     * @return siteAssetFactoryContainerId
     */
    public java.lang.String getSiteAssetFactoryContainerId() {
        return siteAssetFactoryContainerId;
    }


    /**
     * Sets the siteAssetFactoryContainerId value for this Site.
     * 
     * @param siteAssetFactoryContainerId
     */
    public void setSiteAssetFactoryContainerId(java.lang.String siteAssetFactoryContainerId) {
        this.siteAssetFactoryContainerId = siteAssetFactoryContainerId;
    }


    /**
     * Gets the siteAssetFactoryContainerPath value for this Site.
     * 
     * @return siteAssetFactoryContainerPath
     */
    public java.lang.String getSiteAssetFactoryContainerPath() {
        return siteAssetFactoryContainerPath;
    }


    /**
     * Sets the siteAssetFactoryContainerPath value for this Site.
     * 
     * @param siteAssetFactoryContainerPath
     */
    public void setSiteAssetFactoryContainerPath(java.lang.String siteAssetFactoryContainerPath) {
        this.siteAssetFactoryContainerPath = siteAssetFactoryContainerPath;
    }


    /**
     * Gets the siteStartingPageId value for this Site.
     * 
     * @return siteStartingPageId
     */
    public java.lang.String getSiteStartingPageId() {
        return siteStartingPageId;
    }


    /**
     * Sets the siteStartingPageId value for this Site.
     * 
     * @param siteStartingPageId
     */
    public void setSiteStartingPageId(java.lang.String siteStartingPageId) {
        this.siteStartingPageId = siteStartingPageId;
    }


    /**
     * Gets the siteStartingPagePath value for this Site.
     * 
     * @return siteStartingPagePath
     */
    public java.lang.String getSiteStartingPagePath() {
        return siteStartingPagePath;
    }


    /**
     * Sets the siteStartingPagePath value for this Site.
     * 
     * @param siteStartingPagePath
     */
    public void setSiteStartingPagePath(java.lang.String siteStartingPagePath) {
        this.siteStartingPagePath = siteStartingPagePath;
    }


    /**
     * Gets the siteStartingPageRecycled value for this Site.
     * 
     * @return siteStartingPageRecycled
     */
    public java.lang.Boolean getSiteStartingPageRecycled() {
        return siteStartingPageRecycled;
    }


    /**
     * Sets the siteStartingPageRecycled value for this Site.
     * 
     * @param siteStartingPageRecycled
     */
    public void setSiteStartingPageRecycled(java.lang.Boolean siteStartingPageRecycled) {
        this.siteStartingPageRecycled = siteStartingPageRecycled;
    }


    /**
     * Gets the cssClasses value for this Site.
     * 
     * @return cssClasses
     */
    public java.lang.String getCssClasses() {
        return cssClasses;
    }


    /**
     * Sets the cssClasses value for this Site.
     * 
     * @param cssClasses
     */
    public void setCssClasses(java.lang.String cssClasses) {
        this.cssClasses = cssClasses;
    }


    /**
     * Gets the roleAssignments value for this Site.
     * 
     * @return roleAssignments
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] getRoleAssignments() {
        return roleAssignments;
    }


    /**
     * Sets the roleAssignments value for this Site.
     * 
     * @param roleAssignments
     */
    public void setRoleAssignments(com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignments) {
        this.roleAssignments = roleAssignments;
    }


    /**
     * Gets the usesScheduledPublishing value for this Site.
     * 
     * @return usesScheduledPublishing
     */
    public java.lang.Boolean getUsesScheduledPublishing() {
        return usesScheduledPublishing;
    }


    /**
     * Sets the usesScheduledPublishing value for this Site.
     * 
     * @param usesScheduledPublishing
     */
    public void setUsesScheduledPublishing(java.lang.Boolean usesScheduledPublishing) {
        this.usesScheduledPublishing = usesScheduledPublishing;
    }


    /**
     * Gets the timeToPublish value for this Site.
     * 
     * @return timeToPublish
     */
    public org.apache.axis.types.Time getTimeToPublish() {
        return timeToPublish;
    }


    /**
     * Sets the timeToPublish value for this Site.
     * 
     * @param timeToPublish
     */
    public void setTimeToPublish(org.apache.axis.types.Time timeToPublish) {
        this.timeToPublish = timeToPublish;
    }


    /**
     * Gets the publishIntervalHours value for this Site.
     * 
     * @return publishIntervalHours
     */
    public org.apache.axis.types.NonNegativeInteger getPublishIntervalHours() {
        return publishIntervalHours;
    }


    /**
     * Sets the publishIntervalHours value for this Site.
     * 
     * @param publishIntervalHours
     */
    public void setPublishIntervalHours(org.apache.axis.types.NonNegativeInteger publishIntervalHours) {
        this.publishIntervalHours = publishIntervalHours;
    }


    /**
     * Gets the publishDaysOfWeek value for this Site.
     * 
     * @return publishDaysOfWeek
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] getPublishDaysOfWeek() {
        return publishDaysOfWeek;
    }


    /**
     * Sets the publishDaysOfWeek value for this Site.
     * 
     * @param publishDaysOfWeek
     */
    public void setPublishDaysOfWeek(com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek) {
        this.publishDaysOfWeek = publishDaysOfWeek;
    }


    /**
     * Gets the cronExpression value for this Site.
     * 
     * @return cronExpression
     */
    public java.lang.String getCronExpression() {
        return cronExpression;
    }


    /**
     * Sets the cronExpression value for this Site.
     * 
     * @param cronExpression
     */
    public void setCronExpression(java.lang.String cronExpression) {
        this.cronExpression = cronExpression;
    }


    /**
     * Gets the recycleBinExpiration value for this Site.
     * 
     * @return recycleBinExpiration
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.RecycleBinExpiration getRecycleBinExpiration() {
        return recycleBinExpiration;
    }


    /**
     * Sets the recycleBinExpiration value for this Site.
     * 
     * @param recycleBinExpiration
     */
    public void setRecycleBinExpiration(com.hannonhill.www.ws.ns.AssetOperationService.RecycleBinExpiration recycleBinExpiration) {
        this.recycleBinExpiration = recycleBinExpiration;
    }


    /**
     * Gets the rootFolderId value for this Site.
     * 
     * @return rootFolderId
     */
    public java.lang.String getRootFolderId() {
        return rootFolderId;
    }


    /**
     * Sets the rootFolderId value for this Site.
     * 
     * @param rootFolderId
     */
    public void setRootFolderId(java.lang.String rootFolderId) {
        this.rootFolderId = rootFolderId;
    }


    /**
     * Gets the rootAssetFactoryContainerId value for this Site.
     * 
     * @return rootAssetFactoryContainerId
     */
    public java.lang.String getRootAssetFactoryContainerId() {
        return rootAssetFactoryContainerId;
    }


    /**
     * Sets the rootAssetFactoryContainerId value for this Site.
     * 
     * @param rootAssetFactoryContainerId
     */
    public void setRootAssetFactoryContainerId(java.lang.String rootAssetFactoryContainerId) {
        this.rootAssetFactoryContainerId = rootAssetFactoryContainerId;
    }


    /**
     * Gets the rootPageConfigurationSetContainerId value for this Site.
     * 
     * @return rootPageConfigurationSetContainerId
     */
    public java.lang.String getRootPageConfigurationSetContainerId() {
        return rootPageConfigurationSetContainerId;
    }


    /**
     * Sets the rootPageConfigurationSetContainerId value for this Site.
     * 
     * @param rootPageConfigurationSetContainerId
     */
    public void setRootPageConfigurationSetContainerId(java.lang.String rootPageConfigurationSetContainerId) {
        this.rootPageConfigurationSetContainerId = rootPageConfigurationSetContainerId;
    }


    /**
     * Gets the rootContentTypeContainerId value for this Site.
     * 
     * @return rootContentTypeContainerId
     */
    public java.lang.String getRootContentTypeContainerId() {
        return rootContentTypeContainerId;
    }


    /**
     * Sets the rootContentTypeContainerId value for this Site.
     * 
     * @param rootContentTypeContainerId
     */
    public void setRootContentTypeContainerId(java.lang.String rootContentTypeContainerId) {
        this.rootContentTypeContainerId = rootContentTypeContainerId;
    }


    /**
     * Gets the rootConnectorContainerId value for this Site.
     * 
     * @return rootConnectorContainerId
     */
    public java.lang.String getRootConnectorContainerId() {
        return rootConnectorContainerId;
    }


    /**
     * Sets the rootConnectorContainerId value for this Site.
     * 
     * @param rootConnectorContainerId
     */
    public void setRootConnectorContainerId(java.lang.String rootConnectorContainerId) {
        this.rootConnectorContainerId = rootConnectorContainerId;
    }


    /**
     * Gets the rootDataDefinitionContainerId value for this Site.
     * 
     * @return rootDataDefinitionContainerId
     */
    public java.lang.String getRootDataDefinitionContainerId() {
        return rootDataDefinitionContainerId;
    }


    /**
     * Sets the rootDataDefinitionContainerId value for this Site.
     * 
     * @param rootDataDefinitionContainerId
     */
    public void setRootDataDefinitionContainerId(java.lang.String rootDataDefinitionContainerId) {
        this.rootDataDefinitionContainerId = rootDataDefinitionContainerId;
    }


    /**
     * Gets the rootMetadataSetContainerId value for this Site.
     * 
     * @return rootMetadataSetContainerId
     */
    public java.lang.String getRootMetadataSetContainerId() {
        return rootMetadataSetContainerId;
    }


    /**
     * Sets the rootMetadataSetContainerId value for this Site.
     * 
     * @param rootMetadataSetContainerId
     */
    public void setRootMetadataSetContainerId(java.lang.String rootMetadataSetContainerId) {
        this.rootMetadataSetContainerId = rootMetadataSetContainerId;
    }


    /**
     * Gets the rootPublishSetContainerId value for this Site.
     * 
     * @return rootPublishSetContainerId
     */
    public java.lang.String getRootPublishSetContainerId() {
        return rootPublishSetContainerId;
    }


    /**
     * Sets the rootPublishSetContainerId value for this Site.
     * 
     * @param rootPublishSetContainerId
     */
    public void setRootPublishSetContainerId(java.lang.String rootPublishSetContainerId) {
        this.rootPublishSetContainerId = rootPublishSetContainerId;
    }


    /**
     * Gets the rootSiteDestinationContainerId value for this Site.
     * 
     * @return rootSiteDestinationContainerId
     */
    public java.lang.String getRootSiteDestinationContainerId() {
        return rootSiteDestinationContainerId;
    }


    /**
     * Sets the rootSiteDestinationContainerId value for this Site.
     * 
     * @param rootSiteDestinationContainerId
     */
    public void setRootSiteDestinationContainerId(java.lang.String rootSiteDestinationContainerId) {
        this.rootSiteDestinationContainerId = rootSiteDestinationContainerId;
    }


    /**
     * Gets the rootTransportContainerId value for this Site.
     * 
     * @return rootTransportContainerId
     */
    public java.lang.String getRootTransportContainerId() {
        return rootTransportContainerId;
    }


    /**
     * Sets the rootTransportContainerId value for this Site.
     * 
     * @param rootTransportContainerId
     */
    public void setRootTransportContainerId(java.lang.String rootTransportContainerId) {
        this.rootTransportContainerId = rootTransportContainerId;
    }


    /**
     * Gets the rootWorkflowDefinitionContainerId value for this Site.
     * 
     * @return rootWorkflowDefinitionContainerId
     */
    public java.lang.String getRootWorkflowDefinitionContainerId() {
        return rootWorkflowDefinitionContainerId;
    }


    /**
     * Sets the rootWorkflowDefinitionContainerId value for this Site.
     * 
     * @param rootWorkflowDefinitionContainerId
     */
    public void setRootWorkflowDefinitionContainerId(java.lang.String rootWorkflowDefinitionContainerId) {
        this.rootWorkflowDefinitionContainerId = rootWorkflowDefinitionContainerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.defaultMetadataSetId==null && other.getDefaultMetadataSetId()==null) || 
             (this.defaultMetadataSetId!=null &&
              this.defaultMetadataSetId.equals(other.getDefaultMetadataSetId()))) &&
            ((this.defaultMetadataSetPath==null && other.getDefaultMetadataSetPath()==null) || 
             (this.defaultMetadataSetPath!=null &&
              this.defaultMetadataSetPath.equals(other.getDefaultMetadataSetPath()))) &&
            ((this.cssFileId==null && other.getCssFileId()==null) || 
             (this.cssFileId!=null &&
              this.cssFileId.equals(other.getCssFileId()))) &&
            ((this.cssFilePath==null && other.getCssFilePath()==null) || 
             (this.cssFilePath!=null &&
              this.cssFilePath.equals(other.getCssFilePath()))) &&
            ((this.cssFileRecycled==null && other.getCssFileRecycled()==null) || 
             (this.cssFileRecycled!=null &&
              this.cssFileRecycled.equals(other.getCssFileRecycled()))) &&
            ((this.siteAssetFactoryContainerId==null && other.getSiteAssetFactoryContainerId()==null) || 
             (this.siteAssetFactoryContainerId!=null &&
              this.siteAssetFactoryContainerId.equals(other.getSiteAssetFactoryContainerId()))) &&
            ((this.siteAssetFactoryContainerPath==null && other.getSiteAssetFactoryContainerPath()==null) || 
             (this.siteAssetFactoryContainerPath!=null &&
              this.siteAssetFactoryContainerPath.equals(other.getSiteAssetFactoryContainerPath()))) &&
            ((this.siteStartingPageId==null && other.getSiteStartingPageId()==null) || 
             (this.siteStartingPageId!=null &&
              this.siteStartingPageId.equals(other.getSiteStartingPageId()))) &&
            ((this.siteStartingPagePath==null && other.getSiteStartingPagePath()==null) || 
             (this.siteStartingPagePath!=null &&
              this.siteStartingPagePath.equals(other.getSiteStartingPagePath()))) &&
            ((this.siteStartingPageRecycled==null && other.getSiteStartingPageRecycled()==null) || 
             (this.siteStartingPageRecycled!=null &&
              this.siteStartingPageRecycled.equals(other.getSiteStartingPageRecycled()))) &&
            ((this.cssClasses==null && other.getCssClasses()==null) || 
             (this.cssClasses!=null &&
              this.cssClasses.equals(other.getCssClasses()))) &&
            ((this.roleAssignments==null && other.getRoleAssignments()==null) || 
             (this.roleAssignments!=null &&
              java.util.Arrays.equals(this.roleAssignments, other.getRoleAssignments()))) &&
            ((this.usesScheduledPublishing==null && other.getUsesScheduledPublishing()==null) || 
             (this.usesScheduledPublishing!=null &&
              this.usesScheduledPublishing.equals(other.getUsesScheduledPublishing()))) &&
            ((this.timeToPublish==null && other.getTimeToPublish()==null) || 
             (this.timeToPublish!=null &&
              this.timeToPublish.equals(other.getTimeToPublish()))) &&
            ((this.publishIntervalHours==null && other.getPublishIntervalHours()==null) || 
             (this.publishIntervalHours!=null &&
              this.publishIntervalHours.equals(other.getPublishIntervalHours()))) &&
            ((this.publishDaysOfWeek==null && other.getPublishDaysOfWeek()==null) || 
             (this.publishDaysOfWeek!=null &&
              java.util.Arrays.equals(this.publishDaysOfWeek, other.getPublishDaysOfWeek()))) &&
            ((this.cronExpression==null && other.getCronExpression()==null) || 
             (this.cronExpression!=null &&
              this.cronExpression.equals(other.getCronExpression()))) &&
            ((this.recycleBinExpiration==null && other.getRecycleBinExpiration()==null) || 
             (this.recycleBinExpiration!=null &&
              this.recycleBinExpiration.equals(other.getRecycleBinExpiration()))) &&
            ((this.rootFolderId==null && other.getRootFolderId()==null) || 
             (this.rootFolderId!=null &&
              this.rootFolderId.equals(other.getRootFolderId()))) &&
            ((this.rootAssetFactoryContainerId==null && other.getRootAssetFactoryContainerId()==null) || 
             (this.rootAssetFactoryContainerId!=null &&
              this.rootAssetFactoryContainerId.equals(other.getRootAssetFactoryContainerId()))) &&
            ((this.rootPageConfigurationSetContainerId==null && other.getRootPageConfigurationSetContainerId()==null) || 
             (this.rootPageConfigurationSetContainerId!=null &&
              this.rootPageConfigurationSetContainerId.equals(other.getRootPageConfigurationSetContainerId()))) &&
            ((this.rootContentTypeContainerId==null && other.getRootContentTypeContainerId()==null) || 
             (this.rootContentTypeContainerId!=null &&
              this.rootContentTypeContainerId.equals(other.getRootContentTypeContainerId()))) &&
            ((this.rootConnectorContainerId==null && other.getRootConnectorContainerId()==null) || 
             (this.rootConnectorContainerId!=null &&
              this.rootConnectorContainerId.equals(other.getRootConnectorContainerId()))) &&
            ((this.rootDataDefinitionContainerId==null && other.getRootDataDefinitionContainerId()==null) || 
             (this.rootDataDefinitionContainerId!=null &&
              this.rootDataDefinitionContainerId.equals(other.getRootDataDefinitionContainerId()))) &&
            ((this.rootMetadataSetContainerId==null && other.getRootMetadataSetContainerId()==null) || 
             (this.rootMetadataSetContainerId!=null &&
              this.rootMetadataSetContainerId.equals(other.getRootMetadataSetContainerId()))) &&
            ((this.rootPublishSetContainerId==null && other.getRootPublishSetContainerId()==null) || 
             (this.rootPublishSetContainerId!=null &&
              this.rootPublishSetContainerId.equals(other.getRootPublishSetContainerId()))) &&
            ((this.rootSiteDestinationContainerId==null && other.getRootSiteDestinationContainerId()==null) || 
             (this.rootSiteDestinationContainerId!=null &&
              this.rootSiteDestinationContainerId.equals(other.getRootSiteDestinationContainerId()))) &&
            ((this.rootTransportContainerId==null && other.getRootTransportContainerId()==null) || 
             (this.rootTransportContainerId!=null &&
              this.rootTransportContainerId.equals(other.getRootTransportContainerId()))) &&
            ((this.rootWorkflowDefinitionContainerId==null && other.getRootWorkflowDefinitionContainerId()==null) || 
             (this.rootWorkflowDefinitionContainerId!=null &&
              this.rootWorkflowDefinitionContainerId.equals(other.getRootWorkflowDefinitionContainerId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDefaultMetadataSetId() != null) {
            _hashCode += getDefaultMetadataSetId().hashCode();
        }
        if (getDefaultMetadataSetPath() != null) {
            _hashCode += getDefaultMetadataSetPath().hashCode();
        }
        if (getCssFileId() != null) {
            _hashCode += getCssFileId().hashCode();
        }
        if (getCssFilePath() != null) {
            _hashCode += getCssFilePath().hashCode();
        }
        if (getCssFileRecycled() != null) {
            _hashCode += getCssFileRecycled().hashCode();
        }
        if (getSiteAssetFactoryContainerId() != null) {
            _hashCode += getSiteAssetFactoryContainerId().hashCode();
        }
        if (getSiteAssetFactoryContainerPath() != null) {
            _hashCode += getSiteAssetFactoryContainerPath().hashCode();
        }
        if (getSiteStartingPageId() != null) {
            _hashCode += getSiteStartingPageId().hashCode();
        }
        if (getSiteStartingPagePath() != null) {
            _hashCode += getSiteStartingPagePath().hashCode();
        }
        if (getSiteStartingPageRecycled() != null) {
            _hashCode += getSiteStartingPageRecycled().hashCode();
        }
        if (getCssClasses() != null) {
            _hashCode += getCssClasses().hashCode();
        }
        if (getRoleAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsesScheduledPublishing() != null) {
            _hashCode += getUsesScheduledPublishing().hashCode();
        }
        if (getTimeToPublish() != null) {
            _hashCode += getTimeToPublish().hashCode();
        }
        if (getPublishIntervalHours() != null) {
            _hashCode += getPublishIntervalHours().hashCode();
        }
        if (getPublishDaysOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishDaysOfWeek());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishDaysOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCronExpression() != null) {
            _hashCode += getCronExpression().hashCode();
        }
        if (getRecycleBinExpiration() != null) {
            _hashCode += getRecycleBinExpiration().hashCode();
        }
        if (getRootFolderId() != null) {
            _hashCode += getRootFolderId().hashCode();
        }
        if (getRootAssetFactoryContainerId() != null) {
            _hashCode += getRootAssetFactoryContainerId().hashCode();
        }
        if (getRootPageConfigurationSetContainerId() != null) {
            _hashCode += getRootPageConfigurationSetContainerId().hashCode();
        }
        if (getRootContentTypeContainerId() != null) {
            _hashCode += getRootContentTypeContainerId().hashCode();
        }
        if (getRootConnectorContainerId() != null) {
            _hashCode += getRootConnectorContainerId().hashCode();
        }
        if (getRootDataDefinitionContainerId() != null) {
            _hashCode += getRootDataDefinitionContainerId().hashCode();
        }
        if (getRootMetadataSetContainerId() != null) {
            _hashCode += getRootMetadataSetContainerId().hashCode();
        }
        if (getRootPublishSetContainerId() != null) {
            _hashCode += getRootPublishSetContainerId().hashCode();
        }
        if (getRootSiteDestinationContainerId() != null) {
            _hashCode += getRootSiteDestinationContainerId().hashCode();
        }
        if (getRootTransportContainerId() != null) {
            _hashCode += getRootTransportContainerId().hashCode();
        }
        if (getRootWorkflowDefinitionContainerId() != null) {
            _hashCode += getRootWorkflowDefinitionContainerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMetadataSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "defaultMetadataSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMetadataSetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "defaultMetadataSetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAssetFactoryContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteAssetFactoryContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAssetFactoryContainerPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteAssetFactoryContainerPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteStartingPageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteStartingPageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteStartingPagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteStartingPagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteStartingPageRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteStartingPageRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "roleAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "roleAssignment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesScheduledPublishing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "usesScheduledPublishing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToPublish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "timeToPublish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishIntervalHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishIntervalHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishDaysOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishDaysOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cronExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cronExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleBinExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinExpiration"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAssetFactoryContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootAssetFactoryContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootPageConfigurationSetContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootPageConfigurationSetContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootContentTypeContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootContentTypeContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootConnectorContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootConnectorContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootDataDefinitionContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootDataDefinitionContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootMetadataSetContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootMetadataSetContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootPublishSetContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootPublishSetContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootSiteDestinationContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootSiteDestinationContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootTransportContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootTransportContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootWorkflowDefinitionContainerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rootWorkflowDefinitionContainerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
