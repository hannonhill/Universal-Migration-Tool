/**
 * IndexBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class IndexBlock  extends com.hannonhill.www.ws.ns.AssetOperationService.Block  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockType indexBlockType;

    private java.lang.String indexedFolderId;

    private java.lang.String indexedFolderPath;

    private java.lang.String indexedContentTypeId;

    private java.lang.String indexedContentTypePath;

    private java.lang.Boolean indexedFolderRecycled;

    private org.apache.axis.types.NonNegativeInteger maxRenderedAssets;

    private org.apache.axis.types.NonNegativeInteger depthOfIndex;

    private java.lang.Boolean includePageContent;

    private java.lang.Boolean includeCurrentPageXML;

    private java.lang.Boolean renderCurrentPageAndHierarchy;

    private java.lang.Boolean includeChildrenInHierarchy;

    private java.lang.Boolean indexPages;

    private java.lang.Boolean indexBlocks;

    private java.lang.Boolean indexLinks;

    private java.lang.Boolean indexFiles;

    private java.lang.Boolean indexRegularContent;

    private java.lang.Boolean indexSystemMetadata;

    private java.lang.Boolean indexUserMetadata;

    private java.lang.Boolean indexAccessRights;

    private java.lang.Boolean indexUserInfo;

    private java.lang.Boolean indexWorkflowInfo;

    private java.lang.Boolean appendCallingPageData;

    private com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortMethod sortMethod;

    private com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortOrder sortOrder;

    public IndexBlock() {
    }

    public IndexBlock(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentFolderId,
           java.lang.String parentFolderPath,
           java.lang.String path,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastModifiedBy,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.Metadata metadata,
           java.lang.String metadataSetId,
           java.lang.String metadataSetPath,
           java.lang.String expirationFolderId,
           java.lang.String expirationFolderPath,
           java.lang.Boolean expirationFolderRecycled,
           com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockType indexBlockType,
           java.lang.String indexedFolderId,
           java.lang.String indexedFolderPath,
           java.lang.String indexedContentTypeId,
           java.lang.String indexedContentTypePath,
           java.lang.Boolean indexedFolderRecycled,
           org.apache.axis.types.NonNegativeInteger maxRenderedAssets,
           org.apache.axis.types.NonNegativeInteger depthOfIndex,
           java.lang.Boolean includePageContent,
           java.lang.Boolean includeCurrentPageXML,
           java.lang.Boolean renderCurrentPageAndHierarchy,
           java.lang.Boolean includeChildrenInHierarchy,
           java.lang.Boolean indexPages,
           java.lang.Boolean indexBlocks,
           java.lang.Boolean indexLinks,
           java.lang.Boolean indexFiles,
           java.lang.Boolean indexRegularContent,
           java.lang.Boolean indexSystemMetadata,
           java.lang.Boolean indexUserMetadata,
           java.lang.Boolean indexAccessRights,
           java.lang.Boolean indexUserInfo,
           java.lang.Boolean indexWorkflowInfo,
           java.lang.Boolean appendCallingPageData,
           com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortMethod sortMethod,
           com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortOrder sortOrder) {
        super(
            id,
            name,
            parentFolderId,
            parentFolderPath,
            path,
            lastModifiedDate,
            lastModifiedBy,
            siteId,
            siteName,
            metadata,
            metadataSetId,
            metadataSetPath,
            expirationFolderId,
            expirationFolderPath,
            expirationFolderRecycled);
        this.indexBlockType = indexBlockType;
        this.indexedFolderId = indexedFolderId;
        this.indexedFolderPath = indexedFolderPath;
        this.indexedContentTypeId = indexedContentTypeId;
        this.indexedContentTypePath = indexedContentTypePath;
        this.indexedFolderRecycled = indexedFolderRecycled;
        this.maxRenderedAssets = maxRenderedAssets;
        this.depthOfIndex = depthOfIndex;
        this.includePageContent = includePageContent;
        this.includeCurrentPageXML = includeCurrentPageXML;
        this.renderCurrentPageAndHierarchy = renderCurrentPageAndHierarchy;
        this.includeChildrenInHierarchy = includeChildrenInHierarchy;
        this.indexPages = indexPages;
        this.indexBlocks = indexBlocks;
        this.indexLinks = indexLinks;
        this.indexFiles = indexFiles;
        this.indexRegularContent = indexRegularContent;
        this.indexSystemMetadata = indexSystemMetadata;
        this.indexUserMetadata = indexUserMetadata;
        this.indexAccessRights = indexAccessRights;
        this.indexUserInfo = indexUserInfo;
        this.indexWorkflowInfo = indexWorkflowInfo;
        this.appendCallingPageData = appendCallingPageData;
        this.sortMethod = sortMethod;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the indexBlockType value for this IndexBlock.
     * 
     * @return indexBlockType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockType getIndexBlockType() {
        return indexBlockType;
    }


    /**
     * Sets the indexBlockType value for this IndexBlock.
     * 
     * @param indexBlockType
     */
    public void setIndexBlockType(com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockType indexBlockType) {
        this.indexBlockType = indexBlockType;
    }


    /**
     * Gets the indexedFolderId value for this IndexBlock.
     * 
     * @return indexedFolderId
     */
    public java.lang.String getIndexedFolderId() {
        return indexedFolderId;
    }


    /**
     * Sets the indexedFolderId value for this IndexBlock.
     * 
     * @param indexedFolderId
     */
    public void setIndexedFolderId(java.lang.String indexedFolderId) {
        this.indexedFolderId = indexedFolderId;
    }


    /**
     * Gets the indexedFolderPath value for this IndexBlock.
     * 
     * @return indexedFolderPath
     */
    public java.lang.String getIndexedFolderPath() {
        return indexedFolderPath;
    }


    /**
     * Sets the indexedFolderPath value for this IndexBlock.
     * 
     * @param indexedFolderPath
     */
    public void setIndexedFolderPath(java.lang.String indexedFolderPath) {
        this.indexedFolderPath = indexedFolderPath;
    }


    /**
     * Gets the indexedContentTypeId value for this IndexBlock.
     * 
     * @return indexedContentTypeId
     */
    public java.lang.String getIndexedContentTypeId() {
        return indexedContentTypeId;
    }


    /**
     * Sets the indexedContentTypeId value for this IndexBlock.
     * 
     * @param indexedContentTypeId
     */
    public void setIndexedContentTypeId(java.lang.String indexedContentTypeId) {
        this.indexedContentTypeId = indexedContentTypeId;
    }


    /**
     * Gets the indexedContentTypePath value for this IndexBlock.
     * 
     * @return indexedContentTypePath
     */
    public java.lang.String getIndexedContentTypePath() {
        return indexedContentTypePath;
    }


    /**
     * Sets the indexedContentTypePath value for this IndexBlock.
     * 
     * @param indexedContentTypePath
     */
    public void setIndexedContentTypePath(java.lang.String indexedContentTypePath) {
        this.indexedContentTypePath = indexedContentTypePath;
    }


    /**
     * Gets the indexedFolderRecycled value for this IndexBlock.
     * 
     * @return indexedFolderRecycled
     */
    public java.lang.Boolean getIndexedFolderRecycled() {
        return indexedFolderRecycled;
    }


    /**
     * Sets the indexedFolderRecycled value for this IndexBlock.
     * 
     * @param indexedFolderRecycled
     */
    public void setIndexedFolderRecycled(java.lang.Boolean indexedFolderRecycled) {
        this.indexedFolderRecycled = indexedFolderRecycled;
    }


    /**
     * Gets the maxRenderedAssets value for this IndexBlock.
     * 
     * @return maxRenderedAssets
     */
    public org.apache.axis.types.NonNegativeInteger getMaxRenderedAssets() {
        return maxRenderedAssets;
    }


    /**
     * Sets the maxRenderedAssets value for this IndexBlock.
     * 
     * @param maxRenderedAssets
     */
    public void setMaxRenderedAssets(org.apache.axis.types.NonNegativeInteger maxRenderedAssets) {
        this.maxRenderedAssets = maxRenderedAssets;
    }


    /**
     * Gets the depthOfIndex value for this IndexBlock.
     * 
     * @return depthOfIndex
     */
    public org.apache.axis.types.NonNegativeInteger getDepthOfIndex() {
        return depthOfIndex;
    }


    /**
     * Sets the depthOfIndex value for this IndexBlock.
     * 
     * @param depthOfIndex
     */
    public void setDepthOfIndex(org.apache.axis.types.NonNegativeInteger depthOfIndex) {
        this.depthOfIndex = depthOfIndex;
    }


    /**
     * Gets the includePageContent value for this IndexBlock.
     * 
     * @return includePageContent
     */
    public java.lang.Boolean getIncludePageContent() {
        return includePageContent;
    }


    /**
     * Sets the includePageContent value for this IndexBlock.
     * 
     * @param includePageContent
     */
    public void setIncludePageContent(java.lang.Boolean includePageContent) {
        this.includePageContent = includePageContent;
    }


    /**
     * Gets the includeCurrentPageXML value for this IndexBlock.
     * 
     * @return includeCurrentPageXML
     */
    public java.lang.Boolean getIncludeCurrentPageXML() {
        return includeCurrentPageXML;
    }


    /**
     * Sets the includeCurrentPageXML value for this IndexBlock.
     * 
     * @param includeCurrentPageXML
     */
    public void setIncludeCurrentPageXML(java.lang.Boolean includeCurrentPageXML) {
        this.includeCurrentPageXML = includeCurrentPageXML;
    }


    /**
     * Gets the renderCurrentPageAndHierarchy value for this IndexBlock.
     * 
     * @return renderCurrentPageAndHierarchy
     */
    public java.lang.Boolean getRenderCurrentPageAndHierarchy() {
        return renderCurrentPageAndHierarchy;
    }


    /**
     * Sets the renderCurrentPageAndHierarchy value for this IndexBlock.
     * 
     * @param renderCurrentPageAndHierarchy
     */
    public void setRenderCurrentPageAndHierarchy(java.lang.Boolean renderCurrentPageAndHierarchy) {
        this.renderCurrentPageAndHierarchy = renderCurrentPageAndHierarchy;
    }


    /**
     * Gets the includeChildrenInHierarchy value for this IndexBlock.
     * 
     * @return includeChildrenInHierarchy
     */
    public java.lang.Boolean getIncludeChildrenInHierarchy() {
        return includeChildrenInHierarchy;
    }


    /**
     * Sets the includeChildrenInHierarchy value for this IndexBlock.
     * 
     * @param includeChildrenInHierarchy
     */
    public void setIncludeChildrenInHierarchy(java.lang.Boolean includeChildrenInHierarchy) {
        this.includeChildrenInHierarchy = includeChildrenInHierarchy;
    }


    /**
     * Gets the indexPages value for this IndexBlock.
     * 
     * @return indexPages
     */
    public java.lang.Boolean getIndexPages() {
        return indexPages;
    }


    /**
     * Sets the indexPages value for this IndexBlock.
     * 
     * @param indexPages
     */
    public void setIndexPages(java.lang.Boolean indexPages) {
        this.indexPages = indexPages;
    }


    /**
     * Gets the indexBlocks value for this IndexBlock.
     * 
     * @return indexBlocks
     */
    public java.lang.Boolean getIndexBlocks() {
        return indexBlocks;
    }


    /**
     * Sets the indexBlocks value for this IndexBlock.
     * 
     * @param indexBlocks
     */
    public void setIndexBlocks(java.lang.Boolean indexBlocks) {
        this.indexBlocks = indexBlocks;
    }


    /**
     * Gets the indexLinks value for this IndexBlock.
     * 
     * @return indexLinks
     */
    public java.lang.Boolean getIndexLinks() {
        return indexLinks;
    }


    /**
     * Sets the indexLinks value for this IndexBlock.
     * 
     * @param indexLinks
     */
    public void setIndexLinks(java.lang.Boolean indexLinks) {
        this.indexLinks = indexLinks;
    }


    /**
     * Gets the indexFiles value for this IndexBlock.
     * 
     * @return indexFiles
     */
    public java.lang.Boolean getIndexFiles() {
        return indexFiles;
    }


    /**
     * Sets the indexFiles value for this IndexBlock.
     * 
     * @param indexFiles
     */
    public void setIndexFiles(java.lang.Boolean indexFiles) {
        this.indexFiles = indexFiles;
    }


    /**
     * Gets the indexRegularContent value for this IndexBlock.
     * 
     * @return indexRegularContent
     */
    public java.lang.Boolean getIndexRegularContent() {
        return indexRegularContent;
    }


    /**
     * Sets the indexRegularContent value for this IndexBlock.
     * 
     * @param indexRegularContent
     */
    public void setIndexRegularContent(java.lang.Boolean indexRegularContent) {
        this.indexRegularContent = indexRegularContent;
    }


    /**
     * Gets the indexSystemMetadata value for this IndexBlock.
     * 
     * @return indexSystemMetadata
     */
    public java.lang.Boolean getIndexSystemMetadata() {
        return indexSystemMetadata;
    }


    /**
     * Sets the indexSystemMetadata value for this IndexBlock.
     * 
     * @param indexSystemMetadata
     */
    public void setIndexSystemMetadata(java.lang.Boolean indexSystemMetadata) {
        this.indexSystemMetadata = indexSystemMetadata;
    }


    /**
     * Gets the indexUserMetadata value for this IndexBlock.
     * 
     * @return indexUserMetadata
     */
    public java.lang.Boolean getIndexUserMetadata() {
        return indexUserMetadata;
    }


    /**
     * Sets the indexUserMetadata value for this IndexBlock.
     * 
     * @param indexUserMetadata
     */
    public void setIndexUserMetadata(java.lang.Boolean indexUserMetadata) {
        this.indexUserMetadata = indexUserMetadata;
    }


    /**
     * Gets the indexAccessRights value for this IndexBlock.
     * 
     * @return indexAccessRights
     */
    public java.lang.Boolean getIndexAccessRights() {
        return indexAccessRights;
    }


    /**
     * Sets the indexAccessRights value for this IndexBlock.
     * 
     * @param indexAccessRights
     */
    public void setIndexAccessRights(java.lang.Boolean indexAccessRights) {
        this.indexAccessRights = indexAccessRights;
    }


    /**
     * Gets the indexUserInfo value for this IndexBlock.
     * 
     * @return indexUserInfo
     */
    public java.lang.Boolean getIndexUserInfo() {
        return indexUserInfo;
    }


    /**
     * Sets the indexUserInfo value for this IndexBlock.
     * 
     * @param indexUserInfo
     */
    public void setIndexUserInfo(java.lang.Boolean indexUserInfo) {
        this.indexUserInfo = indexUserInfo;
    }


    /**
     * Gets the indexWorkflowInfo value for this IndexBlock.
     * 
     * @return indexWorkflowInfo
     */
    public java.lang.Boolean getIndexWorkflowInfo() {
        return indexWorkflowInfo;
    }


    /**
     * Sets the indexWorkflowInfo value for this IndexBlock.
     * 
     * @param indexWorkflowInfo
     */
    public void setIndexWorkflowInfo(java.lang.Boolean indexWorkflowInfo) {
        this.indexWorkflowInfo = indexWorkflowInfo;
    }


    /**
     * Gets the appendCallingPageData value for this IndexBlock.
     * 
     * @return appendCallingPageData
     */
    public java.lang.Boolean getAppendCallingPageData() {
        return appendCallingPageData;
    }


    /**
     * Sets the appendCallingPageData value for this IndexBlock.
     * 
     * @param appendCallingPageData
     */
    public void setAppendCallingPageData(java.lang.Boolean appendCallingPageData) {
        this.appendCallingPageData = appendCallingPageData;
    }


    /**
     * Gets the sortMethod value for this IndexBlock.
     * 
     * @return sortMethod
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortMethod getSortMethod() {
        return sortMethod;
    }


    /**
     * Sets the sortMethod value for this IndexBlock.
     * 
     * @param sortMethod
     */
    public void setSortMethod(com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }


    /**
     * Gets the sortOrder value for this IndexBlock.
     * 
     * @return sortOrder
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this IndexBlock.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndexBlock)) return false;
        IndexBlock other = (IndexBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.indexBlockType==null && other.getIndexBlockType()==null) || 
             (this.indexBlockType!=null &&
              this.indexBlockType.equals(other.getIndexBlockType()))) &&
            ((this.indexedFolderId==null && other.getIndexedFolderId()==null) || 
             (this.indexedFolderId!=null &&
              this.indexedFolderId.equals(other.getIndexedFolderId()))) &&
            ((this.indexedFolderPath==null && other.getIndexedFolderPath()==null) || 
             (this.indexedFolderPath!=null &&
              this.indexedFolderPath.equals(other.getIndexedFolderPath()))) &&
            ((this.indexedContentTypeId==null && other.getIndexedContentTypeId()==null) || 
             (this.indexedContentTypeId!=null &&
              this.indexedContentTypeId.equals(other.getIndexedContentTypeId()))) &&
            ((this.indexedContentTypePath==null && other.getIndexedContentTypePath()==null) || 
             (this.indexedContentTypePath!=null &&
              this.indexedContentTypePath.equals(other.getIndexedContentTypePath()))) &&
            ((this.indexedFolderRecycled==null && other.getIndexedFolderRecycled()==null) || 
             (this.indexedFolderRecycled!=null &&
              this.indexedFolderRecycled.equals(other.getIndexedFolderRecycled()))) &&
            ((this.maxRenderedAssets==null && other.getMaxRenderedAssets()==null) || 
             (this.maxRenderedAssets!=null &&
              this.maxRenderedAssets.equals(other.getMaxRenderedAssets()))) &&
            ((this.depthOfIndex==null && other.getDepthOfIndex()==null) || 
             (this.depthOfIndex!=null &&
              this.depthOfIndex.equals(other.getDepthOfIndex()))) &&
            ((this.includePageContent==null && other.getIncludePageContent()==null) || 
             (this.includePageContent!=null &&
              this.includePageContent.equals(other.getIncludePageContent()))) &&
            ((this.includeCurrentPageXML==null && other.getIncludeCurrentPageXML()==null) || 
             (this.includeCurrentPageXML!=null &&
              this.includeCurrentPageXML.equals(other.getIncludeCurrentPageXML()))) &&
            ((this.renderCurrentPageAndHierarchy==null && other.getRenderCurrentPageAndHierarchy()==null) || 
             (this.renderCurrentPageAndHierarchy!=null &&
              this.renderCurrentPageAndHierarchy.equals(other.getRenderCurrentPageAndHierarchy()))) &&
            ((this.includeChildrenInHierarchy==null && other.getIncludeChildrenInHierarchy()==null) || 
             (this.includeChildrenInHierarchy!=null &&
              this.includeChildrenInHierarchy.equals(other.getIncludeChildrenInHierarchy()))) &&
            ((this.indexPages==null && other.getIndexPages()==null) || 
             (this.indexPages!=null &&
              this.indexPages.equals(other.getIndexPages()))) &&
            ((this.indexBlocks==null && other.getIndexBlocks()==null) || 
             (this.indexBlocks!=null &&
              this.indexBlocks.equals(other.getIndexBlocks()))) &&
            ((this.indexLinks==null && other.getIndexLinks()==null) || 
             (this.indexLinks!=null &&
              this.indexLinks.equals(other.getIndexLinks()))) &&
            ((this.indexFiles==null && other.getIndexFiles()==null) || 
             (this.indexFiles!=null &&
              this.indexFiles.equals(other.getIndexFiles()))) &&
            ((this.indexRegularContent==null && other.getIndexRegularContent()==null) || 
             (this.indexRegularContent!=null &&
              this.indexRegularContent.equals(other.getIndexRegularContent()))) &&
            ((this.indexSystemMetadata==null && other.getIndexSystemMetadata()==null) || 
             (this.indexSystemMetadata!=null &&
              this.indexSystemMetadata.equals(other.getIndexSystemMetadata()))) &&
            ((this.indexUserMetadata==null && other.getIndexUserMetadata()==null) || 
             (this.indexUserMetadata!=null &&
              this.indexUserMetadata.equals(other.getIndexUserMetadata()))) &&
            ((this.indexAccessRights==null && other.getIndexAccessRights()==null) || 
             (this.indexAccessRights!=null &&
              this.indexAccessRights.equals(other.getIndexAccessRights()))) &&
            ((this.indexUserInfo==null && other.getIndexUserInfo()==null) || 
             (this.indexUserInfo!=null &&
              this.indexUserInfo.equals(other.getIndexUserInfo()))) &&
            ((this.indexWorkflowInfo==null && other.getIndexWorkflowInfo()==null) || 
             (this.indexWorkflowInfo!=null &&
              this.indexWorkflowInfo.equals(other.getIndexWorkflowInfo()))) &&
            ((this.appendCallingPageData==null && other.getAppendCallingPageData()==null) || 
             (this.appendCallingPageData!=null &&
              this.appendCallingPageData.equals(other.getAppendCallingPageData()))) &&
            ((this.sortMethod==null && other.getSortMethod()==null) || 
             (this.sortMethod!=null &&
              this.sortMethod.equals(other.getSortMethod()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getIndexBlockType() != null) {
            _hashCode += getIndexBlockType().hashCode();
        }
        if (getIndexedFolderId() != null) {
            _hashCode += getIndexedFolderId().hashCode();
        }
        if (getIndexedFolderPath() != null) {
            _hashCode += getIndexedFolderPath().hashCode();
        }
        if (getIndexedContentTypeId() != null) {
            _hashCode += getIndexedContentTypeId().hashCode();
        }
        if (getIndexedContentTypePath() != null) {
            _hashCode += getIndexedContentTypePath().hashCode();
        }
        if (getIndexedFolderRecycled() != null) {
            _hashCode += getIndexedFolderRecycled().hashCode();
        }
        if (getMaxRenderedAssets() != null) {
            _hashCode += getMaxRenderedAssets().hashCode();
        }
        if (getDepthOfIndex() != null) {
            _hashCode += getDepthOfIndex().hashCode();
        }
        if (getIncludePageContent() != null) {
            _hashCode += getIncludePageContent().hashCode();
        }
        if (getIncludeCurrentPageXML() != null) {
            _hashCode += getIncludeCurrentPageXML().hashCode();
        }
        if (getRenderCurrentPageAndHierarchy() != null) {
            _hashCode += getRenderCurrentPageAndHierarchy().hashCode();
        }
        if (getIncludeChildrenInHierarchy() != null) {
            _hashCode += getIncludeChildrenInHierarchy().hashCode();
        }
        if (getIndexPages() != null) {
            _hashCode += getIndexPages().hashCode();
        }
        if (getIndexBlocks() != null) {
            _hashCode += getIndexBlocks().hashCode();
        }
        if (getIndexLinks() != null) {
            _hashCode += getIndexLinks().hashCode();
        }
        if (getIndexFiles() != null) {
            _hashCode += getIndexFiles().hashCode();
        }
        if (getIndexRegularContent() != null) {
            _hashCode += getIndexRegularContent().hashCode();
        }
        if (getIndexSystemMetadata() != null) {
            _hashCode += getIndexSystemMetadata().hashCode();
        }
        if (getIndexUserMetadata() != null) {
            _hashCode += getIndexUserMetadata().hashCode();
        }
        if (getIndexAccessRights() != null) {
            _hashCode += getIndexAccessRights().hashCode();
        }
        if (getIndexUserInfo() != null) {
            _hashCode += getIndexUserInfo().hashCode();
        }
        if (getIndexWorkflowInfo() != null) {
            _hashCode += getIndexWorkflowInfo().hashCode();
        }
        if (getAppendCallingPageData() != null) {
            _hashCode += getAppendCallingPageData().hashCode();
        }
        if (getSortMethod() != null) {
            _hashCode += getSortMethod().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndexBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexBlockType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlockType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexedFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedFolderPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexedFolderPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedContentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexedContentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedContentTypePath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexedContentTypePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexedFolderRecycled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexedFolderRecycled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRenderedAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "maxRenderedAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depthOfIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "depthOfIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includePageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCurrentPageXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeCurrentPageXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderCurrentPageAndHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "renderCurrentPageAndHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildrenInHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "includeChildrenInHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexRegularContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexRegularContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexSystemMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexSystemMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexUserMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexUserMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexAccessRights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexAccessRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexUserInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexUserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexWorkflowInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexWorkflowInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendCallingPageData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "appendCallingPageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "sortMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-sort-method"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-sort-order"));
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
