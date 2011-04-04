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

    private java.lang.Boolean descriptionFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility descriptionFieldVisibility;

    private java.lang.Boolean displayNameFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility displayNameFieldVisibility;

    private java.lang.Boolean endDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility endDateFieldVisibility;

    private java.lang.Boolean keywordsFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility keywordsFieldVisibility;

    private java.lang.Boolean reviewDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility reviewDateFieldVisibility;

    private java.lang.Boolean startDateFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility startDateFieldVisibility;

    private java.lang.Boolean summaryFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility summaryFieldVisibility;

    private java.lang.Boolean teaserFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility teaserFieldVisibility;

    private java.lang.Boolean titleFieldRequired;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility titleFieldVisibility;

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
           java.lang.Boolean descriptionFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility descriptionFieldVisibility,
           java.lang.Boolean displayNameFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility displayNameFieldVisibility,
           java.lang.Boolean endDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility endDateFieldVisibility,
           java.lang.Boolean keywordsFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility keywordsFieldVisibility,
           java.lang.Boolean reviewDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility reviewDateFieldVisibility,
           java.lang.Boolean startDateFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility startDateFieldVisibility,
           java.lang.Boolean summaryFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility summaryFieldVisibility,
           java.lang.Boolean teaserFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility teaserFieldVisibility,
           java.lang.Boolean titleFieldRequired,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility titleFieldVisibility,
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
        this.descriptionFieldRequired = descriptionFieldRequired;
        this.descriptionFieldVisibility = descriptionFieldVisibility;
        this.displayNameFieldRequired = displayNameFieldRequired;
        this.displayNameFieldVisibility = displayNameFieldVisibility;
        this.endDateFieldRequired = endDateFieldRequired;
        this.endDateFieldVisibility = endDateFieldVisibility;
        this.keywordsFieldRequired = keywordsFieldRequired;
        this.keywordsFieldVisibility = keywordsFieldVisibility;
        this.reviewDateFieldRequired = reviewDateFieldRequired;
        this.reviewDateFieldVisibility = reviewDateFieldVisibility;
        this.startDateFieldRequired = startDateFieldRequired;
        this.startDateFieldVisibility = startDateFieldVisibility;
        this.summaryFieldRequired = summaryFieldRequired;
        this.summaryFieldVisibility = summaryFieldVisibility;
        this.teaserFieldRequired = teaserFieldRequired;
        this.teaserFieldVisibility = teaserFieldVisibility;
        this.titleFieldRequired = titleFieldRequired;
        this.titleFieldVisibility = titleFieldVisibility;
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
            ((this.descriptionFieldRequired==null && other.getDescriptionFieldRequired()==null) || 
             (this.descriptionFieldRequired!=null &&
              this.descriptionFieldRequired.equals(other.getDescriptionFieldRequired()))) &&
            ((this.descriptionFieldVisibility==null && other.getDescriptionFieldVisibility()==null) || 
             (this.descriptionFieldVisibility!=null &&
              this.descriptionFieldVisibility.equals(other.getDescriptionFieldVisibility()))) &&
            ((this.displayNameFieldRequired==null && other.getDisplayNameFieldRequired()==null) || 
             (this.displayNameFieldRequired!=null &&
              this.displayNameFieldRequired.equals(other.getDisplayNameFieldRequired()))) &&
            ((this.displayNameFieldVisibility==null && other.getDisplayNameFieldVisibility()==null) || 
             (this.displayNameFieldVisibility!=null &&
              this.displayNameFieldVisibility.equals(other.getDisplayNameFieldVisibility()))) &&
            ((this.endDateFieldRequired==null && other.getEndDateFieldRequired()==null) || 
             (this.endDateFieldRequired!=null &&
              this.endDateFieldRequired.equals(other.getEndDateFieldRequired()))) &&
            ((this.endDateFieldVisibility==null && other.getEndDateFieldVisibility()==null) || 
             (this.endDateFieldVisibility!=null &&
              this.endDateFieldVisibility.equals(other.getEndDateFieldVisibility()))) &&
            ((this.keywordsFieldRequired==null && other.getKeywordsFieldRequired()==null) || 
             (this.keywordsFieldRequired!=null &&
              this.keywordsFieldRequired.equals(other.getKeywordsFieldRequired()))) &&
            ((this.keywordsFieldVisibility==null && other.getKeywordsFieldVisibility()==null) || 
             (this.keywordsFieldVisibility!=null &&
              this.keywordsFieldVisibility.equals(other.getKeywordsFieldVisibility()))) &&
            ((this.reviewDateFieldRequired==null && other.getReviewDateFieldRequired()==null) || 
             (this.reviewDateFieldRequired!=null &&
              this.reviewDateFieldRequired.equals(other.getReviewDateFieldRequired()))) &&
            ((this.reviewDateFieldVisibility==null && other.getReviewDateFieldVisibility()==null) || 
             (this.reviewDateFieldVisibility!=null &&
              this.reviewDateFieldVisibility.equals(other.getReviewDateFieldVisibility()))) &&
            ((this.startDateFieldRequired==null && other.getStartDateFieldRequired()==null) || 
             (this.startDateFieldRequired!=null &&
              this.startDateFieldRequired.equals(other.getStartDateFieldRequired()))) &&
            ((this.startDateFieldVisibility==null && other.getStartDateFieldVisibility()==null) || 
             (this.startDateFieldVisibility!=null &&
              this.startDateFieldVisibility.equals(other.getStartDateFieldVisibility()))) &&
            ((this.summaryFieldRequired==null && other.getSummaryFieldRequired()==null) || 
             (this.summaryFieldRequired!=null &&
              this.summaryFieldRequired.equals(other.getSummaryFieldRequired()))) &&
            ((this.summaryFieldVisibility==null && other.getSummaryFieldVisibility()==null) || 
             (this.summaryFieldVisibility!=null &&
              this.summaryFieldVisibility.equals(other.getSummaryFieldVisibility()))) &&
            ((this.teaserFieldRequired==null && other.getTeaserFieldRequired()==null) || 
             (this.teaserFieldRequired!=null &&
              this.teaserFieldRequired.equals(other.getTeaserFieldRequired()))) &&
            ((this.teaserFieldVisibility==null && other.getTeaserFieldVisibility()==null) || 
             (this.teaserFieldVisibility!=null &&
              this.teaserFieldVisibility.equals(other.getTeaserFieldVisibility()))) &&
            ((this.titleFieldRequired==null && other.getTitleFieldRequired()==null) || 
             (this.titleFieldRequired!=null &&
              this.titleFieldRequired.equals(other.getTitleFieldRequired()))) &&
            ((this.titleFieldVisibility==null && other.getTitleFieldVisibility()==null) || 
             (this.titleFieldVisibility!=null &&
              this.titleFieldVisibility.equals(other.getTitleFieldVisibility()))) &&
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
        if (getDescriptionFieldRequired() != null) {
            _hashCode += getDescriptionFieldRequired().hashCode();
        }
        if (getDescriptionFieldVisibility() != null) {
            _hashCode += getDescriptionFieldVisibility().hashCode();
        }
        if (getDisplayNameFieldRequired() != null) {
            _hashCode += getDisplayNameFieldRequired().hashCode();
        }
        if (getDisplayNameFieldVisibility() != null) {
            _hashCode += getDisplayNameFieldVisibility().hashCode();
        }
        if (getEndDateFieldRequired() != null) {
            _hashCode += getEndDateFieldRequired().hashCode();
        }
        if (getEndDateFieldVisibility() != null) {
            _hashCode += getEndDateFieldVisibility().hashCode();
        }
        if (getKeywordsFieldRequired() != null) {
            _hashCode += getKeywordsFieldRequired().hashCode();
        }
        if (getKeywordsFieldVisibility() != null) {
            _hashCode += getKeywordsFieldVisibility().hashCode();
        }
        if (getReviewDateFieldRequired() != null) {
            _hashCode += getReviewDateFieldRequired().hashCode();
        }
        if (getReviewDateFieldVisibility() != null) {
            _hashCode += getReviewDateFieldVisibility().hashCode();
        }
        if (getStartDateFieldRequired() != null) {
            _hashCode += getStartDateFieldRequired().hashCode();
        }
        if (getStartDateFieldVisibility() != null) {
            _hashCode += getStartDateFieldVisibility().hashCode();
        }
        if (getSummaryFieldRequired() != null) {
            _hashCode += getSummaryFieldRequired().hashCode();
        }
        if (getSummaryFieldVisibility() != null) {
            _hashCode += getSummaryFieldVisibility().hashCode();
        }
        if (getTeaserFieldRequired() != null) {
            _hashCode += getTeaserFieldRequired().hashCode();
        }
        if (getTeaserFieldVisibility() != null) {
            _hashCode += getTeaserFieldVisibility().hashCode();
        }
        if (getTitleFieldRequired() != null) {
            _hashCode += getTitleFieldRequired().hashCode();
        }
        if (getTitleFieldVisibility() != null) {
            _hashCode += getTitleFieldVisibility().hashCode();
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
