/**
 * NamingRuleSpacing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class NamingRuleSpacing implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NamingRuleSpacing(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SPACE = "SPACE";
    public static final java.lang.String _REMOVE = "REMOVE";
    public static final java.lang.String _HYPHEN = "HYPHEN";
    public static final java.lang.String _UNDERSCORE = "UNDERSCORE";
    public static final NamingRuleSpacing SPACE = new NamingRuleSpacing(_SPACE);
    public static final NamingRuleSpacing REMOVE = new NamingRuleSpacing(_REMOVE);
    public static final NamingRuleSpacing HYPHEN = new NamingRuleSpacing(_HYPHEN);
    public static final NamingRuleSpacing UNDERSCORE = new NamingRuleSpacing(_UNDERSCORE);
    public java.lang.String getValue() { return _value_;}
    public static NamingRuleSpacing fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NamingRuleSpacing enumeration = (NamingRuleSpacing)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NamingRuleSpacing fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NamingRuleSpacing.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "namingRuleSpacing"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
