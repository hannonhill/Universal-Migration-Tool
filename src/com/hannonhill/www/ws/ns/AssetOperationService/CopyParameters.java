/**
 * CopyParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class CopyParameters  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier destinationContainerIdentifier;

    private boolean doWorkflow;

    private java.lang.String newName;

    public CopyParameters() {
    }

    public CopyParameters(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier destinationContainerIdentifier,
           boolean doWorkflow,
           java.lang.String newName) {
           this.destinationContainerIdentifier = destinationContainerIdentifier;
           this.doWorkflow = doWorkflow;
           this.newName = newName;
    }


    /**
     * Gets the destinationContainerIdentifier value for this CopyParameters.
     * 
     * @return destinationContainerIdentifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getDestinationContainerIdentifier() {
        return destinationContainerIdentifier;
    }


    /**
     * Sets the destinationContainerIdentifier value for this CopyParameters.
     * 
     * @param destinationContainerIdentifier
     */
    public void setDestinationContainerIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier destinationContainerIdentifier) {
        this.destinationContainerIdentifier = destinationContainerIdentifier;
    }


    /**
     * Gets the doWorkflow value for this CopyParameters.
     * 
     * @return doWorkflow
     */
    public boolean isDoWorkflow() {
        return doWorkflow;
    }


    /**
     * Sets the doWorkflow value for this CopyParameters.
     * 
     * @param doWorkflow
     */
    public void setDoWorkflow(boolean doWorkflow) {
        this.doWorkflow = doWorkflow;
    }


    /**
     * Gets the newName value for this CopyParameters.
     * 
     * @return newName
     */
    public java.lang.String getNewName() {
        return newName;
    }


    /**
     * Sets the newName value for this CopyParameters.
     * 
     * @param newName
     */
    public void setNewName(java.lang.String newName) {
        this.newName = newName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CopyParameters)) return false;
        CopyParameters other = (CopyParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationContainerIdentifier==null && other.getDestinationContainerIdentifier()==null) || 
             (this.destinationContainerIdentifier!=null &&
              this.destinationContainerIdentifier.equals(other.getDestinationContainerIdentifier()))) &&
            this.doWorkflow == other.isDoWorkflow() &&
            ((this.newName==null && other.getNewName()==null) || 
             (this.newName!=null &&
              this.newName.equals(other.getNewName())));
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
        if (getDestinationContainerIdentifier() != null) {
            _hashCode += getDestinationContainerIdentifier().hashCode();
        }
        _hashCode += (isDoWorkflow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNewName() != null) {
            _hashCode += getNewName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CopyParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copyParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationContainerIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destinationContainerIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doWorkflow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "doWorkflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "newName"));
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
