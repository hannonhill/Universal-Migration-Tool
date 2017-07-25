/**
 * EditorConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class EditorConfiguration  extends com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset  implements java.io.Serializable {
    private java.lang.String siteId;

    private java.lang.String siteName;

    private java.lang.String cssFileId;

    private java.lang.String cssFilePath;

    private java.lang.Boolean cssFileRecycled;

    private java.lang.String configuration;

    public EditorConfiguration() {
    }

    public EditorConfiguration(
           java.lang.String id,
           java.lang.String name,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String cssFileId,
           java.lang.String cssFilePath,
           java.lang.Boolean cssFileRecycled,
           java.lang.String configuration) {
        super(
            id,
            name);
        this.siteId = siteId;
        this.siteName = siteName;
        this.cssFileId = cssFileId;
        this.cssFilePath = cssFilePath;
        this.cssFileRecycled = cssFileRecycled;
        this.configuration = configuration;
    }


    /**
     * Gets the siteId value for this EditorConfiguration.
     * 
     * @return siteId
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this EditorConfiguration.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the siteName value for this EditorConfiguration.
     * 
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this EditorConfiguration.
     * 
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the cssFileId value for this EditorConfiguration.
     * 
     * @return cssFileId
     */
    public java.lang.String getCssFileId() {
        return cssFileId;
    }


    /**
     * Sets the cssFileId value for this EditorConfiguration.
     * 
     * @param cssFileId
     */
    public void setCssFileId(java.lang.String cssFileId) {
        this.cssFileId = cssFileId;
    }


    /**
     * Gets the cssFilePath value for this EditorConfiguration.
     * 
     * @return cssFilePath
     */
    public java.lang.String getCssFilePath() {
        return cssFilePath;
    }


    /**
     * Sets the cssFilePath value for this EditorConfiguration.
     * 
     * @param cssFilePath
     */
    public void setCssFilePath(java.lang.String cssFilePath) {
        this.cssFilePath = cssFilePath;
    }


    /**
     * Gets the cssFileRecycled value for this EditorConfiguration.
     * 
     * @return cssFileRecycled
     */
    public java.lang.Boolean getCssFileRecycled() {
        return cssFileRecycled;
    }


    /**
     * Sets the cssFileRecycled value for this EditorConfiguration.
     * 
     * @param cssFileRecycled
     */
    public void setCssFileRecycled(java.lang.Boolean cssFileRecycled) {
        this.cssFileRecycled = cssFileRecycled;
    }


    /**
     * Gets the configuration value for this EditorConfiguration.
     * 
     * @return configuration
     */
    public java.lang.String getConfiguration() {
        return configuration;
    }


    /**
     * Sets the configuration value for this EditorConfiguration.
     * 
     * @param configuration
     */
    public void setConfiguration(java.lang.String configuration) {
        this.configuration = configuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditorConfiguration)) return false;
        EditorConfiguration other = (EditorConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.siteName==null && other.getSiteName()==null) || 
             (this.siteName!=null &&
              this.siteName.equals(other.getSiteName()))) &&
            ((this.cssFileId==null && other.getCssFileId()==null) || 
             (this.cssFileId!=null &&
              this.cssFileId.equals(other.getCssFileId()))) &&
            ((this.cssFilePath==null && other.getCssFilePath()==null) || 
             (this.cssFilePath!=null &&
              this.cssFilePath.equals(other.getCssFilePath()))) &&
            ((this.cssFileRecycled==null && other.getCssFileRecycled()==null) || 
             (this.cssFileRecycled!=null &&
              this.cssFileRecycled.equals(other.getCssFileRecycled()))) &&
            ((this.configuration==null && other.getConfiguration()==null) || 
             (this.configuration!=null &&
              this.configuration.equals(other.getConfiguration())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getSiteName() != null) {
            _hashCode += getSiteName().hashCode();
        }
        if (getCssFileId() != null) {
            _hashCode += getCssFileId().hashCode();
        }
        if (getCssFilePath() != null) {
            _hashCode += getCssFilePath().hashCode();
        }
        if (getCssFileRecycled() != null) {
            _hashCode += getCssFileRecycled().hashCode();
        }
        if (getConfiguration() != null) {
            _hashCode += getConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditorConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editorConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "configuration"));
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
