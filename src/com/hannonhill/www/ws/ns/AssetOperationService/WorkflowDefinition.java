/**
 * WorkflowDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowDefinition  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.String applicableGroups;

    private java.lang.Boolean copy;

    private java.lang.Boolean create;

    private java.lang.Boolean delete;

    private java.lang.Boolean edit;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowNamingBehavior namingBehavior;

    private java.lang.String xml;

    public WorkflowDefinition() {
    }

    public WorkflowDefinition(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String applicableGroups,
           java.lang.Boolean copy,
           java.lang.Boolean create,
           java.lang.Boolean delete,
           java.lang.Boolean edit,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowNamingBehavior namingBehavior,
           java.lang.String xml) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.applicableGroups = applicableGroups;
        this.copy = copy;
        this.create = create;
        this.delete = delete;
        this.edit = edit;
        this.namingBehavior = namingBehavior;
        this.xml = xml;
    }


    /**
     * Gets the applicableGroups value for this WorkflowDefinition.
     * 
     * @return applicableGroups
     */
    public java.lang.String getApplicableGroups() {
        return applicableGroups;
    }


    /**
     * Sets the applicableGroups value for this WorkflowDefinition.
     * 
     * @param applicableGroups
     */
    public void setApplicableGroups(java.lang.String applicableGroups) {
        this.applicableGroups = applicableGroups;
    }


    /**
     * Gets the copy value for this WorkflowDefinition.
     * 
     * @return copy
     */
    public java.lang.Boolean getCopy() {
        return copy;
    }


    /**
     * Sets the copy value for this WorkflowDefinition.
     * 
     * @param copy
     */
    public void setCopy(java.lang.Boolean copy) {
        this.copy = copy;
    }


    /**
     * Gets the create value for this WorkflowDefinition.
     * 
     * @return create
     */
    public java.lang.Boolean getCreate() {
        return create;
    }


    /**
     * Sets the create value for this WorkflowDefinition.
     * 
     * @param create
     */
    public void setCreate(java.lang.Boolean create) {
        this.create = create;
    }


    /**
     * Gets the delete value for this WorkflowDefinition.
     * 
     * @return delete
     */
    public java.lang.Boolean getDelete() {
        return delete;
    }


    /**
     * Sets the delete value for this WorkflowDefinition.
     * 
     * @param delete
     */
    public void setDelete(java.lang.Boolean delete) {
        this.delete = delete;
    }


    /**
     * Gets the edit value for this WorkflowDefinition.
     * 
     * @return edit
     */
    public java.lang.Boolean getEdit() {
        return edit;
    }


    /**
     * Sets the edit value for this WorkflowDefinition.
     * 
     * @param edit
     */
    public void setEdit(java.lang.Boolean edit) {
        this.edit = edit;
    }


    /**
     * Gets the namingBehavior value for this WorkflowDefinition.
     * 
     * @return namingBehavior
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowNamingBehavior getNamingBehavior() {
        return namingBehavior;
    }


    /**
     * Sets the namingBehavior value for this WorkflowDefinition.
     * 
     * @param namingBehavior
     */
    public void setNamingBehavior(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowNamingBehavior namingBehavior) {
        this.namingBehavior = namingBehavior;
    }


    /**
     * Gets the xml value for this WorkflowDefinition.
     * 
     * @return xml
     */
    public java.lang.String getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this WorkflowDefinition.
     * 
     * @param xml
     */
    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowDefinition)) return false;
        WorkflowDefinition other = (WorkflowDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicableGroups==null && other.getApplicableGroups()==null) || 
             (this.applicableGroups!=null &&
              this.applicableGroups.equals(other.getApplicableGroups()))) &&
            ((this.copy==null && other.getCopy()==null) || 
             (this.copy!=null &&
              this.copy.equals(other.getCopy()))) &&
            ((this.create==null && other.getCreate()==null) || 
             (this.create!=null &&
              this.create.equals(other.getCreate()))) &&
            ((this.delete==null && other.getDelete()==null) || 
             (this.delete!=null &&
              this.delete.equals(other.getDelete()))) &&
            ((this.edit==null && other.getEdit()==null) || 
             (this.edit!=null &&
              this.edit.equals(other.getEdit()))) &&
            ((this.namingBehavior==null && other.getNamingBehavior()==null) || 
             (this.namingBehavior!=null &&
              this.namingBehavior.equals(other.getNamingBehavior()))) &&
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml())));
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
        if (getApplicableGroups() != null) {
            _hashCode += getApplicableGroups().hashCode();
        }
        if (getCopy() != null) {
            _hashCode += getCopy().hashCode();
        }
        if (getCreate() != null) {
            _hashCode += getCreate().hashCode();
        }
        if (getDelete() != null) {
            _hashCode += getDelete().hashCode();
        }
        if (getEdit() != null) {
            _hashCode += getEdit().hashCode();
        }
        if (getNamingBehavior() != null) {
            _hashCode += getNamingBehavior().hashCode();
        }
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applicableGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "create"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "delete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "edit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namingBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "namingBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowNamingBehavior"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
