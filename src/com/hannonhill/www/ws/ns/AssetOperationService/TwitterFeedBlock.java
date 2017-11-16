/**
 * TwitterFeedBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class TwitterFeedBlock  extends com.hannonhill.www.ws.ns.AssetOperationService.Block  implements java.io.Serializable {
    private java.lang.String accountName;

    private java.lang.String searchString;

    private org.apache.axis.types.NonNegativeInteger maxResults;

    private boolean useDefaultStyle;

    private boolean excludeJQuery;

    private com.hannonhill.www.ws.ns.AssetOperationService.TwitterQueryType queryType;

    public TwitterFeedBlock() {
    }

    public TwitterFeedBlock(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.util.Calendar createdDate,
           java.lang.String createdBy,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata,
           java.lang.String metadataSetId,
           java.lang.String metadataSetPath,
           java.lang.Boolean reviewOnSchedule,
           org.apache.axis.types.NonNegativeInteger reviewEvery,
           java.lang.String expirationFolderId,
           java.lang.String expirationFolderPath,
           java.lang.Boolean expirationFolderRecycled,
           java.lang.String accountName,
           java.lang.String searchString,
           org.apache.axis.types.NonNegativeInteger maxResults,
           boolean useDefaultStyle,
           boolean excludeJQuery,
           com.hannonhill.www.ws.ns.AssetOperationService.TwitterQueryType queryType) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            createdDate,
            createdBy,
            siteId,
            siteName,
            metadata,
            metadataSetId,
            metadataSetPath,
            reviewOnSchedule,
            reviewEvery,
            expirationFolderId,
            expirationFolderPath,
            expirationFolderRecycled);
        this.accountName = accountName;
        this.searchString = searchString;
        this.maxResults = maxResults;
        this.useDefaultStyle = useDefaultStyle;
        this.excludeJQuery = excludeJQuery;
        this.queryType = queryType;
    }


    /**
     * Gets the accountName value for this TwitterFeedBlock.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this TwitterFeedBlock.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the searchString value for this TwitterFeedBlock.
     * 
     * @return searchString
     */
    public java.lang.String getSearchString() {
        return searchString;
    }


    /**
     * Sets the searchString value for this TwitterFeedBlock.
     * 
     * @param searchString
     */
    public void setSearchString(java.lang.String searchString) {
        this.searchString = searchString;
    }


    /**
     * Gets the maxResults value for this TwitterFeedBlock.
     * 
     * @return maxResults
     */
    public org.apache.axis.types.NonNegativeInteger getMaxResults() {
        return maxResults;
    }


    /**
     * Sets the maxResults value for this TwitterFeedBlock.
     * 
     * @param maxResults
     */
    public void setMaxResults(org.apache.axis.types.NonNegativeInteger maxResults) {
        this.maxResults = maxResults;
    }


    /**
     * Gets the useDefaultStyle value for this TwitterFeedBlock.
     * 
     * @return useDefaultStyle
     */
    public boolean isUseDefaultStyle() {
        return useDefaultStyle;
    }


    /**
     * Sets the useDefaultStyle value for this TwitterFeedBlock.
     * 
     * @param useDefaultStyle
     */
    public void setUseDefaultStyle(boolean useDefaultStyle) {
        this.useDefaultStyle = useDefaultStyle;
    }


    /**
     * Gets the excludeJQuery value for this TwitterFeedBlock.
     * 
     * @return excludeJQuery
     */
    public boolean isExcludeJQuery() {
        return excludeJQuery;
    }


    /**
     * Sets the excludeJQuery value for this TwitterFeedBlock.
     * 
     * @param excludeJQuery
     */
    public void setExcludeJQuery(boolean excludeJQuery) {
        this.excludeJQuery = excludeJQuery;
    }


    /**
     * Gets the queryType value for this TwitterFeedBlock.
     * 
     * @return queryType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.TwitterQueryType getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this TwitterFeedBlock.
     * 
     * @param queryType
     */
    public void setQueryType(com.hannonhill.www.ws.ns.AssetOperationService.TwitterQueryType queryType) {
        this.queryType = queryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TwitterFeedBlock)) return false;
        TwitterFeedBlock other = (TwitterFeedBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.searchString==null && other.getSearchString()==null) || 
             (this.searchString!=null &&
              this.searchString.equals(other.getSearchString()))) &&
            ((this.maxResults==null && other.getMaxResults()==null) || 
             (this.maxResults!=null &&
              this.maxResults.equals(other.getMaxResults()))) &&
            this.useDefaultStyle == other.isUseDefaultStyle() &&
            this.excludeJQuery == other.isExcludeJQuery() &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType())));
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
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getSearchString() != null) {
            _hashCode += getSearchString().hashCode();
        }
        if (getMaxResults() != null) {
            _hashCode += getMaxResults().hashCode();
        }
        _hashCode += (isUseDefaultStyle() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExcludeJQuery() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TwitterFeedBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitterFeedBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "maxResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "useDefaultStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeJQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "excludeJQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitter-query-type"));
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
