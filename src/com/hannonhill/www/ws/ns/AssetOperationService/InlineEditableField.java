/**
 * InlineEditableField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class InlineEditableField  implements java.io.Serializable {
    private java.lang.String pageConfigurationName;

    private java.lang.String pageRegionName;

    private java.lang.String dataDefinitionGroupPath;

    private com.hannonhill.www.ws.ns.AssetOperationService.InlineEditableFieldType type;

    private java.lang.String name;

    public InlineEditableField() {
    }

    public InlineEditableField(
           java.lang.String pageConfigurationName,
           java.lang.String pageRegionName,
           java.lang.String dataDefinitionGroupPath,
           com.hannonhill.www.ws.ns.AssetOperationService.InlineEditableFieldType type,
           java.lang.String name) {
           this.pageConfigurationName = pageConfigurationName;
           this.pageRegionName = pageRegionName;
           this.dataDefinitionGroupPath = dataDefinitionGroupPath;
           this.type = type;
           this.name = name;
    }


    /**
     * Gets the pageConfigurationName value for this InlineEditableField.
     * 
     * @return pageConfigurationName
     */
    public java.lang.String getPageConfigurationName() {
        return pageConfigurationName;
    }


    /**
     * Sets the pageConfigurationName value for this InlineEditableField.
     * 
     * @param pageConfigurationName
     */
    public void setPageConfigurationName(java.lang.String pageConfigurationName) {
        this.pageConfigurationName = pageConfigurationName;
    }


    /**
     * Gets the pageRegionName value for this InlineEditableField.
     * 
     * @return pageRegionName
     */
    public java.lang.String getPageRegionName() {
        return pageRegionName;
    }


    /**
     * Sets the pageRegionName value for this InlineEditableField.
     * 
     * @param pageRegionName
     */
    public void setPageRegionName(java.lang.String pageRegionName) {
        this.pageRegionName = pageRegionName;
    }


    /**
     * Gets the dataDefinitionGroupPath value for this InlineEditableField.
     * 
     * @return dataDefinitionGroupPath
     */
    public java.lang.String getDataDefinitionGroupPath() {
        return dataDefinitionGroupPath;
    }


    /**
     * Sets the dataDefinitionGroupPath value for this InlineEditableField.
     * 
     * @param dataDefinitionGroupPath
     */
    public void setDataDefinitionGroupPath(java.lang.String dataDefinitionGroupPath) {
        this.dataDefinitionGroupPath = dataDefinitionGroupPath;
    }


    /**
     * Gets the type value for this InlineEditableField.
     * 
     * @return type
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.InlineEditableFieldType getType() {
        return type;
    }


    /**
     * Sets the type value for this InlineEditableField.
     * 
     * @param type
     */
    public void setType(com.hannonhill.www.ws.ns.AssetOperationService.InlineEditableFieldType type) {
        this.type = type;
    }


    /**
     * Gets the name value for this InlineEditableField.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InlineEditableField.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InlineEditableField)) return false;
        InlineEditableField other = (InlineEditableField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageConfigurationName==null && other.getPageConfigurationName()==null) || 
             (this.pageConfigurationName!=null &&
              this.pageConfigurationName.equals(other.getPageConfigurationName()))) &&
            ((this.pageRegionName==null && other.getPageRegionName()==null) || 
             (this.pageRegionName!=null &&
              this.pageRegionName.equals(other.getPageRegionName()))) &&
            ((this.dataDefinitionGroupPath==null && other.getDataDefinitionGroupPath()==null) || 
             (this.dataDefinitionGroupPath!=null &&
              this.dataDefinitionGroupPath.equals(other.getDataDefinitionGroupPath()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getPageConfigurationName() != null) {
            _hashCode += getPageConfigurationName().hashCode();
        }
        if (getPageRegionName() != null) {
            _hashCode += getPageRegionName().hashCode();
        }
        if (getDataDefinitionGroupPath() != null) {
            _hashCode += getDataDefinitionGroupPath().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InlineEditableField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "inlineEditableField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageRegionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDefinitionGroupPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionGroupPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "inlineEditableFieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
