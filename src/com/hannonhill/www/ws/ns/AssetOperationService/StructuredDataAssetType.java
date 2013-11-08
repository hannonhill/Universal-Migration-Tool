/**
 * StructuredDataAssetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class StructuredDataAssetType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StructuredDataAssetType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "block";
    public static final java.lang.String _value2 = "file";
    public static final java.lang.String _value3 = "page";
    public static final java.lang.String _value4 = "symlink";
    public static final java.lang.String _value5 = "page,file,symlink";
    public static final StructuredDataAssetType value1 = new StructuredDataAssetType(_value1);
    public static final StructuredDataAssetType value2 = new StructuredDataAssetType(_value2);
    public static final StructuredDataAssetType value3 = new StructuredDataAssetType(_value3);
    public static final StructuredDataAssetType value4 = new StructuredDataAssetType(_value4);
    public static final StructuredDataAssetType value5 = new StructuredDataAssetType(_value5);
    public java.lang.String getValue() { return _value_;}
    public static StructuredDataAssetType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StructuredDataAssetType enumeration = (StructuredDataAssetType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StructuredDataAssetType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StructuredDataAssetType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-asset-type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
