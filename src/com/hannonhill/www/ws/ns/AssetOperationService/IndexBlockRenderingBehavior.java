/**
 * IndexBlockRenderingBehavior.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class IndexBlockRenderingBehavior implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IndexBlockRenderingBehavior(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "render-normally";
    public static final java.lang.String _value2 = "hierarchy";
    public static final java.lang.String _value3 = "hierarchy-with-siblings";
    public static final java.lang.String _value4 = "hierarchy-siblings-forward";
    public static final IndexBlockRenderingBehavior value1 = new IndexBlockRenderingBehavior(_value1);
    public static final IndexBlockRenderingBehavior value2 = new IndexBlockRenderingBehavior(_value2);
    public static final IndexBlockRenderingBehavior value3 = new IndexBlockRenderingBehavior(_value3);
    public static final IndexBlockRenderingBehavior value4 = new IndexBlockRenderingBehavior(_value4);
    public java.lang.String getValue() { return _value_;}
    public static IndexBlockRenderingBehavior fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IndexBlockRenderingBehavior enumeration = (IndexBlockRenderingBehavior)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IndexBlockRenderingBehavior fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IndexBlockRenderingBehavior.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-rendering-behavior"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
