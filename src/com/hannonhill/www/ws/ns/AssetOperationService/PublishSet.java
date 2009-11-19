/**
 * PublishSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PublishSet  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] files;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] folders;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] pages;

    private java.lang.Boolean usesScheduledPublishing;

    private org.apache.axis.types.Time timeToPublish;

    private org.apache.axis.types.NonNegativeInteger publishInterval;

    private com.hannonhill.www.ws.ns.AssetOperationService.TimeUnits publishIntervalUnits;

    public PublishSet() {
    }

    public PublishSet(
           java.lang.String id,
           com.hannonhill.www.ws.ns.AssetOperationService.EntityType entityType,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] files,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] folders,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] pages,
           java.lang.Boolean usesScheduledPublishing,
           org.apache.axis.types.Time timeToPublish,
           org.apache.axis.types.NonNegativeInteger publishInterval,
           com.hannonhill.www.ws.ns.AssetOperationService.TimeUnits publishIntervalUnits) {
        super(
            id,
            entityType,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.files = files;
        this.folders = folders;
        this.pages = pages;
        this.usesScheduledPublishing = usesScheduledPublishing;
        this.timeToPublish = timeToPublish;
        this.publishInterval = publishInterval;
        this.publishIntervalUnits = publishIntervalUnits;
    }


    /**
     * Gets the files value for this PublishSet.
     * 
     * @return files
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this PublishSet.
     * 
     * @param files
     */
    public void setFiles(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] files) {
        this.files = files;
    }


    /**
     * Gets the folders value for this PublishSet.
     * 
     * @return folders
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getFolders() {
        return folders;
    }


    /**
     * Sets the folders value for this PublishSet.
     * 
     * @param folders
     */
    public void setFolders(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] folders) {
        this.folders = folders;
    }


    /**
     * Gets the pages value for this PublishSet.
     * 
     * @return pages
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this PublishSet.
     * 
     * @param pages
     */
    public void setPages(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] pages) {
        this.pages = pages;
    }


    /**
     * Gets the usesScheduledPublishing value for this PublishSet.
     * 
     * @return usesScheduledPublishing
     */
    public java.lang.Boolean getUsesScheduledPublishing() {
        return usesScheduledPublishing;
    }


    /**
     * Sets the usesScheduledPublishing value for this PublishSet.
     * 
     * @param usesScheduledPublishing
     */
    public void setUsesScheduledPublishing(java.lang.Boolean usesScheduledPublishing) {
        this.usesScheduledPublishing = usesScheduledPublishing;
    }


    /**
     * Gets the timeToPublish value for this PublishSet.
     * 
     * @return timeToPublish
     */
    public org.apache.axis.types.Time getTimeToPublish() {
        return timeToPublish;
    }


    /**
     * Sets the timeToPublish value for this PublishSet.
     * 
     * @param timeToPublish
     */
    public void setTimeToPublish(org.apache.axis.types.Time timeToPublish) {
        this.timeToPublish = timeToPublish;
    }


    /**
     * Gets the publishInterval value for this PublishSet.
     * 
     * @return publishInterval
     */
    public org.apache.axis.types.NonNegativeInteger getPublishInterval() {
        return publishInterval;
    }


    /**
     * Sets the publishInterval value for this PublishSet.
     * 
     * @param publishInterval
     */
    public void setPublishInterval(org.apache.axis.types.NonNegativeInteger publishInterval) {
        this.publishInterval = publishInterval;
    }


    /**
     * Gets the publishIntervalUnits value for this PublishSet.
     * 
     * @return publishIntervalUnits
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.TimeUnits getPublishIntervalUnits() {
        return publishIntervalUnits;
    }


    /**
     * Sets the publishIntervalUnits value for this PublishSet.
     * 
     * @param publishIntervalUnits
     */
    public void setPublishIntervalUnits(com.hannonhill.www.ws.ns.AssetOperationService.TimeUnits publishIntervalUnits) {
        this.publishIntervalUnits = publishIntervalUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishSet)) return false;
        PublishSet other = (PublishSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.folders==null && other.getFolders()==null) || 
             (this.folders!=null &&
              java.util.Arrays.equals(this.folders, other.getFolders()))) &&
            ((this.pages==null && other.getPages()==null) || 
             (this.pages!=null &&
              java.util.Arrays.equals(this.pages, other.getPages()))) &&
            ((this.usesScheduledPublishing==null && other.getUsesScheduledPublishing()==null) || 
             (this.usesScheduledPublishing!=null &&
              this.usesScheduledPublishing.equals(other.getUsesScheduledPublishing()))) &&
            ((this.timeToPublish==null && other.getTimeToPublish()==null) || 
             (this.timeToPublish!=null &&
              this.timeToPublish.equals(other.getTimeToPublish()))) &&
            ((this.publishInterval==null && other.getPublishInterval()==null) || 
             (this.publishInterval!=null &&
              this.publishInterval.equals(other.getPublishInterval()))) &&
            ((this.publishIntervalUnits==null && other.getPublishIntervalUnits()==null) || 
             (this.publishIntervalUnits!=null &&
              this.publishIntervalUnits.equals(other.getPublishIntervalUnits())));
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
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFolders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFolders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFolders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsesScheduledPublishing() != null) {
            _hashCode += getUsesScheduledPublishing().hashCode();
        }
        if (getTimeToPublish() != null) {
            _hashCode += getTimeToPublish().hashCode();
        }
        if (getPublishInterval() != null) {
            _hashCode += getPublishInterval().hashCode();
        }
        if (getPublishIntervalUnits() != null) {
            _hashCode += getPublishIntervalUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishableAssetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishableAssetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishableAssetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesScheduledPublishing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "usesScheduledPublishing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToPublish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "timeToPublish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishIntervalUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishIntervalUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "timeUnits"));
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
