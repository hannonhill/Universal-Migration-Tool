/**
 * WorkflowTransitionInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowTransitionInformation  implements java.io.Serializable {
    private java.lang.String workflowId;

    private java.lang.String actionIdentifier;

    private java.lang.String transitionComment;

    public WorkflowTransitionInformation() {
    }

    public WorkflowTransitionInformation(
           java.lang.String workflowId,
           java.lang.String actionIdentifier,
           java.lang.String transitionComment) {
           this.workflowId = workflowId;
           this.actionIdentifier = actionIdentifier;
           this.transitionComment = transitionComment;
    }


    /**
     * Gets the workflowId value for this WorkflowTransitionInformation.
     * 
     * @return workflowId
     */
    public java.lang.String getWorkflowId() {
        return workflowId;
    }


    /**
     * Sets the workflowId value for this WorkflowTransitionInformation.
     * 
     * @param workflowId
     */
    public void setWorkflowId(java.lang.String workflowId) {
        this.workflowId = workflowId;
    }


    /**
     * Gets the actionIdentifier value for this WorkflowTransitionInformation.
     * 
     * @return actionIdentifier
     */
    public java.lang.String getActionIdentifier() {
        return actionIdentifier;
    }


    /**
     * Sets the actionIdentifier value for this WorkflowTransitionInformation.
     * 
     * @param actionIdentifier
     */
    public void setActionIdentifier(java.lang.String actionIdentifier) {
        this.actionIdentifier = actionIdentifier;
    }


    /**
     * Gets the transitionComment value for this WorkflowTransitionInformation.
     * 
     * @return transitionComment
     */
    public java.lang.String getTransitionComment() {
        return transitionComment;
    }


    /**
     * Sets the transitionComment value for this WorkflowTransitionInformation.
     * 
     * @param transitionComment
     */
    public void setTransitionComment(java.lang.String transitionComment) {
        this.transitionComment = transitionComment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowTransitionInformation)) return false;
        WorkflowTransitionInformation other = (WorkflowTransitionInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowId==null && other.getWorkflowId()==null) || 
             (this.workflowId!=null &&
              this.workflowId.equals(other.getWorkflowId()))) &&
            ((this.actionIdentifier==null && other.getActionIdentifier()==null) || 
             (this.actionIdentifier!=null &&
              this.actionIdentifier.equals(other.getActionIdentifier()))) &&
            ((this.transitionComment==null && other.getTransitionComment()==null) || 
             (this.transitionComment!=null &&
              this.transitionComment.equals(other.getTransitionComment())));
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
        if (getWorkflowId() != null) {
            _hashCode += getWorkflowId().hashCode();
        }
        if (getActionIdentifier() != null) {
            _hashCode += getActionIdentifier().hashCode();
        }
        if (getTransitionComment() != null) {
            _hashCode += getTransitionComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowTransitionInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowTransitionInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "actionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitionComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "transitionComment"));
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
