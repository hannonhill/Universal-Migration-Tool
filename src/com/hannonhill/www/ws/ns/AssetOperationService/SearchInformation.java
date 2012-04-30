/**
 * SearchInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SearchInformation  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType;

    private java.lang.String assetName;

    private java.lang.String assetContent;

    private java.lang.String assetMetadata;

    private java.lang.Boolean searchBlocks;

    private java.lang.Boolean searchFiles;

    private java.lang.Boolean searchFolders;

    private java.lang.Boolean searchPages;

    private java.lang.Boolean searchFormats;

    private java.lang.Boolean searchSymlinks;

    private java.lang.Boolean searchTemplates;

    private java.lang.Boolean searchAssetFactories;

    private java.lang.Boolean searchPageConfigurationSets;

    private java.lang.Boolean searchContentTypes;

    private java.lang.Boolean searchDataDefinitions;

    private java.lang.Boolean searchWorkflowDefinitions;

    private java.lang.Boolean searchMetadataSets;

    private java.lang.Boolean searchPublishSets;

    private java.lang.Boolean searchConnectors;

    private java.lang.Boolean searchDestinations;

    private java.lang.Boolean searchTargets;

    private java.lang.Boolean searchTransports;

    private java.lang.Boolean searchUsers;

    private java.lang.Boolean searchGroups;

    private java.lang.Boolean searchRoles;

    private java.lang.Boolean searchSites;

    public SearchInformation() {
    }

    public SearchInformation(
           com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType,
           java.lang.String assetName,
           java.lang.String assetContent,
           java.lang.String assetMetadata,
           java.lang.Boolean searchBlocks,
           java.lang.Boolean searchFiles,
           java.lang.Boolean searchFolders,
           java.lang.Boolean searchPages,
           java.lang.Boolean searchFormats,
           java.lang.Boolean searchSymlinks,
           java.lang.Boolean searchTemplates,
           java.lang.Boolean searchAssetFactories,
           java.lang.Boolean searchPageConfigurationSets,
           java.lang.Boolean searchContentTypes,
           java.lang.Boolean searchDataDefinitions,
           java.lang.Boolean searchWorkflowDefinitions,
           java.lang.Boolean searchMetadataSets,
           java.lang.Boolean searchPublishSets,
           java.lang.Boolean searchConnectors,
           java.lang.Boolean searchDestinations,
           java.lang.Boolean searchTargets,
           java.lang.Boolean searchTransports,
           java.lang.Boolean searchUsers,
           java.lang.Boolean searchGroups,
           java.lang.Boolean searchRoles,
           java.lang.Boolean searchSites) {
           this.matchType = matchType;
           this.assetName = assetName;
           this.assetContent = assetContent;
           this.assetMetadata = assetMetadata;
           this.searchBlocks = searchBlocks;
           this.searchFiles = searchFiles;
           this.searchFolders = searchFolders;
           this.searchPages = searchPages;
           this.searchFormats = searchFormats;
           this.searchSymlinks = searchSymlinks;
           this.searchTemplates = searchTemplates;
           this.searchAssetFactories = searchAssetFactories;
           this.searchPageConfigurationSets = searchPageConfigurationSets;
           this.searchContentTypes = searchContentTypes;
           this.searchDataDefinitions = searchDataDefinitions;
           this.searchWorkflowDefinitions = searchWorkflowDefinitions;
           this.searchMetadataSets = searchMetadataSets;
           this.searchPublishSets = searchPublishSets;
           this.searchConnectors = searchConnectors;
           this.searchDestinations = searchDestinations;
           this.searchTargets = searchTargets;
           this.searchTransports = searchTransports;
           this.searchUsers = searchUsers;
           this.searchGroups = searchGroups;
           this.searchRoles = searchRoles;
           this.searchSites = searchSites;
    }


    /**
     * Gets the matchType value for this SearchInformation.
     * 
     * @return matchType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this SearchInformation.
     * 
     * @param matchType
     */
    public void setMatchType(com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the assetName value for this SearchInformation.
     * 
     * @return assetName
     */
    public java.lang.String getAssetName() {
        return assetName;
    }


    /**
     * Sets the assetName value for this SearchInformation.
     * 
     * @param assetName
     */
    public void setAssetName(java.lang.String assetName) {
        this.assetName = assetName;
    }


    /**
     * Gets the assetContent value for this SearchInformation.
     * 
     * @return assetContent
     */
    public java.lang.String getAssetContent() {
        return assetContent;
    }


    /**
     * Sets the assetContent value for this SearchInformation.
     * 
     * @param assetContent
     */
    public void setAssetContent(java.lang.String assetContent) {
        this.assetContent = assetContent;
    }


    /**
     * Gets the assetMetadata value for this SearchInformation.
     * 
     * @return assetMetadata
     */
    public java.lang.String getAssetMetadata() {
        return assetMetadata;
    }


    /**
     * Sets the assetMetadata value for this SearchInformation.
     * 
     * @param assetMetadata
     */
    public void setAssetMetadata(java.lang.String assetMetadata) {
        this.assetMetadata = assetMetadata;
    }


    /**
     * Gets the searchBlocks value for this SearchInformation.
     * 
     * @return searchBlocks
     */
    public java.lang.Boolean getSearchBlocks() {
        return searchBlocks;
    }


    /**
     * Sets the searchBlocks value for this SearchInformation.
     * 
     * @param searchBlocks
     */
    public void setSearchBlocks(java.lang.Boolean searchBlocks) {
        this.searchBlocks = searchBlocks;
    }


    /**
     * Gets the searchFiles value for this SearchInformation.
     * 
     * @return searchFiles
     */
    public java.lang.Boolean getSearchFiles() {
        return searchFiles;
    }


    /**
     * Sets the searchFiles value for this SearchInformation.
     * 
     * @param searchFiles
     */
    public void setSearchFiles(java.lang.Boolean searchFiles) {
        this.searchFiles = searchFiles;
    }


    /**
     * Gets the searchFolders value for this SearchInformation.
     * 
     * @return searchFolders
     */
    public java.lang.Boolean getSearchFolders() {
        return searchFolders;
    }


    /**
     * Sets the searchFolders value for this SearchInformation.
     * 
     * @param searchFolders
     */
    public void setSearchFolders(java.lang.Boolean searchFolders) {
        this.searchFolders = searchFolders;
    }


    /**
     * Gets the searchPages value for this SearchInformation.
     * 
     * @return searchPages
     */
    public java.lang.Boolean getSearchPages() {
        return searchPages;
    }


    /**
     * Sets the searchPages value for this SearchInformation.
     * 
     * @param searchPages
     */
    public void setSearchPages(java.lang.Boolean searchPages) {
        this.searchPages = searchPages;
    }


    /**
     * Gets the searchFormats value for this SearchInformation.
     * 
     * @return searchFormats
     */
    public java.lang.Boolean getSearchFormats() {
        return searchFormats;
    }


    /**
     * Sets the searchFormats value for this SearchInformation.
     * 
     * @param searchFormats
     */
    public void setSearchFormats(java.lang.Boolean searchFormats) {
        this.searchFormats = searchFormats;
    }


    /**
     * Gets the searchSymlinks value for this SearchInformation.
     * 
     * @return searchSymlinks
     */
    public java.lang.Boolean getSearchSymlinks() {
        return searchSymlinks;
    }


    /**
     * Sets the searchSymlinks value for this SearchInformation.
     * 
     * @param searchSymlinks
     */
    public void setSearchSymlinks(java.lang.Boolean searchSymlinks) {
        this.searchSymlinks = searchSymlinks;
    }


    /**
     * Gets the searchTemplates value for this SearchInformation.
     * 
     * @return searchTemplates
     */
    public java.lang.Boolean getSearchTemplates() {
        return searchTemplates;
    }


    /**
     * Sets the searchTemplates value for this SearchInformation.
     * 
     * @param searchTemplates
     */
    public void setSearchTemplates(java.lang.Boolean searchTemplates) {
        this.searchTemplates = searchTemplates;
    }


    /**
     * Gets the searchAssetFactories value for this SearchInformation.
     * 
     * @return searchAssetFactories
     */
    public java.lang.Boolean getSearchAssetFactories() {
        return searchAssetFactories;
    }


    /**
     * Sets the searchAssetFactories value for this SearchInformation.
     * 
     * @param searchAssetFactories
     */
    public void setSearchAssetFactories(java.lang.Boolean searchAssetFactories) {
        this.searchAssetFactories = searchAssetFactories;
    }


    /**
     * Gets the searchPageConfigurationSets value for this SearchInformation.
     * 
     * @return searchPageConfigurationSets
     */
    public java.lang.Boolean getSearchPageConfigurationSets() {
        return searchPageConfigurationSets;
    }


    /**
     * Sets the searchPageConfigurationSets value for this SearchInformation.
     * 
     * @param searchPageConfigurationSets
     */
    public void setSearchPageConfigurationSets(java.lang.Boolean searchPageConfigurationSets) {
        this.searchPageConfigurationSets = searchPageConfigurationSets;
    }


    /**
     * Gets the searchContentTypes value for this SearchInformation.
     * 
     * @return searchContentTypes
     */
    public java.lang.Boolean getSearchContentTypes() {
        return searchContentTypes;
    }


    /**
     * Sets the searchContentTypes value for this SearchInformation.
     * 
     * @param searchContentTypes
     */
    public void setSearchContentTypes(java.lang.Boolean searchContentTypes) {
        this.searchContentTypes = searchContentTypes;
    }


    /**
     * Gets the searchDataDefinitions value for this SearchInformation.
     * 
     * @return searchDataDefinitions
     */
    public java.lang.Boolean getSearchDataDefinitions() {
        return searchDataDefinitions;
    }


    /**
     * Sets the searchDataDefinitions value for this SearchInformation.
     * 
     * @param searchDataDefinitions
     */
    public void setSearchDataDefinitions(java.lang.Boolean searchDataDefinitions) {
        this.searchDataDefinitions = searchDataDefinitions;
    }


    /**
     * Gets the searchWorkflowDefinitions value for this SearchInformation.
     * 
     * @return searchWorkflowDefinitions
     */
    public java.lang.Boolean getSearchWorkflowDefinitions() {
        return searchWorkflowDefinitions;
    }


    /**
     * Sets the searchWorkflowDefinitions value for this SearchInformation.
     * 
     * @param searchWorkflowDefinitions
     */
    public void setSearchWorkflowDefinitions(java.lang.Boolean searchWorkflowDefinitions) {
        this.searchWorkflowDefinitions = searchWorkflowDefinitions;
    }


    /**
     * Gets the searchMetadataSets value for this SearchInformation.
     * 
     * @return searchMetadataSets
     */
    public java.lang.Boolean getSearchMetadataSets() {
        return searchMetadataSets;
    }


    /**
     * Sets the searchMetadataSets value for this SearchInformation.
     * 
     * @param searchMetadataSets
     */
    public void setSearchMetadataSets(java.lang.Boolean searchMetadataSets) {
        this.searchMetadataSets = searchMetadataSets;
    }


    /**
     * Gets the searchPublishSets value for this SearchInformation.
     * 
     * @return searchPublishSets
     */
    public java.lang.Boolean getSearchPublishSets() {
        return searchPublishSets;
    }


    /**
     * Sets the searchPublishSets value for this SearchInformation.
     * 
     * @param searchPublishSets
     */
    public void setSearchPublishSets(java.lang.Boolean searchPublishSets) {
        this.searchPublishSets = searchPublishSets;
    }


    /**
     * Gets the searchConnectors value for this SearchInformation.
     * 
     * @return searchConnectors
     */
    public java.lang.Boolean getSearchConnectors() {
        return searchConnectors;
    }


    /**
     * Sets the searchConnectors value for this SearchInformation.
     * 
     * @param searchConnectors
     */
    public void setSearchConnectors(java.lang.Boolean searchConnectors) {
        this.searchConnectors = searchConnectors;
    }


    /**
     * Gets the searchDestinations value for this SearchInformation.
     * 
     * @return searchDestinations
     */
    public java.lang.Boolean getSearchDestinations() {
        return searchDestinations;
    }


    /**
     * Sets the searchDestinations value for this SearchInformation.
     * 
     * @param searchDestinations
     */
    public void setSearchDestinations(java.lang.Boolean searchDestinations) {
        this.searchDestinations = searchDestinations;
    }


    /**
     * Gets the searchTargets value for this SearchInformation.
     * 
     * @return searchTargets
     */
    public java.lang.Boolean getSearchTargets() {
        return searchTargets;
    }


    /**
     * Sets the searchTargets value for this SearchInformation.
     * 
     * @param searchTargets
     */
    public void setSearchTargets(java.lang.Boolean searchTargets) {
        this.searchTargets = searchTargets;
    }


    /**
     * Gets the searchTransports value for this SearchInformation.
     * 
     * @return searchTransports
     */
    public java.lang.Boolean getSearchTransports() {
        return searchTransports;
    }


    /**
     * Sets the searchTransports value for this SearchInformation.
     * 
     * @param searchTransports
     */
    public void setSearchTransports(java.lang.Boolean searchTransports) {
        this.searchTransports = searchTransports;
    }


    /**
     * Gets the searchUsers value for this SearchInformation.
     * 
     * @return searchUsers
     */
    public java.lang.Boolean getSearchUsers() {
        return searchUsers;
    }


    /**
     * Sets the searchUsers value for this SearchInformation.
     * 
     * @param searchUsers
     */
    public void setSearchUsers(java.lang.Boolean searchUsers) {
        this.searchUsers = searchUsers;
    }


    /**
     * Gets the searchGroups value for this SearchInformation.
     * 
     * @return searchGroups
     */
    public java.lang.Boolean getSearchGroups() {
        return searchGroups;
    }


    /**
     * Sets the searchGroups value for this SearchInformation.
     * 
     * @param searchGroups
     */
    public void setSearchGroups(java.lang.Boolean searchGroups) {
        this.searchGroups = searchGroups;
    }


    /**
     * Gets the searchRoles value for this SearchInformation.
     * 
     * @return searchRoles
     */
    public java.lang.Boolean getSearchRoles() {
        return searchRoles;
    }


    /**
     * Sets the searchRoles value for this SearchInformation.
     * 
     * @param searchRoles
     */
    public void setSearchRoles(java.lang.Boolean searchRoles) {
        this.searchRoles = searchRoles;
    }


    /**
     * Gets the searchSites value for this SearchInformation.
     * 
     * @return searchSites
     */
    public java.lang.Boolean getSearchSites() {
        return searchSites;
    }


    /**
     * Sets the searchSites value for this SearchInformation.
     * 
     * @param searchSites
     */
    public void setSearchSites(java.lang.Boolean searchSites) {
        this.searchSites = searchSites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchInformation)) return false;
        SearchInformation other = (SearchInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.assetName==null && other.getAssetName()==null) || 
             (this.assetName!=null &&
              this.assetName.equals(other.getAssetName()))) &&
            ((this.assetContent==null && other.getAssetContent()==null) || 
             (this.assetContent!=null &&
              this.assetContent.equals(other.getAssetContent()))) &&
            ((this.assetMetadata==null && other.getAssetMetadata()==null) || 
             (this.assetMetadata!=null &&
              this.assetMetadata.equals(other.getAssetMetadata()))) &&
            ((this.searchBlocks==null && other.getSearchBlocks()==null) || 
             (this.searchBlocks!=null &&
              this.searchBlocks.equals(other.getSearchBlocks()))) &&
            ((this.searchFiles==null && other.getSearchFiles()==null) || 
             (this.searchFiles!=null &&
              this.searchFiles.equals(other.getSearchFiles()))) &&
            ((this.searchFolders==null && other.getSearchFolders()==null) || 
             (this.searchFolders!=null &&
              this.searchFolders.equals(other.getSearchFolders()))) &&
            ((this.searchPages==null && other.getSearchPages()==null) || 
             (this.searchPages!=null &&
              this.searchPages.equals(other.getSearchPages()))) &&
            ((this.searchFormats==null && other.getSearchFormats()==null) || 
             (this.searchFormats!=null &&
              this.searchFormats.equals(other.getSearchFormats()))) &&
            ((this.searchSymlinks==null && other.getSearchSymlinks()==null) || 
             (this.searchSymlinks!=null &&
              this.searchSymlinks.equals(other.getSearchSymlinks()))) &&
            ((this.searchTemplates==null && other.getSearchTemplates()==null) || 
             (this.searchTemplates!=null &&
              this.searchTemplates.equals(other.getSearchTemplates()))) &&
            ((this.searchAssetFactories==null && other.getSearchAssetFactories()==null) || 
             (this.searchAssetFactories!=null &&
              this.searchAssetFactories.equals(other.getSearchAssetFactories()))) &&
            ((this.searchPageConfigurationSets==null && other.getSearchPageConfigurationSets()==null) || 
             (this.searchPageConfigurationSets!=null &&
              this.searchPageConfigurationSets.equals(other.getSearchPageConfigurationSets()))) &&
            ((this.searchContentTypes==null && other.getSearchContentTypes()==null) || 
             (this.searchContentTypes!=null &&
              this.searchContentTypes.equals(other.getSearchContentTypes()))) &&
            ((this.searchDataDefinitions==null && other.getSearchDataDefinitions()==null) || 
             (this.searchDataDefinitions!=null &&
              this.searchDataDefinitions.equals(other.getSearchDataDefinitions()))) &&
            ((this.searchWorkflowDefinitions==null && other.getSearchWorkflowDefinitions()==null) || 
             (this.searchWorkflowDefinitions!=null &&
              this.searchWorkflowDefinitions.equals(other.getSearchWorkflowDefinitions()))) &&
            ((this.searchMetadataSets==null && other.getSearchMetadataSets()==null) || 
             (this.searchMetadataSets!=null &&
              this.searchMetadataSets.equals(other.getSearchMetadataSets()))) &&
            ((this.searchPublishSets==null && other.getSearchPublishSets()==null) || 
             (this.searchPublishSets!=null &&
              this.searchPublishSets.equals(other.getSearchPublishSets()))) &&
            ((this.searchConnectors==null && other.getSearchConnectors()==null) || 
             (this.searchConnectors!=null &&
              this.searchConnectors.equals(other.getSearchConnectors()))) &&
            ((this.searchDestinations==null && other.getSearchDestinations()==null) || 
             (this.searchDestinations!=null &&
              this.searchDestinations.equals(other.getSearchDestinations()))) &&
            ((this.searchTargets==null && other.getSearchTargets()==null) || 
             (this.searchTargets!=null &&
              this.searchTargets.equals(other.getSearchTargets()))) &&
            ((this.searchTransports==null && other.getSearchTransports()==null) || 
             (this.searchTransports!=null &&
              this.searchTransports.equals(other.getSearchTransports()))) &&
            ((this.searchUsers==null && other.getSearchUsers()==null) || 
             (this.searchUsers!=null &&
              this.searchUsers.equals(other.getSearchUsers()))) &&
            ((this.searchGroups==null && other.getSearchGroups()==null) || 
             (this.searchGroups!=null &&
              this.searchGroups.equals(other.getSearchGroups()))) &&
            ((this.searchRoles==null && other.getSearchRoles()==null) || 
             (this.searchRoles!=null &&
              this.searchRoles.equals(other.getSearchRoles()))) &&
            ((this.searchSites==null && other.getSearchSites()==null) || 
             (this.searchSites!=null &&
              this.searchSites.equals(other.getSearchSites())));
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
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getAssetName() != null) {
            _hashCode += getAssetName().hashCode();
        }
        if (getAssetContent() != null) {
            _hashCode += getAssetContent().hashCode();
        }
        if (getAssetMetadata() != null) {
            _hashCode += getAssetMetadata().hashCode();
        }
        if (getSearchBlocks() != null) {
            _hashCode += getSearchBlocks().hashCode();
        }
        if (getSearchFiles() != null) {
            _hashCode += getSearchFiles().hashCode();
        }
        if (getSearchFolders() != null) {
            _hashCode += getSearchFolders().hashCode();
        }
        if (getSearchPages() != null) {
            _hashCode += getSearchPages().hashCode();
        }
        if (getSearchFormats() != null) {
            _hashCode += getSearchFormats().hashCode();
        }
        if (getSearchSymlinks() != null) {
            _hashCode += getSearchSymlinks().hashCode();
        }
        if (getSearchTemplates() != null) {
            _hashCode += getSearchTemplates().hashCode();
        }
        if (getSearchAssetFactories() != null) {
            _hashCode += getSearchAssetFactories().hashCode();
        }
        if (getSearchPageConfigurationSets() != null) {
            _hashCode += getSearchPageConfigurationSets().hashCode();
        }
        if (getSearchContentTypes() != null) {
            _hashCode += getSearchContentTypes().hashCode();
        }
        if (getSearchDataDefinitions() != null) {
            _hashCode += getSearchDataDefinitions().hashCode();
        }
        if (getSearchWorkflowDefinitions() != null) {
            _hashCode += getSearchWorkflowDefinitions().hashCode();
        }
        if (getSearchMetadataSets() != null) {
            _hashCode += getSearchMetadataSets().hashCode();
        }
        if (getSearchPublishSets() != null) {
            _hashCode += getSearchPublishSets().hashCode();
        }
        if (getSearchConnectors() != null) {
            _hashCode += getSearchConnectors().hashCode();
        }
        if (getSearchDestinations() != null) {
            _hashCode += getSearchDestinations().hashCode();
        }
        if (getSearchTargets() != null) {
            _hashCode += getSearchTargets().hashCode();
        }
        if (getSearchTransports() != null) {
            _hashCode += getSearchTransports().hashCode();
        }
        if (getSearchUsers() != null) {
            _hashCode += getSearchUsers().hashCode();
        }
        if (getSearchGroups() != null) {
            _hashCode += getSearchGroups().hashCode();
        }
        if (getSearchRoles() != null) {
            _hashCode += getSearchRoles().hashCode();
        }
        if (getSearchSites() != null) {
            _hashCode += getSearchSites().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search-match-type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchFormats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchFormats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSymlinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchSymlinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchAssetFactories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchAssetFactories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPageConfigurationSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchPageConfigurationSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchContentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchContentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchDataDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchDataDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchWorkflowDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchWorkflowDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchMetadataSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchMetadataSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPublishSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchPublishSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchConnectors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchConnectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchDestinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchDestinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTransports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchTransports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchSites"));
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
