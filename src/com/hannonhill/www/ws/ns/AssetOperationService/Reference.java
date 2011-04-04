/**
 * Reference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Reference  extends com.hannonhill.www.ws.ns.AssetOperationService.FolderContainedAsset  implements java.io.Serializable {
    private java.lang.String referencedAssetId;

    private java.lang.String referencedAssetPath;

    private com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString referencedAssetType;

    public Reference() {
    }

    public Reference(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String referencedAssetId,
           java.lang.String referencedAssetPath,
           com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString referencedAssetType) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            siteId,
            siteName);
        this.referencedAssetId = referencedAssetId;
        this.referencedAssetPath = referencedAssetPath;
        this.referencedAssetType = referencedAssetType;
    }


    /**
     * Gets the referencedAssetId value for this Reference.
     * 
     * @return referencedAssetId
     */
    public java.lang.String getReferencedAssetId() {
        return referencedAssetId;
    }


    /**
     * Sets the referencedAssetId value for this Reference.
     * 
     * @param referencedAssetId
     */
    public void setReferencedAssetId(java.lang.String referencedAssetId) {
        this.referencedAssetId = referencedAssetId;
    }


    /**
     * Gets the referencedAssetPath value for this Reference.
     * 
     * @return referencedAssetPath
     */
    public java.lang.String getReferencedAssetPath() {
        return referencedAssetPath;
    }


    /**
     * Sets the referencedAssetPath value for this Reference.
     * 
     * @param referencedAssetPath
     */
    public void setReferencedAssetPath(java.lang.String referencedAssetPath) {
        this.referencedAssetPath = referencedAssetPath;
    }


    /**
     * Gets the referencedAssetType value for this Reference.
     * 
     * @return referencedAssetType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString getReferencedAssetType() {
        return referencedAssetType;
    }


    /**
     * Sets the referencedAssetType value for this Reference.
     * 
     * @param referencedAssetType
     */
    public void setReferencedAssetType(com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString referencedAssetType) {
        this.referencedAssetType = referencedAssetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reference)) return false;
        Reference other = (Reference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referencedAssetId==null && other.getReferencedAssetId()==null) || 
             (this.referencedAssetId!=null &&
              this.referencedAssetId.equals(other.getReferencedAssetId()))) &&
            ((this.referencedAssetPath==null && other.getReferencedAssetPath()==null) || 
             (this.referencedAssetPath!=null &&
              this.referencedAssetPath.equals(other.getReferencedAssetPath()))) &&
            ((this.referencedAssetType==null && other.getReferencedAssetType()==null) || 
             (this.referencedAssetType!=null &&
              this.referencedAssetType.equals(other.getReferencedAssetType())));
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
        if (getReferencedAssetId() != null) {
            _hashCode += getReferencedAssetId().hashCode();
        }
        if (getReferencedAssetPath() != null) {
            _hashCode += getReferencedAssetPath().hashCode();
        }
        if (getReferencedAssetType() != null) {
            _hashCode += getReferencedAssetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencedAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "referencedAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencedAssetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "referencedAssetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencedAssetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "referencedAssetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "entityTypeString"));
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
