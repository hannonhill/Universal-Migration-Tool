/**
 * AssetOperationHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AssetOperationHandlerServiceLocator extends org.apache.axis.client.Service implements com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandlerService {

    public AssetOperationHandlerServiceLocator() {
    }


    public AssetOperationHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AssetOperationHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AssetOperationService
    private java.lang.String AssetOperationService_address = "http://localhost:8080/ws/services/AssetOperationService";

    public java.lang.String getAssetOperationServiceAddress() {
        return AssetOperationService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AssetOperationServiceWSDDServiceName = "AssetOperationService";

    public java.lang.String getAssetOperationServiceWSDDServiceName() {
        return AssetOperationServiceWSDDServiceName;
    }

    public void setAssetOperationServiceWSDDServiceName(java.lang.String name) {
        AssetOperationServiceWSDDServiceName = name;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler getAssetOperationService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AssetOperationService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAssetOperationService(endpoint);
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler getAssetOperationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationServiceSoapBindingStub _stub = new com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAssetOperationServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAssetOperationServiceEndpointAddress(java.lang.String address) {
        AssetOperationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationHandler.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationServiceSoapBindingStub _stub = new com.hannonhill.www.ws.ns.AssetOperationService.AssetOperationServiceSoapBindingStub(new java.net.URL(AssetOperationService_address), this);
                _stub.setPortName(getAssetOperationServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AssetOperationService".equals(inputPortName)) {
            return getAssetOperationService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "AssetOperationHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "AssetOperationService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AssetOperationService".equals(portName)) {
            setAssetOperationServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
