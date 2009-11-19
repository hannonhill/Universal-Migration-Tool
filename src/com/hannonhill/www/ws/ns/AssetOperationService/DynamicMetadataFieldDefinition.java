/**
 * DynamicMetadataFieldDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DynamicMetadataFieldDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String label;

    private com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldType fieldType;

    private java.lang.Boolean required;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility visibility;

    private java.lang.String configurationXML;

    public DynamicMetadataFieldDefinition() {
    }

    public DynamicMetadataFieldDefinition(
           java.lang.String name,
           java.lang.String label,
           com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldType fieldType,
           java.lang.Boolean required,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility visibility,
           java.lang.String configurationXML) {
           this.name = name;
           this.label = label;
           this.fieldType = fieldType;
           this.required = required;
           this.visibility = visibility;
           this.configurationXML = configurationXML;
    }


    /**
     * Gets the name value for this DynamicMetadataFieldDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DynamicMetadataFieldDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the label value for this DynamicMetadataFieldDefinition.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DynamicMetadataFieldDefinition.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the fieldType value for this DynamicMetadataFieldDefinition.
     * 
     * @return fieldType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this DynamicMetadataFieldDefinition.
     * 
     * @param fieldType
     */
    public void setFieldType(com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the required value for this DynamicMetadataFieldDefinition.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this DynamicMetadataFieldDefinition.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the visibility value for this DynamicMetadataFieldDefinition.
     * 
     * @return visibility
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this DynamicMetadataFieldDefinition.
     * 
     * @param visibility
     */
    public void setVisibility(com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the configurationXML value for this DynamicMetadataFieldDefinition.
     * 
     * @return configurationXML
     */
    public java.lang.String getConfigurationXML() {
        return configurationXML;
    }


    /**
     * Sets the configurationXML value for this DynamicMetadataFieldDefinition.
     * 
     * @param configurationXML
     */
    public void setConfigurationXML(java.lang.String configurationXML) {
        this.configurationXML = configurationXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicMetadataFieldDefinition)) return false;
        DynamicMetadataFieldDefinition other = (DynamicMetadataFieldDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility()))) &&
            ((this.configurationXML==null && other.getConfigurationXML()==null) || 
             (this.configurationXML!=null &&
              this.configurationXML.equals(other.getConfigurationXML())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        if (getConfigurationXML() != null) {
            _hashCode += getConfigurationXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicMetadataFieldDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamic-metadata-field-type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "configurationXML"));
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
