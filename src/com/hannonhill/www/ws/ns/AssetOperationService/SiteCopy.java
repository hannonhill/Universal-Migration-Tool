/**
 * SiteCopy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SiteCopy  implements java.io.Serializable {
    private java.lang.String originalSiteId;

    private java.lang.String originalSiteName;

    private java.lang.String newSiteName;

    public SiteCopy() {
    }

    public SiteCopy(
           java.lang.String originalSiteId,
           java.lang.String originalSiteName,
           java.lang.String newSiteName) {
           this.originalSiteId = originalSiteId;
           this.originalSiteName = originalSiteName;
           this.newSiteName = newSiteName;
    }


    /**
     * Gets the originalSiteId value for this SiteCopy.
     * 
     * @return originalSiteId
     */
    public java.lang.String getOriginalSiteId() {
        return originalSiteId;
    }


    /**
     * Sets the originalSiteId value for this SiteCopy.
     * 
     * @param originalSiteId
     */
    public void setOriginalSiteId(java.lang.String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }


    /**
     * Gets the originalSiteName value for this SiteCopy.
     * 
     * @return originalSiteName
     */
    public java.lang.String getOriginalSiteName() {
        return originalSiteName;
    }


    /**
     * Sets the originalSiteName value for this SiteCopy.
     * 
     * @param originalSiteName
     */
    public void setOriginalSiteName(java.lang.String originalSiteName) {
        this.originalSiteName = originalSiteName;
    }


    /**
     * Gets the newSiteName value for this SiteCopy.
     * 
     * @return newSiteName
     */
    public java.lang.String getNewSiteName() {
        return newSiteName;
    }


    /**
     * Sets the newSiteName value for this SiteCopy.
     * 
     * @param newSiteName
     */
    public void setNewSiteName(java.lang.String newSiteName) {
        this.newSiteName = newSiteName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCopy)) return false;
        SiteCopy other = (SiteCopy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalSiteId==null && other.getOriginalSiteId()==null) || 
             (this.originalSiteId!=null &&
              this.originalSiteId.equals(other.getOriginalSiteId()))) &&
            ((this.originalSiteName==null && other.getOriginalSiteName()==null) || 
             (this.originalSiteName!=null &&
              this.originalSiteName.equals(other.getOriginalSiteName()))) &&
            ((this.newSiteName==null && other.getNewSiteName()==null) || 
             (this.newSiteName!=null &&
              this.newSiteName.equals(other.getNewSiteName())));
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
        if (getOriginalSiteId() != null) {
            _hashCode += getOriginalSiteId().hashCode();
        }
        if (getOriginalSiteName() != null) {
            _hashCode += getOriginalSiteName().hashCode();
        }
        if (getNewSiteName() != null) {
            _hashCode += getNewSiteName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteCopy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteCopy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "originalSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSiteName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "originalSiteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSiteName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "newSiteName"));
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
