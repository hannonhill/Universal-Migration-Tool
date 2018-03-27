/**
 * ListSubscribersResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ListSubscribersResult  extends com.hannonhill.www.ws.ns.AssetOperationService.OperationResult  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] subscribers;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] manualSubscribers;

    public ListSubscribersResult() {
    }

    public ListSubscribersResult(
           java.lang.String success,
           java.lang.String message,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] subscribers,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] manualSubscribers) {
        super(
            success,
            message);
        this.subscribers = subscribers;
        this.manualSubscribers = manualSubscribers;
    }


    /**
     * Gets the subscribers value for this ListSubscribersResult.
     * 
     * @return subscribers
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getSubscribers() {
        return subscribers;
    }


    /**
     * Sets the subscribers value for this ListSubscribersResult.
     * 
     * @param subscribers
     */
    public void setSubscribers(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] subscribers) {
        this.subscribers = subscribers;
    }


    /**
     * Gets the manualSubscribers value for this ListSubscribersResult.
     * 
     * @return manualSubscribers
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getManualSubscribers() {
        return manualSubscribers;
    }


    /**
     * Sets the manualSubscribers value for this ListSubscribersResult.
     * 
     * @param manualSubscribers
     */
    public void setManualSubscribers(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] manualSubscribers) {
        this.manualSubscribers = manualSubscribers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListSubscribersResult)) return false;
        ListSubscribersResult other = (ListSubscribersResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscribers==null && other.getSubscribers()==null) || 
             (this.subscribers!=null &&
              java.util.Arrays.equals(this.subscribers, other.getSubscribers()))) &&
            ((this.manualSubscribers==null && other.getManualSubscribers()==null) || 
             (this.manualSubscribers!=null &&
              java.util.Arrays.equals(this.manualSubscribers, other.getManualSubscribers())));
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
        if (getSubscribers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManualSubscribers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManualSubscribers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManualSubscribers(), i);
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
        new org.apache.axis.description.TypeDesc(ListSubscribersResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listSubscribersResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "subscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetIdentifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualSubscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "manualSubscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetIdentifier"));
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
