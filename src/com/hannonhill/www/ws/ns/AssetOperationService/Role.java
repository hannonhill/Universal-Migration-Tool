/**
 * Role.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Role  extends com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.RoleTypes roleType;

    private com.hannonhill.www.ws.ns.AssetOperationService.GlobalAbilities globalAbilities;

    private com.hannonhill.www.ws.ns.AssetOperationService.SiteAbilities siteAbilities;

    public Role() {
    }

    public Role(
           java.lang.String id,
           java.lang.String name,
           com.hannonhill.www.ws.ns.AssetOperationService.RoleTypes roleType,
           com.hannonhill.www.ws.ns.AssetOperationService.GlobalAbilities globalAbilities,
           com.hannonhill.www.ws.ns.AssetOperationService.SiteAbilities siteAbilities) {
        super(
            id,
            name);
        this.roleType = roleType;
        this.globalAbilities = globalAbilities;
        this.siteAbilities = siteAbilities;
    }


    /**
     * Gets the roleType value for this Role.
     * 
     * @return roleType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.RoleTypes getRoleType() {
        return roleType;
    }


    /**
     * Sets the roleType value for this Role.
     * 
     * @param roleType
     */
    public void setRoleType(com.hannonhill.www.ws.ns.AssetOperationService.RoleTypes roleType) {
        this.roleType = roleType;
    }


    /**
     * Gets the globalAbilities value for this Role.
     * 
     * @return globalAbilities
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.GlobalAbilities getGlobalAbilities() {
        return globalAbilities;
    }


    /**
     * Sets the globalAbilities value for this Role.
     * 
     * @param globalAbilities
     */
    public void setGlobalAbilities(com.hannonhill.www.ws.ns.AssetOperationService.GlobalAbilities globalAbilities) {
        this.globalAbilities = globalAbilities;
    }


    /**
     * Gets the siteAbilities value for this Role.
     * 
     * @return siteAbilities
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SiteAbilities getSiteAbilities() {
        return siteAbilities;
    }


    /**
     * Sets the siteAbilities value for this Role.
     * 
     * @param siteAbilities
     */
    public void setSiteAbilities(com.hannonhill.www.ws.ns.AssetOperationService.SiteAbilities siteAbilities) {
        this.siteAbilities = siteAbilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Role)) return false;
        Role other = (Role) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.roleType==null && other.getRoleType()==null) || 
             (this.roleType!=null &&
              this.roleType.equals(other.getRoleType()))) &&
            ((this.globalAbilities==null && other.getGlobalAbilities()==null) || 
             (this.globalAbilities!=null &&
              this.globalAbilities.equals(other.getGlobalAbilities()))) &&
            ((this.siteAbilities==null && other.getSiteAbilities()==null) || 
             (this.siteAbilities!=null &&
              this.siteAbilities.equals(other.getSiteAbilities())));
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
        if (getRoleType() != null) {
            _hashCode += getRoleType().hashCode();
        }
        if (getGlobalAbilities() != null) {
            _hashCode += getGlobalAbilities().hashCode();
        }
        if (getSiteAbilities() != null) {
            _hashCode += getSiteAbilities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Role.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "roleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-types"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalAbilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "globalAbilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "global-abilities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAbilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteAbilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site-abilities"));
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
