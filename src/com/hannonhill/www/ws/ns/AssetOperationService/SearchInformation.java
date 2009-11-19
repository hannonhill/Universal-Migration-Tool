/**
 * SearchInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SearchInformation  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType;

    private java.lang.String assetName;

    private java.lang.String assetContent;

    private java.lang.String assetMetadata;

    private java.lang.Boolean searchBlocks;

    private java.lang.Boolean searchFiles;

    private java.lang.Boolean searchFolders;

    private java.lang.Boolean searchPages;

    private java.lang.Boolean searchFormats;

    private java.lang.Boolean searchSymlinks;

    private java.lang.Boolean searchTemplates;

    public SearchInformation() {
    }

    public SearchInformation(
           com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType,
           java.lang.String assetName,
           java.lang.String assetContent,
           java.lang.String assetMetadata,
           java.lang.Boolean searchBlocks,
           java.lang.Boolean searchFiles,
           java.lang.Boolean searchFolders,
           java.lang.Boolean searchPages,
           java.lang.Boolean searchFormats,
           java.lang.Boolean searchSymlinks,
           java.lang.Boolean searchTemplates) {
           this.matchType = matchType;
           this.assetName = assetName;
           this.assetContent = assetContent;
           this.assetMetadata = assetMetadata;
           this.searchBlocks = searchBlocks;
           this.searchFiles = searchFiles;
           this.searchFolders = searchFolders;
           this.searchPages = searchPages;
           this.searchFormats = searchFormats;
           this.searchSymlinks = searchSymlinks;
           this.searchTemplates = searchTemplates;
    }


    /**
     * Gets the matchType value for this SearchInformation.
     * 
     * @return matchType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this SearchInformation.
     * 
     * @param matchType
     */
    public void setMatchType(com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the assetName value for this SearchInformation.
     * 
     * @return assetName
     */
    public java.lang.String getAssetName() {
        return assetName;
    }


    /**
     * Sets the assetName value for this SearchInformation.
     * 
     * @param assetName
     */
    public void setAssetName(java.lang.String assetName) {
        this.assetName = assetName;
    }


    /**
     * Gets the assetContent value for this SearchInformation.
     * 
     * @return assetContent
     */
    public java.lang.String getAssetContent() {
        return assetContent;
    }


    /**
     * Sets the assetContent value for this SearchInformation.
     * 
     * @param assetContent
     */
    public void setAssetContent(java.lang.String assetContent) {
        this.assetContent = assetContent;
    }


    /**
     * Gets the assetMetadata value for this SearchInformation.
     * 
     * @return assetMetadata
     */
    public java.lang.String getAssetMetadata() {
        return assetMetadata;
    }


    /**
     * Sets the assetMetadata value for this SearchInformation.
     * 
     * @param assetMetadata
     */
    public void setAssetMetadata(java.lang.String assetMetadata) {
        this.assetMetadata = assetMetadata;
    }


    /**
     * Gets the searchBlocks value for this SearchInformation.
     * 
     * @return searchBlocks
     */
    public java.lang.Boolean getSearchBlocks() {
        return searchBlocks;
    }


    /**
     * Sets the searchBlocks value for this SearchInformation.
     * 
     * @param searchBlocks
     */
    public void setSearchBlocks(java.lang.Boolean searchBlocks) {
        this.searchBlocks = searchBlocks;
    }


    /**
     * Gets the searchFiles value for this SearchInformation.
     * 
     * @return searchFiles
     */
    public java.lang.Boolean getSearchFiles() {
        return searchFiles;
    }


    /**
     * Sets the searchFiles value for this SearchInformation.
     * 
     * @param searchFiles
     */
    public void setSearchFiles(java.lang.Boolean searchFiles) {
        this.searchFiles = searchFiles;
    }


    /**
     * Gets the searchFolders value for this SearchInformation.
     * 
     * @return searchFolders
     */
    public java.lang.Boolean getSearchFolders() {
        return searchFolders;
    }


    /**
     * Sets the searchFolders value for this SearchInformation.
     * 
     * @param searchFolders
     */
    public void setSearchFolders(java.lang.Boolean searchFolders) {
        this.searchFolders = searchFolders;
    }


    /**
     * Gets the searchPages value for this SearchInformation.
     * 
     * @return searchPages
     */
    public java.lang.Boolean getSearchPages() {
        return searchPages;
    }


    /**
     * Sets the searchPages value for this SearchInformation.
     * 
     * @param searchPages
     */
    public void setSearchPages(java.lang.Boolean searchPages) {
        this.searchPages = searchPages;
    }


    /**
     * Gets the searchFormats value for this SearchInformation.
     * 
     * @return searchFormats
     */
    public java.lang.Boolean getSearchFormats() {
        return searchFormats;
    }


    /**
     * Sets the searchFormats value for this SearchInformation.
     * 
     * @param searchFormats
     */
    public void setSearchFormats(java.lang.Boolean searchFormats) {
        this.searchFormats = searchFormats;
    }


    /**
     * Gets the searchSymlinks value for this SearchInformation.
     * 
     * @return searchSymlinks
     */
    public java.lang.Boolean getSearchSymlinks() {
        return searchSymlinks;
    }


    /**
     * Sets the searchSymlinks value for this SearchInformation.
     * 
     * @param searchSymlinks
     */
    public void setSearchSymlinks(java.lang.Boolean searchSymlinks) {
        this.searchSymlinks = searchSymlinks;
    }


    /**
     * Gets the searchTemplates value for this SearchInformation.
     * 
     * @return searchTemplates
     */
    public java.lang.Boolean getSearchTemplates() {
        return searchTemplates;
    }


    /**
     * Sets the searchTemplates value for this SearchInformation.
     * 
     * @param searchTemplates
     */
    public void setSearchTemplates(java.lang.Boolean searchTemplates) {
        this.searchTemplates = searchTemplates;
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
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.assetName==null && other.getAssetName()==null) || 
             (this.assetName!=null &&
              this.assetName.equals(other.getAssetName()))) &&
            ((this.assetContent==null && other.getAssetContent()==null) || 
             (this.assetContent!=null &&
              this.assetContent.equals(other.getAssetContent()))) &&
            ((this.assetMetadata==null && other.getAssetMetadata()==null) || 
             (this.assetMetadata!=null &&
              this.assetMetadata.equals(other.getAssetMetadata()))) &&
            ((this.searchBlocks==null && other.getSearchBlocks()==null) || 
             (this.searchBlocks!=null &&
              this.searchBlocks.equals(other.getSearchBlocks()))) &&
            ((this.searchFiles==null && other.getSearchFiles()==null) || 
             (this.searchFiles!=null &&
              this.searchFiles.equals(other.getSearchFiles()))) &&
            ((this.searchFolders==null && other.getSearchFolders()==null) || 
             (this.searchFolders!=null &&
              this.searchFolders.equals(other.getSearchFolders()))) &&
            ((this.searchPages==null && other.getSearchPages()==null) || 
             (this.searchPages!=null &&
              this.searchPages.equals(other.getSearchPages()))) &&
            ((this.searchFormats==null && other.getSearchFormats()==null) || 
             (this.searchFormats!=null &&
              this.searchFormats.equals(other.getSearchFormats()))) &&
            ((this.searchSymlinks==null && other.getSearchSymlinks()==null) || 
             (this.searchSymlinks!=null &&
              this.searchSymlinks.equals(other.getSearchSymlinks()))) &&
            ((this.searchTemplates==null && other.getSearchTemplates()==null) || 
             (this.searchTemplates!=null &&
              this.searchTemplates.equals(other.getSearchTemplates())));
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
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getAssetName() != null) {
            _hashCode += getAssetName().hashCode();
        }
        if (getAssetContent() != null) {
            _hashCode += getAssetContent().hashCode();
        }
        if (getAssetMetadata() != null) {
            _hashCode += getAssetMetadata().hashCode();
        }
        if (getSearchBlocks() != null) {
            _hashCode += getSearchBlocks().hashCode();
        }
        if (getSearchFiles() != null) {
            _hashCode += getSearchFiles().hashCode();
        }
        if (getSearchFolders() != null) {
            _hashCode += getSearchFolders().hashCode();
        }
        if (getSearchPages() != null) {
            _hashCode += getSearchPages().hashCode();
        }
        if (getSearchFormats() != null) {
            _hashCode += getSearchFormats().hashCode();
        }
        if (getSearchSymlinks() != null) {
            _hashCode += getSearchSymlinks().hashCode();
        }
        if (getSearchTemplates() != null) {
            _hashCode += getSearchTemplates().hashCode();
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
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search-match-type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFormats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFormats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSymlinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchSymlinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
