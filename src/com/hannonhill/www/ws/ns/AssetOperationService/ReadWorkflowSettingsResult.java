/**
 * ReadWorkflowSettingsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ReadWorkflowSettingsResult  extends com.hannonhill.www.ws.ns.AssetOperationService.OperationResult  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings;

    public ReadWorkflowSettingsResult() {
    }

    public ReadWorkflowSettingsResult(
           java.lang.String success,
           java.lang.String message,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings) {
        super(
            success,
            message);
        this.workflowSettings = workflowSettings;
    }


    /**
     * Gets the workflowSettings value for this ReadWorkflowSettingsResult.
     * 
     * @return workflowSettings
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings getWorkflowSettings() {
        return workflowSettings;
    }


    /**
     * Sets the workflowSettings value for this ReadWorkflowSettingsResult.
     * 
     * @param workflowSettings
     */
    public void setWorkflowSettings(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowSettings workflowSettings) {
        this.workflowSettings = workflowSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadWorkflowSettingsResult)) return false;
        ReadWorkflowSettingsResult other = (ReadWorkflowSettingsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.workflowSettings==null && other.getWorkflowSettings()==null) || 
             (this.workflowSettings!=null &&
              this.workflowSettings.equals(other.getWorkflowSettings())));
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
        if (getWorkflowSettings() != null) {
            _hashCode += getWorkflowSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadWorkflowSettingsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowSettingsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSettings"));
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
