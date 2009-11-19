/**
 * AuditParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AuditParameters  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier;

    private java.lang.String username;

    private java.lang.String groupname;

    private java.lang.String rolename;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.hannonhill.www.ws.ns.AssetOperationService.AuditTypes auditType;

    public AuditParameters() {
    }

    public AuditParameters(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier,
           java.lang.String username,
           java.lang.String groupname,
           java.lang.String rolename,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.hannonhill.www.ws.ns.AssetOperationService.AuditTypes auditType) {
           this.identifier = identifier;
           this.username = username;
           this.groupname = groupname;
           this.rolename = rolename;
           this.startDate = startDate;
           this.endDate = endDate;
           this.auditType = auditType;
    }


    /**
     * Gets the identifier value for this AuditParameters.
     * 
     * @return identifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this AuditParameters.
     * 
     * @param identifier
     */
    public void setIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the username value for this AuditParameters.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this AuditParameters.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the groupname value for this AuditParameters.
     * 
     * @return groupname
     */
    public java.lang.String getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this AuditParameters.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the rolename value for this AuditParameters.
     * 
     * @return rolename
     */
    public java.lang.String getRolename() {
        return rolename;
    }


    /**
     * Sets the rolename value for this AuditParameters.
     * 
     * @param rolename
     */
    public void setRolename(java.lang.String rolename) {
        this.rolename = rolename;
    }


    /**
     * Gets the startDate value for this AuditParameters.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AuditParameters.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this AuditParameters.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AuditParameters.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the auditType value for this AuditParameters.
     * 
     * @return auditType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AuditTypes getAuditType() {
        return auditType;
    }


    /**
     * Sets the auditType value for this AuditParameters.
     * 
     * @param auditType
     */
    public void setAuditType(com.hannonhill.www.ws.ns.AssetOperationService.AuditTypes auditType) {
        this.auditType = auditType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditParameters)) return false;
        AuditParameters other = (AuditParameters) obj;
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
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              this.groupname.equals(other.getGroupname()))) &&
            ((this.rolename==null && other.getRolename()==null) || 
             (this.rolename!=null &&
              this.rolename.equals(other.getRolename()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.auditType==null && other.getAuditType()==null) || 
             (this.auditType!=null &&
              this.auditType.equals(other.getAuditType())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getGroupname() != null) {
            _hashCode += getGroupname().hashCode();
        }
        if (getRolename() != null) {
            _hashCode += getRolename().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAuditType() != null) {
            _hashCode += getAuditType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "rolename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditTypes"));
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
