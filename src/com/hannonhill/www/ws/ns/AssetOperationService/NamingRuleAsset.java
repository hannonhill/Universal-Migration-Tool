/**
 * NamingRuleAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class NamingRuleAsset implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NamingRuleAsset(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _block = "block";
    public static final java.lang.String _file = "file";
    public static final java.lang.String _folder = "folder";
    public static final java.lang.String _page = "page";
    public static final java.lang.String _symlink = "symlink";
    public static final java.lang.String _template = "template";
    public static final java.lang.String _reference = "reference";
    public static final java.lang.String _format = "format";
    public static final NamingRuleAsset block = new NamingRuleAsset(_block);
    public static final NamingRuleAsset file = new NamingRuleAsset(_file);
    public static final NamingRuleAsset folder = new NamingRuleAsset(_folder);
    public static final NamingRuleAsset page = new NamingRuleAsset(_page);
    public static final NamingRuleAsset symlink = new NamingRuleAsset(_symlink);
    public static final NamingRuleAsset template = new NamingRuleAsset(_template);
    public static final NamingRuleAsset reference = new NamingRuleAsset(_reference);
    public static final NamingRuleAsset format = new NamingRuleAsset(_format);
    public java.lang.String getValue() { return _value_;}
    public static NamingRuleAsset fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NamingRuleAsset enumeration = (NamingRuleAsset)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NamingRuleAsset fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NamingRuleAsset.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "namingRuleAsset"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
