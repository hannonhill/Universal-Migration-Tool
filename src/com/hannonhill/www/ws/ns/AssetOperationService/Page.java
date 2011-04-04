/**
 * Page.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Page  extends com.hannonhill.www.ws.ns.AssetOperationService.PublishableAsset  implements java.io.Serializable {
    private java.lang.String configurationSetId;

    private java.lang.String configurationSetPath;

    private java.lang.String contentTypeId;

    private java.lang.String contentTypePath;

    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredData structuredData;

    private java.lang.String xhtml;

    private com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration[] pageConfigurations;

    public Page() {
    }

    public Page(
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
           java.lang.String lastPublishedBy,
           java.lang.String configurationSetId,
           java.lang.String configurationSetPath,
           java.lang.String contentTypeId,
           java.lang.String contentTypePath,
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredData structuredData,
           java.lang.String xhtml,
           com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration[] pageConfigurations) {
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
            expirationFolderRecycled,
            shouldBePublished,
            shouldBeIndexed,
            lastPublishedDate,
            lastPublishedBy);
        this.configurationSetId = configurationSetId;
        this.configurationSetPath = configurationSetPath;
        this.contentTypeId = contentTypeId;
        this.contentTypePath = contentTypePath;
        this.structuredData = structuredData;
        this.xhtml = xhtml;
        this.pageConfigurations = pageConfigurations;
    }


    /**
     * Gets the configurationSetId value for this Page.
     * 
     * @return configurationSetId
     */
    public java.lang.String getConfigurationSetId() {
        return configurationSetId;
    }


    /**
     * Sets the configurationSetId value for this Page.
     * 
     * @param configurationSetId
     */
    public void setConfigurationSetId(java.lang.String configurationSetId) {
        this.configurationSetId = configurationSetId;
    }


    /**
     * Gets the configurationSetPath value for this Page.
     * 
     * @return configurationSetPath
     */
    public java.lang.String getConfigurationSetPath() {
        return configurationSetPath;
    }


    /**
     * Sets the configurationSetPath value for this Page.
     * 
     * @param configurationSetPath
     */
    public void setConfigurationSetPath(java.lang.String configurationSetPath) {
        this.configurationSetPath = configurationSetPath;
    }


    /**
     * Gets the contentTypeId value for this Page.
     * 
     * @return contentTypeId
     */
    public java.lang.String getContentTypeId() {
        return contentTypeId;
    }


    /**
     * Sets the contentTypeId value for this Page.
     * 
     * @param contentTypeId
     */
    public void setContentTypeId(java.lang.String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }


    /**
     * Gets the contentTypePath value for this Page.
     * 
     * @return contentTypePath
     */
    public java.lang.String getContentTypePath() {
        return contentTypePath;
    }


    /**
     * Sets the contentTypePath value for this Page.
     * 
     * @param contentTypePath
     */
    public void setContentTypePath(java.lang.String contentTypePath) {
        this.contentTypePath = contentTypePath;
    }


    /**
     * Gets the structuredData value for this Page.
     * 
     * @return structuredData
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredData getStructuredData() {
        return structuredData;
    }


    /**
     * Sets the structuredData value for this Page.
     * 
     * @param structuredData
     */
    public void setStructuredData(com.hannonhill.www.ws.ns.AssetOperationService.StructuredData structuredData) {
        this.structuredData = structuredData;
    }


    /**
     * Gets the xhtml value for this Page.
     * 
     * @return xhtml
     */
    public java.lang.String getXhtml() {
        return xhtml;
    }


    /**
     * Sets the xhtml value for this Page.
     * 
     * @param xhtml
     */
    public void setXhtml(java.lang.String xhtml) {
        this.xhtml = xhtml;
    }


    /**
     * Gets the pageConfigurations value for this Page.
     * 
     * @return pageConfigurations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration[] getPageConfigurations() {
        return pageConfigurations;
    }


    /**
     * Sets the pageConfigurations value for this Page.
     * 
     * @param pageConfigurations
     */
    public void setPageConfigurations(com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration[] pageConfigurations) {
        this.pageConfigurations = pageConfigurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Page)) return false;
        Page other = (Page) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configurationSetId==null && other.getConfigurationSetId()==null) || 
             (this.configurationSetId!=null &&
              this.configurationSetId.equals(other.getConfigurationSetId()))) &&
            ((this.configurationSetPath==null && other.getConfigurationSetPath()==null) || 
             (this.configurationSetPath!=null &&
              this.configurationSetPath.equals(other.getConfigurationSetPath()))) &&
            ((this.contentTypeId==null && other.getContentTypeId()==null) || 
             (this.contentTypeId!=null &&
              this.contentTypeId.equals(other.getContentTypeId()))) &&
            ((this.contentTypePath==null && other.getContentTypePath()==null) || 
             (this.contentTypePath!=null &&
              this.contentTypePath.equals(other.getContentTypePath()))) &&
            ((this.structuredData==null && other.getStructuredData()==null) || 
             (this.structuredData!=null &&
              this.structuredData.equals(other.getStructuredData()))) &&
            ((this.xhtml==null && other.getXhtml()==null) || 
             (this.xhtml!=null &&
              this.xhtml.equals(other.getXhtml()))) &&
            ((this.pageConfigurations==null && other.getPageConfigurations()==null) || 
             (this.pageConfigurations!=null &&
              java.util.Arrays.equals(this.pageConfigurations, other.getPageConfigurations())));
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
        if (getConfigurationSetId() != null) {
            _hashCode += getConfigurationSetId().hashCode();
        }
        if (getConfigurationSetPath() != null) {
            _hashCode += getConfigurationSetPath().hashCode();
        }
        if (getContentTypeId() != null) {
            _hashCode += getContentTypeId().hashCode();
        }
        if (getContentTypePath() != null) {
            _hashCode += getContentTypePath().hashCode();
        }
        if (getStructuredData() != null) {
            _hashCode += getStructuredData().hashCode();
        }
        if (getXhtml() != null) {
            _hashCode += getXhtml().hashCode();
        }
        if (getPageConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageConfigurations(), i);
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
        new org.apache.axis.description.TypeDesc(Page.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "configurationSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationSetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "configurationSetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structuredData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xhtml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration"));
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
