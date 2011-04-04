/**
 * ContentTypePageConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ContentTypePageConfiguration  implements java.io.Serializable {
    private java.lang.String pageConfigurationId;

    private java.lang.String pageConfigurationName;

    private com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfigurationPublishMode publishMode;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations;

    public ContentTypePageConfiguration() {
    }

    public ContentTypePageConfiguration(
           java.lang.String pageConfigurationId,
           java.lang.String pageConfigurationName,
           com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfigurationPublishMode publishMode,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations) {
           this.pageConfigurationId = pageConfigurationId;
           this.pageConfigurationName = pageConfigurationName;
           this.publishMode = publishMode;
           this.destinations = destinations;
    }


    /**
     * Gets the pageConfigurationId value for this ContentTypePageConfiguration.
     * 
     * @return pageConfigurationId
     */
    public java.lang.String getPageConfigurationId() {
        return pageConfigurationId;
    }


    /**
     * Sets the pageConfigurationId value for this ContentTypePageConfiguration.
     * 
     * @param pageConfigurationId
     */
    public void setPageConfigurationId(java.lang.String pageConfigurationId) {
        this.pageConfigurationId = pageConfigurationId;
    }


    /**
     * Gets the pageConfigurationName value for this ContentTypePageConfiguration.
     * 
     * @return pageConfigurationName
     */
    public java.lang.String getPageConfigurationName() {
        return pageConfigurationName;
    }


    /**
     * Sets the pageConfigurationName value for this ContentTypePageConfiguration.
     * 
     * @param pageConfigurationName
     */
    public void setPageConfigurationName(java.lang.String pageConfigurationName) {
        this.pageConfigurationName = pageConfigurationName;
    }


    /**
     * Gets the publishMode value for this ContentTypePageConfiguration.
     * 
     * @return publishMode
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfigurationPublishMode getPublishMode() {
        return publishMode;
    }


    /**
     * Sets the publishMode value for this ContentTypePageConfiguration.
     * 
     * @param publishMode
     */
    public void setPublishMode(com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfigurationPublishMode publishMode) {
        this.publishMode = publishMode;
    }


    /**
     * Gets the destinations value for this ContentTypePageConfiguration.
     * 
     * @return destinations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getDestinations() {
        return destinations;
    }


    /**
     * Sets the destinations value for this ContentTypePageConfiguration.
     * 
     * @param destinations
     */
    public void setDestinations(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations) {
        this.destinations = destinations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentTypePageConfiguration)) return false;
        ContentTypePageConfiguration other = (ContentTypePageConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageConfigurationId==null && other.getPageConfigurationId()==null) || 
             (this.pageConfigurationId!=null &&
              this.pageConfigurationId.equals(other.getPageConfigurationId()))) &&
            ((this.pageConfigurationName==null && other.getPageConfigurationName()==null) || 
             (this.pageConfigurationName!=null &&
              this.pageConfigurationName.equals(other.getPageConfigurationName()))) &&
            ((this.publishMode==null && other.getPublishMode()==null) || 
             (this.publishMode!=null &&
              this.publishMode.equals(other.getPublishMode()))) &&
            ((this.destinations==null && other.getDestinations()==null) || 
             (this.destinations!=null &&
              java.util.Arrays.equals(this.destinations, other.getDestinations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPageConfigurationId() != null) {
            _hashCode += getPageConfigurationId().hashCode();
        }
        if (getPageConfigurationName() != null) {
            _hashCode += getPageConfigurationName().hashCode();
        }
        if (getPublishMode() != null) {
            _hashCode += getPublishMode().hashCode();
        }
        if (getDestinations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinations(), i);
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
        new org.apache.axis.description.TypeDesc(ContentTypePageConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfigurationPublishMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destination"));
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
