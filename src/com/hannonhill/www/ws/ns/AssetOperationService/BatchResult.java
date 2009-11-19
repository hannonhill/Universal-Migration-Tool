/**
 * BatchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class BatchResult  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.OperationResult operationResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult checkOutResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.CreateResult createResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult listMessagesResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.ReadResult readResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult readAccessRightsResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult readAuditsResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.SearchResult searchResult;

    private com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult readWorkflowInformationResult;

    public BatchResult() {
    }

    public BatchResult(
           com.hannonhill.www.ws.ns.AssetOperationService.OperationResult operationResult,
           com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult checkOutResult,
           com.hannonhill.www.ws.ns.AssetOperationService.CreateResult createResult,
           com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult listMessagesResult,
           com.hannonhill.www.ws.ns.AssetOperationService.ReadResult readResult,
           com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult readAccessRightsResult,
           com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult readAuditsResult,
           com.hannonhill.www.ws.ns.AssetOperationService.SearchResult searchResult,
           com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult readWorkflowInformationResult) {
           this.operationResult = operationResult;
           this.checkOutResult = checkOutResult;
           this.createResult = createResult;
           this.listMessagesResult = listMessagesResult;
           this.readResult = readResult;
           this.readAccessRightsResult = readAccessRightsResult;
           this.readAuditsResult = readAuditsResult;
           this.searchResult = searchResult;
           this.readWorkflowInformationResult = readWorkflowInformationResult;
    }


    /**
     * Gets the operationResult value for this BatchResult.
     * 
     * @return operationResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult getOperationResult() {
        return operationResult;
    }


    /**
     * Sets the operationResult value for this BatchResult.
     * 
     * @param operationResult
     */
    public void setOperationResult(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult operationResult) {
        this.operationResult = operationResult;
    }


    /**
     * Gets the checkOutResult value for this BatchResult.
     * 
     * @return checkOutResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult getCheckOutResult() {
        return checkOutResult;
    }


    /**
     * Sets the checkOutResult value for this BatchResult.
     * 
     * @param checkOutResult
     */
    public void setCheckOutResult(com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult checkOutResult) {
        this.checkOutResult = checkOutResult;
    }


    /**
     * Gets the createResult value for this BatchResult.
     * 
     * @return createResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.CreateResult getCreateResult() {
        return createResult;
    }


    /**
     * Sets the createResult value for this BatchResult.
     * 
     * @param createResult
     */
    public void setCreateResult(com.hannonhill.www.ws.ns.AssetOperationService.CreateResult createResult) {
        this.createResult = createResult;
    }


    /**
     * Gets the listMessagesResult value for this BatchResult.
     * 
     * @return listMessagesResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult getListMessagesResult() {
        return listMessagesResult;
    }


    /**
     * Sets the listMessagesResult value for this BatchResult.
     * 
     * @param listMessagesResult
     */
    public void setListMessagesResult(com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult listMessagesResult) {
        this.listMessagesResult = listMessagesResult;
    }


    /**
     * Gets the readResult value for this BatchResult.
     * 
     * @return readResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadResult getReadResult() {
        return readResult;
    }


    /**
     * Sets the readResult value for this BatchResult.
     * 
     * @param readResult
     */
    public void setReadResult(com.hannonhill.www.ws.ns.AssetOperationService.ReadResult readResult) {
        this.readResult = readResult;
    }


    /**
     * Gets the readAccessRightsResult value for this BatchResult.
     * 
     * @return readAccessRightsResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult getReadAccessRightsResult() {
        return readAccessRightsResult;
    }


    /**
     * Sets the readAccessRightsResult value for this BatchResult.
     * 
     * @param readAccessRightsResult
     */
    public void setReadAccessRightsResult(com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult readAccessRightsResult) {
        this.readAccessRightsResult = readAccessRightsResult;
    }


    /**
     * Gets the readAuditsResult value for this BatchResult.
     * 
     * @return readAuditsResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult getReadAuditsResult() {
        return readAuditsResult;
    }


    /**
     * Sets the readAuditsResult value for this BatchResult.
     * 
     * @param readAuditsResult
     */
    public void setReadAuditsResult(com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult readAuditsResult) {
        this.readAuditsResult = readAuditsResult;
    }


    /**
     * Gets the searchResult value for this BatchResult.
     * 
     * @return searchResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SearchResult getSearchResult() {
        return searchResult;
    }


    /**
     * Sets the searchResult value for this BatchResult.
     * 
     * @param searchResult
     */
    public void setSearchResult(com.hannonhill.www.ws.ns.AssetOperationService.SearchResult searchResult) {
        this.searchResult = searchResult;
    }


    /**
     * Gets the readWorkflowInformationResult value for this BatchResult.
     * 
     * @return readWorkflowInformationResult
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult getReadWorkflowInformationResult() {
        return readWorkflowInformationResult;
    }


    /**
     * Sets the readWorkflowInformationResult value for this BatchResult.
     * 
     * @param readWorkflowInformationResult
     */
    public void setReadWorkflowInformationResult(com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult readWorkflowInformationResult) {
        this.readWorkflowInformationResult = readWorkflowInformationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchResult)) return false;
        BatchResult other = (BatchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationResult==null && other.getOperationResult()==null) || 
             (this.operationResult!=null &&
              this.operationResult.equals(other.getOperationResult()))) &&
            ((this.checkOutResult==null && other.getCheckOutResult()==null) || 
             (this.checkOutResult!=null &&
              this.checkOutResult.equals(other.getCheckOutResult()))) &&
            ((this.createResult==null && other.getCreateResult()==null) || 
             (this.createResult!=null &&
              this.createResult.equals(other.getCreateResult()))) &&
            ((this.listMessagesResult==null && other.getListMessagesResult()==null) || 
             (this.listMessagesResult!=null &&
              this.listMessagesResult.equals(other.getListMessagesResult()))) &&
            ((this.readResult==null && other.getReadResult()==null) || 
             (this.readResult!=null &&
              this.readResult.equals(other.getReadResult()))) &&
            ((this.readAccessRightsResult==null && other.getReadAccessRightsResult()==null) || 
             (this.readAccessRightsResult!=null &&
              this.readAccessRightsResult.equals(other.getReadAccessRightsResult()))) &&
            ((this.readAuditsResult==null && other.getReadAuditsResult()==null) || 
             (this.readAuditsResult!=null &&
              this.readAuditsResult.equals(other.getReadAuditsResult()))) &&
            ((this.searchResult==null && other.getSearchResult()==null) || 
             (this.searchResult!=null &&
              this.searchResult.equals(other.getSearchResult()))) &&
            ((this.readWorkflowInformationResult==null && other.getReadWorkflowInformationResult()==null) || 
             (this.readWorkflowInformationResult!=null &&
              this.readWorkflowInformationResult.equals(other.getReadWorkflowInformationResult())));
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
        if (getOperationResult() != null) {
            _hashCode += getOperationResult().hashCode();
        }
        if (getCheckOutResult() != null) {
            _hashCode += getCheckOutResult().hashCode();
        }
        if (getCreateResult() != null) {
            _hashCode += getCreateResult().hashCode();
        }
        if (getListMessagesResult() != null) {
            _hashCode += getListMessagesResult().hashCode();
        }
        if (getReadResult() != null) {
            _hashCode += getReadResult().hashCode();
        }
        if (getReadAccessRightsResult() != null) {
            _hashCode += getReadAccessRightsResult().hashCode();
        }
        if (getReadAuditsResult() != null) {
            _hashCode += getReadAuditsResult().hashCode();
        }
        if (getSearchResult() != null) {
            _hashCode += getSearchResult().hashCode();
        }
        if (getReadWorkflowInformationResult() != null) {
            _hashCode += getReadWorkflowInformationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "batchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOutResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOutResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOutResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "createResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "createResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listMessagesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessagesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessagesResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAccessRightsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRightsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRightsResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readAuditsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAuditsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAuditsResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readWorkflowInformationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformationResult"));
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
