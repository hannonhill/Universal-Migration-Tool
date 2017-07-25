/**
 * ListEditorConfigurationsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ListEditorConfigurationsResult  extends com.hannonhill.www.ws.ns.AssetOperationService.OperationResult  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] editorConfigurations;

    public ListEditorConfigurationsResult() {
    }

    public ListEditorConfigurationsResult(
           java.lang.String success,
           java.lang.String message,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] editorConfigurations) {
        super(
            success,
            message);
        this.editorConfigurations = editorConfigurations;
    }


    /**
     * Gets the editorConfigurations value for this ListEditorConfigurationsResult.
     * 
     * @return editorConfigurations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getEditorConfigurations() {
        return editorConfigurations;
    }


    /**
     * Sets the editorConfigurations value for this ListEditorConfigurationsResult.
     * 
     * @param editorConfigurations
     */
    public void setEditorConfigurations(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] editorConfigurations) {
        this.editorConfigurations = editorConfigurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListEditorConfigurationsResult)) return false;
        ListEditorConfigurationsResult other = (ListEditorConfigurationsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.editorConfigurations==null && other.getEditorConfigurations()==null) || 
             (this.editorConfigurations!=null &&
              java.util.Arrays.equals(this.editorConfigurations, other.getEditorConfigurations())));
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
        if (getEditorConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorConfigurations(), i);
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
        new org.apache.axis.description.TypeDesc(ListEditorConfigurationsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listEditorConfigurationsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editorConfigurations"));
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
