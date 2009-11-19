/**
 * XhtmlBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class XhtmlBlock  extends com.hannonhill.www.ws.ns.AssetOperationService.Block  implements java.io.Serializable {
    private java.lang.String xhtml;

    public XhtmlBlock() {
    }

    public XhtmlBlock(
           java.lang.String id,
           com.hannonhill.www.ws.ns.AssetOperationService.EntityType entityType,
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
           java.lang.String xhtml) {
        super(
            id,
            entityType,
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
            expirationFolderPath);
        this.xhtml = xhtml;
    }


    /**
     * Gets the xhtml value for this XhtmlBlock.
     * 
     * @return xhtml
     */
    public java.lang.String getXhtml() {
        return xhtml;
    }


    /**
     * Sets the xhtml value for this XhtmlBlock.
     * 
     * @param xhtml
     */
    public void setXhtml(java.lang.String xhtml) {
        this.xhtml = xhtml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XhtmlBlock)) return false;
        XhtmlBlock other = (XhtmlBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.xhtml==null && other.getXhtml()==null) || 
             (this.xhtml!=null &&
              this.xhtml.equals(other.getXhtml())));
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
        if (getXhtml() != null) {
            _hashCode += getXhtml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XhtmlBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtmlBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xhtml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
