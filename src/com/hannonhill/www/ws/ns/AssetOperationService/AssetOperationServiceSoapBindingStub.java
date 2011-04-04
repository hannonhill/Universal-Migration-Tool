/**
 * AssetOperationServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AssetOperationServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("batch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operation"), com.hannonhill.www.ws.ns.AssetOperationService.Operation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "batchResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "batchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset"), com.hannonhill.www.ws.ns.AssetOperationService.Asset.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "createResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.CreateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "createReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "deleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("edit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset"), com.hannonhill.www.ws.ns.AssetOperationService.Asset.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("publish");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.ReadResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchInformation"), com.hannonhill.www.ws.ns.AssetOperationService.SearchInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("readAccessRights");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRightsResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRightsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editAccessRights");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation"), com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "applyToChildren"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editAccessRightsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessagesResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessagesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("markMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "markType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message-mark-type"), com.hannonhill.www.ws.ns.AssetOperationService.MessageMarkType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "markMessageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "deleteMessageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message"), com.hannonhill.www.ws.ns.AssetOperationService.Message.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "sendMessageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOutResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOutReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "comments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkInReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copyParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copyParameters"), com.hannonhill.www.ws.ns.AssetOperationService.CopyParameters.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration"), com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("move");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "moveParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "moveParameters"), com.hannonhill.www.ws.ns.AssetOperationService.MoveParameters.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration"), com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "moveReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("readWorkflowInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"), com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("readAudits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditParameters"), com.hannonhill.www.ws.ns.AssetOperationService.AuditParameters.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAuditsResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAuditsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performWorkflowTransition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication"), com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowTransitionInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowTransitionInformation"), com.hannonhill.www.ws.ns.AssetOperationService.WorkflowTransitionInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult"));
        oper.setReturnClass(com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "performWorkflowTransitionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    public AssetOperationServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AssetOperationServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AssetOperationServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "accessRightsInformation");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "acl-entries");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AclEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "acl-entry-level");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AclEntryLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "acl-entry-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AclEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "aclEntry");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AclEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "all-level");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AllLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin-parameter");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin-parameters");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin-parameter");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugins");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "plugin");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-workflow-mode");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryWorkflowMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactory");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactoryContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audit");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Audit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditParameters");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AuditParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audits");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Audit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audit");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "audit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "auditTypes");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.AuditTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authentication");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "base-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.BaseAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "batchResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.BatchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "block");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Block.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkIn");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.CheckIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOut");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.CheckOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOutResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Connector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-list");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLink");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param-list");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLinkParam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-parameter");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-parameter-list");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-parameter");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorParameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "container-children");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Identifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "child");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "containered-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentType");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypeContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfigurationDestinations");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Identifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destination");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfigurationPublishMode");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfigurationPublishMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfigurations");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ContentTypePageConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypePageConfiguration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copy");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Copy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copyParameters");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.CopyParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "create");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "createResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.CreateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "databaseTransport");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DatabaseTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinition");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DataDefinitionContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "daysOfWeek");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DayOfWeek[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dayOfWeek");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "delete");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Delete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destination");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Destination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dublin-aware-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DublinAwareAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamic-metadata-field-definitions");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamic-metadata-field-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataField");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFieldDefinition");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataFieldDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataFields");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.DynamicMetadataField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicMetadataField");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dynamicField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "edit");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Edit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editAccessRights");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.EditAccessRights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "entity-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.EntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "entityTypeString");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.EntityTypeString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "expiring-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ExpiringAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "feedBlock");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FeedBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValue");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValues");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FieldValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValue");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fieldValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "file");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.File.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fileSystemTransport");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FileSystemTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folder");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folder-contained-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FolderContainedAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpTransport");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.FtpTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "global-abilities");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.GlobalAbilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "googleAnalyticsConnector");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.GoogleAnalyticsConnector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "group");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Identifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-sort-method");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-sort-order");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockSortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "index-block-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.IndexBlockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlock");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.IndexBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessagesResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message-mark-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.MessageMarkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "messagesList");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Metadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadata-field-visibility");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.MetadataFieldVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSet");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSetContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.MetadataSetContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "move");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Move.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "moveParameters");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.MoveParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "named-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.NamedAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operation");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "operationResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page-configurations");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page-regions");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfiguration");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSet");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSetContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSetContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PageRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "path");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Path.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publish");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Publish.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishable-asset");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PublishableAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishable-asset-list");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Identifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishableAssetIdentifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSet");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PublishSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSetContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.PublishSetContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "read");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Read.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRights");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRightsResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAuditsResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ReadResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformationResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "recycleBinExpiration");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.RecycleBinExpiration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reference");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Reference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignment");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignments");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignment");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "roleAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-types");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.RoleTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "scriptFormat");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.ScriptFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search-match-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SearchMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search-matches");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Identifier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "match");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchInformation");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SearchInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "searchResult");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "serialization-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SerializationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Site.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site-abilities");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SiteAbilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteDestinationContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.SiteDestinationContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.StructuredData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-asset-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataAssetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-nodes");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-type");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlink");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Symlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "target");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Target.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "template");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "textBlock");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.TextBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "transportContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.TransportContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitterConnector");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.TwitterConnector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "user");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "user-auth-types");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.UserAuthTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "user-group-identifier");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.UserGroupIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "wordPressConnector");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WordPressConnector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.Workflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configuration");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configurations");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configuration");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStepConfiguration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowAction");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowActions");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowAction");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "action");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinition");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionContainer");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinitionContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowNamingBehavior");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowNamingBehavior.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStep");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSteps");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStep");
            qName2 = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "step");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowTransitionInformation");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.WorkflowTransitionInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtmlDataDefinitionBlock");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xmlBlock");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.XmlBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xsltFormat");
            cachedSerQNames.add(qName);
            cls = com.hannonhill.www.ws.ns.AssetOperationService.XsltFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[] batch(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Operation[] operation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "batch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, operation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.BatchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.CreateResult create(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Asset asset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, asset});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.CreateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.CreateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.CreateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult delete(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult edit(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Asset asset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "edit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, asset});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult publish(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publish"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ReadResult read(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.ReadResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.SearchResult search(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.SearchInformation searchInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, searchInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult readAccessRights(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAccessRights"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.ReadAccessRightsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult editAccessRights(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.AccessRightsInformation accessRightsInformation, java.lang.Boolean applyToChildren) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "editAccessRights"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, accessRightsInformation, applyToChildren});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult listMessages(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "listMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.ListMessagesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult markMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.MessageMarkType markType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "markMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier, markType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult deleteMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "deleteMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult sendMessage(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Message message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "sendMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult checkOut(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.CheckOutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult checkIn(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, java.lang.String comments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "checkIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier, comments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult copy(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.CopyParameters copyParameters, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "copy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier, copyParameters, workflowConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult move(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier, com.hannonhill.www.ws.ns.AssetOperationService.MoveParameters moveParameters, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "move"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier, moveParameters, workflowConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult readWorkflowInformation(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.Identifier identifier) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readWorkflowInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, identifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.ReadWorkflowInformationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult readAudits(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.AuditParameters auditParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "readAudits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, auditParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.ReadAuditsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.OperationResult performWorkflowTransition(com.hannonhill.www.ws.ns.AssetOperationService.Authentication authentication, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowTransitionInformation workflowTransitionInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "performWorkflowTransition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, workflowTransitionInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hannonhill.www.ws.ns.AssetOperationService.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.hannonhill.www.ws.ns.AssetOperationService.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
