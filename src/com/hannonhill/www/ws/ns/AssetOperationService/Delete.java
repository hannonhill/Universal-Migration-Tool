/**
 * Delete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Delete  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier;

    public Delete() {
    }

    public Delete(
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
           this.workflowConfiguration = workflowConfiguration;
           this.identifier = identifier;
    }


    /**
     * Gets the workflowConfiguration value for this Delete.
     * 
     * @return workflowConfiguration
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration getWorkflowConfiguration() {
        return workflowConfiguration;
    }


    /**
     * Sets the workflowConfiguration value for this Delete.
     * 
     * @param workflowConfiguration
     */
    public void setWorkflowConfiguration(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) {
        this.workflowConfiguration = workflowConfiguration;
    }


    /**
     * Gets the identifier value for this Delete.
     * 
     * @return identifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Delete.
     * 
     * @param identifier
     */
    public void setIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Delete)) return false;
        Delete other = (Delete) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowConfiguration==null && other.getWorkflowConfiguration()==null) || 
             (this.workflowConfiguration!=null &&
              this.workflowConfiguration.equals(other.getWorkflowConfiguration()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier())));
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
        if (getWorkflowConfiguration() != null) {
            _hashCode += getWorkflowConfiguration().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Delete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "delete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
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
