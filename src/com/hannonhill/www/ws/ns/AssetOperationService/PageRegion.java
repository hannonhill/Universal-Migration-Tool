/**
 * PageRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PageRegion  extends com.hannonhill.www.ws.ns.AssetOperationService.BaseAsset  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String blockId;

    private java.lang.String blockPath;

    private java.lang.Boolean blockRecycled;

    private java.lang.Boolean noBlock;

    private java.lang.String formatId;

    private java.lang.String formatPath;

    private java.lang.Boolean formatRecycled;

    private java.lang.Boolean noFormat;

    public PageRegion() {
    }

    public PageRegion(
           java.lang.String id,
           java.lang.String name,
           java.lang.String blockId,
           java.lang.String blockPath,
           java.lang.Boolean blockRecycled,
           java.lang.Boolean noBlock,
           java.lang.String formatId,
           java.lang.String formatPath,
           java.lang.Boolean formatRecycled,
           java.lang.Boolean noFormat) {
        super(
            id);
        this.name = name;
        this.blockId = blockId;
        this.blockPath = blockPath;
        this.blockRecycled = blockRecycled;
        this.noBlock = noBlock;
        this.formatId = formatId;
        this.formatPath = formatPath;
        this.formatRecycled = formatRecycled;
        this.noFormat = noFormat;
    }


    /**
     * Gets the name value for this PageRegion.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PageRegion.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the blockId value for this PageRegion.
     * 
     * @return blockId
     */
    public java.lang.String getBlockId() {
        return blockId;
    }


    /**
     * Sets the blockId value for this PageRegion.
     * 
     * @param blockId
     */
    public void setBlockId(java.lang.String blockId) {
        this.blockId = blockId;
    }


    /**
     * Gets the blockPath value for this PageRegion.
     * 
     * @return blockPath
     */
    public java.lang.String getBlockPath() {
        return blockPath;
    }


    /**
     * Sets the blockPath value for this PageRegion.
     * 
     * @param blockPath
     */
    public void setBlockPath(java.lang.String blockPath) {
        this.blockPath = blockPath;
    }


    /**
     * Gets the blockRecycled value for this PageRegion.
     * 
     * @return blockRecycled
     */
    public java.lang.Boolean getBlockRecycled() {
        return blockRecycled;
    }


    /**
     * Sets the blockRecycled value for this PageRegion.
     * 
     * @param blockRecycled
     */
    public void setBlockRecycled(java.lang.Boolean blockRecycled) {
        this.blockRecycled = blockRecycled;
    }


    /**
     * Gets the noBlock value for this PageRegion.
     * 
     * @return noBlock
     */
    public java.lang.Boolean getNoBlock() {
        return noBlock;
    }


    /**
     * Sets the noBlock value for this PageRegion.
     * 
     * @param noBlock
     */
    public void setNoBlock(java.lang.Boolean noBlock) {
        this.noBlock = noBlock;
    }


    /**
     * Gets the formatId value for this PageRegion.
     * 
     * @return formatId
     */
    public java.lang.String getFormatId() {
        return formatId;
    }


    /**
     * Sets the formatId value for this PageRegion.
     * 
     * @param formatId
     */
    public void setFormatId(java.lang.String formatId) {
        this.formatId = formatId;
    }


    /**
     * Gets the formatPath value for this PageRegion.
     * 
     * @return formatPath
     */
    public java.lang.String getFormatPath() {
        return formatPath;
    }


    /**
     * Sets the formatPath value for this PageRegion.
     * 
     * @param formatPath
     */
    public void setFormatPath(java.lang.String formatPath) {
        this.formatPath = formatPath;
    }


    /**
     * Gets the formatRecycled value for this PageRegion.
     * 
     * @return formatRecycled
     */
    public java.lang.Boolean getFormatRecycled() {
        return formatRecycled;
    }


    /**
     * Sets the formatRecycled value for this PageRegion.
     * 
     * @param formatRecycled
     */
    public void setFormatRecycled(java.lang.Boolean formatRecycled) {
        this.formatRecycled = formatRecycled;
    }


    /**
     * Gets the noFormat value for this PageRegion.
     * 
     * @return noFormat
     */
    public java.lang.Boolean getNoFormat() {
        return noFormat;
    }


    /**
     * Sets the noFormat value for this PageRegion.
     * 
     * @param noFormat
     */
    public void setNoFormat(java.lang.Boolean noFormat) {
        this.noFormat = noFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageRegion)) return false;
        PageRegion other = (PageRegion) obj;
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
            ((this.blockId==null && other.getBlockId()==null) || 
             (this.blockId!=null &&
              this.blockId.equals(other.getBlockId()))) &&
            ((this.blockPath==null && other.getBlockPath()==null) || 
             (this.blockPath!=null &&
              this.blockPath.equals(other.getBlockPath()))) &&
            ((this.blockRecycled==null && other.getBlockRecycled()==null) || 
             (this.blockRecycled!=null &&
              this.blockRecycled.equals(other.getBlockRecycled()))) &&
            ((this.noBlock==null && other.getNoBlock()==null) || 
             (this.noBlock!=null &&
              this.noBlock.equals(other.getNoBlock()))) &&
            ((this.formatId==null && other.getFormatId()==null) || 
             (this.formatId!=null &&
              this.formatId.equals(other.getFormatId()))) &&
            ((this.formatPath==null && other.getFormatPath()==null) || 
             (this.formatPath!=null &&
              this.formatPath.equals(other.getFormatPath()))) &&
            ((this.formatRecycled==null && other.getFormatRecycled()==null) || 
             (this.formatRecycled!=null &&
              this.formatRecycled.equals(other.getFormatRecycled()))) &&
            ((this.noFormat==null && other.getNoFormat()==null) || 
             (this.noFormat!=null &&
              this.noFormat.equals(other.getNoFormat())));
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
        if (getBlockId() != null) {
            _hashCode += getBlockId().hashCode();
        }
        if (getBlockPath() != null) {
            _hashCode += getBlockPath().hashCode();
        }
        if (getBlockRecycled() != null) {
            _hashCode += getBlockRecycled().hashCode();
        }
        if (getNoBlock() != null) {
            _hashCode += getNoBlock().hashCode();
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
        if (getNoFormat() != null) {
            _hashCode += getNoFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageRegion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "blockId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "blockPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "blockRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "noBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("noFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "noFormat"));
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
