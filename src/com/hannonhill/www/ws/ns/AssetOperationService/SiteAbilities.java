/**
 * SiteAbilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SiteAbilities  implements java.io.Serializable {
    private java.lang.Boolean bypassAllPermissionsChecks;

    private java.lang.Boolean uploadImagesFromWysiwyg;

    private java.lang.Boolean multiSelectCopy;

    private java.lang.Boolean multiSelectPublish;

    private java.lang.Boolean multiSelectMove;

    private java.lang.Boolean multiSelectDelete;

    private java.lang.Boolean editPageLevelConfigurations;

    private java.lang.Boolean editPageContentType;

    private java.lang.Boolean editDataDefinition;

    private java.lang.Boolean publishReadableHomeAssets;

    private java.lang.Boolean publishWritableHomeAssets;

    private java.lang.Boolean editAccessRights;

    private java.lang.Boolean viewVersions;

    private java.lang.Boolean activateDeleteVersions;

    private java.lang.Boolean accessAudits;

    private java.lang.Boolean bypassWorkflow;

    private java.lang.Boolean assignApproveWorkflowSteps;

    private java.lang.Boolean deleteWorkflows;

    private java.lang.Boolean breakLocks;

    private java.lang.Boolean assignWorkflowsToFolders;

    private java.lang.Boolean bypassAssetFactoryGroupsNewMenu;

    private java.lang.Boolean bypassDestinationGroupsWhenPublishing;

    private java.lang.Boolean bypassWorkflowDefintionGroupsForFolders;

    private java.lang.Boolean accessAdminArea;

    private java.lang.Boolean accessAssetFactories;

    private java.lang.Boolean accessConfigurationSets;

    private java.lang.Boolean accessDataDefinitions;

    private java.lang.Boolean accessMetadataSets;

    private java.lang.Boolean accessPublishSets;

    private java.lang.Boolean accessDestinations;

    private java.lang.Boolean accessTransports;

    private java.lang.Boolean accessWorkflowDefinitions;

    private java.lang.Boolean accessContentTypes;

    private java.lang.Boolean accessConnectors;

    private java.lang.Boolean publishReadableAdminAreaAssets;

    private java.lang.Boolean publishWritableAdminAreaAssets;

    private java.lang.Boolean integrateFolder;

    private java.lang.Boolean importZipArchive;

    private java.lang.Boolean bulkChange;

    private java.lang.Boolean recycleBinViewRestoreUserAssets;

    private java.lang.Boolean recycleBinDeleteAssets;

    private java.lang.Boolean recycleBinViewRestoreAllAssets;

    private java.lang.Boolean moveRenameAssets;

    public SiteAbilities() {
    }

    public SiteAbilities(
           java.lang.Boolean bypassAllPermissionsChecks,
           java.lang.Boolean uploadImagesFromWysiwyg,
           java.lang.Boolean multiSelectCopy,
           java.lang.Boolean multiSelectPublish,
           java.lang.Boolean multiSelectMove,
           java.lang.Boolean multiSelectDelete,
           java.lang.Boolean editPageLevelConfigurations,
           java.lang.Boolean editPageContentType,
           java.lang.Boolean editDataDefinition,
           java.lang.Boolean publishReadableHomeAssets,
           java.lang.Boolean publishWritableHomeAssets,
           java.lang.Boolean editAccessRights,
           java.lang.Boolean viewVersions,
           java.lang.Boolean activateDeleteVersions,
           java.lang.Boolean accessAudits,
           java.lang.Boolean bypassWorkflow,
           java.lang.Boolean assignApproveWorkflowSteps,
           java.lang.Boolean deleteWorkflows,
           java.lang.Boolean breakLocks,
           java.lang.Boolean assignWorkflowsToFolders,
           java.lang.Boolean bypassAssetFactoryGroupsNewMenu,
           java.lang.Boolean bypassDestinationGroupsWhenPublishing,
           java.lang.Boolean bypassWorkflowDefintionGroupsForFolders,
           java.lang.Boolean accessAdminArea,
           java.lang.Boolean accessAssetFactories,
           java.lang.Boolean accessConfigurationSets,
           java.lang.Boolean accessDataDefinitions,
           java.lang.Boolean accessMetadataSets,
           java.lang.Boolean accessPublishSets,
           java.lang.Boolean accessDestinations,
           java.lang.Boolean accessTransports,
           java.lang.Boolean accessWorkflowDefinitions,
           java.lang.Boolean accessContentTypes,
           java.lang.Boolean accessConnectors,
           java.lang.Boolean publishReadableAdminAreaAssets,
           java.lang.Boolean publishWritableAdminAreaAssets,
           java.lang.Boolean integrateFolder,
           java.lang.Boolean importZipArchive,
           java.lang.Boolean bulkChange,
           java.lang.Boolean recycleBinViewRestoreUserAssets,
           java.lang.Boolean recycleBinDeleteAssets,
           java.lang.Boolean recycleBinViewRestoreAllAssets,
           java.lang.Boolean moveRenameAssets) {
           this.bypassAllPermissionsChecks = bypassAllPermissionsChecks;
           this.uploadImagesFromWysiwyg = uploadImagesFromWysiwyg;
           this.multiSelectCopy = multiSelectCopy;
           this.multiSelectPublish = multiSelectPublish;
           this.multiSelectMove = multiSelectMove;
           this.multiSelectDelete = multiSelectDelete;
           this.editPageLevelConfigurations = editPageLevelConfigurations;
           this.editPageContentType = editPageContentType;
           this.editDataDefinition = editDataDefinition;
           this.publishReadableHomeAssets = publishReadableHomeAssets;
           this.publishWritableHomeAssets = publishWritableHomeAssets;
           this.editAccessRights = editAccessRights;
           this.viewVersions = viewVersions;
           this.activateDeleteVersions = activateDeleteVersions;
           this.accessAudits = accessAudits;
           this.bypassWorkflow = bypassWorkflow;
           this.assignApproveWorkflowSteps = assignApproveWorkflowSteps;
           this.deleteWorkflows = deleteWorkflows;
           this.breakLocks = breakLocks;
           this.assignWorkflowsToFolders = assignWorkflowsToFolders;
           this.bypassAssetFactoryGroupsNewMenu = bypassAssetFactoryGroupsNewMenu;
           this.bypassDestinationGroupsWhenPublishing = bypassDestinationGroupsWhenPublishing;
           this.bypassWorkflowDefintionGroupsForFolders = bypassWorkflowDefintionGroupsForFolders;
           this.accessAdminArea = accessAdminArea;
           this.accessAssetFactories = accessAssetFactories;
           this.accessConfigurationSets = accessConfigurationSets;
           this.accessDataDefinitions = accessDataDefinitions;
           this.accessMetadataSets = accessMetadataSets;
           this.accessPublishSets = accessPublishSets;
           this.accessDestinations = accessDestinations;
           this.accessTransports = accessTransports;
           this.accessWorkflowDefinitions = accessWorkflowDefinitions;
           this.accessContentTypes = accessContentTypes;
           this.accessConnectors = accessConnectors;
           this.publishReadableAdminAreaAssets = publishReadableAdminAreaAssets;
           this.publishWritableAdminAreaAssets = publishWritableAdminAreaAssets;
           this.integrateFolder = integrateFolder;
           this.importZipArchive = importZipArchive;
           this.bulkChange = bulkChange;
           this.recycleBinViewRestoreUserAssets = recycleBinViewRestoreUserAssets;
           this.recycleBinDeleteAssets = recycleBinDeleteAssets;
           this.recycleBinViewRestoreAllAssets = recycleBinViewRestoreAllAssets;
           this.moveRenameAssets = moveRenameAssets;
    }


    /**
     * Gets the bypassAllPermissionsChecks value for this SiteAbilities.
     * 
     * @return bypassAllPermissionsChecks
     */
    public java.lang.Boolean getBypassAllPermissionsChecks() {
        return bypassAllPermissionsChecks;
    }


    /**
     * Sets the bypassAllPermissionsChecks value for this SiteAbilities.
     * 
     * @param bypassAllPermissionsChecks
     */
    public void setBypassAllPermissionsChecks(java.lang.Boolean bypassAllPermissionsChecks) {
        this.bypassAllPermissionsChecks = bypassAllPermissionsChecks;
    }


    /**
     * Gets the uploadImagesFromWysiwyg value for this SiteAbilities.
     * 
     * @return uploadImagesFromWysiwyg
     */
    public java.lang.Boolean getUploadImagesFromWysiwyg() {
        return uploadImagesFromWysiwyg;
    }


    /**
     * Sets the uploadImagesFromWysiwyg value for this SiteAbilities.
     * 
     * @param uploadImagesFromWysiwyg
     */
    public void setUploadImagesFromWysiwyg(java.lang.Boolean uploadImagesFromWysiwyg) {
        this.uploadImagesFromWysiwyg = uploadImagesFromWysiwyg;
    }


    /**
     * Gets the multiSelectCopy value for this SiteAbilities.
     * 
     * @return multiSelectCopy
     */
    public java.lang.Boolean getMultiSelectCopy() {
        return multiSelectCopy;
    }


    /**
     * Sets the multiSelectCopy value for this SiteAbilities.
     * 
     * @param multiSelectCopy
     */
    public void setMultiSelectCopy(java.lang.Boolean multiSelectCopy) {
        this.multiSelectCopy = multiSelectCopy;
    }


    /**
     * Gets the multiSelectPublish value for this SiteAbilities.
     * 
     * @return multiSelectPublish
     */
    public java.lang.Boolean getMultiSelectPublish() {
        return multiSelectPublish;
    }


    /**
     * Sets the multiSelectPublish value for this SiteAbilities.
     * 
     * @param multiSelectPublish
     */
    public void setMultiSelectPublish(java.lang.Boolean multiSelectPublish) {
        this.multiSelectPublish = multiSelectPublish;
    }


    /**
     * Gets the multiSelectMove value for this SiteAbilities.
     * 
     * @return multiSelectMove
     */
    public java.lang.Boolean getMultiSelectMove() {
        return multiSelectMove;
    }


    /**
     * Sets the multiSelectMove value for this SiteAbilities.
     * 
     * @param multiSelectMove
     */
    public void setMultiSelectMove(java.lang.Boolean multiSelectMove) {
        this.multiSelectMove = multiSelectMove;
    }


    /**
     * Gets the multiSelectDelete value for this SiteAbilities.
     * 
     * @return multiSelectDelete
     */
    public java.lang.Boolean getMultiSelectDelete() {
        return multiSelectDelete;
    }


    /**
     * Sets the multiSelectDelete value for this SiteAbilities.
     * 
     * @param multiSelectDelete
     */
    public void setMultiSelectDelete(java.lang.Boolean multiSelectDelete) {
        this.multiSelectDelete = multiSelectDelete;
    }


    /**
     * Gets the editPageLevelConfigurations value for this SiteAbilities.
     * 
     * @return editPageLevelConfigurations
     */
    public java.lang.Boolean getEditPageLevelConfigurations() {
        return editPageLevelConfigurations;
    }


    /**
     * Sets the editPageLevelConfigurations value for this SiteAbilities.
     * 
     * @param editPageLevelConfigurations
     */
    public void setEditPageLevelConfigurations(java.lang.Boolean editPageLevelConfigurations) {
        this.editPageLevelConfigurations = editPageLevelConfigurations;
    }


    /**
     * Gets the editPageContentType value for this SiteAbilities.
     * 
     * @return editPageContentType
     */
    public java.lang.Boolean getEditPageContentType() {
        return editPageContentType;
    }


    /**
     * Sets the editPageContentType value for this SiteAbilities.
     * 
     * @param editPageContentType
     */
    public void setEditPageContentType(java.lang.Boolean editPageContentType) {
        this.editPageContentType = editPageContentType;
    }


    /**
     * Gets the editDataDefinition value for this SiteAbilities.
     * 
     * @return editDataDefinition
     */
    public java.lang.Boolean getEditDataDefinition() {
        return editDataDefinition;
    }


    /**
     * Sets the editDataDefinition value for this SiteAbilities.
     * 
     * @param editDataDefinition
     */
    public void setEditDataDefinition(java.lang.Boolean editDataDefinition) {
        this.editDataDefinition = editDataDefinition;
    }


    /**
     * Gets the publishReadableHomeAssets value for this SiteAbilities.
     * 
     * @return publishReadableHomeAssets
     */
    public java.lang.Boolean getPublishReadableHomeAssets() {
        return publishReadableHomeAssets;
    }


    /**
     * Sets the publishReadableHomeAssets value for this SiteAbilities.
     * 
     * @param publishReadableHomeAssets
     */
    public void setPublishReadableHomeAssets(java.lang.Boolean publishReadableHomeAssets) {
        this.publishReadableHomeAssets = publishReadableHomeAssets;
    }


    /**
     * Gets the publishWritableHomeAssets value for this SiteAbilities.
     * 
     * @return publishWritableHomeAssets
     */
    public java.lang.Boolean getPublishWritableHomeAssets() {
        return publishWritableHomeAssets;
    }


    /**
     * Sets the publishWritableHomeAssets value for this SiteAbilities.
     * 
     * @param publishWritableHomeAssets
     */
    public void setPublishWritableHomeAssets(java.lang.Boolean publishWritableHomeAssets) {
        this.publishWritableHomeAssets = publishWritableHomeAssets;
    }


    /**
     * Gets the editAccessRights value for this SiteAbilities.
     * 
     * @return editAccessRights
     */
    public java.lang.Boolean getEditAccessRights() {
        return editAccessRights;
    }


    /**
     * Sets the editAccessRights value for this SiteAbilities.
     * 
     * @param editAccessRights
     */
    public void setEditAccessRights(java.lang.Boolean editAccessRights) {
        this.editAccessRights = editAccessRights;
    }


    /**
     * Gets the viewVersions value for this SiteAbilities.
     * 
     * @return viewVersions
     */
    public java.lang.Boolean getViewVersions() {
        return viewVersions;
    }


    /**
     * Sets the viewVersions value for this SiteAbilities.
     * 
     * @param viewVersions
     */
    public void setViewVersions(java.lang.Boolean viewVersions) {
        this.viewVersions = viewVersions;
    }


    /**
     * Gets the activateDeleteVersions value for this SiteAbilities.
     * 
     * @return activateDeleteVersions
     */
    public java.lang.Boolean getActivateDeleteVersions() {
        return activateDeleteVersions;
    }


    /**
     * Sets the activateDeleteVersions value for this SiteAbilities.
     * 
     * @param activateDeleteVersions
     */
    public void setActivateDeleteVersions(java.lang.Boolean activateDeleteVersions) {
        this.activateDeleteVersions = activateDeleteVersions;
    }


    /**
     * Gets the accessAudits value for this SiteAbilities.
     * 
     * @return accessAudits
     */
    public java.lang.Boolean getAccessAudits() {
        return accessAudits;
    }


    /**
     * Sets the accessAudits value for this SiteAbilities.
     * 
     * @param accessAudits
     */
    public void setAccessAudits(java.lang.Boolean accessAudits) {
        this.accessAudits = accessAudits;
    }


    /**
     * Gets the bypassWorkflow value for this SiteAbilities.
     * 
     * @return bypassWorkflow
     */
    public java.lang.Boolean getBypassWorkflow() {
        return bypassWorkflow;
    }


    /**
     * Sets the bypassWorkflow value for this SiteAbilities.
     * 
     * @param bypassWorkflow
     */
    public void setBypassWorkflow(java.lang.Boolean bypassWorkflow) {
        this.bypassWorkflow = bypassWorkflow;
    }


    /**
     * Gets the assignApproveWorkflowSteps value for this SiteAbilities.
     * 
     * @return assignApproveWorkflowSteps
     */
    public java.lang.Boolean getAssignApproveWorkflowSteps() {
        return assignApproveWorkflowSteps;
    }


    /**
     * Sets the assignApproveWorkflowSteps value for this SiteAbilities.
     * 
     * @param assignApproveWorkflowSteps
     */
    public void setAssignApproveWorkflowSteps(java.lang.Boolean assignApproveWorkflowSteps) {
        this.assignApproveWorkflowSteps = assignApproveWorkflowSteps;
    }


    /**
     * Gets the deleteWorkflows value for this SiteAbilities.
     * 
     * @return deleteWorkflows
     */
    public java.lang.Boolean getDeleteWorkflows() {
        return deleteWorkflows;
    }


    /**
     * Sets the deleteWorkflows value for this SiteAbilities.
     * 
     * @param deleteWorkflows
     */
    public void setDeleteWorkflows(java.lang.Boolean deleteWorkflows) {
        this.deleteWorkflows = deleteWorkflows;
    }


    /**
     * Gets the breakLocks value for this SiteAbilities.
     * 
     * @return breakLocks
     */
    public java.lang.Boolean getBreakLocks() {
        return breakLocks;
    }


    /**
     * Sets the breakLocks value for this SiteAbilities.
     * 
     * @param breakLocks
     */
    public void setBreakLocks(java.lang.Boolean breakLocks) {
        this.breakLocks = breakLocks;
    }


    /**
     * Gets the assignWorkflowsToFolders value for this SiteAbilities.
     * 
     * @return assignWorkflowsToFolders
     */
    public java.lang.Boolean getAssignWorkflowsToFolders() {
        return assignWorkflowsToFolders;
    }


    /**
     * Sets the assignWorkflowsToFolders value for this SiteAbilities.
     * 
     * @param assignWorkflowsToFolders
     */
    public void setAssignWorkflowsToFolders(java.lang.Boolean assignWorkflowsToFolders) {
        this.assignWorkflowsToFolders = assignWorkflowsToFolders;
    }


    /**
     * Gets the bypassAssetFactoryGroupsNewMenu value for this SiteAbilities.
     * 
     * @return bypassAssetFactoryGroupsNewMenu
     */
    public java.lang.Boolean getBypassAssetFactoryGroupsNewMenu() {
        return bypassAssetFactoryGroupsNewMenu;
    }


    /**
     * Sets the bypassAssetFactoryGroupsNewMenu value for this SiteAbilities.
     * 
     * @param bypassAssetFactoryGroupsNewMenu
     */
    public void setBypassAssetFactoryGroupsNewMenu(java.lang.Boolean bypassAssetFactoryGroupsNewMenu) {
        this.bypassAssetFactoryGroupsNewMenu = bypassAssetFactoryGroupsNewMenu;
    }


    /**
     * Gets the bypassDestinationGroupsWhenPublishing value for this SiteAbilities.
     * 
     * @return bypassDestinationGroupsWhenPublishing
     */
    public java.lang.Boolean getBypassDestinationGroupsWhenPublishing() {
        return bypassDestinationGroupsWhenPublishing;
    }


    /**
     * Sets the bypassDestinationGroupsWhenPublishing value for this SiteAbilities.
     * 
     * @param bypassDestinationGroupsWhenPublishing
     */
    public void setBypassDestinationGroupsWhenPublishing(java.lang.Boolean bypassDestinationGroupsWhenPublishing) {
        this.bypassDestinationGroupsWhenPublishing = bypassDestinationGroupsWhenPublishing;
    }


    /**
     * Gets the bypassWorkflowDefintionGroupsForFolders value for this SiteAbilities.
     * 
     * @return bypassWorkflowDefintionGroupsForFolders
     */
    public java.lang.Boolean getBypassWorkflowDefintionGroupsForFolders() {
        return bypassWorkflowDefintionGroupsForFolders;
    }


    /**
     * Sets the bypassWorkflowDefintionGroupsForFolders value for this SiteAbilities.
     * 
     * @param bypassWorkflowDefintionGroupsForFolders
     */
    public void setBypassWorkflowDefintionGroupsForFolders(java.lang.Boolean bypassWorkflowDefintionGroupsForFolders) {
        this.bypassWorkflowDefintionGroupsForFolders = bypassWorkflowDefintionGroupsForFolders;
    }


    /**
     * Gets the accessAdminArea value for this SiteAbilities.
     * 
     * @return accessAdminArea
     */
    public java.lang.Boolean getAccessAdminArea() {
        return accessAdminArea;
    }


    /**
     * Sets the accessAdminArea value for this SiteAbilities.
     * 
     * @param accessAdminArea
     */
    public void setAccessAdminArea(java.lang.Boolean accessAdminArea) {
        this.accessAdminArea = accessAdminArea;
    }


    /**
     * Gets the accessAssetFactories value for this SiteAbilities.
     * 
     * @return accessAssetFactories
     */
    public java.lang.Boolean getAccessAssetFactories() {
        return accessAssetFactories;
    }


    /**
     * Sets the accessAssetFactories value for this SiteAbilities.
     * 
     * @param accessAssetFactories
     */
    public void setAccessAssetFactories(java.lang.Boolean accessAssetFactories) {
        this.accessAssetFactories = accessAssetFactories;
    }


    /**
     * Gets the accessConfigurationSets value for this SiteAbilities.
     * 
     * @return accessConfigurationSets
     */
    public java.lang.Boolean getAccessConfigurationSets() {
        return accessConfigurationSets;
    }


    /**
     * Sets the accessConfigurationSets value for this SiteAbilities.
     * 
     * @param accessConfigurationSets
     */
    public void setAccessConfigurationSets(java.lang.Boolean accessConfigurationSets) {
        this.accessConfigurationSets = accessConfigurationSets;
    }


    /**
     * Gets the accessDataDefinitions value for this SiteAbilities.
     * 
     * @return accessDataDefinitions
     */
    public java.lang.Boolean getAccessDataDefinitions() {
        return accessDataDefinitions;
    }


    /**
     * Sets the accessDataDefinitions value for this SiteAbilities.
     * 
     * @param accessDataDefinitions
     */
    public void setAccessDataDefinitions(java.lang.Boolean accessDataDefinitions) {
        this.accessDataDefinitions = accessDataDefinitions;
    }


    /**
     * Gets the accessMetadataSets value for this SiteAbilities.
     * 
     * @return accessMetadataSets
     */
    public java.lang.Boolean getAccessMetadataSets() {
        return accessMetadataSets;
    }


    /**
     * Sets the accessMetadataSets value for this SiteAbilities.
     * 
     * @param accessMetadataSets
     */
    public void setAccessMetadataSets(java.lang.Boolean accessMetadataSets) {
        this.accessMetadataSets = accessMetadataSets;
    }


    /**
     * Gets the accessPublishSets value for this SiteAbilities.
     * 
     * @return accessPublishSets
     */
    public java.lang.Boolean getAccessPublishSets() {
        return accessPublishSets;
    }


    /**
     * Sets the accessPublishSets value for this SiteAbilities.
     * 
     * @param accessPublishSets
     */
    public void setAccessPublishSets(java.lang.Boolean accessPublishSets) {
        this.accessPublishSets = accessPublishSets;
    }


    /**
     * Gets the accessDestinations value for this SiteAbilities.
     * 
     * @return accessDestinations
     */
    public java.lang.Boolean getAccessDestinations() {
        return accessDestinations;
    }


    /**
     * Sets the accessDestinations value for this SiteAbilities.
     * 
     * @param accessDestinations
     */
    public void setAccessDestinations(java.lang.Boolean accessDestinations) {
        this.accessDestinations = accessDestinations;
    }


    /**
     * Gets the accessTransports value for this SiteAbilities.
     * 
     * @return accessTransports
     */
    public java.lang.Boolean getAccessTransports() {
        return accessTransports;
    }


    /**
     * Sets the accessTransports value for this SiteAbilities.
     * 
     * @param accessTransports
     */
    public void setAccessTransports(java.lang.Boolean accessTransports) {
        this.accessTransports = accessTransports;
    }


    /**
     * Gets the accessWorkflowDefinitions value for this SiteAbilities.
     * 
     * @return accessWorkflowDefinitions
     */
    public java.lang.Boolean getAccessWorkflowDefinitions() {
        return accessWorkflowDefinitions;
    }


    /**
     * Sets the accessWorkflowDefinitions value for this SiteAbilities.
     * 
     * @param accessWorkflowDefinitions
     */
    public void setAccessWorkflowDefinitions(java.lang.Boolean accessWorkflowDefinitions) {
        this.accessWorkflowDefinitions = accessWorkflowDefinitions;
    }


    /**
     * Gets the accessContentTypes value for this SiteAbilities.
     * 
     * @return accessContentTypes
     */
    public java.lang.Boolean getAccessContentTypes() {
        return accessContentTypes;
    }


    /**
     * Sets the accessContentTypes value for this SiteAbilities.
     * 
     * @param accessContentTypes
     */
    public void setAccessContentTypes(java.lang.Boolean accessContentTypes) {
        this.accessContentTypes = accessContentTypes;
    }


    /**
     * Gets the accessConnectors value for this SiteAbilities.
     * 
     * @return accessConnectors
     */
    public java.lang.Boolean getAccessConnectors() {
        return accessConnectors;
    }


    /**
     * Sets the accessConnectors value for this SiteAbilities.
     * 
     * @param accessConnectors
     */
    public void setAccessConnectors(java.lang.Boolean accessConnectors) {
        this.accessConnectors = accessConnectors;
    }


    /**
     * Gets the publishReadableAdminAreaAssets value for this SiteAbilities.
     * 
     * @return publishReadableAdminAreaAssets
     */
    public java.lang.Boolean getPublishReadableAdminAreaAssets() {
        return publishReadableAdminAreaAssets;
    }


    /**
     * Sets the publishReadableAdminAreaAssets value for this SiteAbilities.
     * 
     * @param publishReadableAdminAreaAssets
     */
    public void setPublishReadableAdminAreaAssets(java.lang.Boolean publishReadableAdminAreaAssets) {
        this.publishReadableAdminAreaAssets = publishReadableAdminAreaAssets;
    }


    /**
     * Gets the publishWritableAdminAreaAssets value for this SiteAbilities.
     * 
     * @return publishWritableAdminAreaAssets
     */
    public java.lang.Boolean getPublishWritableAdminAreaAssets() {
        return publishWritableAdminAreaAssets;
    }


    /**
     * Sets the publishWritableAdminAreaAssets value for this SiteAbilities.
     * 
     * @param publishWritableAdminAreaAssets
     */
    public void setPublishWritableAdminAreaAssets(java.lang.Boolean publishWritableAdminAreaAssets) {
        this.publishWritableAdminAreaAssets = publishWritableAdminAreaAssets;
    }


    /**
     * Gets the integrateFolder value for this SiteAbilities.
     * 
     * @return integrateFolder
     */
    public java.lang.Boolean getIntegrateFolder() {
        return integrateFolder;
    }


    /**
     * Sets the integrateFolder value for this SiteAbilities.
     * 
     * @param integrateFolder
     */
    public void setIntegrateFolder(java.lang.Boolean integrateFolder) {
        this.integrateFolder = integrateFolder;
    }


    /**
     * Gets the importZipArchive value for this SiteAbilities.
     * 
     * @return importZipArchive
     */
    public java.lang.Boolean getImportZipArchive() {
        return importZipArchive;
    }


    /**
     * Sets the importZipArchive value for this SiteAbilities.
     * 
     * @param importZipArchive
     */
    public void setImportZipArchive(java.lang.Boolean importZipArchive) {
        this.importZipArchive = importZipArchive;
    }


    /**
     * Gets the bulkChange value for this SiteAbilities.
     * 
     * @return bulkChange
     */
    public java.lang.Boolean getBulkChange() {
        return bulkChange;
    }


    /**
     * Sets the bulkChange value for this SiteAbilities.
     * 
     * @param bulkChange
     */
    public void setBulkChange(java.lang.Boolean bulkChange) {
        this.bulkChange = bulkChange;
    }


    /**
     * Gets the recycleBinViewRestoreUserAssets value for this SiteAbilities.
     * 
     * @return recycleBinViewRestoreUserAssets
     */
    public java.lang.Boolean getRecycleBinViewRestoreUserAssets() {
        return recycleBinViewRestoreUserAssets;
    }


    /**
     * Sets the recycleBinViewRestoreUserAssets value for this SiteAbilities.
     * 
     * @param recycleBinViewRestoreUserAssets
     */
    public void setRecycleBinViewRestoreUserAssets(java.lang.Boolean recycleBinViewRestoreUserAssets) {
        this.recycleBinViewRestoreUserAssets = recycleBinViewRestoreUserAssets;
    }


    /**
     * Gets the recycleBinDeleteAssets value for this SiteAbilities.
     * 
     * @return recycleBinDeleteAssets
     */
    public java.lang.Boolean getRecycleBinDeleteAssets() {
        return recycleBinDeleteAssets;
    }


    /**
     * Sets the recycleBinDeleteAssets value for this SiteAbilities.
     * 
     * @param recycleBinDeleteAssets
     */
    public void setRecycleBinDeleteAssets(java.lang.Boolean recycleBinDeleteAssets) {
        this.recycleBinDeleteAssets = recycleBinDeleteAssets;
    }


    /**
     * Gets the recycleBinViewRestoreAllAssets value for this SiteAbilities.
     * 
     * @return recycleBinViewRestoreAllAssets
     */
    public java.lang.Boolean getRecycleBinViewRestoreAllAssets() {
        return recycleBinViewRestoreAllAssets;
    }


    /**
     * Sets the recycleBinViewRestoreAllAssets value for this SiteAbilities.
     * 
     * @param recycleBinViewRestoreAllAssets
     */
    public void setRecycleBinViewRestoreAllAssets(java.lang.Boolean recycleBinViewRestoreAllAssets) {
        this.recycleBinViewRestoreAllAssets = recycleBinViewRestoreAllAssets;
    }


    /**
     * Gets the moveRenameAssets value for this SiteAbilities.
     * 
     * @return moveRenameAssets
     */
    public java.lang.Boolean getMoveRenameAssets() {
        return moveRenameAssets;
    }


    /**
     * Sets the moveRenameAssets value for this SiteAbilities.
     * 
     * @param moveRenameAssets
     */
    public void setMoveRenameAssets(java.lang.Boolean moveRenameAssets) {
        this.moveRenameAssets = moveRenameAssets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteAbilities)) return false;
        SiteAbilities other = (SiteAbilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bypassAllPermissionsChecks==null && other.getBypassAllPermissionsChecks()==null) || 
             (this.bypassAllPermissionsChecks!=null &&
              this.bypassAllPermissionsChecks.equals(other.getBypassAllPermissionsChecks()))) &&
            ((this.uploadImagesFromWysiwyg==null && other.getUploadImagesFromWysiwyg()==null) || 
             (this.uploadImagesFromWysiwyg!=null &&
              this.uploadImagesFromWysiwyg.equals(other.getUploadImagesFromWysiwyg()))) &&
            ((this.multiSelectCopy==null && other.getMultiSelectCopy()==null) || 
             (this.multiSelectCopy!=null &&
              this.multiSelectCopy.equals(other.getMultiSelectCopy()))) &&
            ((this.multiSelectPublish==null && other.getMultiSelectPublish()==null) || 
             (this.multiSelectPublish!=null &&
              this.multiSelectPublish.equals(other.getMultiSelectPublish()))) &&
            ((this.multiSelectMove==null && other.getMultiSelectMove()==null) || 
             (this.multiSelectMove!=null &&
              this.multiSelectMove.equals(other.getMultiSelectMove()))) &&
            ((this.multiSelectDelete==null && other.getMultiSelectDelete()==null) || 
             (this.multiSelectDelete!=null &&
              this.multiSelectDelete.equals(other.getMultiSelectDelete()))) &&
            ((this.editPageLevelConfigurations==null && other.getEditPageLevelConfigurations()==null) || 
             (this.editPageLevelConfigurations!=null &&
              this.editPageLevelConfigurations.equals(other.getEditPageLevelConfigurations()))) &&
            ((this.editPageContentType==null && other.getEditPageContentType()==null) || 
             (this.editPageContentType!=null &&
              this.editPageContentType.equals(other.getEditPageContentType()))) &&
            ((this.editDataDefinition==null && other.getEditDataDefinition()==null) || 
             (this.editDataDefinition!=null &&
              this.editDataDefinition.equals(other.getEditDataDefinition()))) &&
            ((this.publishReadableHomeAssets==null && other.getPublishReadableHomeAssets()==null) || 
             (this.publishReadableHomeAssets!=null &&
              this.publishReadableHomeAssets.equals(other.getPublishReadableHomeAssets()))) &&
            ((this.publishWritableHomeAssets==null && other.getPublishWritableHomeAssets()==null) || 
             (this.publishWritableHomeAssets!=null &&
              this.publishWritableHomeAssets.equals(other.getPublishWritableHomeAssets()))) &&
            ((this.editAccessRights==null && other.getEditAccessRights()==null) || 
             (this.editAccessRights!=null &&
              this.editAccessRights.equals(other.getEditAccessRights()))) &&
            ((this.viewVersions==null && other.getViewVersions()==null) || 
             (this.viewVersions!=null &&
              this.viewVersions.equals(other.getViewVersions()))) &&
            ((this.activateDeleteVersions==null && other.getActivateDeleteVersions()==null) || 
             (this.activateDeleteVersions!=null &&
              this.activateDeleteVersions.equals(other.getActivateDeleteVersions()))) &&
            ((this.accessAudits==null && other.getAccessAudits()==null) || 
             (this.accessAudits!=null &&
              this.accessAudits.equals(other.getAccessAudits()))) &&
            ((this.bypassWorkflow==null && other.getBypassWorkflow()==null) || 
             (this.bypassWorkflow!=null &&
              this.bypassWorkflow.equals(other.getBypassWorkflow()))) &&
            ((this.assignApproveWorkflowSteps==null && other.getAssignApproveWorkflowSteps()==null) || 
             (this.assignApproveWorkflowSteps!=null &&
              this.assignApproveWorkflowSteps.equals(other.getAssignApproveWorkflowSteps()))) &&
            ((this.deleteWorkflows==null && other.getDeleteWorkflows()==null) || 
             (this.deleteWorkflows!=null &&
              this.deleteWorkflows.equals(other.getDeleteWorkflows()))) &&
            ((this.breakLocks==null && other.getBreakLocks()==null) || 
             (this.breakLocks!=null &&
              this.breakLocks.equals(other.getBreakLocks()))) &&
            ((this.assignWorkflowsToFolders==null && other.getAssignWorkflowsToFolders()==null) || 
             (this.assignWorkflowsToFolders!=null &&
              this.assignWorkflowsToFolders.equals(other.getAssignWorkflowsToFolders()))) &&
            ((this.bypassAssetFactoryGroupsNewMenu==null && other.getBypassAssetFactoryGroupsNewMenu()==null) || 
             (this.bypassAssetFactoryGroupsNewMenu!=null &&
              this.bypassAssetFactoryGroupsNewMenu.equals(other.getBypassAssetFactoryGroupsNewMenu()))) &&
            ((this.bypassDestinationGroupsWhenPublishing==null && other.getBypassDestinationGroupsWhenPublishing()==null) || 
             (this.bypassDestinationGroupsWhenPublishing!=null &&
              this.bypassDestinationGroupsWhenPublishing.equals(other.getBypassDestinationGroupsWhenPublishing()))) &&
            ((this.bypassWorkflowDefintionGroupsForFolders==null && other.getBypassWorkflowDefintionGroupsForFolders()==null) || 
             (this.bypassWorkflowDefintionGroupsForFolders!=null &&
              this.bypassWorkflowDefintionGroupsForFolders.equals(other.getBypassWorkflowDefintionGroupsForFolders()))) &&
            ((this.accessAdminArea==null && other.getAccessAdminArea()==null) || 
             (this.accessAdminArea!=null &&
              this.accessAdminArea.equals(other.getAccessAdminArea()))) &&
            ((this.accessAssetFactories==null && other.getAccessAssetFactories()==null) || 
             (this.accessAssetFactories!=null &&
              this.accessAssetFactories.equals(other.getAccessAssetFactories()))) &&
            ((this.accessConfigurationSets==null && other.getAccessConfigurationSets()==null) || 
             (this.accessConfigurationSets!=null &&
              this.accessConfigurationSets.equals(other.getAccessConfigurationSets()))) &&
            ((this.accessDataDefinitions==null && other.getAccessDataDefinitions()==null) || 
             (this.accessDataDefinitions!=null &&
              this.accessDataDefinitions.equals(other.getAccessDataDefinitions()))) &&
            ((this.accessMetadataSets==null && other.getAccessMetadataSets()==null) || 
             (this.accessMetadataSets!=null &&
              this.accessMetadataSets.equals(other.getAccessMetadataSets()))) &&
            ((this.accessPublishSets==null && other.getAccessPublishSets()==null) || 
             (this.accessPublishSets!=null &&
              this.accessPublishSets.equals(other.getAccessPublishSets()))) &&
            ((this.accessDestinations==null && other.getAccessDestinations()==null) || 
             (this.accessDestinations!=null &&
              this.accessDestinations.equals(other.getAccessDestinations()))) &&
            ((this.accessTransports==null && other.getAccessTransports()==null) || 
             (this.accessTransports!=null &&
              this.accessTransports.equals(other.getAccessTransports()))) &&
            ((this.accessWorkflowDefinitions==null && other.getAccessWorkflowDefinitions()==null) || 
             (this.accessWorkflowDefinitions!=null &&
              this.accessWorkflowDefinitions.equals(other.getAccessWorkflowDefinitions()))) &&
            ((this.accessContentTypes==null && other.getAccessContentTypes()==null) || 
             (this.accessContentTypes!=null &&
              this.accessContentTypes.equals(other.getAccessContentTypes()))) &&
            ((this.accessConnectors==null && other.getAccessConnectors()==null) || 
             (this.accessConnectors!=null &&
              this.accessConnectors.equals(other.getAccessConnectors()))) &&
            ((this.publishReadableAdminAreaAssets==null && other.getPublishReadableAdminAreaAssets()==null) || 
             (this.publishReadableAdminAreaAssets!=null &&
              this.publishReadableAdminAreaAssets.equals(other.getPublishReadableAdminAreaAssets()))) &&
            ((this.publishWritableAdminAreaAssets==null && other.getPublishWritableAdminAreaAssets()==null) || 
             (this.publishWritableAdminAreaAssets!=null &&
              this.publishWritableAdminAreaAssets.equals(other.getPublishWritableAdminAreaAssets()))) &&
            ((this.integrateFolder==null && other.getIntegrateFolder()==null) || 
             (this.integrateFolder!=null &&
              this.integrateFolder.equals(other.getIntegrateFolder()))) &&
            ((this.importZipArchive==null && other.getImportZipArchive()==null) || 
             (this.importZipArchive!=null &&
              this.importZipArchive.equals(other.getImportZipArchive()))) &&
            ((this.bulkChange==null && other.getBulkChange()==null) || 
             (this.bulkChange!=null &&
              this.bulkChange.equals(other.getBulkChange()))) &&
            ((this.recycleBinViewRestoreUserAssets==null && other.getRecycleBinViewRestoreUserAssets()==null) || 
             (this.recycleBinViewRestoreUserAssets!=null &&
              this.recycleBinViewRestoreUserAssets.equals(other.getRecycleBinViewRestoreUserAssets()))) &&
            ((this.recycleBinDeleteAssets==null && other.getRecycleBinDeleteAssets()==null) || 
             (this.recycleBinDeleteAssets!=null &&
              this.recycleBinDeleteAssets.equals(other.getRecycleBinDeleteAssets()))) &&
            ((this.recycleBinViewRestoreAllAssets==null && other.getRecycleBinViewRestoreAllAssets()==null) || 
             (this.recycleBinViewRestoreAllAssets!=null &&
              this.recycleBinViewRestoreAllAssets.equals(other.getRecycleBinViewRestoreAllAssets()))) &&
            ((this.moveRenameAssets==null && other.getMoveRenameAssets()==null) || 
             (this.moveRenameAssets!=null &&
              this.moveRenameAssets.equals(other.getMoveRenameAssets())));
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
        if (getBypassAllPermissionsChecks() != null) {
            _hashCode += getBypassAllPermissionsChecks().hashCode();
        }
        if (getUploadImagesFromWysiwyg() != null) {
            _hashCode += getUploadImagesFromWysiwyg().hashCode();
        }
        if (getMultiSelectCopy() != null) {
            _hashCode += getMultiSelectCopy().hashCode();
        }
        if (getMultiSelectPublish() != null) {
            _hashCode += getMultiSelectPublish().hashCode();
        }
        if (getMultiSelectMove() != null) {
            _hashCode += getMultiSelectMove().hashCode();
        }
        if (getMultiSelectDelete() != null) {
            _hashCode += getMultiSelectDelete().hashCode();
        }
        if (getEditPageLevelConfigurations() != null) {
            _hashCode += getEditPageLevelConfigurations().hashCode();
        }
        if (getEditPageContentType() != null) {
            _hashCode += getEditPageContentType().hashCode();
        }
        if (getEditDataDefinition() != null) {
            _hashCode += getEditDataDefinition().hashCode();
        }
        if (getPublishReadableHomeAssets() != null) {
            _hashCode += getPublishReadableHomeAssets().hashCode();
        }
        if (getPublishWritableHomeAssets() != null) {
            _hashCode += getPublishWritableHomeAssets().hashCode();
        }
        if (getEditAccessRights() != null) {
            _hashCode += getEditAccessRights().hashCode();
        }
        if (getViewVersions() != null) {
            _hashCode += getViewVersions().hashCode();
        }
        if (getActivateDeleteVersions() != null) {
            _hashCode += getActivateDeleteVersions().hashCode();
        }
        if (getAccessAudits() != null) {
            _hashCode += getAccessAudits().hashCode();
        }
        if (getBypassWorkflow() != null) {
            _hashCode += getBypassWorkflow().hashCode();
        }
        if (getAssignApproveWorkflowSteps() != null) {
            _hashCode += getAssignApproveWorkflowSteps().hashCode();
        }
        if (getDeleteWorkflows() != null) {
            _hashCode += getDeleteWorkflows().hashCode();
        }
        if (getBreakLocks() != null) {
            _hashCode += getBreakLocks().hashCode();
        }
        if (getAssignWorkflowsToFolders() != null) {
            _hashCode += getAssignWorkflowsToFolders().hashCode();
        }
        if (getBypassAssetFactoryGroupsNewMenu() != null) {
            _hashCode += getBypassAssetFactoryGroupsNewMenu().hashCode();
        }
        if (getBypassDestinationGroupsWhenPublishing() != null) {
            _hashCode += getBypassDestinationGroupsWhenPublishing().hashCode();
        }
        if (getBypassWorkflowDefintionGroupsForFolders() != null) {
            _hashCode += getBypassWorkflowDefintionGroupsForFolders().hashCode();
        }
        if (getAccessAdminArea() != null) {
            _hashCode += getAccessAdminArea().hashCode();
        }
        if (getAccessAssetFactories() != null) {
            _hashCode += getAccessAssetFactories().hashCode();
        }
        if (getAccessConfigurationSets() != null) {
            _hashCode += getAccessConfigurationSets().hashCode();
        }
        if (getAccessDataDefinitions() != null) {
            _hashCode += getAccessDataDefinitions().hashCode();
        }
        if (getAccessMetadataSets() != null) {
            _hashCode += getAccessMetadataSets().hashCode();
        }
        if (getAccessPublishSets() != null) {
            _hashCode += getAccessPublishSets().hashCode();
        }
        if (getAccessDestinations() != null) {
            _hashCode += getAccessDestinations().hashCode();
        }
        if (getAccessTransports() != null) {
            _hashCode += getAccessTransports().hashCode();
        }
        if (getAccessWorkflowDefinitions() != null) {
            _hashCode += getAccessWorkflowDefinitions().hashCode();
        }
        if (getAccessContentTypes() != null) {
            _hashCode += getAccessContentTypes().hashCode();
        }
        if (getAccessConnectors() != null) {
            _hashCode += getAccessConnectors().hashCode();
        }
        if (getPublishReadableAdminAreaAssets() != null) {
            _hashCode += getPublishReadableAdminAreaAssets().hashCode();
        }
        if (getPublishWritableAdminAreaAssets() != null) {
            _hashCode += getPublishWritableAdminAreaAssets().hashCode();
        }
        if (getIntegrateFolder() != null) {
            _hashCode += getIntegrateFolder().hashCode();
        }
        if (getImportZipArchive() != null) {
            _hashCode += getImportZipArchive().hashCode();
        }
        if (getBulkChange() != null) {
            _hashCode += getBulkChange().hashCode();
        }
        if (getRecycleBinViewRestoreUserAssets() != null) {
            _hashCode += getRecycleBinViewRestoreUserAssets().hashCode();
        }
        if (getRecycleBinDeleteAssets() != null) {
            _hashCode += getRecycleBinDeleteAssets().hashCode();
        }
        if (getRecycleBinViewRestoreAllAssets() != null) {
            _hashCode += getRecycleBinViewRestoreAllAssets().hashCode();
        }
        if (getMoveRenameAssets() != null) {
            _hashCode += getMoveRenameAssets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteAbilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site-abilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassAllPermissionsChecks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bypassAllPermissionsChecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadImagesFromWysiwyg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "uploadImagesFromWysiwyg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSelectCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "multiSelectCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSelectPublish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "multiSelectPublish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSelectMove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "multiSelectMove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSelectDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "multiSelectDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editPageLevelConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editPageLevelConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editPageContentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editPageContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editDataDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editDataDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishReadableHomeAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishReadableHomeAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishWritableHomeAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishWritableHomeAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editAccessRights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editAccessRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "viewVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateDeleteVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "activateDeleteVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessAudits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessAudits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassWorkflow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bypassWorkflow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignApproveWorkflowSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assignApproveWorkflowSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteWorkflows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "deleteWorkflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakLocks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "breakLocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignWorkflowsToFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assignWorkflowsToFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassAssetFactoryGroupsNewMenu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bypassAssetFactoryGroupsNewMenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassDestinationGroupsWhenPublishing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bypassDestinationGroupsWhenPublishing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassWorkflowDefintionGroupsForFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bypassWorkflowDefintionGroupsForFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessAdminArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessAdminArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessAssetFactories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessAssetFactories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessConfigurationSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessConfigurationSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDataDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessDataDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMetadataSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessMetadataSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPublishSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessPublishSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDestinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessDestinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTransports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessTransports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessWorkflowDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessWorkflowDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessContentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessContentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessConnectors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessConnectors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishReadableAdminAreaAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishReadableAdminAreaAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishWritableAdminAreaAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishWritableAdminAreaAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrateFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "integrateFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importZipArchive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "importZipArchive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "bulkChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleBinViewRestoreUserAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinViewRestoreUserAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleBinDeleteAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinDeleteAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recycleBinViewRestoreAllAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinViewRestoreAllAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moveRenameAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "moveRenameAssets"));
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
