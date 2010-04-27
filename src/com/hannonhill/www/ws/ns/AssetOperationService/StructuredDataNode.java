/**
 * StructuredDataNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class StructuredDataNode  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType type;

    private java.lang.String identifier;

    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes;

    private java.lang.String text;

    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType assetType;

    private java.lang.String blockId;

    private java.lang.String blockPath;

    private java.lang.String fileId;

    private java.lang.String filePath;

    private java.lang.String pageId;

    private java.lang.String pagePath;

    private java.lang.String symlinkId;

    private java.lang.String symlinkPath;

    private java.lang.Boolean recycled;

    public StructuredDataNode() {
    }

    public StructuredDataNode(
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType type,
           java.lang.String identifier,
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes,
           java.lang.String text,
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType assetType,
           java.lang.String blockId,
           java.lang.String blockPath,
           java.lang.String fileId,
           java.lang.String filePath,
           java.lang.String pageId,
           java.lang.String pagePath,
           java.lang.String symlinkId,
           java.lang.String symlinkPath,
           java.lang.Boolean recycled) {
           this.type = type;
           this.identifier = identifier;
           this.structuredDataNodes = structuredDataNodes;
           this.text = text;
           this.assetType = assetType;
           this.blockId = blockId;
           this.blockPath = blockPath;
           this.fileId = fileId;
           this.filePath = filePath;
           this.pageId = pageId;
           this.pagePath = pagePath;
           this.symlinkId = symlinkId;
           this.symlinkPath = symlinkPath;
           this.recycled = recycled;
    }


    /**
     * Gets the type value for this StructuredDataNode.
     * 
     * @return type
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType getType() {
        return type;
    }


    /**
     * Sets the type value for this StructuredDataNode.
     * 
     * @param type
     */
    public void setType(com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType type) {
        this.type = type;
    }


    /**
     * Gets the identifier value for this StructuredDataNode.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StructuredDataNode.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the structuredDataNodes value for this StructuredDataNode.
     * 
     * @return structuredDataNodes
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] getStructuredDataNodes() {
        return structuredDataNodes;
    }


    /**
     * Sets the structuredDataNodes value for this StructuredDataNode.
     * 
     * @param structuredDataNodes
     */
    public void setStructuredDataNodes(com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNodes) {
        this.structuredDataNodes = structuredDataNodes;
    }


    /**
     * Gets the text value for this StructuredDataNode.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this StructuredDataNode.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the assetType value for this StructuredDataNode.
     * 
     * @return assetType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this StructuredDataNode.
     * 
     * @param assetType
     */
    public void setAssetType(com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the blockId value for this StructuredDataNode.
     * 
     * @return blockId
     */
    public java.lang.String getBlockId() {
        return blockId;
    }


    /**
     * Sets the blockId value for this StructuredDataNode.
     * 
     * @param blockId
     */
    public void setBlockId(java.lang.String blockId) {
        this.blockId = blockId;
    }


    /**
     * Gets the blockPath value for this StructuredDataNode.
     * 
     * @return blockPath
     */
    public java.lang.String getBlockPath() {
        return blockPath;
    }


    /**
     * Sets the blockPath value for this StructuredDataNode.
     * 
     * @param blockPath
     */
    public void setBlockPath(java.lang.String blockPath) {
        this.blockPath = blockPath;
    }


    /**
     * Gets the fileId value for this StructuredDataNode.
     * 
     * @return fileId
     */
    public java.lang.String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this StructuredDataNode.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the filePath value for this StructuredDataNode.
     * 
     * @return filePath
     */
    public java.lang.String getFilePath() {
        return filePath;
    }


    /**
     * Sets the filePath value for this StructuredDataNode.
     * 
     * @param filePath
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }


    /**
     * Gets the pageId value for this StructuredDataNode.
     * 
     * @return pageId
     */
    public java.lang.String getPageId() {
        return pageId;
    }


    /**
     * Sets the pageId value for this StructuredDataNode.
     * 
     * @param pageId
     */
    public void setPageId(java.lang.String pageId) {
        this.pageId = pageId;
    }


    /**
     * Gets the pagePath value for this StructuredDataNode.
     * 
     * @return pagePath
     */
    public java.lang.String getPagePath() {
        return pagePath;
    }


    /**
     * Sets the pagePath value for this StructuredDataNode.
     * 
     * @param pagePath
     */
    public void setPagePath(java.lang.String pagePath) {
        this.pagePath = pagePath;
    }


    /**
     * Gets the symlinkId value for this StructuredDataNode.
     * 
     * @return symlinkId
     */
    public java.lang.String getSymlinkId() {
        return symlinkId;
    }


    /**
     * Sets the symlinkId value for this StructuredDataNode.
     * 
     * @param symlinkId
     */
    public void setSymlinkId(java.lang.String symlinkId) {
        this.symlinkId = symlinkId;
    }


    /**
     * Gets the symlinkPath value for this StructuredDataNode.
     * 
     * @return symlinkPath
     */
    public java.lang.String getSymlinkPath() {
        return symlinkPath;
    }


    /**
     * Sets the symlinkPath value for this StructuredDataNode.
     * 
     * @param symlinkPath
     */
    public void setSymlinkPath(java.lang.String symlinkPath) {
        this.symlinkPath = symlinkPath;
    }


    /**
     * Gets the recycled value for this StructuredDataNode.
     * 
     * @return recycled
     */
    public java.lang.Boolean getRecycled() {
        return recycled;
    }


    /**
     * Sets the recycled value for this StructuredDataNode.
     * 
     * @param recycled
     */
    public void setRecycled(java.lang.Boolean recycled) {
        this.recycled = recycled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredDataNode)) return false;
        StructuredDataNode other = (StructuredDataNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.structuredDataNodes==null && other.getStructuredDataNodes()==null) || 
             (this.structuredDataNodes!=null &&
              java.util.Arrays.equals(this.structuredDataNodes, other.getStructuredDataNodes()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.blockId==null && other.getBlockId()==null) || 
             (this.blockId!=null &&
              this.blockId.equals(other.getBlockId()))) &&
            ((this.blockPath==null && other.getBlockPath()==null) || 
             (this.blockPath!=null &&
              this.blockPath.equals(other.getBlockPath()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.filePath==null && other.getFilePath()==null) || 
             (this.filePath!=null &&
              this.filePath.equals(other.getFilePath()))) &&
            ((this.pageId==null && other.getPageId()==null) || 
             (this.pageId!=null &&
              this.pageId.equals(other.getPageId()))) &&
            ((this.pagePath==null && other.getPagePath()==null) || 
             (this.pagePath!=null &&
              this.pagePath.equals(other.getPagePath()))) &&
            ((this.symlinkId==null && other.getSymlinkId()==null) || 
             (this.symlinkId!=null &&
              this.symlinkId.equals(other.getSymlinkId()))) &&
            ((this.symlinkPath==null && other.getSymlinkPath()==null) || 
             (this.symlinkPath!=null &&
              this.symlinkPath.equals(other.getSymlinkPath()))) &&
            ((this.recycled==null && other.getRecycled()==null) || 
             (this.recycled!=null &&
              this.recycled.equals(other.getRecycled())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getStructuredDataNodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStructuredDataNodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStructuredDataNodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getBlockId() != null) {
            _hashCode += getBlockId().hashCode();
        }
        if (getBlockPath() != null) {
            _hashCode += getBlockPath().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getFilePath() != null) {
            _hashCode += getFilePath().hashCode();
        }
        if (getPageId() != null) {
            _hashCode += getPageId().hashCode();
        }
        if (getPagePath() != null) {
            _hashCode += getPagePath().hashCode();
        }
        if (getSymlinkId() != null) {
            _hashCode += getSymlinkId().hashCode();
        }
        if (getSymlinkPath() != null) {
            _hashCode += getSymlinkPath().hashCode();
        }
        if (getRecycled() != null) {
            _hashCode += getRecycled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StructuredDataNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structuredDataNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-asset-type"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "filePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pagePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symlinkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlinkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symlinkPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlinkPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycled"));
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
