/**
 * MetadataSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class MetadataSet  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.Boolean authorFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility authorFieldVisibility;

    private java.lang.String authorFieldHelpText;

    private java.lang.Boolean descriptionFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility descriptionFieldVisibility;

    private java.lang.String descriptionFieldHelpText;

    private java.lang.Boolean displayNameFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility displayNameFieldVisibility;

    private java.lang.String displayNameFieldHelpText;

    private java.lang.Boolean endDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility endDateFieldVisibility;

    private java.lang.String endDateFieldHelpText;

    private java.lang.Boolean expirationFolderFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility expirationFolderFieldVisibility;

    private java.lang.String expirationFolderFieldHelpText;

    private java.lang.Boolean keywordsFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility keywordsFieldVisibility;

    private java.lang.String keywordsFieldHelpText;

    private java.lang.Boolean reviewDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility reviewDateFieldVisibility;

    private java.lang.String reviewDateFieldHelpText;

    private java.lang.Boolean startDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility startDateFieldVisibility;

    private java.lang.String startDateFieldHelpText;

    private java.lang.Boolean summaryFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility summaryFieldVisibility;

    private java.lang.String summaryFieldHelpText;

    private java.lang.Boolean teaserFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility teaserFieldVisibility;

    private java.lang.String teaserFieldHelpText;

    private java.lang.Boolean titleFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility titleFieldVisibility;

    private java.lang.String titleFieldHelpText;

    private com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinitions;

    public MetadataSet() {
    }

    public MetadataSet(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.Boolean authorFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility authorFieldVisibility,
           java.lang.String authorFieldHelpText,
           java.lang.Boolean descriptionFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility descriptionFieldVisibility,
           java.lang.String descriptionFieldHelpText,
           java.lang.Boolean displayNameFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility displayNameFieldVisibility,
           java.lang.String displayNameFieldHelpText,
           java.lang.Boolean endDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility endDateFieldVisibility,
           java.lang.String endDateFieldHelpText,
           java.lang.Boolean expirationFolderFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility expirationFolderFieldVisibility,
           java.lang.String expirationFolderFieldHelpText,
           java.lang.Boolean keywordsFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility keywordsFieldVisibility,
           java.lang.String keywordsFieldHelpText,
           java.lang.Boolean reviewDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility reviewDateFieldVisibility,
           java.lang.String reviewDateFieldHelpText,
           java.lang.Boolean startDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility startDateFieldVisibility,
           java.lang.String startDateFieldHelpText,
           java.lang.Boolean summaryFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility summaryFieldVisibility,
           java.lang.String summaryFieldHelpText,
           java.lang.Boolean teaserFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility teaserFieldVisibility,
           java.lang.String teaserFieldHelpText,
           java.lang.Boolean titleFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility titleFieldVisibility,
           java.lang.String titleFieldHelpText,
           com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinitions) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.authorFieldRequired = authorFieldRequired;
        this.authorFieldVisibility = authorFieldVisibility;
        this.authorFieldHelpText = authorFieldHelpText;
        this.descriptionFieldRequired = descriptionFieldRequired;
        this.descriptionFieldVisibility = descriptionFieldVisibility;
        this.descriptionFieldHelpText = descriptionFieldHelpText;
        this.displayNameFieldRequired = displayNameFieldRequired;
        this.displayNameFieldVisibility = displayNameFieldVisibility;
        this.displayNameFieldHelpText = displayNameFieldHelpText;
        this.endDateFieldRequired = endDateFieldRequired;
        this.endDateFieldVisibility = endDateFieldVisibility;
        this.endDateFieldHelpText = endDateFieldHelpText;
        this.expirationFolderFieldRequired = expirationFolderFieldRequired;
        this.expirationFolderFieldVisibility = expirationFolderFieldVisibility;
        this.expirationFolderFieldHelpText = expirationFolderFieldHelpText;
        this.keywordsFieldRequired = keywordsFieldRequired;
        this.keywordsFieldVisibility = keywordsFieldVisibility;
        this.keywordsFieldHelpText = keywordsFieldHelpText;
        this.reviewDateFieldRequired = reviewDateFieldRequired;
        this.reviewDateFieldVisibility = reviewDateFieldVisibility;
        this.reviewDateFieldHelpText = reviewDateFieldHelpText;
        this.startDateFieldRequired = startDateFieldRequired;
        this.startDateFieldVisibility = startDateFieldVisibility;
        this.startDateFieldHelpText = startDateFieldHelpText;
        this.summaryFieldRequired = summaryFieldRequired;
        this.summaryFieldVisibility = summaryFieldVisibility;
        this.summaryFieldHelpText = summaryFieldHelpText;
        this.teaserFieldRequired = teaserFieldRequired;
        this.teaserFieldVisibility = teaserFieldVisibility;
        this.teaserFieldHelpText = teaserFieldHelpText;
        this.titleFieldRequired = titleFieldRequired;
        this.titleFieldVisibility = titleFieldVisibility;
        this.titleFieldHelpText = titleFieldHelpText;
        this.dynamicMetadataFieldDefinitions = dynamicMetadataFieldDefinitions;
    }


    /**
     * Gets the authorFieldRequired value for this MetadataSet.
     * 
     * @return authorFieldRequired
     */
    public java.lang.Boolean getAuthorFieldRequired() {
        return authorFieldRequired;
    }


    /**
     * Sets the authorFieldRequired value for this MetadataSet.
     * 
     * @param authorFieldRequired
     */
    public void setAuthorFieldRequired(java.lang.Boolean authorFieldRequired) {
        this.authorFieldRequired = authorFieldRequired;
    }


    /**
     * Gets the authorFieldVisibility value for this MetadataSet.
     * 
     * @return authorFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getAuthorFieldVisibility() {
        return authorFieldVisibility;
    }


    /**
     * Sets the authorFieldVisibility value for this MetadataSet.
     * 
     * @param authorFieldVisibility
     */
    public void setAuthorFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility authorFieldVisibility) {
        this.authorFieldVisibility = authorFieldVisibility;
    }


    /**
     * Gets the authorFieldHelpText value for this MetadataSet.
     * 
     * @return authorFieldHelpText
     */
    public java.lang.String getAuthorFieldHelpText() {
        return authorFieldHelpText;
    }


    /**
     * Sets the authorFieldHelpText value for this MetadataSet.
     * 
     * @param authorFieldHelpText
     */
    public void setAuthorFieldHelpText(java.lang.String authorFieldHelpText) {
        this.authorFieldHelpText = authorFieldHelpText;
    }


    /**
     * Gets the descriptionFieldRequired value for this MetadataSet.
     * 
     * @return descriptionFieldRequired
     */
    public java.lang.Boolean getDescriptionFieldRequired() {
        return descriptionFieldRequired;
    }


    /**
     * Sets the descriptionFieldRequired value for this MetadataSet.
     * 
     * @param descriptionFieldRequired
     */
    public void setDescriptionFieldRequired(java.lang.Boolean descriptionFieldRequired) {
        this.descriptionFieldRequired = descriptionFieldRequired;
    }


    /**
     * Gets the descriptionFieldVisibility value for this MetadataSet.
     * 
     * @return descriptionFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getDescriptionFieldVisibility() {
        return descriptionFieldVisibility;
    }


    /**
     * Sets the descriptionFieldVisibility value for this MetadataSet.
     * 
     * @param descriptionFieldVisibility
     */
    public void setDescriptionFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility descriptionFieldVisibility) {
        this.descriptionFieldVisibility = descriptionFieldVisibility;
    }


    /**
     * Gets the descriptionFieldHelpText value for this MetadataSet.
     * 
     * @return descriptionFieldHelpText
     */
    public java.lang.String getDescriptionFieldHelpText() {
        return descriptionFieldHelpText;
    }


    /**
     * Sets the descriptionFieldHelpText value for this MetadataSet.
     * 
     * @param descriptionFieldHelpText
     */
    public void setDescriptionFieldHelpText(java.lang.String descriptionFieldHelpText) {
        this.descriptionFieldHelpText = descriptionFieldHelpText;
    }


    /**
     * Gets the displayNameFieldRequired value for this MetadataSet.
     * 
     * @return displayNameFieldRequired
     */
    public java.lang.Boolean getDisplayNameFieldRequired() {
        return displayNameFieldRequired;
    }


    /**
     * Sets the displayNameFieldRequired value for this MetadataSet.
     * 
     * @param displayNameFieldRequired
     */
    public void setDisplayNameFieldRequired(java.lang.Boolean displayNameFieldRequired) {
        this.displayNameFieldRequired = displayNameFieldRequired;
    }


    /**
     * Gets the displayNameFieldVisibility value for this MetadataSet.
     * 
     * @return displayNameFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getDisplayNameFieldVisibility() {
        return displayNameFieldVisibility;
    }


    /**
     * Sets the displayNameFieldVisibility value for this MetadataSet.
     * 
     * @param displayNameFieldVisibility
     */
    public void setDisplayNameFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility displayNameFieldVisibility) {
        this.displayNameFieldVisibility = displayNameFieldVisibility;
    }


    /**
     * Gets the displayNameFieldHelpText value for this MetadataSet.
     * 
     * @return displayNameFieldHelpText
     */
    public java.lang.String getDisplayNameFieldHelpText() {
        return displayNameFieldHelpText;
    }


    /**
     * Sets the displayNameFieldHelpText value for this MetadataSet.
     * 
     * @param displayNameFieldHelpText
     */
    public void setDisplayNameFieldHelpText(java.lang.String displayNameFieldHelpText) {
        this.displayNameFieldHelpText = displayNameFieldHelpText;
    }


    /**
     * Gets the endDateFieldRequired value for this MetadataSet.
     * 
     * @return endDateFieldRequired
     */
    public java.lang.Boolean getEndDateFieldRequired() {
        return endDateFieldRequired;
    }


    /**
     * Sets the endDateFieldRequired value for this MetadataSet.
     * 
     * @param endDateFieldRequired
     */
    public void setEndDateFieldRequired(java.lang.Boolean endDateFieldRequired) {
        this.endDateFieldRequired = endDateFieldRequired;
    }


    /**
     * Gets the endDateFieldVisibility value for this MetadataSet.
     * 
     * @return endDateFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getEndDateFieldVisibility() {
        return endDateFieldVisibility;
    }


    /**
     * Sets the endDateFieldVisibility value for this MetadataSet.
     * 
     * @param endDateFieldVisibility
     */
    public void setEndDateFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility endDateFieldVisibility) {
        this.endDateFieldVisibility = endDateFieldVisibility;
    }


    /**
     * Gets the endDateFieldHelpText value for this MetadataSet.
     * 
     * @return endDateFieldHelpText
     */
    public java.lang.String getEndDateFieldHelpText() {
        return endDateFieldHelpText;
    }


    /**
     * Sets the endDateFieldHelpText value for this MetadataSet.
     * 
     * @param endDateFieldHelpText
     */
    public void setEndDateFieldHelpText(java.lang.String endDateFieldHelpText) {
        this.endDateFieldHelpText = endDateFieldHelpText;
    }


    /**
     * Gets the expirationFolderFieldRequired value for this MetadataSet.
     * 
     * @return expirationFolderFieldRequired
     */
    public java.lang.Boolean getExpirationFolderFieldRequired() {
        return expirationFolderFieldRequired;
    }


    /**
     * Sets the expirationFolderFieldRequired value for this MetadataSet.
     * 
     * @param expirationFolderFieldRequired
     */
    public void setExpirationFolderFieldRequired(java.lang.Boolean expirationFolderFieldRequired) {
        this.expirationFolderFieldRequired = expirationFolderFieldRequired;
    }


    /**
     * Gets the expirationFolderFieldVisibility value for this MetadataSet.
     * 
     * @return expirationFolderFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getExpirationFolderFieldVisibility() {
        return expirationFolderFieldVisibility;
    }


    /**
     * Sets the expirationFolderFieldVisibility value for this MetadataSet.
     * 
     * @param expirationFolderFieldVisibility
     */
    public void setExpirationFolderFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility expirationFolderFieldVisibility) {
        this.expirationFolderFieldVisibility = expirationFolderFieldVisibility;
    }


    /**
     * Gets the expirationFolderFieldHelpText value for this MetadataSet.
     * 
     * @return expirationFolderFieldHelpText
     */
    public java.lang.String getExpirationFolderFieldHelpText() {
        return expirationFolderFieldHelpText;
    }


    /**
     * Sets the expirationFolderFieldHelpText value for this MetadataSet.
     * 
     * @param expirationFolderFieldHelpText
     */
    public void setExpirationFolderFieldHelpText(java.lang.String expirationFolderFieldHelpText) {
        this.expirationFolderFieldHelpText = expirationFolderFieldHelpText;
    }


    /**
     * Gets the keywordsFieldRequired value for this MetadataSet.
     * 
     * @return keywordsFieldRequired
     */
    public java.lang.Boolean getKeywordsFieldRequired() {
        return keywordsFieldRequired;
    }


    /**
     * Sets the keywordsFieldRequired value for this MetadataSet.
     * 
     * @param keywordsFieldRequired
     */
    public void setKeywordsFieldRequired(java.lang.Boolean keywordsFieldRequired) {
        this.keywordsFieldRequired = keywordsFieldRequired;
    }


    /**
     * Gets the keywordsFieldVisibility value for this MetadataSet.
     * 
     * @return keywordsFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getKeywordsFieldVisibility() {
        return keywordsFieldVisibility;
    }


    /**
     * Sets the keywordsFieldVisibility value for this MetadataSet.
     * 
     * @param keywordsFieldVisibility
     */
    public void setKeywordsFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility keywordsFieldVisibility) {
        this.keywordsFieldVisibility = keywordsFieldVisibility;
    }


    /**
     * Gets the keywordsFieldHelpText value for this MetadataSet.
     * 
     * @return keywordsFieldHelpText
     */
    public java.lang.String getKeywordsFieldHelpText() {
        return keywordsFieldHelpText;
    }


    /**
     * Sets the keywordsFieldHelpText value for this MetadataSet.
     * 
     * @param keywordsFieldHelpText
     */
    public void setKeywordsFieldHelpText(java.lang.String keywordsFieldHelpText) {
        this.keywordsFieldHelpText = keywordsFieldHelpText;
    }


    /**
     * Gets the reviewDateFieldRequired value for this MetadataSet.
     * 
     * @return reviewDateFieldRequired
     */
    public java.lang.Boolean getReviewDateFieldRequired() {
        return reviewDateFieldRequired;
    }


    /**
     * Sets the reviewDateFieldRequired value for this MetadataSet.
     * 
     * @param reviewDateFieldRequired
     */
    public void setReviewDateFieldRequired(java.lang.Boolean reviewDateFieldRequired) {
        this.reviewDateFieldRequired = reviewDateFieldRequired;
    }


    /**
     * Gets the reviewDateFieldVisibility value for this MetadataSet.
     * 
     * @return reviewDateFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getReviewDateFieldVisibility() {
        return reviewDateFieldVisibility;
    }


    /**
     * Sets the reviewDateFieldVisibility value for this MetadataSet.
     * 
     * @param reviewDateFieldVisibility
     */
    public void setReviewDateFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility reviewDateFieldVisibility) {
        this.reviewDateFieldVisibility = reviewDateFieldVisibility;
    }


    /**
     * Gets the reviewDateFieldHelpText value for this MetadataSet.
     * 
     * @return reviewDateFieldHelpText
     */
    public java.lang.String getReviewDateFieldHelpText() {
        return reviewDateFieldHelpText;
    }


    /**
     * Sets the reviewDateFieldHelpText value for this MetadataSet.
     * 
     * @param reviewDateFieldHelpText
     */
    public void setReviewDateFieldHelpText(java.lang.String reviewDateFieldHelpText) {
        this.reviewDateFieldHelpText = reviewDateFieldHelpText;
    }


    /**
     * Gets the startDateFieldRequired value for this MetadataSet.
     * 
     * @return startDateFieldRequired
     */
    public java.lang.Boolean getStartDateFieldRequired() {
        return startDateFieldRequired;
    }


    /**
     * Sets the startDateFieldRequired value for this MetadataSet.
     * 
     * @param startDateFieldRequired
     */
    public void setStartDateFieldRequired(java.lang.Boolean startDateFieldRequired) {
        this.startDateFieldRequired = startDateFieldRequired;
    }


    /**
     * Gets the startDateFieldVisibility value for this MetadataSet.
     * 
     * @return startDateFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getStartDateFieldVisibility() {
        return startDateFieldVisibility;
    }


    /**
     * Sets the startDateFieldVisibility value for this MetadataSet.
     * 
     * @param startDateFieldVisibility
     */
    public void setStartDateFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility startDateFieldVisibility) {
        this.startDateFieldVisibility = startDateFieldVisibility;
    }


    /**
     * Gets the startDateFieldHelpText value for this MetadataSet.
     * 
     * @return startDateFieldHelpText
     */
    public java.lang.String getStartDateFieldHelpText() {
        return startDateFieldHelpText;
    }


    /**
     * Sets the startDateFieldHelpText value for this MetadataSet.
     * 
     * @param startDateFieldHelpText
     */
    public void setStartDateFieldHelpText(java.lang.String startDateFieldHelpText) {
        this.startDateFieldHelpText = startDateFieldHelpText;
    }


    /**
     * Gets the summaryFieldRequired value for this MetadataSet.
     * 
     * @return summaryFieldRequired
     */
    public java.lang.Boolean getSummaryFieldRequired() {
        return summaryFieldRequired;
    }


    /**
     * Sets the summaryFieldRequired value for this MetadataSet.
     * 
     * @param summaryFieldRequired
     */
    public void setSummaryFieldRequired(java.lang.Boolean summaryFieldRequired) {
        this.summaryFieldRequired = summaryFieldRequired;
    }


    /**
     * Gets the summaryFieldVisibility value for this MetadataSet.
     * 
     * @return summaryFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getSummaryFieldVisibility() {
        return summaryFieldVisibility;
    }


    /**
     * Sets the summaryFieldVisibility value for this MetadataSet.
     * 
     * @param summaryFieldVisibility
     */
    public void setSummaryFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility summaryFieldVisibility) {
        this.summaryFieldVisibility = summaryFieldVisibility;
    }


    /**
     * Gets the summaryFieldHelpText value for this MetadataSet.
     * 
     * @return summaryFieldHelpText
     */
    public java.lang.String getSummaryFieldHelpText() {
        return summaryFieldHelpText;
    }


    /**
     * Sets the summaryFieldHelpText value for this MetadataSet.
     * 
     * @param summaryFieldHelpText
     */
    public void setSummaryFieldHelpText(java.lang.String summaryFieldHelpText) {
        this.summaryFieldHelpText = summaryFieldHelpText;
    }


    /**
     * Gets the teaserFieldRequired value for this MetadataSet.
     * 
     * @return teaserFieldRequired
     */
    public java.lang.Boolean getTeaserFieldRequired() {
        return teaserFieldRequired;
    }


    /**
     * Sets the teaserFieldRequired value for this MetadataSet.
     * 
     * @param teaserFieldRequired
     */
    public void setTeaserFieldRequired(java.lang.Boolean teaserFieldRequired) {
        this.teaserFieldRequired = teaserFieldRequired;
    }


    /**
     * Gets the teaserFieldVisibility value for this MetadataSet.
     * 
     * @return teaserFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getTeaserFieldVisibility() {
        return teaserFieldVisibility;
    }


    /**
     * Sets the teaserFieldVisibility value for this MetadataSet.
     * 
     * @param teaserFieldVisibility
     */
    public void setTeaserFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility teaserFieldVisibility) {
        this.teaserFieldVisibility = teaserFieldVisibility;
    }


    /**
     * Gets the teaserFieldHelpText value for this MetadataSet.
     * 
     * @return teaserFieldHelpText
     */
    public java.lang.String getTeaserFieldHelpText() {
        return teaserFieldHelpText;
    }


    /**
     * Sets the teaserFieldHelpText value for this MetadataSet.
     * 
     * @param teaserFieldHelpText
     */
    public void setTeaserFieldHelpText(java.lang.String teaserFieldHelpText) {
        this.teaserFieldHelpText = teaserFieldHelpText;
    }


    /**
     * Gets the titleFieldRequired value for this MetadataSet.
     * 
     * @return titleFieldRequired
     */
    public java.lang.Boolean getTitleFieldRequired() {
        return titleFieldRequired;
    }


    /**
     * Sets the titleFieldRequired value for this MetadataSet.
     * 
     * @param titleFieldRequired
     */
    public void setTitleFieldRequired(java.lang.Boolean titleFieldRequired) {
        this.titleFieldRequired = titleFieldRequired;
    }


    /**
     * Gets the titleFieldVisibility value for this MetadataSet.
     * 
     * @return titleFieldVisibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getTitleFieldVisibility() {
        return titleFieldVisibility;
    }


    /**
     * Sets the titleFieldVisibility value for this MetadataSet.
     * 
     * @param titleFieldVisibility
     */
    public void setTitleFieldVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility titleFieldVisibility) {
        this.titleFieldVisibility = titleFieldVisibility;
    }


    /**
     * Gets the titleFieldHelpText value for this MetadataSet.
     * 
     * @return titleFieldHelpText
     */
    public java.lang.String getTitleFieldHelpText() {
        return titleFieldHelpText;
    }


    /**
     * Sets the titleFieldHelpText value for this MetadataSet.
     * 
     * @param titleFieldHelpText
     */
    public void setTitleFieldHelpText(java.lang.String titleFieldHelpText) {
        this.titleFieldHelpText = titleFieldHelpText;
    }


    /**
     * Gets the dynamicMetadataFieldDefinitions value for this MetadataSet.
     * 
     * @return dynamicMetadataFieldDefinitions
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] getDynamicMetadataFieldDefinitions() {
        return dynamicMetadataFieldDefinitions;
    }


    /**
     * Sets the dynamicMetadataFieldDefinitions value for this MetadataSet.
     * 
     * @param dynamicMetadataFieldDefinitions
     */
    public void setDynamicMetadataFieldDefinitions(com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[] dynamicMetadataFieldDefinitions) {
        this.dynamicMetadataFieldDefinitions = dynamicMetadataFieldDefinitions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetadataSet)) return false;
        MetadataSet other = (MetadataSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorFieldRequired==null && other.getAuthorFieldRequired()==null) || 
             (this.authorFieldRequired!=null &&
              this.authorFieldRequired.equals(other.getAuthorFieldRequired()))) &&
            ((this.authorFieldVisibility==null && other.getAuthorFieldVisibility()==null) || 
             (this.authorFieldVisibility!=null &&
              this.authorFieldVisibility.equals(other.getAuthorFieldVisibility()))) &&
            ((this.authorFieldHelpText==null && other.getAuthorFieldHelpText()==null) || 
             (this.authorFieldHelpText!=null &&
              this.authorFieldHelpText.equals(other.getAuthorFieldHelpText()))) &&
            ((this.descriptionFieldRequired==null && other.getDescriptionFieldRequired()==null) || 
             (this.descriptionFieldRequired!=null &&
              this.descriptionFieldRequired.equals(other.getDescriptionFieldRequired()))) &&
            ((this.descriptionFieldVisibility==null && other.getDescriptionFieldVisibility()==null) || 
             (this.descriptionFieldVisibility!=null &&
              this.descriptionFieldVisibility.equals(other.getDescriptionFieldVisibility()))) &&
            ((this.descriptionFieldHelpText==null && other.getDescriptionFieldHelpText()==null) || 
             (this.descriptionFieldHelpText!=null &&
              this.descriptionFieldHelpText.equals(other.getDescriptionFieldHelpText()))) &&
            ((this.displayNameFieldRequired==null && other.getDisplayNameFieldRequired()==null) || 
             (this.displayNameFieldRequired!=null &&
              this.displayNameFieldRequired.equals(other.getDisplayNameFieldRequired()))) &&
            ((this.displayNameFieldVisibility==null && other.getDisplayNameFieldVisibility()==null) || 
             (this.displayNameFieldVisibility!=null &&
              this.displayNameFieldVisibility.equals(other.getDisplayNameFieldVisibility()))) &&
            ((this.displayNameFieldHelpText==null && other.getDisplayNameFieldHelpText()==null) || 
             (this.displayNameFieldHelpText!=null &&
              this.displayNameFieldHelpText.equals(other.getDisplayNameFieldHelpText()))) &&
            ((this.endDateFieldRequired==null && other.getEndDateFieldRequired()==null) || 
             (this.endDateFieldRequired!=null &&
              this.endDateFieldRequired.equals(other.getEndDateFieldRequired()))) &&
            ((this.endDateFieldVisibility==null && other.getEndDateFieldVisibility()==null) || 
             (this.endDateFieldVisibility!=null &&
              this.endDateFieldVisibility.equals(other.getEndDateFieldVisibility()))) &&
            ((this.endDateFieldHelpText==null && other.getEndDateFieldHelpText()==null) || 
             (this.endDateFieldHelpText!=null &&
              this.endDateFieldHelpText.equals(other.getEndDateFieldHelpText()))) &&
            ((this.expirationFolderFieldRequired==null && other.getExpirationFolderFieldRequired()==null) || 
             (this.expirationFolderFieldRequired!=null &&
              this.expirationFolderFieldRequired.equals(other.getExpirationFolderFieldRequired()))) &&
            ((this.expirationFolderFieldVisibility==null && other.getExpirationFolderFieldVisibility()==null) || 
             (this.expirationFolderFieldVisibility!=null &&
              this.expirationFolderFieldVisibility.equals(other.getExpirationFolderFieldVisibility()))) &&
            ((this.expirationFolderFieldHelpText==null && other.getExpirationFolderFieldHelpText()==null) || 
             (this.expirationFolderFieldHelpText!=null &&
              this.expirationFolderFieldHelpText.equals(other.getExpirationFolderFieldHelpText()))) &&
            ((this.keywordsFieldRequired==null && other.getKeywordsFieldRequired()==null) || 
             (this.keywordsFieldRequired!=null &&
              this.keywordsFieldRequired.equals(other.getKeywordsFieldRequired()))) &&
            ((this.keywordsFieldVisibility==null && other.getKeywordsFieldVisibility()==null) || 
             (this.keywordsFieldVisibility!=null &&
              this.keywordsFieldVisibility.equals(other.getKeywordsFieldVisibility()))) &&
            ((this.keywordsFieldHelpText==null && other.getKeywordsFieldHelpText()==null) || 
             (this.keywordsFieldHelpText!=null &&
              this.keywordsFieldHelpText.equals(other.getKeywordsFieldHelpText()))) &&
            ((this.reviewDateFieldRequired==null && other.getReviewDateFieldRequired()==null) || 
             (this.reviewDateFieldRequired!=null &&
              this.reviewDateFieldRequired.equals(other.getReviewDateFieldRequired()))) &&
            ((this.reviewDateFieldVisibility==null && other.getReviewDateFieldVisibility()==null) || 
             (this.reviewDateFieldVisibility!=null &&
              this.reviewDateFieldVisibility.equals(other.getReviewDateFieldVisibility()))) &&
            ((this.reviewDateFieldHelpText==null && other.getReviewDateFieldHelpText()==null) || 
             (this.reviewDateFieldHelpText!=null &&
              this.reviewDateFieldHelpText.equals(other.getReviewDateFieldHelpText()))) &&
            ((this.startDateFieldRequired==null && other.getStartDateFieldRequired()==null) || 
             (this.startDateFieldRequired!=null &&
              this.startDateFieldRequired.equals(other.getStartDateFieldRequired()))) &&
            ((this.startDateFieldVisibility==null && other.getStartDateFieldVisibility()==null) || 
             (this.startDateFieldVisibility!=null &&
              this.startDateFieldVisibility.equals(other.getStartDateFieldVisibility()))) &&
            ((this.startDateFieldHelpText==null && other.getStartDateFieldHelpText()==null) || 
             (this.startDateFieldHelpText!=null &&
              this.startDateFieldHelpText.equals(other.getStartDateFieldHelpText()))) &&
            ((this.summaryFieldRequired==null && other.getSummaryFieldRequired()==null) || 
             (this.summaryFieldRequired!=null &&
              this.summaryFieldRequired.equals(other.getSummaryFieldRequired()))) &&
            ((this.summaryFieldVisibility==null && other.getSummaryFieldVisibility()==null) || 
             (this.summaryFieldVisibility!=null &&
              this.summaryFieldVisibility.equals(other.getSummaryFieldVisibility()))) &&
            ((this.summaryFieldHelpText==null && other.getSummaryFieldHelpText()==null) || 
             (this.summaryFieldHelpText!=null &&
              this.summaryFieldHelpText.equals(other.getSummaryFieldHelpText()))) &&
            ((this.teaserFieldRequired==null && other.getTeaserFieldRequired()==null) || 
             (this.teaserFieldRequired!=null &&
              this.teaserFieldRequired.equals(other.getTeaserFieldRequired()))) &&
            ((this.teaserFieldVisibility==null && other.getTeaserFieldVisibility()==null) || 
             (this.teaserFieldVisibility!=null &&
              this.teaserFieldVisibility.equals(other.getTeaserFieldVisibility()))) &&
            ((this.teaserFieldHelpText==null && other.getTeaserFieldHelpText()==null) || 
             (this.teaserFieldHelpText!=null &&
              this.teaserFieldHelpText.equals(other.getTeaserFieldHelpText()))) &&
            ((this.titleFieldRequired==null && other.getTitleFieldRequired()==null) || 
             (this.titleFieldRequired!=null &&
              this.titleFieldRequired.equals(other.getTitleFieldRequired()))) &&
            ((this.titleFieldVisibility==null && other.getTitleFieldVisibility()==null) || 
             (this.titleFieldVisibility!=null &&
              this.titleFieldVisibility.equals(other.getTitleFieldVisibility()))) &&
            ((this.titleFieldHelpText==null && other.getTitleFieldHelpText()==null) || 
             (this.titleFieldHelpText!=null &&
              this.titleFieldHelpText.equals(other.getTitleFieldHelpText()))) &&
            ((this.dynamicMetadataFieldDefinitions==null && other.getDynamicMetadataFieldDefinitions()==null) || 
             (this.dynamicMetadataFieldDefinitions!=null &&
              java.util.Arrays.equals(this.dynamicMetadataFieldDefinitions, other.getDynamicMetadataFieldDefinitions())));
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
        if (getAuthorFieldRequired() != null) {
            _hashCode += getAuthorFieldRequired().hashCode();
        }
        if (getAuthorFieldVisibility() != null) {
            _hashCode += getAuthorFieldVisibility().hashCode();
        }
        if (getAuthorFieldHelpText() != null) {
            _hashCode += getAuthorFieldHelpText().hashCode();
        }
        if (getDescriptionFieldRequired() != null) {
            _hashCode += getDescriptionFieldRequired().hashCode();
        }
        if (getDescriptionFieldVisibility() != null) {
            _hashCode += getDescriptionFieldVisibility().hashCode();
        }
        if (getDescriptionFieldHelpText() != null) {
            _hashCode += getDescriptionFieldHelpText().hashCode();
        }
        if (getDisplayNameFieldRequired() != null) {
            _hashCode += getDisplayNameFieldRequired().hashCode();
        }
        if (getDisplayNameFieldVisibility() != null) {
            _hashCode += getDisplayNameFieldVisibility().hashCode();
        }
        if (getDisplayNameFieldHelpText() != null) {
            _hashCode += getDisplayNameFieldHelpText().hashCode();
        }
        if (getEndDateFieldRequired() != null) {
            _hashCode += getEndDateFieldRequired().hashCode();
        }
        if (getEndDateFieldVisibility() != null) {
            _hashCode += getEndDateFieldVisibility().hashCode();
        }
        if (getEndDateFieldHelpText() != null) {
            _hashCode += getEndDateFieldHelpText().hashCode();
        }
        if (getExpirationFolderFieldRequired() != null) {
            _hashCode += getExpirationFolderFieldRequired().hashCode();
        }
        if (getExpirationFolderFieldVisibility() != null) {
            _hashCode += getExpirationFolderFieldVisibility().hashCode();
        }
        if (getExpirationFolderFieldHelpText() != null) {
            _hashCode += getExpirationFolderFieldHelpText().hashCode();
        }
        if (getKeywordsFieldRequired() != null) {
            _hashCode += getKeywordsFieldRequired().hashCode();
        }
        if (getKeywordsFieldVisibility() != null) {
            _hashCode += getKeywordsFieldVisibility().hashCode();
        }
        if (getKeywordsFieldHelpText() != null) {
            _hashCode += getKeywordsFieldHelpText().hashCode();
        }
        if (getReviewDateFieldRequired() != null) {
            _hashCode += getReviewDateFieldRequired().hashCode();
        }
        if (getReviewDateFieldVisibility() != null) {
            _hashCode += getReviewDateFieldVisibility().hashCode();
        }
        if (getReviewDateFieldHelpText() != null) {
            _hashCode += getReviewDateFieldHelpText().hashCode();
        }
        if (getStartDateFieldRequired() != null) {
            _hashCode += getStartDateFieldRequired().hashCode();
        }
        if (getStartDateFieldVisibility() != null) {
            _hashCode += getStartDateFieldVisibility().hashCode();
        }
        if (getStartDateFieldHelpText() != null) {
            _hashCode += getStartDateFieldHelpText().hashCode();
        }
        if (getSummaryFieldRequired() != null) {
            _hashCode += getSummaryFieldRequired().hashCode();
        }
        if (getSummaryFieldVisibility() != null) {
            _hashCode += getSummaryFieldVisibility().hashCode();
        }
        if (getSummaryFieldHelpText() != null) {
            _hashCode += getSummaryFieldHelpText().hashCode();
        }
        if (getTeaserFieldRequired() != null) {
            _hashCode += getTeaserFieldRequired().hashCode();
        }
        if (getTeaserFieldVisibility() != null) {
            _hashCode += getTeaserFieldVisibility().hashCode();
        }
        if (getTeaserFieldHelpText() != null) {
            _hashCode += getTeaserFieldHelpText().hashCode();
        }
        if (getTitleFieldRequired() != null) {
            _hashCode += getTitleFieldRequired().hashCode();
        }
        if (getTitleFieldVisibility() != null) {
            _hashCode += getTitleFieldVisibility().hashCode();
        }
        if (getTitleFieldHelpText() != null) {
            _hashCode += getTitleFieldHelpText().hashCode();
        }
        if (getDynamicMetadataFieldDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicMetadataFieldDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicMetadataFieldDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetadataSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authorFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authorFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authorFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "descriptionFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "descriptionFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "descriptionFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayNameFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "displayNameFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayNameFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "displayNameFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayNameFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "displayNameFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDateFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDateFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDateFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordsFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "keywordsFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordsFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "keywordsFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordsFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "keywordsFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDateFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reviewDateFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDateFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reviewDateFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewDateFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reviewDateFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "startDateFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "startDateFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "startDateFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "summaryFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "summaryFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "summaryFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teaserFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "teaserFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teaserFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "teaserFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teaserFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "teaserFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleFieldRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "titleFieldRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleFieldVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "titleFieldVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleFieldHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "titleFieldHelpText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicMetadataFieldDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition"));
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
