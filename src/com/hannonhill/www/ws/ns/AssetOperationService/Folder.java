/**
 * Folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Folder  extends com.hannonhill.www.ws.ns.AssetOperationService.PublishableAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children;

    private java.lang.Boolean includeInStaleContent;

    public Folder() {
    }

    public Folder(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.util.Calendar createdDate,
           java.lang.String createdBy,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.Tag[] tags,
           com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata,
           java.lang.String metadataSetId,
           java.lang.String metadataSetPath,
           java.lang.Boolean reviewOnSchedule,
           org.apache.axis.types.NonNegativeInteger reviewEvery,
           java.lang.String expirationFolderId,
           java.lang.String expirationFolderPath,
           java.lang.Boolean expirationFolderRecycled,
           java.lang.Boolean shouldBePublished,
           java.lang.Boolean shouldBeIndexed,
           java.util.Calendar lastPublishedDate,
           java.lang.String lastPublishedBy,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children,
           java.lang.Boolean includeInStaleContent) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            createdDate,
            createdBy,
            siteId,
            siteName,
            tags,
            metadata,
            metadataSetId,
            metadataSetPath,
            reviewOnSchedule,
            reviewEvery,
            expirationFolderId,
            expirationFolderPath,
            expirationFolderRecycled,
            shouldBePublished,
            shouldBeIndexed,
            lastPublishedDate,
            lastPublishedBy);
        this.children = children;
        this.includeInStaleContent = includeInStaleContent;
    }


    /**
     * Gets the children value for this Folder.
     * 
     * @return children
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Folder.
     * 
     * @param children
     */
    public void setChildren(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children) {
        this.children = children;
    }


    /**
     * Gets the includeInStaleContent value for this Folder.
     * 
     * @return includeInStaleContent
     */
    public java.lang.Boolean getIncludeInStaleContent() {
        return includeInStaleContent;
    }


    /**
     * Sets the includeInStaleContent value for this Folder.
     * 
     * @param includeInStaleContent
     */
    public void setIncludeInStaleContent(java.lang.Boolean includeInStaleContent) {
        this.includeInStaleContent = includeInStaleContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Folder)) return false;
        Folder other = (Folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.includeInStaleContent==null && other.getIncludeInStaleContent()==null) || 
             (this.includeInStaleContent!=null &&
              this.includeInStaleContent.equals(other.getIncludeInStaleContent())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeInStaleContent() != null) {
            _hashCode += getIncludeInStaleContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Folder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "child"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInStaleContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeInStaleContent"));
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
