/**
 * Template.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Template  extends com.hannonhill.www.ws.ns.AssetOperationService.FolderContainedAsset  implements java.io.Serializable {
    private java.lang.String targetId;

    private java.lang.String targetPath;

    private java.lang.String formatId;

    private java.lang.String formatPath;

    private java.lang.Boolean formatRecycled;

    private java.lang.String xml;

    private com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions;

    public Template() {
    }

    public Template(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String targetId,
           java.lang.String targetPath,
           java.lang.String formatId,
           java.lang.String formatPath,
           java.lang.Boolean formatRecycled,
           java.lang.String xml,
           com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            siteId,
            siteName);
        this.targetId = targetId;
        this.targetPath = targetPath;
        this.formatId = formatId;
        this.formatPath = formatPath;
        this.formatRecycled = formatRecycled;
        this.xml = xml;
        this.pageRegions = pageRegions;
    }


    /**
     * Gets the targetId value for this Template.
     * 
     * @return targetId
     */
    public java.lang.String getTargetId() {
        return targetId;
    }


    /**
     * Sets the targetId value for this Template.
     * 
     * @param targetId
     */
    public void setTargetId(java.lang.String targetId) {
        this.targetId = targetId;
    }


    /**
     * Gets the targetPath value for this Template.
     * 
     * @return targetPath
     */
    public java.lang.String getTargetPath() {
        return targetPath;
    }


    /**
     * Sets the targetPath value for this Template.
     * 
     * @param targetPath
     */
    public void setTargetPath(java.lang.String targetPath) {
        this.targetPath = targetPath;
    }


    /**
     * Gets the formatId value for this Template.
     * 
     * @return formatId
     */
    public java.lang.String getFormatId() {
        return formatId;
    }


    /**
     * Sets the formatId value for this Template.
     * 
     * @param formatId
     */
    public void setFormatId(java.lang.String formatId) {
        this.formatId = formatId;
    }


    /**
     * Gets the formatPath value for this Template.
     * 
     * @return formatPath
     */
    public java.lang.String getFormatPath() {
        return formatPath;
    }


    /**
     * Sets the formatPath value for this Template.
     * 
     * @param formatPath
     */
    public void setFormatPath(java.lang.String formatPath) {
        this.formatPath = formatPath;
    }


    /**
     * Gets the formatRecycled value for this Template.
     * 
     * @return formatRecycled
     */
    public java.lang.Boolean getFormatRecycled() {
        return formatRecycled;
    }


    /**
     * Sets the formatRecycled value for this Template.
     * 
     * @param formatRecycled
     */
    public void setFormatRecycled(java.lang.Boolean formatRecycled) {
        this.formatRecycled = formatRecycled;
    }


    /**
     * Gets the xml value for this Template.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this Template.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }


    /**
     * Gets the pageRegions value for this Template.
     * 
     * @return pageRegions
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] getPageRegions() {
        return pageRegions;
    }


    /**
     * Sets the pageRegions value for this Template.
     * 
     * @param pageRegions
     */
    public void setPageRegions(com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions) {
        this.pageRegions = pageRegions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Template)) return false;
        Template other = (Template) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetId==null && other.getTargetId()==null) || 
             (this.targetId!=null &&
              this.targetId.equals(other.getTargetId()))) &&
            ((this.targetPath==null && other.getTargetPath()==null) || 
             (this.targetPath!=null &&
              this.targetPath.equals(other.getTargetPath()))) &&
            ((this.formatId==null && other.getFormatId()==null) || 
             (this.formatId!=null &&
              this.formatId.equals(other.getFormatId()))) &&
            ((this.formatPath==null && other.getFormatPath()==null) || 
             (this.formatPath!=null &&
              this.formatPath.equals(other.getFormatPath()))) &&
            ((this.formatRecycled==null && other.getFormatRecycled()==null) || 
             (this.formatRecycled!=null &&
              this.formatRecycled.equals(other.getFormatRecycled()))) &&
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml()))) &&
            ((this.pageRegions==null && other.getPageRegions()==null) || 
             (this.pageRegions!=null &&
              java.util.Arrays.equals(this.pageRegions, other.getPageRegions())));
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
        if (getTargetId() != null) {
            _hashCode += getTargetId().hashCode();
        }
        if (getTargetPath() != null) {
            _hashCode += getTargetPath().hashCode();
        }
        if (getFormatId() != null) {
            _hashCode += getFormatId().hashCode();
        }
        if (getFormatPath() != null) {
            _hashCode += getFormatPath().hashCode();
        }
        if (getFormatRecycled() != null) {
            _hashCode += getFormatRecycled().hashCode();
        }
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        if (getPageRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageRegions(), i);
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
        new org.apache.axis.description.TypeDesc(Template.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "template"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "targetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "targetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion"));
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
