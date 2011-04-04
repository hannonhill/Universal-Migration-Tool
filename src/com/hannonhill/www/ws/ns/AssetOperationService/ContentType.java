/**
 * ContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ContentType  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.String pageConfigurationSetId;

    private java.lang.String pageConfigurationSetPath;

    private java.lang.String metadataSetId;

    private java.lang.String metadataSetPath;

    private java.lang.String dataDefinitionId;

    private java.lang.String dataDefinitionPath;

    private com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration[] contentTypePageConfigurations;

    public ContentType() {
    }

    public ContentType(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String pageConfigurationSetId,
           java.lang.String pageConfigurationSetPath,
           java.lang.String metadataSetId,
           java.lang.String metadataSetPath,
           java.lang.String dataDefinitionId,
           java.lang.String dataDefinitionPath,
           com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration[] contentTypePageConfigurations) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.pageConfigurationSetId = pageConfigurationSetId;
        this.pageConfigurationSetPath = pageConfigurationSetPath;
        this.metadataSetId = metadataSetId;
        this.metadataSetPath = metadataSetPath;
        this.dataDefinitionId = dataDefinitionId;
        this.dataDefinitionPath = dataDefinitionPath;
        this.contentTypePageConfigurations = contentTypePageConfigurations;
    }


    /**
     * Gets the pageConfigurationSetId value for this ContentType.
     * 
     * @return pageConfigurationSetId
     */
    public java.lang.String getPageConfigurationSetId() {
        return pageConfigurationSetId;
    }


    /**
     * Sets the pageConfigurationSetId value for this ContentType.
     * 
     * @param pageConfigurationSetId
     */
    public void setPageConfigurationSetId(java.lang.String pageConfigurationSetId) {
        this.pageConfigurationSetId = pageConfigurationSetId;
    }


    /**
     * Gets the pageConfigurationSetPath value for this ContentType.
     * 
     * @return pageConfigurationSetPath
     */
    public java.lang.String getPageConfigurationSetPath() {
        return pageConfigurationSetPath;
    }


    /**
     * Sets the pageConfigurationSetPath value for this ContentType.
     * 
     * @param pageConfigurationSetPath
     */
    public void setPageConfigurationSetPath(java.lang.String pageConfigurationSetPath) {
        this.pageConfigurationSetPath = pageConfigurationSetPath;
    }


    /**
     * Gets the metadataSetId value for this ContentType.
     * 
     * @return metadataSetId
     */
    public java.lang.String getMetadataSetId() {
        return metadataSetId;
    }


    /**
     * Sets the metadataSetId value for this ContentType.
     * 
     * @param metadataSetId
     */
    public void setMetadataSetId(java.lang.String metadataSetId) {
        this.metadataSetId = metadataSetId;
    }


    /**
     * Gets the metadataSetPath value for this ContentType.
     * 
     * @return metadataSetPath
     */
    public java.lang.String getMetadataSetPath() {
        return metadataSetPath;
    }


    /**
     * Sets the metadataSetPath value for this ContentType.
     * 
     * @param metadataSetPath
     */
    public void setMetadataSetPath(java.lang.String metadataSetPath) {
        this.metadataSetPath = metadataSetPath;
    }


    /**
     * Gets the dataDefinitionId value for this ContentType.
     * 
     * @return dataDefinitionId
     */
    public java.lang.String getDataDefinitionId() {
        return dataDefinitionId;
    }


    /**
     * Sets the dataDefinitionId value for this ContentType.
     * 
     * @param dataDefinitionId
     */
    public void setDataDefinitionId(java.lang.String dataDefinitionId) {
        this.dataDefinitionId = dataDefinitionId;
    }


    /**
     * Gets the dataDefinitionPath value for this ContentType.
     * 
     * @return dataDefinitionPath
     */
    public java.lang.String getDataDefinitionPath() {
        return dataDefinitionPath;
    }


    /**
     * Sets the dataDefinitionPath value for this ContentType.
     * 
     * @param dataDefinitionPath
     */
    public void setDataDefinitionPath(java.lang.String dataDefinitionPath) {
        this.dataDefinitionPath = dataDefinitionPath;
    }


    /**
     * Gets the contentTypePageConfigurations value for this ContentType.
     * 
     * @return contentTypePageConfigurations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration[] getContentTypePageConfigurations() {
        return contentTypePageConfigurations;
    }


    /**
     * Sets the contentTypePageConfigurations value for this ContentType.
     * 
     * @param contentTypePageConfigurations
     */
    public void setContentTypePageConfigurations(com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration[] contentTypePageConfigurations) {
        this.contentTypePageConfigurations = contentTypePageConfigurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentType)) return false;
        ContentType other = (ContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pageConfigurationSetId==null && other.getPageConfigurationSetId()==null) || 
             (this.pageConfigurationSetId!=null &&
              this.pageConfigurationSetId.equals(other.getPageConfigurationSetId()))) &&
            ((this.pageConfigurationSetPath==null && other.getPageConfigurationSetPath()==null) || 
             (this.pageConfigurationSetPath!=null &&
              this.pageConfigurationSetPath.equals(other.getPageConfigurationSetPath()))) &&
            ((this.metadataSetId==null && other.getMetadataSetId()==null) || 
             (this.metadataSetId!=null &&
              this.metadataSetId.equals(other.getMetadataSetId()))) &&
            ((this.metadataSetPath==null && other.getMetadataSetPath()==null) || 
             (this.metadataSetPath!=null &&
              this.metadataSetPath.equals(other.getMetadataSetPath()))) &&
            ((this.dataDefinitionId==null && other.getDataDefinitionId()==null) || 
             (this.dataDefinitionId!=null &&
              this.dataDefinitionId.equals(other.getDataDefinitionId()))) &&
            ((this.dataDefinitionPath==null && other.getDataDefinitionPath()==null) || 
             (this.dataDefinitionPath!=null &&
              this.dataDefinitionPath.equals(other.getDataDefinitionPath()))) &&
            ((this.contentTypePageConfigurations==null && other.getContentTypePageConfigurations()==null) || 
             (this.contentTypePageConfigurations!=null &&
              java.util.Arrays.equals(this.contentTypePageConfigurations, other.getContentTypePageConfigurations())));
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
        if (getPageConfigurationSetId() != null) {
            _hashCode += getPageConfigurationSetId().hashCode();
        }
        if (getPageConfigurationSetPath() != null) {
            _hashCode += getPageConfigurationSetPath().hashCode();
        }
        if (getMetadataSetId() != null) {
            _hashCode += getMetadataSetId().hashCode();
        }
        if (getMetadataSetPath() != null) {
            _hashCode += getMetadataSetPath().hashCode();
        }
        if (getDataDefinitionId() != null) {
            _hashCode += getDataDefinitionId().hashCode();
        }
        if (getDataDefinitionPath() != null) {
            _hashCode += getDataDefinitionPath().hashCode();
        }
        if (getContentTypePageConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentTypePageConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentTypePageConfigurations(), i);
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
        new org.apache.axis.description.TypeDesc(ContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationSetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDefinitionPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypePageConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration"));
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
