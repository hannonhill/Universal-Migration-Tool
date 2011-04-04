/**
 * AssetFactory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AssetFactory  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.String applicableGroups;

    private java.lang.String assetType;

    private java.lang.String baseAssetId;

    private java.lang.String baseAssetPath;

    private java.lang.Boolean baseAssetRecycled;

    private java.lang.String placementFolderId;

    private java.lang.String placementFolderPath;

    private java.lang.Boolean placementFolderRecycled;

    private java.lang.Boolean allowSubfolderPlacement;

    private org.apache.axis.types.NonNegativeInteger folderPlacementPosition;

    private java.lang.Boolean overwrite;

    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryWorkflowMode workflowMode;

    private java.lang.String workflowDefinitionId;

    private java.lang.String workflowDefinitionPath;

    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugins;

    public AssetFactory() {
    }

    public AssetFactory(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String applicableGroups,
           java.lang.String assetType,
           java.lang.String baseAssetId,
           java.lang.String baseAssetPath,
           java.lang.Boolean baseAssetRecycled,
           java.lang.String placementFolderId,
           java.lang.String placementFolderPath,
           java.lang.Boolean placementFolderRecycled,
           java.lang.Boolean allowSubfolderPlacement,
           org.apache.axis.types.NonNegativeInteger folderPlacementPosition,
           java.lang.Boolean overwrite,
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryWorkflowMode workflowMode,
           java.lang.String workflowDefinitionId,
           java.lang.String workflowDefinitionPath,
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugins) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.applicableGroups = applicableGroups;
        this.assetType = assetType;
        this.baseAssetId = baseAssetId;
        this.baseAssetPath = baseAssetPath;
        this.baseAssetRecycled = baseAssetRecycled;
        this.placementFolderId = placementFolderId;
        this.placementFolderPath = placementFolderPath;
        this.placementFolderRecycled = placementFolderRecycled;
        this.allowSubfolderPlacement = allowSubfolderPlacement;
        this.folderPlacementPosition = folderPlacementPosition;
        this.overwrite = overwrite;
        this.workflowMode = workflowMode;
        this.workflowDefinitionId = workflowDefinitionId;
        this.workflowDefinitionPath = workflowDefinitionPath;
        this.plugins = plugins;
    }


    /**
     * Gets the applicableGroups value for this AssetFactory.
     * 
     * @return applicableGroups
     */
    public java.lang.String getApplicableGroups() {
        return applicableGroups;
    }


    /**
     * Sets the applicableGroups value for this AssetFactory.
     * 
     * @param applicableGroups
     */
    public void setApplicableGroups(java.lang.String applicableGroups) {
        this.applicableGroups = applicableGroups;
    }


    /**
     * Gets the assetType value for this AssetFactory.
     * 
     * @return assetType
     */
    public java.lang.String getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this AssetFactory.
     * 
     * @param assetType
     */
    public void setAssetType(java.lang.String assetType) {
        this.assetType = assetType;
    }


    /**
     * Gets the baseAssetId value for this AssetFactory.
     * 
     * @return baseAssetId
     */
    public java.lang.String getBaseAssetId() {
        return baseAssetId;
    }


    /**
     * Sets the baseAssetId value for this AssetFactory.
     * 
     * @param baseAssetId
     */
    public void setBaseAssetId(java.lang.String baseAssetId) {
        this.baseAssetId = baseAssetId;
    }


    /**
     * Gets the baseAssetPath value for this AssetFactory.
     * 
     * @return baseAssetPath
     */
    public java.lang.String getBaseAssetPath() {
        return baseAssetPath;
    }


    /**
     * Sets the baseAssetPath value for this AssetFactory.
     * 
     * @param baseAssetPath
     */
    public void setBaseAssetPath(java.lang.String baseAssetPath) {
        this.baseAssetPath = baseAssetPath;
    }


    /**
     * Gets the baseAssetRecycled value for this AssetFactory.
     * 
     * @return baseAssetRecycled
     */
    public java.lang.Boolean getBaseAssetRecycled() {
        return baseAssetRecycled;
    }


    /**
     * Sets the baseAssetRecycled value for this AssetFactory.
     * 
     * @param baseAssetRecycled
     */
    public void setBaseAssetRecycled(java.lang.Boolean baseAssetRecycled) {
        this.baseAssetRecycled = baseAssetRecycled;
    }


    /**
     * Gets the placementFolderId value for this AssetFactory.
     * 
     * @return placementFolderId
     */
    public java.lang.String getPlacementFolderId() {
        return placementFolderId;
    }


    /**
     * Sets the placementFolderId value for this AssetFactory.
     * 
     * @param placementFolderId
     */
    public void setPlacementFolderId(java.lang.String placementFolderId) {
        this.placementFolderId = placementFolderId;
    }


    /**
     * Gets the placementFolderPath value for this AssetFactory.
     * 
     * @return placementFolderPath
     */
    public java.lang.String getPlacementFolderPath() {
        return placementFolderPath;
    }


    /**
     * Sets the placementFolderPath value for this AssetFactory.
     * 
     * @param placementFolderPath
     */
    public void setPlacementFolderPath(java.lang.String placementFolderPath) {
        this.placementFolderPath = placementFolderPath;
    }


    /**
     * Gets the placementFolderRecycled value for this AssetFactory.
     * 
     * @return placementFolderRecycled
     */
    public java.lang.Boolean getPlacementFolderRecycled() {
        return placementFolderRecycled;
    }


    /**
     * Sets the placementFolderRecycled value for this AssetFactory.
     * 
     * @param placementFolderRecycled
     */
    public void setPlacementFolderRecycled(java.lang.Boolean placementFolderRecycled) {
        this.placementFolderRecycled = placementFolderRecycled;
    }


    /**
     * Gets the allowSubfolderPlacement value for this AssetFactory.
     * 
     * @return allowSubfolderPlacement
     */
    public java.lang.Boolean getAllowSubfolderPlacement() {
        return allowSubfolderPlacement;
    }


    /**
     * Sets the allowSubfolderPlacement value for this AssetFactory.
     * 
     * @param allowSubfolderPlacement
     */
    public void setAllowSubfolderPlacement(java.lang.Boolean allowSubfolderPlacement) {
        this.allowSubfolderPlacement = allowSubfolderPlacement;
    }


    /**
     * Gets the folderPlacementPosition value for this AssetFactory.
     * 
     * @return folderPlacementPosition
     */
    public org.apache.axis.types.NonNegativeInteger getFolderPlacementPosition() {
        return folderPlacementPosition;
    }


    /**
     * Sets the folderPlacementPosition value for this AssetFactory.
     * 
     * @param folderPlacementPosition
     */
    public void setFolderPlacementPosition(org.apache.axis.types.NonNegativeInteger folderPlacementPosition) {
        this.folderPlacementPosition = folderPlacementPosition;
    }


    /**
     * Gets the overwrite value for this AssetFactory.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this AssetFactory.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the workflowMode value for this AssetFactory.
     * 
     * @return workflowMode
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryWorkflowMode getWorkflowMode() {
        return workflowMode;
    }


    /**
     * Sets the workflowMode value for this AssetFactory.
     * 
     * @param workflowMode
     */
    public void setWorkflowMode(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryWorkflowMode workflowMode) {
        this.workflowMode = workflowMode;
    }


    /**
     * Gets the workflowDefinitionId value for this AssetFactory.
     * 
     * @return workflowDefinitionId
     */
    public java.lang.String getWorkflowDefinitionId() {
        return workflowDefinitionId;
    }


    /**
     * Sets the workflowDefinitionId value for this AssetFactory.
     * 
     * @param workflowDefinitionId
     */
    public void setWorkflowDefinitionId(java.lang.String workflowDefinitionId) {
        this.workflowDefinitionId = workflowDefinitionId;
    }


    /**
     * Gets the workflowDefinitionPath value for this AssetFactory.
     * 
     * @return workflowDefinitionPath
     */
    public java.lang.String getWorkflowDefinitionPath() {
        return workflowDefinitionPath;
    }


    /**
     * Sets the workflowDefinitionPath value for this AssetFactory.
     * 
     * @param workflowDefinitionPath
     */
    public void setWorkflowDefinitionPath(java.lang.String workflowDefinitionPath) {
        this.workflowDefinitionPath = workflowDefinitionPath;
    }


    /**
     * Gets the plugins value for this AssetFactory.
     * 
     * @return plugins
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] getPlugins() {
        return plugins;
    }


    /**
     * Sets the plugins value for this AssetFactory.
     * 
     * @param plugins
     */
    public void setPlugins(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugins) {
        this.plugins = plugins;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetFactory)) return false;
        AssetFactory other = (AssetFactory) obj;
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
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType()))) &&
            ((this.baseAssetId==null && other.getBaseAssetId()==null) || 
             (this.baseAssetId!=null &&
              this.baseAssetId.equals(other.getBaseAssetId()))) &&
            ((this.baseAssetPath==null && other.getBaseAssetPath()==null) || 
             (this.baseAssetPath!=null &&
              this.baseAssetPath.equals(other.getBaseAssetPath()))) &&
            ((this.baseAssetRecycled==null && other.getBaseAssetRecycled()==null) || 
             (this.baseAssetRecycled!=null &&
              this.baseAssetRecycled.equals(other.getBaseAssetRecycled()))) &&
            ((this.placementFolderId==null && other.getPlacementFolderId()==null) || 
             (this.placementFolderId!=null &&
              this.placementFolderId.equals(other.getPlacementFolderId()))) &&
            ((this.placementFolderPath==null && other.getPlacementFolderPath()==null) || 
             (this.placementFolderPath!=null &&
              this.placementFolderPath.equals(other.getPlacementFolderPath()))) &&
            ((this.placementFolderRecycled==null && other.getPlacementFolderRecycled()==null) || 
             (this.placementFolderRecycled!=null &&
              this.placementFolderRecycled.equals(other.getPlacementFolderRecycled()))) &&
            ((this.allowSubfolderPlacement==null && other.getAllowSubfolderPlacement()==null) || 
             (this.allowSubfolderPlacement!=null &&
              this.allowSubfolderPlacement.equals(other.getAllowSubfolderPlacement()))) &&
            ((this.folderPlacementPosition==null && other.getFolderPlacementPosition()==null) || 
             (this.folderPlacementPosition!=null &&
              this.folderPlacementPosition.equals(other.getFolderPlacementPosition()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.workflowMode==null && other.getWorkflowMode()==null) || 
             (this.workflowMode!=null &&
              this.workflowMode.equals(other.getWorkflowMode()))) &&
            ((this.workflowDefinitionId==null && other.getWorkflowDefinitionId()==null) || 
             (this.workflowDefinitionId!=null &&
              this.workflowDefinitionId.equals(other.getWorkflowDefinitionId()))) &&
            ((this.workflowDefinitionPath==null && other.getWorkflowDefinitionPath()==null) || 
             (this.workflowDefinitionPath!=null &&
              this.workflowDefinitionPath.equals(other.getWorkflowDefinitionPath()))) &&
            ((this.plugins==null && other.getPlugins()==null) || 
             (this.plugins!=null &&
              java.util.Arrays.equals(this.plugins, other.getPlugins())));
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
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        if (getBaseAssetId() != null) {
            _hashCode += getBaseAssetId().hashCode();
        }
        if (getBaseAssetPath() != null) {
            _hashCode += getBaseAssetPath().hashCode();
        }
        if (getBaseAssetRecycled() != null) {
            _hashCode += getBaseAssetRecycled().hashCode();
        }
        if (getPlacementFolderId() != null) {
            _hashCode += getPlacementFolderId().hashCode();
        }
        if (getPlacementFolderPath() != null) {
            _hashCode += getPlacementFolderPath().hashCode();
        }
        if (getPlacementFolderRecycled() != null) {
            _hashCode += getPlacementFolderRecycled().hashCode();
        }
        if (getAllowSubfolderPlacement() != null) {
            _hashCode += getAllowSubfolderPlacement().hashCode();
        }
        if (getFolderPlacementPosition() != null) {
            _hashCode += getFolderPlacementPosition().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getWorkflowMode() != null) {
            _hashCode += getWorkflowMode().hashCode();
        }
        if (getWorkflowDefinitionId() != null) {
            _hashCode += getWorkflowDefinitionId().hashCode();
        }
        if (getWorkflowDefinitionPath() != null) {
            _hashCode += getWorkflowDefinitionPath().hashCode();
        }
        if (getPlugins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlugins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlugins(), i);
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
        new org.apache.axis.description.TypeDesc(AssetFactory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applicableGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "baseAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAssetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "baseAssetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAssetRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "baseAssetRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "placementFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementFolderPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "placementFolderPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementFolderRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "placementFolderRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSubfolderPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "allowSubfolderPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderPlacementPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folderPlacementPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-workflow-mode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitionPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plugins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "plugins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "plugin"));
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
