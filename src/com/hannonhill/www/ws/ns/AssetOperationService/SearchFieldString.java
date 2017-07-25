/**
 * SearchFieldString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SearchFieldString implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchFieldString(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _name = "name";
    public static final java.lang.String _path = "path";
    public static final java.lang.String _createdBy = "createdBy";
    public static final java.lang.String _modifiedBy = "modifiedBy";
    public static final java.lang.String _displayName = "displayName";
    public static final java.lang.String _title = "title";
    public static final java.lang.String _summary = "summary";
    public static final java.lang.String _teaser = "teaser";
    public static final java.lang.String _keywords = "keywords";
    public static final java.lang.String _description = "description";
    public static final java.lang.String _author = "author";
    public static final java.lang.String _blob = "blob";
    public static final java.lang.String _velocityFormatContent = "velocityFormatContent";
    public static final java.lang.String _xml = "xml";
    public static final java.lang.String _link = "link";
    public static final SearchFieldString name = new SearchFieldString(_name);
    public static final SearchFieldString path = new SearchFieldString(_path);
    public static final SearchFieldString createdBy = new SearchFieldString(_createdBy);
    public static final SearchFieldString modifiedBy = new SearchFieldString(_modifiedBy);
    public static final SearchFieldString displayName = new SearchFieldString(_displayName);
    public static final SearchFieldString title = new SearchFieldString(_title);
    public static final SearchFieldString summary = new SearchFieldString(_summary);
    public static final SearchFieldString teaser = new SearchFieldString(_teaser);
    public static final SearchFieldString keywords = new SearchFieldString(_keywords);
    public static final SearchFieldString description = new SearchFieldString(_description);
    public static final SearchFieldString author = new SearchFieldString(_author);
    public static final SearchFieldString blob = new SearchFieldString(_blob);
    public static final SearchFieldString velocityFormatContent = new SearchFieldString(_velocityFormatContent);
    public static final SearchFieldString xml = new SearchFieldString(_xml);
    public static final SearchFieldString link = new SearchFieldString(_link);
    public java.lang.String getValue() { return _value_;}
    public static SearchFieldString fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchFieldString enumeration = (SearchFieldString)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchFieldString fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchFieldString.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFieldString"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
