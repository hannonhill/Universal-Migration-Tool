/**
 * ExpiringAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ExpiringAsset  extends com.hannonhill.www.ws.ns.AssetOperationService.DublinAwareAsset  implements java.io.Serializable {
    private java.lang.String expirationFolderId;

    private java.lang.String expirationFolderPath;

    private java.lang.Boolean expirationFolderRecycled;

    public ExpiringAsset() {
    }

    public ExpiringAsset(
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
           java.lang.Boolean expirationFolderRecycled) {
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
            metadataSetPath);
        this.expirationFolderId = expirationFolderId;
        this.expirationFolderPath = expirationFolderPath;
        this.expirationFolderRecycled = expirationFolderRecycled;
    }


    /**
     * Gets the expirationFolderId value for this ExpiringAsset.
     * 
     * @return expirationFolderId
     */
    public java.lang.String getExpirationFolderId() {
        return expirationFolderId;
    }


    /**
     * Sets the expirationFolderId value for this ExpiringAsset.
     * 
     * @param expirationFolderId
     */
    public void setExpirationFolderId(java.lang.String expirationFolderId) {
        this.expirationFolderId = expirationFolderId;
    }


    /**
     * Gets the expirationFolderPath value for this ExpiringAsset.
     * 
     * @return expirationFolderPath
     */
    public java.lang.String getExpirationFolderPath() {
        return expirationFolderPath;
    }


    /**
     * Sets the expirationFolderPath value for this ExpiringAsset.
     * 
     * @param expirationFolderPath
     */
    public void setExpirationFolderPath(java.lang.String expirationFolderPath) {
        this.expirationFolderPath = expirationFolderPath;
    }


    /**
     * Gets the expirationFolderRecycled value for this ExpiringAsset.
     * 
     * @return expirationFolderRecycled
     */
    public java.lang.Boolean getExpirationFolderRecycled() {
        return expirationFolderRecycled;
    }


    /**
     * Sets the expirationFolderRecycled value for this ExpiringAsset.
     * 
     * @param expirationFolderRecycled
     */
    public void setExpirationFolderRecycled(java.lang.Boolean expirationFolderRecycled) {
        this.expirationFolderRecycled = expirationFolderRecycled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpiringAsset)) return false;
        ExpiringAsset other = (ExpiringAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationFolderId==null && other.getExpirationFolderId()==null) || 
             (this.expirationFolderId!=null &&
              this.expirationFolderId.equals(other.getExpirationFolderId()))) &&
            ((this.expirationFolderPath==null && other.getExpirationFolderPath()==null) || 
             (this.expirationFolderPath!=null &&
              this.expirationFolderPath.equals(other.getExpirationFolderPath()))) &&
            ((this.expirationFolderRecycled==null && other.getExpirationFolderRecycled()==null) || 
             (this.expirationFolderRecycled!=null &&
              this.expirationFolderRecycled.equals(other.getExpirationFolderRecycled())));
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
        if (getExpirationFolderId() != null) {
            _hashCode += getExpirationFolderId().hashCode();
        }
        if (getExpirationFolderPath() != null) {
            _hashCode += getExpirationFolderPath().hashCode();
        }
        if (getExpirationFolderRecycled() != null) {
            _hashCode += getExpirationFolderRecycled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpiringAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expiring-asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationFolderRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expirationFolderRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
