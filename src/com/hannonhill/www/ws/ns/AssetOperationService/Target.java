/**
 * Target.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Target  extends com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset  implements java.io.Serializable {
    private java.lang.String parentTargetId;

    private java.lang.String parentTargetPath;

    private java.lang.String path;

    private java.lang.String baseFolderId;

    private java.lang.String baseFolderPath;

    private java.lang.String outputExtension;

    private java.lang.String cssClasses;

    private java.lang.String cssFileId;

    private java.lang.String cssFilePath;

    private java.lang.Boolean cssFileRecycled;

    private com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType;

    private java.lang.Boolean includeXMLDeclaration;

    private java.lang.Boolean includeTargetPath;

    private java.lang.Boolean removeBaseFolder;

    private java.lang.Boolean usesScheduledPublishing;

    private org.apache.axis.types.Time timeToPublish;

    private org.apache.axis.types.NonNegativeInteger publishIntervalHours;

    private com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek;

    private java.lang.String cronExpression;

    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children;

    public Target() {
    }

    public Target(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentTargetId,
           java.lang.String parentTargetPath,
           java.lang.String path,
           java.lang.String baseFolderId,
           java.lang.String baseFolderPath,
           java.lang.String outputExtension,
           java.lang.String cssClasses,
           java.lang.String cssFileId,
           java.lang.String cssFilePath,
           java.lang.Boolean cssFileRecycled,
           com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType,
           java.lang.Boolean includeXMLDeclaration,
           java.lang.Boolean includeTargetPath,
           java.lang.Boolean removeBaseFolder,
           java.lang.Boolean usesScheduledPublishing,
           org.apache.axis.types.Time timeToPublish,
           org.apache.axis.types.NonNegativeInteger publishIntervalHours,
           com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek,
           java.lang.String cronExpression,
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children) {
        super(
            id,
            name);
        this.parentTargetId = parentTargetId;
        this.parentTargetPath = parentTargetPath;
        this.path = path;
        this.baseFolderId = baseFolderId;
        this.baseFolderPath = baseFolderPath;
        this.outputExtension = outputExtension;
        this.cssClasses = cssClasses;
        this.cssFileId = cssFileId;
        this.cssFilePath = cssFilePath;
        this.cssFileRecycled = cssFileRecycled;
        this.serializationType = serializationType;
        this.includeXMLDeclaration = includeXMLDeclaration;
        this.includeTargetPath = includeTargetPath;
        this.removeBaseFolder = removeBaseFolder;
        this.usesScheduledPublishing = usesScheduledPublishing;
        this.timeToPublish = timeToPublish;
        this.publishIntervalHours = publishIntervalHours;
        this.publishDaysOfWeek = publishDaysOfWeek;
        this.cronExpression = cronExpression;
        this.children = children;
    }


    /**
     * Gets the parentTargetId value for this Target.
     * 
     * @return parentTargetId
     */
    public java.lang.String getParentTargetId() {
        return parentTargetId;
    }


    /**
     * Sets the parentTargetId value for this Target.
     * 
     * @param parentTargetId
     */
    public void setParentTargetId(java.lang.String parentTargetId) {
        this.parentTargetId = parentTargetId;
    }


    /**
     * Gets the parentTargetPath value for this Target.
     * 
     * @return parentTargetPath
     */
    public java.lang.String getParentTargetPath() {
        return parentTargetPath;
    }


    /**
     * Sets the parentTargetPath value for this Target.
     * 
     * @param parentTargetPath
     */
    public void setParentTargetPath(java.lang.String parentTargetPath) {
        this.parentTargetPath = parentTargetPath;
    }


    /**
     * Gets the path value for this Target.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this Target.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the baseFolderId value for this Target.
     * 
     * @return baseFolderId
     */
    public java.lang.String getBaseFolderId() {
        return baseFolderId;
    }


    /**
     * Sets the baseFolderId value for this Target.
     * 
     * @param baseFolderId
     */
    public void setBaseFolderId(java.lang.String baseFolderId) {
        this.baseFolderId = baseFolderId;
    }


    /**
     * Gets the baseFolderPath value for this Target.
     * 
     * @return baseFolderPath
     */
    public java.lang.String getBaseFolderPath() {
        return baseFolderPath;
    }


    /**
     * Sets the baseFolderPath value for this Target.
     * 
     * @param baseFolderPath
     */
    public void setBaseFolderPath(java.lang.String baseFolderPath) {
        this.baseFolderPath = baseFolderPath;
    }


    /**
     * Gets the outputExtension value for this Target.
     * 
     * @return outputExtension
     */
    public java.lang.String getOutputExtension() {
        return outputExtension;
    }


    /**
     * Sets the outputExtension value for this Target.
     * 
     * @param outputExtension
     */
    public void setOutputExtension(java.lang.String outputExtension) {
        this.outputExtension = outputExtension;
    }


    /**
     * Gets the cssClasses value for this Target.
     * 
     * @return cssClasses
     */
    public java.lang.String getCssClasses() {
        return cssClasses;
    }


    /**
     * Sets the cssClasses value for this Target.
     * 
     * @param cssClasses
     */
    public void setCssClasses(java.lang.String cssClasses) {
        this.cssClasses = cssClasses;
    }


    /**
     * Gets the cssFileId value for this Target.
     * 
     * @return cssFileId
     */
    public java.lang.String getCssFileId() {
        return cssFileId;
    }


    /**
     * Sets the cssFileId value for this Target.
     * 
     * @param cssFileId
     */
    public void setCssFileId(java.lang.String cssFileId) {
        this.cssFileId = cssFileId;
    }


    /**
     * Gets the cssFilePath value for this Target.
     * 
     * @return cssFilePath
     */
    public java.lang.String getCssFilePath() {
        return cssFilePath;
    }


    /**
     * Sets the cssFilePath value for this Target.
     * 
     * @param cssFilePath
     */
    public void setCssFilePath(java.lang.String cssFilePath) {
        this.cssFilePath = cssFilePath;
    }


    /**
     * Gets the cssFileRecycled value for this Target.
     * 
     * @return cssFileRecycled
     */
    public java.lang.Boolean getCssFileRecycled() {
        return cssFileRecycled;
    }


    /**
     * Sets the cssFileRecycled value for this Target.
     * 
     * @param cssFileRecycled
     */
    public void setCssFileRecycled(java.lang.Boolean cssFileRecycled) {
        this.cssFileRecycled = cssFileRecycled;
    }


    /**
     * Gets the serializationType value for this Target.
     * 
     * @return serializationType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SerializationType getSerializationType() {
        return serializationType;
    }


    /**
     * Sets the serializationType value for this Target.
     * 
     * @param serializationType
     */
    public void setSerializationType(com.hannonhill.www.ws.ns.AssetOperationService.SerializationType serializationType) {
        this.serializationType = serializationType;
    }


    /**
     * Gets the includeXMLDeclaration value for this Target.
     * 
     * @return includeXMLDeclaration
     */
    public java.lang.Boolean getIncludeXMLDeclaration() {
        return includeXMLDeclaration;
    }


    /**
     * Sets the includeXMLDeclaration value for this Target.
     * 
     * @param includeXMLDeclaration
     */
    public void setIncludeXMLDeclaration(java.lang.Boolean includeXMLDeclaration) {
        this.includeXMLDeclaration = includeXMLDeclaration;
    }


    /**
     * Gets the includeTargetPath value for this Target.
     * 
     * @return includeTargetPath
     */
    public java.lang.Boolean getIncludeTargetPath() {
        return includeTargetPath;
    }


    /**
     * Sets the includeTargetPath value for this Target.
     * 
     * @param includeTargetPath
     */
    public void setIncludeTargetPath(java.lang.Boolean includeTargetPath) {
        this.includeTargetPath = includeTargetPath;
    }


    /**
     * Gets the removeBaseFolder value for this Target.
     * 
     * @return removeBaseFolder
     */
    public java.lang.Boolean getRemoveBaseFolder() {
        return removeBaseFolder;
    }


    /**
     * Sets the removeBaseFolder value for this Target.
     * 
     * @param removeBaseFolder
     */
    public void setRemoveBaseFolder(java.lang.Boolean removeBaseFolder) {
        this.removeBaseFolder = removeBaseFolder;
    }


    /**
     * Gets the usesScheduledPublishing value for this Target.
     * 
     * @return usesScheduledPublishing
     */
    public java.lang.Boolean getUsesScheduledPublishing() {
        return usesScheduledPublishing;
    }


    /**
     * Sets the usesScheduledPublishing value for this Target.
     * 
     * @param usesScheduledPublishing
     */
    public void setUsesScheduledPublishing(java.lang.Boolean usesScheduledPublishing) {
        this.usesScheduledPublishing = usesScheduledPublishing;
    }


    /**
     * Gets the timeToPublish value for this Target.
     * 
     * @return timeToPublish
     */
    public org.apache.axis.types.Time getTimeToPublish() {
        return timeToPublish;
    }


    /**
     * Sets the timeToPublish value for this Target.
     * 
     * @param timeToPublish
     */
    public void setTimeToPublish(org.apache.axis.types.Time timeToPublish) {
        this.timeToPublish = timeToPublish;
    }


    /**
     * Gets the publishIntervalHours value for this Target.
     * 
     * @return publishIntervalHours
     */
    public org.apache.axis.types.NonNegativeInteger getPublishIntervalHours() {
        return publishIntervalHours;
    }


    /**
     * Sets the publishIntervalHours value for this Target.
     * 
     * @param publishIntervalHours
     */
    public void setPublishIntervalHours(org.apache.axis.types.NonNegativeInteger publishIntervalHours) {
        this.publishIntervalHours = publishIntervalHours;
    }


    /**
     * Gets the publishDaysOfWeek value for this Target.
     * 
     * @return publishDaysOfWeek
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] getPublishDaysOfWeek() {
        return publishDaysOfWeek;
    }


    /**
     * Sets the publishDaysOfWeek value for this Target.
     * 
     * @param publishDaysOfWeek
     */
    public void setPublishDaysOfWeek(com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[] publishDaysOfWeek) {
        this.publishDaysOfWeek = publishDaysOfWeek;
    }


    /**
     * Gets the cronExpression value for this Target.
     * 
     * @return cronExpression
     */
    public java.lang.String getCronExpression() {
        return cronExpression;
    }


    /**
     * Sets the cronExpression value for this Target.
     * 
     * @param cronExpression
     */
    public void setCronExpression(java.lang.String cronExpression) {
        this.cronExpression = cronExpression;
    }


    /**
     * Gets the children value for this Target.
     * 
     * @return children
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Target.
     * 
     * @param children
     */
    public void setChildren(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] children) {
        this.children = children;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Target)) return false;
        Target other = (Target) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentTargetId==null && other.getParentTargetId()==null) || 
             (this.parentTargetId!=null &&
              this.parentTargetId.equals(other.getParentTargetId()))) &&
            ((this.parentTargetPath==null && other.getParentTargetPath()==null) || 
             (this.parentTargetPath!=null &&
              this.parentTargetPath.equals(other.getParentTargetPath()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.baseFolderId==null && other.getBaseFolderId()==null) || 
             (this.baseFolderId!=null &&
              this.baseFolderId.equals(other.getBaseFolderId()))) &&
            ((this.baseFolderPath==null && other.getBaseFolderPath()==null) || 
             (this.baseFolderPath!=null &&
              this.baseFolderPath.equals(other.getBaseFolderPath()))) &&
            ((this.outputExtension==null && other.getOutputExtension()==null) || 
             (this.outputExtension!=null &&
              this.outputExtension.equals(other.getOutputExtension()))) &&
            ((this.cssClasses==null && other.getCssClasses()==null) || 
             (this.cssClasses!=null &&
              this.cssClasses.equals(other.getCssClasses()))) &&
            ((this.cssFileId==null && other.getCssFileId()==null) || 
             (this.cssFileId!=null &&
              this.cssFileId.equals(other.getCssFileId()))) &&
            ((this.cssFilePath==null && other.getCssFilePath()==null) || 
             (this.cssFilePath!=null &&
              this.cssFilePath.equals(other.getCssFilePath()))) &&
            ((this.cssFileRecycled==null && other.getCssFileRecycled()==null) || 
             (this.cssFileRecycled!=null &&
              this.cssFileRecycled.equals(other.getCssFileRecycled()))) &&
            ((this.serializationType==null && other.getSerializationType()==null) || 
             (this.serializationType!=null &&
              this.serializationType.equals(other.getSerializationType()))) &&
            ((this.includeXMLDeclaration==null && other.getIncludeXMLDeclaration()==null) || 
             (this.includeXMLDeclaration!=null &&
              this.includeXMLDeclaration.equals(other.getIncludeXMLDeclaration()))) &&
            ((this.includeTargetPath==null && other.getIncludeTargetPath()==null) || 
             (this.includeTargetPath!=null &&
              this.includeTargetPath.equals(other.getIncludeTargetPath()))) &&
            ((this.removeBaseFolder==null && other.getRemoveBaseFolder()==null) || 
             (this.removeBaseFolder!=null &&
              this.removeBaseFolder.equals(other.getRemoveBaseFolder()))) &&
            ((this.usesScheduledPublishing==null && other.getUsesScheduledPublishing()==null) || 
             (this.usesScheduledPublishing!=null &&
              this.usesScheduledPublishing.equals(other.getUsesScheduledPublishing()))) &&
            ((this.timeToPublish==null && other.getTimeToPublish()==null) || 
             (this.timeToPublish!=null &&
              this.timeToPublish.equals(other.getTimeToPublish()))) &&
            ((this.publishIntervalHours==null && other.getPublishIntervalHours()==null) || 
             (this.publishIntervalHours!=null &&
              this.publishIntervalHours.equals(other.getPublishIntervalHours()))) &&
            ((this.publishDaysOfWeek==null && other.getPublishDaysOfWeek()==null) || 
             (this.publishDaysOfWeek!=null &&
              java.util.Arrays.equals(this.publishDaysOfWeek, other.getPublishDaysOfWeek()))) &&
            ((this.cronExpression==null && other.getCronExpression()==null) || 
             (this.cronExpression!=null &&
              this.cronExpression.equals(other.getCronExpression()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren())));
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
        if (getParentTargetId() != null) {
            _hashCode += getParentTargetId().hashCode();
        }
        if (getParentTargetPath() != null) {
            _hashCode += getParentTargetPath().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getBaseFolderId() != null) {
            _hashCode += getBaseFolderId().hashCode();
        }
        if (getBaseFolderPath() != null) {
            _hashCode += getBaseFolderPath().hashCode();
        }
        if (getOutputExtension() != null) {
            _hashCode += getOutputExtension().hashCode();
        }
        if (getCssClasses() != null) {
            _hashCode += getCssClasses().hashCode();
        }
        if (getCssFileId() != null) {
            _hashCode += getCssFileId().hashCode();
        }
        if (getCssFilePath() != null) {
            _hashCode += getCssFilePath().hashCode();
        }
        if (getCssFileRecycled() != null) {
            _hashCode += getCssFileRecycled().hashCode();
        }
        if (getSerializationType() != null) {
            _hashCode += getSerializationType().hashCode();
        }
        if (getIncludeXMLDeclaration() != null) {
            _hashCode += getIncludeXMLDeclaration().hashCode();
        }
        if (getIncludeTargetPath() != null) {
            _hashCode += getIncludeTargetPath().hashCode();
        }
        if (getRemoveBaseFolder() != null) {
            _hashCode += getRemoveBaseFolder().hashCode();
        }
        if (getUsesScheduledPublishing() != null) {
            _hashCode += getUsesScheduledPublishing().hashCode();
        }
        if (getTimeToPublish() != null) {
            _hashCode += getTimeToPublish().hashCode();
        }
        if (getPublishIntervalHours() != null) {
            _hashCode += getPublishIntervalHours().hashCode();
        }
        if (getPublishDaysOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishDaysOfWeek());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishDaysOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCronExpression() != null) {
            _hashCode += getCronExpression().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
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
        new org.apache.axis.description.TypeDesc(Target.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "target"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTargetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "parentTargetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTargetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "parentTargetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "baseFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFolderPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "baseFolderPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "outputExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cssFileRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cssFileRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serializationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "serializationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "serialization-type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeXMLDeclaration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeXMLDeclaration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTargetPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeTargetPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeBaseFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "removeBaseFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("publishIntervalHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishIntervalHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishDaysOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishDaysOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cronExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "cronExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "child"));
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
