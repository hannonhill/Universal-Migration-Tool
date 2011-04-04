/**
 * DayOfWeek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class DayOfWeek implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayOfWeek(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Monday = "Monday";
    public static final java.lang.String _Tuesday = "Tuesday";
    public static final java.lang.String _Wednesday = "Wednesday";
    public static final java.lang.String _Thursday = "Thursday";
    public static final java.lang.String _Friday = "Friday";
    public static final java.lang.String _Saturday = "Saturday";
    public static final java.lang.String _Sunday = "Sunday";
    public static final DayOfWeek Monday = new DayOfWeek(_Monday);
    public static final DayOfWeek Tuesday = new DayOfWeek(_Tuesday);
    public static final DayOfWeek Wednesday = new DayOfWeek(_Wednesday);
    public static final DayOfWeek Thursday = new DayOfWeek(_Thursday);
    public static final DayOfWeek Friday = new DayOfWeek(_Friday);
    public static final DayOfWeek Saturday = new DayOfWeek(_Saturday);
    public static final DayOfWeek Sunday = new DayOfWeek(_Sunday);
    public java.lang.String getValue() { return _value_;}
    public static DayOfWeek fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DayOfWeek enumeration = (DayOfWeek)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DayOfWeek fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DayOfWeek.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
