/**
 * SearchInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SearchInformation  implements java.io.Serializable {
    private java.lang.String searchTerms;

    private java.lang.String siteId;

    private java.lang.String siteName;

    private com.hannonhill.www.ws.ns.AssetOperationService.SearchFieldString[] searchFields;

    private com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString[] searchTypes;

    public SearchInformation() {
    }

    public SearchInformation(
           java.lang.String searchTerms,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.SearchFieldString[] searchFields,
           com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString[] searchTypes) {
           this.searchTerms = searchTerms;
           this.siteId = siteId;
           this.siteName = siteName;
           this.searchFields = searchFields;
           this.searchTypes = searchTypes;
    }


    /**
     * Gets the searchTerms value for this SearchInformation.
     * 
     * @return searchTerms
     */
    public java.lang.String getSearchTerms() {
        return searchTerms;
    }


    /**
     * Sets the searchTerms value for this SearchInformation.
     * 
     * @param searchTerms
     */
    public void setSearchTerms(java.lang.String searchTerms) {
        this.searchTerms = searchTerms;
    }


    /**
     * Gets the siteId value for this SearchInformation.
     * 
     * @return siteId
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this SearchInformation.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the siteName value for this SearchInformation.
     * 
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this SearchInformation.
     * 
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the searchFields value for this SearchInformation.
     * 
     * @return searchFields
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SearchFieldString[] getSearchFields() {
        return searchFields;
    }


    /**
     * Sets the searchFields value for this SearchInformation.
     * 
     * @param searchFields
     */
    public void setSearchFields(com.hannonhill.www.ws.ns.AssetOperationService.SearchFieldString[] searchFields) {
        this.searchFields = searchFields;
    }


    /**
     * Gets the searchTypes value for this SearchInformation.
     * 
     * @return searchTypes
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString[] getSearchTypes() {
        return searchTypes;
    }


    /**
     * Sets the searchTypes value for this SearchInformation.
     * 
     * @param searchTypes
     */
    public void setSearchTypes(com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString[] searchTypes) {
        this.searchTypes = searchTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchInformation)) return false;
        SearchInformation other = (SearchInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchTerms==null && other.getSearchTerms()==null) || 
             (this.searchTerms!=null &&
              this.searchTerms.equals(other.getSearchTerms()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.siteName==null && other.getSiteName()==null) || 
             (this.siteName!=null &&
              this.siteName.equals(other.getSiteName()))) &&
            ((this.searchFields==null && other.getSearchFields()==null) || 
             (this.searchFields!=null &&
              java.util.Arrays.equals(this.searchFields, other.getSearchFields()))) &&
            ((this.searchTypes==null && other.getSearchTypes()==null) || 
             (this.searchTypes!=null &&
              java.util.Arrays.equals(this.searchTypes, other.getSearchTypes())));
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
        if (getSearchTerms() != null) {
            _hashCode += getSearchTerms().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getSiteName() != null) {
            _hashCode += getSiteName().hashCode();
        }
        if (getSearchFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFieldString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "entityTypeString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchType"));
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
