/**
 * DublinAwareAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DublinAwareAsset  extends com.hannonhill.www.ws.ns.AssetOperationService.FolderContainedAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata;

    private java.lang.String metadataSetId;

    private java.lang.String metadataSetPath;

    public DublinAwareAsset() {
    }

    public DublinAwareAsset(
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
           java.lang.String metadataSetPath) {
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
        this.metadata = metadata;
        this.metadataSetId = metadataSetId;
        this.metadataSetPath = metadataSetPath;
    }


    /**
     * Gets the metadata value for this DublinAwareAsset.
     * 
     * @return metadata
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Metadata getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this DublinAwareAsset.
     * 
     * @param metadata
     */
    public void setMetadata(com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata) {
        this.metadata = metadata;
    }


    /**
     * Gets the metadataSetId value for this DublinAwareAsset.
     * 
     * @return metadataSetId
     */
    public java.lang.String getMetadataSetId() {
        return metadataSetId;
    }


    /**
     * Sets the metadataSetId value for this DublinAwareAsset.
     * 
     * @param metadataSetId
     */
    public void setMetadataSetId(java.lang.String metadataSetId) {
        this.metadataSetId = metadataSetId;
    }


    /**
     * Gets the metadataSetPath value for this DublinAwareAsset.
     * 
     * @return metadataSetPath
     */
    public java.lang.String getMetadataSetPath() {
        return metadataSetPath;
    }


    /**
     * Sets the metadataSetPath value for this DublinAwareAsset.
     * 
     * @param metadataSetPath
     */
    public void setMetadataSetPath(java.lang.String metadataSetPath) {
        this.metadataSetPath = metadataSetPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DublinAwareAsset)) return false;
        DublinAwareAsset other = (DublinAwareAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              this.metadata.equals(other.getMetadata()))) &&
            ((this.metadataSetId==null && other.getMetadataSetId()==null) || 
             (this.metadataSetId!=null &&
              this.metadataSetId.equals(other.getMetadataSetId()))) &&
            ((this.metadataSetPath==null && other.getMetadataSetPath()==null) || 
             (this.metadataSetPath!=null &&
              this.metadataSetPath.equals(other.getMetadataSetPath())));
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
        if (getMetadata() != null) {
            _hashCode += getMetadata().hashCode();
        }
        if (getMetadataSetId() != null) {
            _hashCode += getMetadataSetId().hashCode();
        }
        if (getMetadataSetPath() != null) {
            _hashCode += getMetadataSetPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DublinAwareAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dublin-aware-asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataSetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
