/**
 * AuditTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AuditTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuditTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _login = "login";
    public static final java.lang.String _login_failed = "login_failed";
    public static final java.lang.String _logout = "logout";
    public static final java.lang.String _start_workflow = "start_workflow";
    public static final java.lang.String _advance_workflow = "advance_workflow";
    public static final java.lang.String _edit = "edit";
    public static final java.lang.String _copy = "copy";
    public static final java.lang.String _create = "create";
    public static final java.lang.String _reference = "reference";
    public static final java.lang.String _delete = "delete";
    public static final java.lang.String _delete_unpublish = "delete_unpublish";
    public static final java.lang.String _check_in = "check_in";
    public static final java.lang.String _check_out = "check_out";
    public static final java.lang.String _activate_version = "activate_version";
    public static final java.lang.String _publish = "publish";
    public static final java.lang.String _unpublish = "unpublish";
    public static final java.lang.String _recycle = "recycle";
    public static final java.lang.String _restore = "restore";
    public static final java.lang.String _move = "move";
    public static final AuditTypes login = new AuditTypes(_login);
    public static final AuditTypes login_failed = new AuditTypes(_login_failed);
    public static final AuditTypes logout = new AuditTypes(_logout);
    public static final AuditTypes start_workflow = new AuditTypes(_start_workflow);
    public static final AuditTypes advance_workflow = new AuditTypes(_advance_workflow);
    public static final AuditTypes edit = new AuditTypes(_edit);
    public static final AuditTypes copy = new AuditTypes(_copy);
    public static final AuditTypes create = new AuditTypes(_create);
    public static final AuditTypes reference = new AuditTypes(_reference);
    public static final AuditTypes delete = new AuditTypes(_delete);
    public static final AuditTypes delete_unpublish = new AuditTypes(_delete_unpublish);
    public static final AuditTypes check_in = new AuditTypes(_check_in);
    public static final AuditTypes check_out = new AuditTypes(_check_out);
    public static final AuditTypes activate_version = new AuditTypes(_activate_version);
    public static final AuditTypes publish = new AuditTypes(_publish);
    public static final AuditTypes unpublish = new AuditTypes(_unpublish);
    public static final AuditTypes recycle = new AuditTypes(_recycle);
    public static final AuditTypes restore = new AuditTypes(_restore);
    public static final AuditTypes move = new AuditTypes(_move);
    public java.lang.String getValue() { return _value_;}
    public static AuditTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuditTypes enumeration = (AuditTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuditTypes fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
