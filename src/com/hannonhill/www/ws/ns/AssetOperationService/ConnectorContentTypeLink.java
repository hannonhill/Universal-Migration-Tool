/**
 * ConnectorContentTypeLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ConnectorContentTypeLink  implements java.io.Serializable {
    private java.lang.String contentTypeId;

    private java.lang.String contentTypePath;

    private java.lang.String pageConfigurationId;

    private java.lang.String pageConfigurationName;

    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParams;

    public ConnectorContentTypeLink() {
    }

    public ConnectorContentTypeLink(
           java.lang.String contentTypeId,
           java.lang.String contentTypePath,
           java.lang.String pageConfigurationId,
           java.lang.String pageConfigurationName,
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParams) {
           this.contentTypeId = contentTypeId;
           this.contentTypePath = contentTypePath;
           this.pageConfigurationId = pageConfigurationId;
           this.pageConfigurationName = pageConfigurationName;
           this.connectorContentTypeLinkParams = connectorContentTypeLinkParams;
    }


    /**
     * Gets the contentTypeId value for this ConnectorContentTypeLink.
     * 
     * @return contentTypeId
     */
    public java.lang.String getContentTypeId() {
        return contentTypeId;
    }


    /**
     * Sets the contentTypeId value for this ConnectorContentTypeLink.
     * 
     * @param contentTypeId
     */
    public void setContentTypeId(java.lang.String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }


    /**
     * Gets the contentTypePath value for this ConnectorContentTypeLink.
     * 
     * @return contentTypePath
     */
    public java.lang.String getContentTypePath() {
        return contentTypePath;
    }


    /**
     * Sets the contentTypePath value for this ConnectorContentTypeLink.
     * 
     * @param contentTypePath
     */
    public void setContentTypePath(java.lang.String contentTypePath) {
        this.contentTypePath = contentTypePath;
    }


    /**
     * Gets the pageConfigurationId value for this ConnectorContentTypeLink.
     * 
     * @return pageConfigurationId
     */
    public java.lang.String getPageConfigurationId() {
        return pageConfigurationId;
    }


    /**
     * Sets the pageConfigurationId value for this ConnectorContentTypeLink.
     * 
     * @param pageConfigurationId
     */
    public void setPageConfigurationId(java.lang.String pageConfigurationId) {
        this.pageConfigurationId = pageConfigurationId;
    }


    /**
     * Gets the pageConfigurationName value for this ConnectorContentTypeLink.
     * 
     * @return pageConfigurationName
     */
    public java.lang.String getPageConfigurationName() {
        return pageConfigurationName;
    }


    /**
     * Sets the pageConfigurationName value for this ConnectorContentTypeLink.
     * 
     * @param pageConfigurationName
     */
    public void setPageConfigurationName(java.lang.String pageConfigurationName) {
        this.pageConfigurationName = pageConfigurationName;
    }


    /**
     * Gets the connectorContentTypeLinkParams value for this ConnectorContentTypeLink.
     * 
     * @return connectorContentTypeLinkParams
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] getConnectorContentTypeLinkParams() {
        return connectorContentTypeLinkParams;
    }


    /**
     * Sets the connectorContentTypeLinkParams value for this ConnectorContentTypeLink.
     * 
     * @param connectorContentTypeLinkParams
     */
    public void setConnectorContentTypeLinkParams(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParams) {
        this.connectorContentTypeLinkParams = connectorContentTypeLinkParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectorContentTypeLink)) return false;
        ConnectorContentTypeLink other = (ConnectorContentTypeLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentTypeId==null && other.getContentTypeId()==null) || 
             (this.contentTypeId!=null &&
              this.contentTypeId.equals(other.getContentTypeId()))) &&
            ((this.contentTypePath==null && other.getContentTypePath()==null) || 
             (this.contentTypePath!=null &&
              this.contentTypePath.equals(other.getContentTypePath()))) &&
            ((this.pageConfigurationId==null && other.getPageConfigurationId()==null) || 
             (this.pageConfigurationId!=null &&
              this.pageConfigurationId.equals(other.getPageConfigurationId()))) &&
            ((this.pageConfigurationName==null && other.getPageConfigurationName()==null) || 
             (this.pageConfigurationName!=null &&
              this.pageConfigurationName.equals(other.getPageConfigurationName()))) &&
            ((this.connectorContentTypeLinkParams==null && other.getConnectorContentTypeLinkParams()==null) || 
             (this.connectorContentTypeLinkParams!=null &&
              java.util.Arrays.equals(this.connectorContentTypeLinkParams, other.getConnectorContentTypeLinkParams())));
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
        if (getContentTypeId() != null) {
            _hashCode += getContentTypeId().hashCode();
        }
        if (getContentTypePath() != null) {
            _hashCode += getContentTypePath().hashCode();
        }
        if (getPageConfigurationId() != null) {
            _hashCode += getPageConfigurationId().hashCode();
        }
        if (getPageConfigurationName() != null) {
            _hashCode += getPageConfigurationName().hashCode();
        }
        if (getConnectorContentTypeLinkParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectorContentTypeLinkParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectorContentTypeLinkParams(), i);
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
        new org.apache.axis.description.TypeDesc(ConnectorContentTypeLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("connectorContentTypeLinkParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLinkParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLinkParam"));
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
