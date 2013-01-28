/**
 * WorkflowSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowSettings  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] workflowDefinitions;

    private java.lang.Boolean inheritWorkflows;

    private java.lang.Boolean requireWorkflow;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] inheritedWorkflowDefinitions;

    public WorkflowSettings() {
    }

    public WorkflowSettings(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] workflowDefinitions,
           java.lang.Boolean inheritWorkflows,
           java.lang.Boolean requireWorkflow,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] inheritedWorkflowDefinitions) {
           this.identifier = identifier;
           this.workflowDefinitions = workflowDefinitions;
           this.inheritWorkflows = inheritWorkflows;
           this.requireWorkflow = requireWorkflow;
           this.inheritedWorkflowDefinitions = inheritedWorkflowDefinitions;
    }


    /**
     * Gets the identifier value for this WorkflowSettings.
     * 
     * @return identifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this WorkflowSettings.
     * 
     * @param identifier
     */
    public void setIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the workflowDefinitions value for this WorkflowSettings.
     * 
     * @return workflowDefinitions
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getWorkflowDefinitions() {
        return workflowDefinitions;
    }


    /**
     * Sets the workflowDefinitions value for this WorkflowSettings.
     * 
     * @param workflowDefinitions
     */
    public void setWorkflowDefinitions(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] workflowDefinitions) {
        this.workflowDefinitions = workflowDefinitions;
    }


    /**
     * Gets the inheritWorkflows value for this WorkflowSettings.
     * 
     * @return inheritWorkflows
     */
    public java.lang.Boolean getInheritWorkflows() {
        return inheritWorkflows;
    }


    /**
     * Sets the inheritWorkflows value for this WorkflowSettings.
     * 
     * @param inheritWorkflows
     */
    public void setInheritWorkflows(java.lang.Boolean inheritWorkflows) {
        this.inheritWorkflows = inheritWorkflows;
    }


    /**
     * Gets the requireWorkflow value for this WorkflowSettings.
     * 
     * @return requireWorkflow
     */
    public java.lang.Boolean getRequireWorkflow() {
        return requireWorkflow;
    }


    /**
     * Sets the requireWorkflow value for this WorkflowSettings.
     * 
     * @param requireWorkflow
     */
    public void setRequireWorkflow(java.lang.Boolean requireWorkflow) {
        this.requireWorkflow = requireWorkflow;
    }


    /**
     * Gets the inheritedWorkflowDefinitions value for this WorkflowSettings.
     * 
     * @return inheritedWorkflowDefinitions
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getInheritedWorkflowDefinitions() {
        return inheritedWorkflowDefinitions;
    }


    /**
     * Sets the inheritedWorkflowDefinitions value for this WorkflowSettings.
     * 
     * @param inheritedWorkflowDefinitions
     */
    public void setInheritedWorkflowDefinitions(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] inheritedWorkflowDefinitions) {
        this.inheritedWorkflowDefinitions = inheritedWorkflowDefinitions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowSettings)) return false;
        WorkflowSettings other = (WorkflowSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.workflowDefinitions==null && other.getWorkflowDefinitions()==null) || 
             (this.workflowDefinitions!=null &&
              java.util.Arrays.equals(this.workflowDefinitions, other.getWorkflowDefinitions()))) &&
            ((this.inheritWorkflows==null && other.getInheritWorkflows()==null) || 
             (this.inheritWorkflows!=null &&
              this.inheritWorkflows.equals(other.getInheritWorkflows()))) &&
            ((this.requireWorkflow==null && other.getRequireWorkflow()==null) || 
             (this.requireWorkflow!=null &&
              this.requireWorkflow.equals(other.getRequireWorkflow()))) &&
            ((this.inheritedWorkflowDefinitions==null && other.getInheritedWorkflowDefinitions()==null) || 
             (this.inheritedWorkflowDefinitions!=null &&
              java.util.Arrays.equals(this.inheritedWorkflowDefinitions, other.getInheritedWorkflowDefinitions())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getWorkflowDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInheritWorkflows() != null) {
            _hashCode += getInheritWorkflows().hashCode();
        }
        if (getRequireWorkflow() != null) {
            _hashCode += getRequireWorkflow().hashCode();
        }
        if (getInheritedWorkflowDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInheritedWorkflowDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInheritedWorkflowDefinitions(), i);
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
        new org.apache.axis.description.TypeDesc(WorkflowSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritWorkflows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "inheritWorkflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireWorkflow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "requireWorkflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritedWorkflowDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "inheritedWorkflowDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetIdentifier"));
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
