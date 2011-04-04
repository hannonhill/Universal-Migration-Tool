/**
 * Connector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Connector  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.String auth1;

    private java.lang.String auth2;

    private java.lang.String url;

    private java.lang.Boolean verified;

    private java.util.Calendar verifiedDate;

    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter[] connectorParameters;

    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLinks;

    public Connector() {
    }

    public Connector(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String auth1,
           java.lang.String auth2,
           java.lang.String url,
           java.lang.Boolean verified,
           java.util.Calendar verifiedDate,
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter[] connectorParameters,
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLinks) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.auth1 = auth1;
        this.auth2 = auth2;
        this.url = url;
        this.verified = verified;
        this.verifiedDate = verifiedDate;
        this.connectorParameters = connectorParameters;
        this.connectorContentTypeLinks = connectorContentTypeLinks;
    }


    /**
     * Gets the auth1 value for this Connector.
     * 
     * @return auth1
     */
    public java.lang.String getAuth1() {
        return auth1;
    }


    /**
     * Sets the auth1 value for this Connector.
     * 
     * @param auth1
     */
    public void setAuth1(java.lang.String auth1) {
        this.auth1 = auth1;
    }


    /**
     * Gets the auth2 value for this Connector.
     * 
     * @return auth2
     */
    public java.lang.String getAuth2() {
        return auth2;
    }


    /**
     * Sets the auth2 value for this Connector.
     * 
     * @param auth2
     */
    public void setAuth2(java.lang.String auth2) {
        this.auth2 = auth2;
    }


    /**
     * Gets the url value for this Connector.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Connector.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the verified value for this Connector.
     * 
     * @return verified
     */
    public java.lang.Boolean getVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this Connector.
     * 
     * @param verified
     */
    public void setVerified(java.lang.Boolean verified) {
        this.verified = verified;
    }


    /**
     * Gets the verifiedDate value for this Connector.
     * 
     * @return verifiedDate
     */
    public java.util.Calendar getVerifiedDate() {
        return verifiedDate;
    }


    /**
     * Sets the verifiedDate value for this Connector.
     * 
     * @param verifiedDate
     */
    public void setVerifiedDate(java.util.Calendar verifiedDate) {
        this.verifiedDate = verifiedDate;
    }


    /**
     * Gets the connectorParameters value for this Connector.
     * 
     * @return connectorParameters
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter[] getConnectorParameters() {
        return connectorParameters;
    }


    /**
     * Sets the connectorParameters value for this Connector.
     * 
     * @param connectorParameters
     */
    public void setConnectorParameters(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter[] connectorParameters) {
        this.connectorParameters = connectorParameters;
    }


    /**
     * Gets the connectorContentTypeLinks value for this Connector.
     * 
     * @return connectorContentTypeLinks
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] getConnectorContentTypeLinks() {
        return connectorContentTypeLinks;
    }


    /**
     * Sets the connectorContentTypeLinks value for this Connector.
     * 
     * @param connectorContentTypeLinks
     */
    public void setConnectorContentTypeLinks(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLinks) {
        this.connectorContentTypeLinks = connectorContentTypeLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Connector)) return false;
        Connector other = (Connector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.auth1==null && other.getAuth1()==null) || 
             (this.auth1!=null &&
              this.auth1.equals(other.getAuth1()))) &&
            ((this.auth2==null && other.getAuth2()==null) || 
             (this.auth2!=null &&
              this.auth2.equals(other.getAuth2()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.verified==null && other.getVerified()==null) || 
             (this.verified!=null &&
              this.verified.equals(other.getVerified()))) &&
            ((this.verifiedDate==null && other.getVerifiedDate()==null) || 
             (this.verifiedDate!=null &&
              this.verifiedDate.equals(other.getVerifiedDate()))) &&
            ((this.connectorParameters==null && other.getConnectorParameters()==null) || 
             (this.connectorParameters!=null &&
              java.util.Arrays.equals(this.connectorParameters, other.getConnectorParameters()))) &&
            ((this.connectorContentTypeLinks==null && other.getConnectorContentTypeLinks()==null) || 
             (this.connectorContentTypeLinks!=null &&
              java.util.Arrays.equals(this.connectorContentTypeLinks, other.getConnectorContentTypeLinks())));
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
        if (getAuth1() != null) {
            _hashCode += getAuth1().hashCode();
        }
        if (getAuth2() != null) {
            _hashCode += getAuth2().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVerified() != null) {
            _hashCode += getVerified().hashCode();
        }
        if (getVerifiedDate() != null) {
            _hashCode += getVerifiedDate().hashCode();
        }
        if (getConnectorParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectorParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectorParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectorContentTypeLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectorContentTypeLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectorContentTypeLinks(), i);
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
        new org.apache.axis.description.TypeDesc(Connector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auth1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auth2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "verifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectorParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-parameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorParameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectorContentTypeLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLink"));
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
