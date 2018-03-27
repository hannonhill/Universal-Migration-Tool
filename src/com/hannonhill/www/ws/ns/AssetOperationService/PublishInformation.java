/**
 * PublishInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PublishInformation  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations;

    private java.lang.Boolean unpublish;

    private java.lang.Boolean publishRelatedAssets;

    private java.lang.Boolean publishRelatedPublishSet;

    public PublishInformation() {
    }

    public PublishInformation(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations,
           java.lang.Boolean unpublish,
           java.lang.Boolean publishRelatedAssets,
           java.lang.Boolean publishRelatedPublishSet) {
           this.identifier = identifier;
           this.destinations = destinations;
           this.unpublish = unpublish;
           this.publishRelatedAssets = publishRelatedAssets;
           this.publishRelatedPublishSet = publishRelatedPublishSet;
    }


    /**
     * Gets the identifier value for this PublishInformation.
     * 
     * @return identifier
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this PublishInformation.
     * 
     * @param identifier
     */
    public void setIdentifier(com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the destinations value for this PublishInformation.
     * 
     * @return destinations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getDestinations() {
        return destinations;
    }


    /**
     * Sets the destinations value for this PublishInformation.
     * 
     * @param destinations
     */
    public void setDestinations(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] destinations) {
        this.destinations = destinations;
    }


    /**
     * Gets the unpublish value for this PublishInformation.
     * 
     * @return unpublish
     */
    public java.lang.Boolean getUnpublish() {
        return unpublish;
    }


    /**
     * Sets the unpublish value for this PublishInformation.
     * 
     * @param unpublish
     */
    public void setUnpublish(java.lang.Boolean unpublish) {
        this.unpublish = unpublish;
    }


    /**
     * Gets the publishRelatedAssets value for this PublishInformation.
     * 
     * @return publishRelatedAssets
     */
    public java.lang.Boolean getPublishRelatedAssets() {
        return publishRelatedAssets;
    }


    /**
     * Sets the publishRelatedAssets value for this PublishInformation.
     * 
     * @param publishRelatedAssets
     */
    public void setPublishRelatedAssets(java.lang.Boolean publishRelatedAssets) {
        this.publishRelatedAssets = publishRelatedAssets;
    }


    /**
     * Gets the publishRelatedPublishSet value for this PublishInformation.
     * 
     * @return publishRelatedPublishSet
     */
    public java.lang.Boolean getPublishRelatedPublishSet() {
        return publishRelatedPublishSet;
    }


    /**
     * Sets the publishRelatedPublishSet value for this PublishInformation.
     * 
     * @param publishRelatedPublishSet
     */
    public void setPublishRelatedPublishSet(java.lang.Boolean publishRelatedPublishSet) {
        this.publishRelatedPublishSet = publishRelatedPublishSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishInformation)) return false;
        PublishInformation other = (PublishInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.destinations==null && other.getDestinations()==null) || 
             (this.destinations!=null &&
              java.util.Arrays.equals(this.destinations, other.getDestinations()))) &&
            ((this.unpublish==null && other.getUnpublish()==null) || 
             (this.unpublish!=null &&
              this.unpublish.equals(other.getUnpublish()))) &&
            ((this.publishRelatedAssets==null && other.getPublishRelatedAssets()==null) || 
             (this.publishRelatedAssets!=null &&
              this.publishRelatedAssets.equals(other.getPublishRelatedAssets()))) &&
            ((this.publishRelatedPublishSet==null && other.getPublishRelatedPublishSet()==null) || 
             (this.publishRelatedPublishSet!=null &&
              this.publishRelatedPublishSet.equals(other.getPublishRelatedPublishSet())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getDestinations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnpublish() != null) {
            _hashCode += getUnpublish().hashCode();
        }
        if (getPublishRelatedAssets() != null) {
            _hashCode += getPublishRelatedAssets().hashCode();
        }
        if (getPublishRelatedPublishSet() != null) {
            _hashCode += getPublishRelatedPublishSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpublish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "unpublish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishRelatedAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishRelatedAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishRelatedPublishSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishRelatedPublishSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
