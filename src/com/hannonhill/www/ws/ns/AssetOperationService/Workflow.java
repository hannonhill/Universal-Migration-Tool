/**
 * Workflow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Workflow  extends com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier relatedEntity;

    private java.lang.String currentStep;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] orderedSteps;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] unorderedSteps;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public Workflow() {
    }

    public Workflow(
           java.lang.String id,
           java.lang.String name,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier relatedEntity,
           java.lang.String currentStep,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] orderedSteps,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] unorderedSteps,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
        super(
            id,
            name);
        this.relatedEntity = relatedEntity;
        this.currentStep = currentStep;
        this.orderedSteps = orderedSteps;
        this.unorderedSteps = unorderedSteps;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    /**
     * Gets the relatedEntity value for this Workflow.
     * 
     * @return relatedEntity
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getRelatedEntity() {
        return relatedEntity;
    }


    /**
     * Sets the relatedEntity value for this Workflow.
     * 
     * @param relatedEntity
     */
    public void setRelatedEntity(com.hannonhill.www.ws.ns.AssetOperationService.Identifier relatedEntity) {
        this.relatedEntity = relatedEntity;
    }


    /**
     * Gets the currentStep value for this Workflow.
     * 
     * @return currentStep
     */
    public java.lang.String getCurrentStep() {
        return currentStep;
    }


    /**
     * Sets the currentStep value for this Workflow.
     * 
     * @param currentStep
     */
    public void setCurrentStep(java.lang.String currentStep) {
        this.currentStep = currentStep;
    }


    /**
     * Gets the orderedSteps value for this Workflow.
     * 
     * @return orderedSteps
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] getOrderedSteps() {
        return orderedSteps;
    }


    /**
     * Sets the orderedSteps value for this Workflow.
     * 
     * @param orderedSteps
     */
    public void setOrderedSteps(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] orderedSteps) {
        this.orderedSteps = orderedSteps;
    }


    /**
     * Gets the unorderedSteps value for this Workflow.
     * 
     * @return unorderedSteps
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] getUnorderedSteps() {
        return unorderedSteps;
    }


    /**
     * Sets the unorderedSteps value for this Workflow.
     * 
     * @param unorderedSteps
     */
    public void setUnorderedSteps(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] unorderedSteps) {
        this.unorderedSteps = unorderedSteps;
    }


    /**
     * Gets the startDate value for this Workflow.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Workflow.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Workflow.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Workflow.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Workflow)) return false;
        Workflow other = (Workflow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.relatedEntity==null && other.getRelatedEntity()==null) || 
             (this.relatedEntity!=null &&
              this.relatedEntity.equals(other.getRelatedEntity()))) &&
            ((this.currentStep==null && other.getCurrentStep()==null) || 
             (this.currentStep!=null &&
              this.currentStep.equals(other.getCurrentStep()))) &&
            ((this.orderedSteps==null && other.getOrderedSteps()==null) || 
             (this.orderedSteps!=null &&
              java.util.Arrays.equals(this.orderedSteps, other.getOrderedSteps()))) &&
            ((this.unorderedSteps==null && other.getUnorderedSteps()==null) || 
             (this.unorderedSteps!=null &&
              java.util.Arrays.equals(this.unorderedSteps, other.getUnorderedSteps()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
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
        int _hashCode = super.hashCode();
        if (getRelatedEntity() != null) {
            _hashCode += getRelatedEntity().hashCode();
        }
        if (getCurrentStep() != null) {
            _hashCode += getCurrentStep().hashCode();
        }
        if (getOrderedSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderedSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderedSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnorderedSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnorderedSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnorderedSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Workflow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "relatedEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "currentStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "orderedSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "step"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unorderedSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "unorderedSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "step"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
