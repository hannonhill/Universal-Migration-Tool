/**
 * EditWorkflowSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class EditWorkflowSettings  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings;

    private java.lang.Boolean applyInheritWorkflowsToChildren;

    private java.lang.Boolean applyRequireWorkflowToChildren;

    public EditWorkflowSettings() {
    }

    public EditWorkflowSettings(
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings,
           java.lang.Boolean applyInheritWorkflowsToChildren,
           java.lang.Boolean applyRequireWorkflowToChildren) {
           this.workflowSettings = workflowSettings;
           this.applyInheritWorkflowsToChildren = applyInheritWorkflowsToChildren;
           this.applyRequireWorkflowToChildren = applyRequireWorkflowToChildren;
    }


    /**
     * Gets the workflowSettings value for this EditWorkflowSettings.
     * 
     * @return workflowSettings
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings getWorkflowSettings() {
        return workflowSettings;
    }


    /**
     * Sets the workflowSettings value for this EditWorkflowSettings.
     * 
     * @param workflowSettings
     */
    public void setWorkflowSettings(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings) {
        this.workflowSettings = workflowSettings;
    }


    /**
     * Gets the applyInheritWorkflowsToChildren value for this EditWorkflowSettings.
     * 
     * @return applyInheritWorkflowsToChildren
     */
    public java.lang.Boolean getApplyInheritWorkflowsToChildren() {
        return applyInheritWorkflowsToChildren;
    }


    /**
     * Sets the applyInheritWorkflowsToChildren value for this EditWorkflowSettings.
     * 
     * @param applyInheritWorkflowsToChildren
     */
    public void setApplyInheritWorkflowsToChildren(java.lang.Boolean applyInheritWorkflowsToChildren) {
        this.applyInheritWorkflowsToChildren = applyInheritWorkflowsToChildren;
    }


    /**
     * Gets the applyRequireWorkflowToChildren value for this EditWorkflowSettings.
     * 
     * @return applyRequireWorkflowToChildren
     */
    public java.lang.Boolean getApplyRequireWorkflowToChildren() {
        return applyRequireWorkflowToChildren;
    }


    /**
     * Sets the applyRequireWorkflowToChildren value for this EditWorkflowSettings.
     * 
     * @param applyRequireWorkflowToChildren
     */
    public void setApplyRequireWorkflowToChildren(java.lang.Boolean applyRequireWorkflowToChildren) {
        this.applyRequireWorkflowToChildren = applyRequireWorkflowToChildren;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditWorkflowSettings)) return false;
        EditWorkflowSettings other = (EditWorkflowSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowSettings==null && other.getWorkflowSettings()==null) || 
             (this.workflowSettings!=null &&
              this.workflowSettings.equals(other.getWorkflowSettings()))) &&
            ((this.applyInheritWorkflowsToChildren==null && other.getApplyInheritWorkflowsToChildren()==null) || 
             (this.applyInheritWorkflowsToChildren!=null &&
              this.applyInheritWorkflowsToChildren.equals(other.getApplyInheritWorkflowsToChildren()))) &&
            ((this.applyRequireWorkflowToChildren==null && other.getApplyRequireWorkflowToChildren()==null) || 
             (this.applyRequireWorkflowToChildren!=null &&
              this.applyRequireWorkflowToChildren.equals(other.getApplyRequireWorkflowToChildren())));
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
        if (getWorkflowSettings() != null) {
            _hashCode += getWorkflowSettings().hashCode();
        }
        if (getApplyInheritWorkflowsToChildren() != null) {
            _hashCode += getApplyInheritWorkflowsToChildren().hashCode();
        }
        if (getApplyRequireWorkflowToChildren() != null) {
            _hashCode += getApplyRequireWorkflowToChildren().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditWorkflowSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editWorkflowSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSettings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyInheritWorkflowsToChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applyInheritWorkflowsToChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyRequireWorkflowToChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applyRequireWorkflowToChildren"));
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
