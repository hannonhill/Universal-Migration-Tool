/**
 * PublishableAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PublishableAsset  extends com.hannonhill.www.ws.ns.AssetOperationService.ExpiringAsset  implements java.io.Serializable {
    private java.lang.Boolean shouldBePublished;

    private java.lang.Boolean shouldBeIndexed;

    private java.util.Calendar lastPublishedDate;

    private java.lang.String lastPublishedBy;

    public PublishableAsset() {
    }

    public PublishableAsset(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata,
           java.lang.String metadataSetId,
           java.lang.String metadataSetPath,
           java.lang.String expirationFolderId,
           java.lang.String expirationFolderPath,
           java.lang.Boolean expirationFolderRecycled,
           java.lang.Boolean shouldBePublished,
           java.lang.Boolean shouldBeIndexed,
           java.util.Calendar lastPublishedDate,
           java.lang.String lastPublishedBy) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            siteId,
            siteName,
            metadata,
            metadataSetId,
            metadataSetPath,
            expirationFolderId,
            expirationFolderPath,
            expirationFolderRecycled);
        this.shouldBePublished = shouldBePublished;
        this.shouldBeIndexed = shouldBeIndexed;
        this.lastPublishedDate = lastPublishedDate;
        this.lastPublishedBy = lastPublishedBy;
    }


    /**
     * Gets the shouldBePublished value for this PublishableAsset.
     * 
     * @return shouldBePublished
     */
    public java.lang.Boolean getShouldBePublished() {
        return shouldBePublished;
    }


    /**
     * Sets the shouldBePublished value for this PublishableAsset.
     * 
     * @param shouldBePublished
     */
    public void setShouldBePublished(java.lang.Boolean shouldBePublished) {
        this.shouldBePublished = shouldBePublished;
    }


    /**
     * Gets the shouldBeIndexed value for this PublishableAsset.
     * 
     * @return shouldBeIndexed
     */
    public java.lang.Boolean getShouldBeIndexed() {
        return shouldBeIndexed;
    }


    /**
     * Sets the shouldBeIndexed value for this PublishableAsset.
     * 
     * @param shouldBeIndexed
     */
    public void setShouldBeIndexed(java.lang.Boolean shouldBeIndexed) {
        this.shouldBeIndexed = shouldBeIndexed;
    }


    /**
     * Gets the lastPublishedDate value for this PublishableAsset.
     * 
     * @return lastPublishedDate
     */
    public java.util.Calendar getLastPublishedDate() {
        return lastPublishedDate;
    }


    /**
     * Sets the lastPublishedDate value for this PublishableAsset.
     * 
     * @param lastPublishedDate
     */
    public void setLastPublishedDate(java.util.Calendar lastPublishedDate) {
        this.lastPublishedDate = lastPublishedDate;
    }


    /**
     * Gets the lastPublishedBy value for this PublishableAsset.
     * 
     * @return lastPublishedBy
     */
    public java.lang.String getLastPublishedBy() {
        return lastPublishedBy;
    }


    /**
     * Sets the lastPublishedBy value for this PublishableAsset.
     * 
     * @param lastPublishedBy
     */
    public void setLastPublishedBy(java.lang.String lastPublishedBy) {
        this.lastPublishedBy = lastPublishedBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishableAsset)) return false;
        PublishableAsset other = (PublishableAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shouldBePublished==null && other.getShouldBePublished()==null) || 
             (this.shouldBePublished!=null &&
              this.shouldBePublished.equals(other.getShouldBePublished()))) &&
            ((this.shouldBeIndexed==null && other.getShouldBeIndexed()==null) || 
             (this.shouldBeIndexed!=null &&
              this.shouldBeIndexed.equals(other.getShouldBeIndexed()))) &&
            ((this.lastPublishedDate==null && other.getLastPublishedDate()==null) || 
             (this.lastPublishedDate!=null &&
              this.lastPublishedDate.equals(other.getLastPublishedDate()))) &&
            ((this.lastPublishedBy==null && other.getLastPublishedBy()==null) || 
             (this.lastPublishedBy!=null &&
              this.lastPublishedBy.equals(other.getLastPublishedBy())));
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
        if (getShouldBePublished() != null) {
            _hashCode += getShouldBePublished().hashCode();
        }
        if (getShouldBeIndexed() != null) {
            _hashCode += getShouldBeIndexed().hashCode();
        }
        if (getLastPublishedDate() != null) {
            _hashCode += getLastPublishedDate().hashCode();
        }
        if (getLastPublishedBy() != null) {
            _hashCode += getLastPublishedBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishableAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishable-asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shouldBePublished");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "shouldBePublished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shouldBeIndexed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "shouldBeIndexed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPublishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "lastPublishedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPublishedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "lastPublishedBy"));
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
