/**
 * TwitterConnector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class TwitterConnector  extends com.hannonhill.www.ws.ns.AssetOperationService.Connector  implements java.io.Serializable {
    private java.lang.String destinationId;

    private java.lang.String destinationPath;

    public TwitterConnector() {
    }

    public TwitterConnector(
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
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLinks,
           java.lang.String destinationId,
           java.lang.String destinationPath) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName,
            auth1,
            auth2,
            url,
            verified,
            verifiedDate,
            connectorParameters,
            connectorContentTypeLinks);
        this.destinationId = destinationId;
        this.destinationPath = destinationPath;
    }


    /**
     * Gets the destinationId value for this TwitterConnector.
     * 
     * @return destinationId
     */
    public java.lang.String getDestinationId() {
        return destinationId;
    }


    /**
     * Sets the destinationId value for this TwitterConnector.
     * 
     * @param destinationId
     */
    public void setDestinationId(java.lang.String destinationId) {
        this.destinationId = destinationId;
    }


    /**
     * Gets the destinationPath value for this TwitterConnector.
     * 
     * @return destinationPath
     */
    public java.lang.String getDestinationPath() {
        return destinationPath;
    }


    /**
     * Sets the destinationPath value for this TwitterConnector.
     * 
     * @param destinationPath
     */
    public void setDestinationPath(java.lang.String destinationPath) {
        this.destinationPath = destinationPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TwitterConnector)) return false;
        TwitterConnector other = (TwitterConnector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destinationId==null && other.getDestinationId()==null) || 
             (this.destinationId!=null &&
              this.destinationId.equals(other.getDestinationId()))) &&
            ((this.destinationPath==null && other.getDestinationPath()==null) || 
             (this.destinationPath!=null &&
              this.destinationPath.equals(other.getDestinationPath())));
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
        if (getDestinationId() != null) {
            _hashCode += getDestinationId().hashCode();
        }
        if (getDestinationPath() != null) {
            _hashCode += getDestinationPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TwitterConnector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitterConnector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destinationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destinationPath"));
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
