/**
 * ConnectionCredentialType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * Connection Details like:
 */
public class ConnectionCredentialType  implements java.io.Serializable {
    private java.lang.String loginName;

    private java.lang.String loginPassword;

    private byte[] serverTrustCert;

    private com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeClientKeyStore clientKeyStore;

    private com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeSsl ssl;  // attribute

    public ConnectionCredentialType() {
    }

    public ConnectionCredentialType(
           java.lang.String loginName,
           java.lang.String loginPassword,
           byte[] serverTrustCert,
           com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeClientKeyStore clientKeyStore,
           com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeSsl ssl) {
           this.loginName = loginName;
           this.loginPassword = loginPassword;
           this.serverTrustCert = serverTrustCert;
           this.clientKeyStore = clientKeyStore;
           this.ssl = ssl;
    }


    /**
     * Gets the loginName value for this ConnectionCredentialType.
     * 
     * @return loginName
     */
    public java.lang.String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this ConnectionCredentialType.
     * 
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the loginPassword value for this ConnectionCredentialType.
     * 
     * @return loginPassword
     */
    public java.lang.String getLoginPassword() {
        return loginPassword;
    }


    /**
     * Sets the loginPassword value for this ConnectionCredentialType.
     * 
     * @param loginPassword
     */
    public void setLoginPassword(java.lang.String loginPassword) {
        this.loginPassword = loginPassword;
    }


    /**
     * Gets the serverTrustCert value for this ConnectionCredentialType.
     * 
     * @return serverTrustCert
     */
    public byte[] getServerTrustCert() {
        return serverTrustCert;
    }


    /**
     * Sets the serverTrustCert value for this ConnectionCredentialType.
     * 
     * @param serverTrustCert
     */
    public void setServerTrustCert(byte[] serverTrustCert) {
        this.serverTrustCert = serverTrustCert;
    }


    /**
     * Gets the clientKeyStore value for this ConnectionCredentialType.
     * 
     * @return clientKeyStore
     */
    public com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeClientKeyStore getClientKeyStore() {
        return clientKeyStore;
    }


    /**
     * Sets the clientKeyStore value for this ConnectionCredentialType.
     * 
     * @param clientKeyStore
     */
    public void setClientKeyStore(com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeClientKeyStore clientKeyStore) {
        this.clientKeyStore = clientKeyStore;
    }


    /**
     * Gets the ssl value for this ConnectionCredentialType.
     * 
     * @return ssl
     */
    public com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeSsl getSsl() {
        return ssl;
    }


    /**
     * Sets the ssl value for this ConnectionCredentialType.
     * 
     * @param ssl
     */
    public void setSsl(com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeSsl ssl) {
        this.ssl = ssl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectionCredentialType)) return false;
        ConnectionCredentialType other = (ConnectionCredentialType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.loginPassword==null && other.getLoginPassword()==null) || 
             (this.loginPassword!=null &&
              this.loginPassword.equals(other.getLoginPassword()))) &&
            ((this.serverTrustCert==null && other.getServerTrustCert()==null) || 
             (this.serverTrustCert!=null &&
              java.util.Arrays.equals(this.serverTrustCert, other.getServerTrustCert()))) &&
            ((this.clientKeyStore==null && other.getClientKeyStore()==null) || 
             (this.clientKeyStore!=null &&
              this.clientKeyStore.equals(other.getClientKeyStore()))) &&
            ((this.ssl==null && other.getSsl()==null) || 
             (this.ssl!=null &&
              this.ssl.equals(other.getSsl())));
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
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getLoginPassword() != null) {
            _hashCode += getLoginPassword().hashCode();
        }
        if (getServerTrustCert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerTrustCert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerTrustCert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientKeyStore() != null) {
            _hashCode += getClientKeyStore().hashCode();
        }
        if (getSsl() != null) {
            _hashCode += getSsl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectionCredentialType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "ConnectionCredentialType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ssl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ssl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">ConnectionCredentialType>ssl"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "loginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "loginPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverTrustCert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "serverTrustCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientKeyStore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "clientKeyStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">ConnectionCredentialType>clientKeyStore"));
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
