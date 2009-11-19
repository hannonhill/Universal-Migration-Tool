/**
 * AccessRightsInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AccessRightsInformation  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier;

    private com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntries;

    private com.hannonhill.www.ws.ns.AssetOperationService.AllLevel allLevel;

    public AccessRightsInformation() {
    }

    public AccessRightsInformation(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier,
           com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntries,
           com.hannonhill.www.ws.ns.AssetOperationService.AllLevel allLevel) {
           this.identifier = identifier;
           this.aclEntries = aclEntries;
           this.allLevel = allLevel;
    }


    /**
     * Gets the identifier value for this AccessRightsInformation.
     * 
     * @return identifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this AccessRightsInformation.
     * 
     * @param identifier
     */
    public void setIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the aclEntries value for this AccessRightsInformation.
     * 
     * @return aclEntries
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] getAclEntries() {
        return aclEntries;
    }


    /**
     * Sets the aclEntries value for this AccessRightsInformation.
     * 
     * @param aclEntries
     */
    public void setAclEntries(com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[] aclEntries) {
        this.aclEntries = aclEntries;
    }


    /**
     * Gets the allLevel value for this AccessRightsInformation.
     * 
     * @return allLevel
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AllLevel getAllLevel() {
        return allLevel;
    }


    /**
     * Sets the allLevel value for this AccessRightsInformation.
     * 
     * @param allLevel
     */
    public void setAllLevel(com.hannonhill.www.ws.ns.AssetOperationService.AllLevel allLevel) {
        this.allLevel = allLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessRightsInformation)) return false;
        AccessRightsInformation other = (AccessRightsInformation) obj;
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
            ((this.aclEntries==null && other.getAclEntries()==null) || 
             (this.aclEntries!=null &&
              java.util.Arrays.equals(this.aclEntries, other.getAclEntries()))) &&
            ((this.allLevel==null && other.getAllLevel()==null) || 
             (this.allLevel!=null &&
              this.allLevel.equals(other.getAllLevel())));
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
        if (getAclEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAclEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAclEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllLevel() != null) {
            _hashCode += getAllLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessRightsInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "allLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "all-level"));
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
