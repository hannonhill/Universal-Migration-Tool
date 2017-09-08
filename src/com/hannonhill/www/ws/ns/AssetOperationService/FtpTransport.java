/**
 * FtpTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class FtpTransport  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private java.lang.String hostName;

    private org.apache.axis.types.PositiveInteger port;

    private java.lang.Boolean doPASV;

    private java.lang.String username;

    private com.hannonhill.www.ws.ns.AssetOperationService.AuthMode authMode;

    private java.lang.String privateKey;

    private java.lang.String password;

    private java.lang.String directory;

    private com.hannonhill.www.ws.ns.AssetOperationService.FtpProtocolType ftpProtocolType;

    public FtpTransport() {
    }

    public FtpTransport(
           java.lang.String id,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           java.lang.String hostName,
           org.apache.axis.types.PositiveInteger port,
           java.lang.Boolean doPASV,
           java.lang.String username,
           com.hannonhill.www.ws.ns.AssetOperationService.AuthMode authMode,
           java.lang.String privateKey,
           java.lang.String password,
           java.lang.String directory,
           com.hannonhill.www.ws.ns.AssetOperationService.FtpProtocolType ftpProtocolType) {
        super(
            id,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.hostName = hostName;
        this.port = port;
        this.doPASV = doPASV;
        this.username = username;
        this.authMode = authMode;
        this.privateKey = privateKey;
        this.password = password;
        this.directory = directory;
        this.ftpProtocolType = ftpProtocolType;
    }


    /**
     * Gets the hostName value for this FtpTransport.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this FtpTransport.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the port value for this FtpTransport.
     * 
     * @return port
     */
    public org.apache.axis.types.PositiveInteger getPort() {
        return port;
    }


    /**
     * Sets the port value for this FtpTransport.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.PositiveInteger port) {
        this.port = port;
    }


    /**
     * Gets the doPASV value for this FtpTransport.
     * 
     * @return doPASV
     */
    public java.lang.Boolean getDoPASV() {
        return doPASV;
    }


    /**
     * Sets the doPASV value for this FtpTransport.
     * 
     * @param doPASV
     */
    public void setDoPASV(java.lang.Boolean doPASV) {
        this.doPASV = doPASV;
    }


    /**
     * Gets the username value for this FtpTransport.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this FtpTransport.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the authMode value for this FtpTransport.
     * 
     * @return authMode
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AuthMode getAuthMode() {
        return authMode;
    }


    /**
     * Sets the authMode value for this FtpTransport.
     * 
     * @param authMode
     */
    public void setAuthMode(com.hannonhill.www.ws.ns.AssetOperationService.AuthMode authMode) {
        this.authMode = authMode;
    }


    /**
     * Gets the privateKey value for this FtpTransport.
     * 
     * @return privateKey
     */
    public java.lang.String getPrivateKey() {
        return privateKey;
    }


    /**
     * Sets the privateKey value for this FtpTransport.
     * 
     * @param privateKey
     */
    public void setPrivateKey(java.lang.String privateKey) {
        this.privateKey = privateKey;
    }


    /**
     * Gets the password value for this FtpTransport.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this FtpTransport.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the directory value for this FtpTransport.
     * 
     * @return directory
     */
    public java.lang.String getDirectory() {
        return directory;
    }


    /**
     * Sets the directory value for this FtpTransport.
     * 
     * @param directory
     */
    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }


    /**
     * Gets the ftpProtocolType value for this FtpTransport.
     * 
     * @return ftpProtocolType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.FtpProtocolType getFtpProtocolType() {
        return ftpProtocolType;
    }


    /**
     * Sets the ftpProtocolType value for this FtpTransport.
     * 
     * @param ftpProtocolType
     */
    public void setFtpProtocolType(com.hannonhill.www.ws.ns.AssetOperationService.FtpProtocolType ftpProtocolType) {
        this.ftpProtocolType = ftpProtocolType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FtpTransport)) return false;
        FtpTransport other = (FtpTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.doPASV==null && other.getDoPASV()==null) || 
             (this.doPASV!=null &&
              this.doPASV.equals(other.getDoPASV()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.authMode==null && other.getAuthMode()==null) || 
             (this.authMode!=null &&
              this.authMode.equals(other.getAuthMode()))) &&
            ((this.privateKey==null && other.getPrivateKey()==null) || 
             (this.privateKey!=null &&
              this.privateKey.equals(other.getPrivateKey()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.directory==null && other.getDirectory()==null) || 
             (this.directory!=null &&
              this.directory.equals(other.getDirectory()))) &&
            ((this.ftpProtocolType==null && other.getFtpProtocolType()==null) || 
             (this.ftpProtocolType!=null &&
              this.ftpProtocolType.equals(other.getFtpProtocolType())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getDoPASV() != null) {
            _hashCode += getDoPASV().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getAuthMode() != null) {
            _hashCode += getAuthMode().hashCode();
        }
        if (getPrivateKey() != null) {
            _hashCode += getPrivateKey().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getDirectory() != null) {
            _hashCode += getDirectory().hashCode();
        }
        if (getFtpProtocolType() != null) {
            _hashCode += getFtpProtocolType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FtpTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doPASV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "doPASV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "authMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "privateKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "directory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpProtocolType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpProtocolType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpProtocolType"));
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
