/**
 * StructuredData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class StructuredData  implements java.io.Serializable {
    private java.lang.String definitionId;

    private java.lang.String definitionPath;

    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes;

    public StructuredData() {
    }

    public StructuredData(
           java.lang.String definitionId,
           java.lang.String definitionPath,
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes) {
           this.definitionId = definitionId;
           this.definitionPath = definitionPath;
           this.structuredDataNodes = structuredDataNodes;
    }


    /**
     * Gets the definitionId value for this StructuredData.
     * 
     * @return definitionId
     */
    public java.lang.String getDefinitionId() {
        return definitionId;
    }


    /**
     * Sets the definitionId value for this StructuredData.
     * 
     * @param definitionId
     */
    public void setDefinitionId(java.lang.String definitionId) {
        this.definitionId = definitionId;
    }


    /**
     * Gets the definitionPath value for this StructuredData.
     * 
     * @return definitionPath
     */
    public java.lang.String getDefinitionPath() {
        return definitionPath;
    }


    /**
     * Sets the definitionPath value for this StructuredData.
     * 
     * @param definitionPath
     */
    public void setDefinitionPath(java.lang.String definitionPath) {
        this.definitionPath = definitionPath;
    }


    /**
     * Gets the structuredDataNodes value for this StructuredData.
     * 
     * @return structuredDataNodes
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] getStructuredDataNodes() {
        return structuredDataNodes;
    }


    /**
     * Sets the structuredDataNodes value for this StructuredData.
     * 
     * @param structuredDataNodes
     */
    public void setStructuredDataNodes(com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes) {
        this.structuredDataNodes = structuredDataNodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredData)) return false;
        StructuredData other = (StructuredData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definitionId==null && other.getDefinitionId()==null) || 
             (this.definitionId!=null &&
              this.definitionId.equals(other.getDefinitionId()))) &&
            ((this.definitionPath==null && other.getDefinitionPath()==null) || 
             (this.definitionPath!=null &&
              this.definitionPath.equals(other.getDefinitionPath()))) &&
            ((this.structuredDataNodes==null && other.getStructuredDataNodes()==null) || 
             (this.structuredDataNodes!=null &&
              java.util.Arrays.equals(this.structuredDataNodes, other.getStructuredDataNodes())));
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
        if (getDefinitionId() != null) {
            _hashCode += getDefinitionId().hashCode();
        }
        if (getDefinitionPath() != null) {
            _hashCode += getDefinitionPath().hashCode();
        }
        if (getStructuredDataNodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStructuredDataNodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStructuredDataNodes(), i);
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
        new org.apache.axis.description.TypeDesc(StructuredData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "definitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "definitionPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structuredDataNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNode"));
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
