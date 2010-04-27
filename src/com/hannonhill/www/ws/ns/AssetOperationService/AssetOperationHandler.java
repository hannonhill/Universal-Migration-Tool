/**
 * AssetOperationHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public interface AssetOperationHandler extends java.rmi.Remote {
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult delete(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.CreateResult create(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Asset asset) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult publish(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult edit(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Asset asset) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[] batch(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Operation[] operation) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadResult read(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.SearchResult search(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.SearchInformation searchInformation) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult readAccessRights(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult editAccessRights(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation accessRightsInformation, java.lang.Boolean applyToChildren) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult listMessages(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult markMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.MessageMarkType markType) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult deleteMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult sendMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Message message) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult checkOut(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult checkIn(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, java.lang.String comments) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult copy(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.CopyParameters copyParameters, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult move(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.MoveParameters moveParameters, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult readWorkflowInformation(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult readAudits(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.AuditParameters auditParameters) throws java.rmi.RemoteException;
    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult performWorkflowTransition(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowTransitionInformation workflowTransitionInformation) throws java.rmi.RemoteException;
}
