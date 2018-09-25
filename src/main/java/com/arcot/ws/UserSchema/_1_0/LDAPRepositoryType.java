/**
 * LDAPRepositoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * Holds the LDAP repository details. This is mandatory when the repository
 * type is LDAP.
 */
public class LDAPRepositoryType  implements java.io.Serializable {
    private java.lang.String host;

    private int port;

    private java.lang.String schemaName;

    private com.arcot.ws.UserSchema._1_0.DNTypeDnEntry[] baseDN;

    private com.arcot.ws.UserSchema._1_0.ConnectionCredentialType connectionCredential;

    private java.lang.String redirectSearchSchema;

    private java.lang.String redirectSearchAttribute;

    public LDAPRepositoryType() {
    }

    public LDAPRepositoryType(
           java.lang.String host,
           int port,
           java.lang.String schemaName,
           com.arcot.ws.UserSchema._1_0.DNTypeDnEntry[] baseDN,
           com.arcot.ws.UserSchema._1_0.ConnectionCredentialType connectionCredential,
           java.lang.String redirectSearchSchema,
           java.lang.String redirectSearchAttribute) {
           this.host = host;
           this.port = port;
           this.schemaName = schemaName;
           this.baseDN = baseDN;
           this.connectionCredential = connectionCredential;
           this.redirectSearchSchema = redirectSearchSchema;
           this.redirectSearchAttribute = redirectSearchAttribute;
    }


    /**
     * Gets the host value for this LDAPRepositoryType.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this LDAPRepositoryType.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the port value for this LDAPRepositoryType.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this LDAPRepositoryType.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the schemaName value for this LDAPRepositoryType.
     * 
     * @return schemaName
     */
    public java.lang.String getSchemaName() {
        return schemaName;
    }


    /**
     * Sets the schemaName value for this LDAPRepositoryType.
     * 
     * @param schemaName
     */
    public void setSchemaName(java.lang.String schemaName) {
        this.schemaName = schemaName;
    }


    /**
     * Gets the baseDN value for this LDAPRepositoryType.
     * 
     * @return baseDN
     */
    public com.arcot.ws.UserSchema._1_0.DNTypeDnEntry[] getBaseDN() {
        return baseDN;
    }


    /**
     * Sets the baseDN value for this LDAPRepositoryType.
     * 
     * @param baseDN
     */
    public void setBaseDN(com.arcot.ws.UserSchema._1_0.DNTypeDnEntry[] baseDN) {
        this.baseDN = baseDN;
    }


    /**
     * Gets the connectionCredential value for this LDAPRepositoryType.
     * 
     * @return connectionCredential
     */
    public com.arcot.ws.UserSchema._1_0.ConnectionCredentialType getConnectionCredential() {
        return connectionCredential;
    }


    /**
     * Sets the connectionCredential value for this LDAPRepositoryType.
     * 
     * @param connectionCredential
     */
    public void setConnectionCredential(com.arcot.ws.UserSchema._1_0.ConnectionCredentialType connectionCredential) {
        this.connectionCredential = connectionCredential;
    }


    /**
     * Gets the redirectSearchSchema value for this LDAPRepositoryType.
     * 
     * @return redirectSearchSchema
     */
    public java.lang.String getRedirectSearchSchema() {
        return redirectSearchSchema;
    }


    /**
     * Sets the redirectSearchSchema value for this LDAPRepositoryType.
     * 
     * @param redirectSearchSchema
     */
    public void setRedirectSearchSchema(java.lang.String redirectSearchSchema) {
        this.redirectSearchSchema = redirectSearchSchema;
    }


    /**
     * Gets the redirectSearchAttribute value for this LDAPRepositoryType.
     * 
     * @return redirectSearchAttribute
     */
    public java.lang.String getRedirectSearchAttribute() {
        return redirectSearchAttribute;
    }


    /**
     * Sets the redirectSearchAttribute value for this LDAPRepositoryType.
     * 
     * @param redirectSearchAttribute
     */
    public void setRedirectSearchAttribute(java.lang.String redirectSearchAttribute) {
        this.redirectSearchAttribute = redirectSearchAttribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LDAPRepositoryType)) return false;
        LDAPRepositoryType other = (LDAPRepositoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            this.port == other.getPort() &&
            ((this.schemaName==null && other.getSchemaName()==null) || 
             (this.schemaName!=null &&
              this.schemaName.equals(other.getSchemaName()))) &&
            ((this.baseDN==null && other.getBaseDN()==null) || 
             (this.baseDN!=null &&
              java.util.Arrays.equals(this.baseDN, other.getBaseDN()))) &&
            ((this.connectionCredential==null && other.getConnectionCredential()==null) || 
             (this.connectionCredential!=null &&
              this.connectionCredential.equals(other.getConnectionCredential()))) &&
            ((this.redirectSearchSchema==null && other.getRedirectSearchSchema()==null) || 
             (this.redirectSearchSchema!=null &&
              this.redirectSearchSchema.equals(other.getRedirectSearchSchema()))) &&
            ((this.redirectSearchAttribute==null && other.getRedirectSearchAttribute()==null) || 
             (this.redirectSearchAttribute!=null &&
              this.redirectSearchAttribute.equals(other.getRedirectSearchAttribute())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        _hashCode += getPort();
        if (getSchemaName() != null) {
            _hashCode += getSchemaName().hashCode();
        }
        if (getBaseDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectionCredential() != null) {
            _hashCode += getConnectionCredential().hashCode();
        }
        if (getRedirectSearchSchema() != null) {
            _hashCode += getRedirectSearchSchema().hashCode();
        }
        if (getRedirectSearchAttribute() != null) {
            _hashCode += getRedirectSearchAttribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LDAPRepositoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "LDAPRepositoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "schemaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "baseDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">DNType>dnEntry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dnEntry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "connectionCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "ConnectionCredentialType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectSearchSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "redirectSearchSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectSearchAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "redirectSearchAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
