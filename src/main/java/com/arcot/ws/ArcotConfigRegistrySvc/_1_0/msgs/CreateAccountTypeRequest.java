/**
 * CreateAccountTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs;

public class CreateAccountTypeRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.AccountType accountType;

    private java.lang.Boolean targetAllOrgs;

    private com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations;

    private java.lang.String clientTxId;

    public CreateAccountTypeRequest() {
    }

    public CreateAccountTypeRequest(
           com.arcot.ws.UserSchema._1_0.AccountType accountType,
           java.lang.Boolean targetAllOrgs,
           com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations,
           java.lang.String clientTxId) {
           this.accountType = accountType;
           this.targetAllOrgs = targetAllOrgs;
           this.listOfOrganizations = listOfOrganizations;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the accountType value for this CreateAccountTypeRequest.
     * 
     * @return accountType
     */
    public com.arcot.ws.UserSchema._1_0.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CreateAccountTypeRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.arcot.ws.UserSchema._1_0.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the targetAllOrgs value for this CreateAccountTypeRequest.
     * 
     * @return targetAllOrgs
     */
    public java.lang.Boolean getTargetAllOrgs() {
        return targetAllOrgs;
    }


    /**
     * Sets the targetAllOrgs value for this CreateAccountTypeRequest.
     * 
     * @param targetAllOrgs
     */
    public void setTargetAllOrgs(java.lang.Boolean targetAllOrgs) {
        this.targetAllOrgs = targetAllOrgs;
    }


    /**
     * Gets the listOfOrganizations value for this CreateAccountTypeRequest.
     * 
     * @return listOfOrganizations
     */
    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] getListOfOrganizations() {
        return listOfOrganizations;
    }


    /**
     * Sets the listOfOrganizations value for this CreateAccountTypeRequest.
     * 
     * @param listOfOrganizations
     */
    public void setListOfOrganizations(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations) {
        this.listOfOrganizations = listOfOrganizations;
    }


    /**
     * Gets the clientTxId value for this CreateAccountTypeRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this CreateAccountTypeRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountTypeRequest)) return false;
        CreateAccountTypeRequest other = (CreateAccountTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.targetAllOrgs==null && other.getTargetAllOrgs()==null) || 
             (this.targetAllOrgs!=null &&
              this.targetAllOrgs.equals(other.getTargetAllOrgs()))) &&
            ((this.listOfOrganizations==null && other.getListOfOrganizations()==null) || 
             (this.listOfOrganizations!=null &&
              java.util.Arrays.equals(this.listOfOrganizations, other.getListOfOrganizations()))) &&
            ((this.clientTxId==null && other.getClientTxId()==null) || 
             (this.clientTxId!=null &&
              this.clientTxId.equals(other.getClientTxId())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getTargetAllOrgs() != null) {
            _hashCode += getTargetAllOrgs().hashCode();
        }
        if (getListOfOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfOrganizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">createAccountTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAllOrgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAllOrgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListOfOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "AccountCustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Organization"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientTxId"));
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
