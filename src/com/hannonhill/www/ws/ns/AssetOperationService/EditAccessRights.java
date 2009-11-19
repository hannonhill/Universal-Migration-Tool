/**
 * EditAccessRights.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class EditAccessRights  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation accessRightsInformation;

    private java.lang.Boolean applyToChildren;

    public EditAccessRights() {
    }

    public EditAccessRights(
           com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation accessRightsInformation,
           java.lang.Boolean applyToChildren) {
           this.accessRightsInformation = accessRightsInformation;
           this.applyToChildren = applyToChildren;
    }


    /**
     * Gets the accessRightsInformation value for this EditAccessRights.
     * 
     * @return accessRightsInformation
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation getAccessRightsInformation() {
        return accessRightsInformation;
    }


    /**
     * Sets the accessRightsInformation value for this EditAccessRights.
     * 
     * @param accessRightsInformation
     */
    public void setAccessRightsInformation(com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation accessRightsInformation) {
        this.accessRightsInformation = accessRightsInformation;
    }


    /**
     * Gets the applyToChildren value for this EditAccessRights.
     * 
     * @return applyToChildren
     */
    public java.lang.Boolean getApplyToChildren() {
        return applyToChildren;
    }


    /**
     * Sets the applyToChildren value for this EditAccessRights.
     * 
     * @param applyToChildren
     */
    public void setApplyToChildren(java.lang.Boolean applyToChildren) {
        this.applyToChildren = applyToChildren;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditAccessRights)) return false;
        EditAccessRights other = (EditAccessRights) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessRightsInformation==null && other.getAccessRightsInformation()==null) || 
             (this.accessRightsInformation!=null &&
              this.accessRightsInformation.equals(other.getAccessRightsInformation()))) &&
            ((this.applyToChildren==null && other.getApplyToChildren()==null) || 
             (this.applyToChildren!=null &&
              this.applyToChildren.equals(other.getApplyToChildren())));
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
        if (getAccessRightsInformation() != null) {
            _hashCode += getAccessRightsInformation().hashCode();
        }
        if (getApplyToChildren() != null) {
            _hashCode += getApplyToChildren().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditAccessRights.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editAccessRights"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessRightsInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyToChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applyToChildren"));
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
