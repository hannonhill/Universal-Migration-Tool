/**
 * DynamicMetadataFieldDefinitionValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DynamicMetadataFieldDefinitionValue  implements java.io.Serializable {
    private java.lang.String value;

    private java.lang.Boolean selectedByDefault;

    public DynamicMetadataFieldDefinitionValue() {
    }

    public DynamicMetadataFieldDefinitionValue(
           java.lang.String value,
           java.lang.Boolean selectedByDefault) {
           this.value = value;
           this.selectedByDefault = selectedByDefault;
    }


    /**
     * Gets the value value for this DynamicMetadataFieldDefinitionValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this DynamicMetadataFieldDefinitionValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the selectedByDefault value for this DynamicMetadataFieldDefinitionValue.
     * 
     * @return selectedByDefault
     */
    public java.lang.Boolean getSelectedByDefault() {
        return selectedByDefault;
    }


    /**
     * Sets the selectedByDefault value for this DynamicMetadataFieldDefinitionValue.
     * 
     * @param selectedByDefault
     */
    public void setSelectedByDefault(java.lang.Boolean selectedByDefault) {
        this.selectedByDefault = selectedByDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicMetadataFieldDefinitionValue)) return false;
        DynamicMetadataFieldDefinitionValue other = (DynamicMetadataFieldDefinitionValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.selectedByDefault==null && other.getSelectedByDefault()==null) || 
             (this.selectedByDefault!=null &&
              this.selectedByDefault.equals(other.getSelectedByDefault())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getSelectedByDefault() != null) {
            _hashCode += getSelectedByDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicMetadataFieldDefinitionValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamic-metadata-field-definition-value"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedByDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "selectedByDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
