/**
 * PageConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PageConfiguration  extends com.hannonhill.www.ws.ns.AssetOperationService.BaseAsset  implements java.io.Serializable {
    private java.lang.String name;

    private boolean defaultConfiguration;

    private java.lang.String templateId;

    private java.lang.String templatePath;

    private java.lang.String formatId;

    private java.lang.String formatPath;

    private java.lang.Boolean formatRecycled;

    private com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions;

    private java.lang.String outputExtension;

    private com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType;

    private java.lang.Boolean includeXMLDeclaration;

    private java.lang.Boolean publishable;

    public PageConfiguration() {
    }

    public PageConfiguration(
           java.lang.String id,
           java.lang.String name,
           boolean defaultConfiguration,
           java.lang.String templateId,
           java.lang.String templatePath,
           java.lang.String formatId,
           java.lang.String formatPath,
           java.lang.Boolean formatRecycled,
           com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions,
           java.lang.String outputExtension,
           com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType,
           java.lang.Boolean includeXMLDeclaration,
           java.lang.Boolean publishable) {
        super(
            id);
        this.name = name;
        this.defaultConfiguration = defaultConfiguration;
        this.templateId = templateId;
        this.templatePath = templatePath;
        this.formatId = formatId;
        this.formatPath = formatPath;
        this.formatRecycled = formatRecycled;
        this.pageRegions = pageRegions;
        this.outputExtension = outputExtension;
        this.serializationType = serializationType;
        this.includeXMLDeclaration = includeXMLDeclaration;
        this.publishable = publishable;
    }


    /**
     * Gets the name value for this PageConfiguration.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PageConfiguration.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the defaultConfiguration value for this PageConfiguration.
     * 
     * @return defaultConfiguration
     */
    public boolean isDefaultConfiguration() {
        return defaultConfiguration;
    }


    /**
     * Sets the defaultConfiguration value for this PageConfiguration.
     * 
     * @param defaultConfiguration
     */
    public void setDefaultConfiguration(boolean defaultConfiguration) {
        this.defaultConfiguration = defaultConfiguration;
    }


    /**
     * Gets the templateId value for this PageConfiguration.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this PageConfiguration.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the templatePath value for this PageConfiguration.
     * 
     * @return templatePath
     */
    public java.lang.String getTemplatePath() {
        return templatePath;
    }


    /**
     * Sets the templatePath value for this PageConfiguration.
     * 
     * @param templatePath
     */
    public void setTemplatePath(java.lang.String templatePath) {
        this.templatePath = templatePath;
    }


    /**
     * Gets the formatId value for this PageConfiguration.
     * 
     * @return formatId
     */
    public java.lang.String getFormatId() {
        return formatId;
    }


    /**
     * Sets the formatId value for this PageConfiguration.
     * 
     * @param formatId
     */
    public void setFormatId(java.lang.String formatId) {
        this.formatId = formatId;
    }


    /**
     * Gets the formatPath value for this PageConfiguration.
     * 
     * @return formatPath
     */
    public java.lang.String getFormatPath() {
        return formatPath;
    }


    /**
     * Sets the formatPath value for this PageConfiguration.
     * 
     * @param formatPath
     */
    public void setFormatPath(java.lang.String formatPath) {
        this.formatPath = formatPath;
    }


    /**
     * Gets the formatRecycled value for this PageConfiguration.
     * 
     * @return formatRecycled
     */
    public java.lang.Boolean getFormatRecycled() {
        return formatRecycled;
    }


    /**
     * Sets the formatRecycled value for this PageConfiguration.
     * 
     * @param formatRecycled
     */
    public void setFormatRecycled(java.lang.Boolean formatRecycled) {
        this.formatRecycled = formatRecycled;
    }


    /**
     * Gets the pageRegions value for this PageConfiguration.
     * 
     * @return pageRegions
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] getPageRegions() {
        return pageRegions;
    }


    /**
     * Sets the pageRegions value for this PageConfiguration.
     * 
     * @param pageRegions
     */
    public void setPageRegions(com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegions) {
        this.pageRegions = pageRegions;
    }


    /**
     * Gets the outputExtension value for this PageConfiguration.
     * 
     * @return outputExtension
     */
    public java.lang.String getOutputExtension() {
        return outputExtension;
    }


    /**
     * Sets the outputExtension value for this PageConfiguration.
     * 
     * @param outputExtension
     */
    public void setOutputExtension(java.lang.String outputExtension) {
        this.outputExtension = outputExtension;
    }


    /**
     * Gets the serializationType value for this PageConfiguration.
     * 
     * @return serializationType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SerializationType getSerializationType() {
        return serializationType;
    }


    /**
     * Sets the serializationType value for this PageConfiguration.
     * 
     * @param serializationType
     */
    public void setSerializationType(com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType) {
        this.serializationType = serializationType;
    }


    /**
     * Gets the includeXMLDeclaration value for this PageConfiguration.
     * 
     * @return includeXMLDeclaration
     */
    public java.lang.Boolean getIncludeXMLDeclaration() {
        return includeXMLDeclaration;
    }


    /**
     * Sets the includeXMLDeclaration value for this PageConfiguration.
     * 
     * @param includeXMLDeclaration
     */
    public void setIncludeXMLDeclaration(java.lang.Boolean includeXMLDeclaration) {
        this.includeXMLDeclaration = includeXMLDeclaration;
    }


    /**
     * Gets the publishable value for this PageConfiguration.
     * 
     * @return publishable
     */
    public java.lang.Boolean getPublishable() {
        return publishable;
    }


    /**
     * Sets the publishable value for this PageConfiguration.
     * 
     * @param publishable
     */
    public void setPublishable(java.lang.Boolean publishable) {
        this.publishable = publishable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageConfiguration)) return false;
        PageConfiguration other = (PageConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.defaultConfiguration == other.isDefaultConfiguration() &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.templatePath==null && other.getTemplatePath()==null) || 
             (this.templatePath!=null &&
              this.templatePath.equals(other.getTemplatePath()))) &&
            ((this.formatId==null && other.getFormatId()==null) || 
             (this.formatId!=null &&
              this.formatId.equals(other.getFormatId()))) &&
            ((this.formatPath==null && other.getFormatPath()==null) || 
             (this.formatPath!=null &&
              this.formatPath.equals(other.getFormatPath()))) &&
            ((this.formatRecycled==null && other.getFormatRecycled()==null) || 
             (this.formatRecycled!=null &&
              this.formatRecycled.equals(other.getFormatRecycled()))) &&
            ((this.pageRegions==null && other.getPageRegions()==null) || 
             (this.pageRegions!=null &&
              java.util.Arrays.equals(this.pageRegions, other.getPageRegions()))) &&
            ((this.outputExtension==null && other.getOutputExtension()==null) || 
             (this.outputExtension!=null &&
              this.outputExtension.equals(other.getOutputExtension()))) &&
            ((this.serializationType==null && other.getSerializationType()==null) || 
             (this.serializationType!=null &&
              this.serializationType.equals(other.getSerializationType()))) &&
            ((this.includeXMLDeclaration==null && other.getIncludeXMLDeclaration()==null) || 
             (this.includeXMLDeclaration!=null &&
              this.includeXMLDeclaration.equals(other.getIncludeXMLDeclaration()))) &&
            ((this.publishable==null && other.getPublishable()==null) || 
             (this.publishable!=null &&
              this.publishable.equals(other.getPublishable())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isDefaultConfiguration() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getTemplatePath() != null) {
            _hashCode += getTemplatePath().hashCode();
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
        if (getOutputExtension() != null) {
            _hashCode += getOutputExtension().hashCode();
        }
        if (getSerializationType() != null) {
            _hashCode += getSerializationType().hashCode();
        }
        if (getIncludeXMLDeclaration() != null) {
            _hashCode += getIncludeXMLDeclaration().hashCode();
        }
        if (getPublishable() != null) {
            _hashCode += getPublishable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "defaultConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "templateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templatePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "templatePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "formatRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "outputExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serializationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "serializationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "serialization-type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeXMLDeclaration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeXMLDeclaration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishable"));
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
