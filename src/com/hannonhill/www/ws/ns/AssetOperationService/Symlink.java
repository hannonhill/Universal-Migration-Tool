/**
 * Symlink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Symlink  extends com.hannonhill.www.ws.ns.AssetOperationService.ExpiringAsset  implements java.io.Serializable {
    private org.apache.axis.types.URI linkURL;

    public Symlink() {
    }

    public Symlink(
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
           org.apache.axis.types.URI linkURL) {
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
        this.linkURL = linkURL;
    }


    /**
     * Gets the linkURL value for this Symlink.
     * 
     * @return linkURL
     */
    public org.apache.axis.types.URI getLinkURL() {
        return linkURL;
    }


    /**
     * Sets the linkURL value for this Symlink.
     * 
     * @param linkURL
     */
    public void setLinkURL(org.apache.axis.types.URI linkURL) {
        this.linkURL = linkURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Symlink)) return false;
        Symlink other = (Symlink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.linkURL==null && other.getLinkURL()==null) || 
             (this.linkURL!=null &&
              this.linkURL.equals(other.getLinkURL())));
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
        if (getLinkURL() != null) {
            _hashCode += getLinkURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Symlink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "linkURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
