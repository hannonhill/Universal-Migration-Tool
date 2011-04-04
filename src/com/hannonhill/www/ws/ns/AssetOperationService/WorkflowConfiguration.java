/**
 * WorkflowConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowConfiguration  implements java.io.Serializable {
    private java.lang.String workflowName;

    private java.lang.String workflowDefinitionId;

    private java.lang.String workflowDefinitionPath;

    private java.lang.String workflowComments;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfigurations;

    private java.util.Calendar endDate;

    public WorkflowConfiguration() {
    }

    public WorkflowConfiguration(
           java.lang.String workflowName,
           java.lang.String workflowDefinitionId,
           java.lang.String workflowDefinitionPath,
           java.lang.String workflowComments,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfigurations,
           java.util.Calendar endDate) {
           this.workflowName = workflowName;
           this.workflowDefinitionId = workflowDefinitionId;
           this.workflowDefinitionPath = workflowDefinitionPath;
           this.workflowComments = workflowComments;
           this.workflowStepConfigurations = workflowStepConfigurations;
           this.endDate = endDate;
    }


    /**
     * Gets the workflowName value for this WorkflowConfiguration.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this WorkflowConfiguration.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workflowDefinitionId value for this WorkflowConfiguration.
     * 
     * @return workflowDefinitionId
     */
    public java.lang.String getWorkflowDefinitionId() {
        return workflowDefinitionId;
    }


    /**
     * Sets the workflowDefinitionId value for this WorkflowConfiguration.
     * 
     * @param workflowDefinitionId
     */
    public void setWorkflowDefinitionId(java.lang.String workflowDefinitionId) {
        this.workflowDefinitionId = workflowDefinitionId;
    }


    /**
     * Gets the workflowDefinitionPath value for this WorkflowConfiguration.
     * 
     * @return workflowDefinitionPath
     */
    public java.lang.String getWorkflowDefinitionPath() {
        return workflowDefinitionPath;
    }


    /**
     * Sets the workflowDefinitionPath value for this WorkflowConfiguration.
     * 
     * @param workflowDefinitionPath
     */
    public void setWorkflowDefinitionPath(java.lang.String workflowDefinitionPath) {
        this.workflowDefinitionPath = workflowDefinitionPath;
    }


    /**
     * Gets the workflowComments value for this WorkflowConfiguration.
     * 
     * @return workflowComments
     */
    public java.lang.String getWorkflowComments() {
        return workflowComments;
    }


    /**
     * Sets the workflowComments value for this WorkflowConfiguration.
     * 
     * @param workflowComments
     */
    public void setWorkflowComments(java.lang.String workflowComments) {
        this.workflowComments = workflowComments;
    }


    /**
     * Gets the workflowStepConfigurations value for this WorkflowConfiguration.
     * 
     * @return workflowStepConfigurations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] getWorkflowStepConfigurations() {
        return workflowStepConfigurations;
    }


    /**
     * Sets the workflowStepConfigurations value for this WorkflowConfiguration.
     * 
     * @param workflowStepConfigurations
     */
    public void setWorkflowStepConfigurations(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfigurations) {
        this.workflowStepConfigurations = workflowStepConfigurations;
    }


    /**
     * Gets the endDate value for this WorkflowConfiguration.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WorkflowConfiguration.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowConfiguration)) return false;
        WorkflowConfiguration other = (WorkflowConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowName==null && other.getWorkflowName()==null) || 
             (this.workflowName!=null &&
              this.workflowName.equals(other.getWorkflowName()))) &&
            ((this.workflowDefinitionId==null && other.getWorkflowDefinitionId()==null) || 
             (this.workflowDefinitionId!=null &&
              this.workflowDefinitionId.equals(other.getWorkflowDefinitionId()))) &&
            ((this.workflowDefinitionPath==null && other.getWorkflowDefinitionPath()==null) || 
             (this.workflowDefinitionPath!=null &&
              this.workflowDefinitionPath.equals(other.getWorkflowDefinitionPath()))) &&
            ((this.workflowComments==null && other.getWorkflowComments()==null) || 
             (this.workflowComments!=null &&
              this.workflowComments.equals(other.getWorkflowComments()))) &&
            ((this.workflowStepConfigurations==null && other.getWorkflowStepConfigurations()==null) || 
             (this.workflowStepConfigurations!=null &&
              java.util.Arrays.equals(this.workflowStepConfigurations, other.getWorkflowStepConfigurations()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getWorkflowName() != null) {
            _hashCode += getWorkflowName().hashCode();
        }
        if (getWorkflowDefinitionId() != null) {
            _hashCode += getWorkflowDefinitionId().hashCode();
        }
        if (getWorkflowDefinitionPath() != null) {
            _hashCode += getWorkflowDefinitionPath().hashCode();
        }
        if (getWorkflowComments() != null) {
            _hashCode += getWorkflowComments().hashCode();
        }
        if (getWorkflowStepConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowStepConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowStepConfigurations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitionPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowStepConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStepConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configuration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStepConfiguration"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
