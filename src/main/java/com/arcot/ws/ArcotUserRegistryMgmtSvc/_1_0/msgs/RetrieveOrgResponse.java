/**
 * RetrieveOrgResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class RetrieveOrgResponse  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.OrganizationType organization;

    private com.arcot.ws.UserSchema._1_0.AccountTypeForOrg[] accountTypeForOrg;

    public RetrieveOrgResponse() {
    }

    public RetrieveOrgResponse(
           com.arcot.ws.UserSchema._1_0.OrganizationType organization,
           com.arcot.ws.UserSchema._1_0.AccountTypeForOrg[] accountTypeForOrg) {
           this.organization = organization;
           this.accountTypeForOrg = accountTypeForOrg;
    }


    /**
     * Gets the organization value for this RetrieveOrgResponse.
     * 
     * @return organization
     */
    public com.arcot.ws.UserSchema._1_0.OrganizationType getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this RetrieveOrgResponse.
     * 
     * @param organization
     */
    public void setOrganization(com.arcot.ws.UserSchema._1_0.OrganizationType organization) {
        this.organization = organization;
    }


    /**
     * Gets the accountTypeForOrg value for this RetrieveOrgResponse.
     * 
     * @return accountTypeForOrg
     */
    public com.arcot.ws.UserSchema._1_0.AccountTypeForOrg[] getAccountTypeForOrg() {
        return accountTypeForOrg;
    }


    /**
     * Sets the accountTypeForOrg value for this RetrieveOrgResponse.
     * 
     * @param accountTypeForOrg
     */
    public void setAccountTypeForOrg(com.arcot.ws.UserSchema._1_0.AccountTypeForOrg[] accountTypeForOrg) {
        this.accountTypeForOrg = accountTypeForOrg;
    }

    public com.arcot.ws.UserSchema._1_0.AccountTypeForOrg getAccountTypeForOrg(int i) {
        return this.accountTypeForOrg[i];
    }

    public void setAccountTypeForOrg(int i, com.arcot.ws.UserSchema._1_0.AccountTypeForOrg _value) {
        this.accountTypeForOrg[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveOrgResponse)) return false;
        RetrieveOrgResponse other = (RetrieveOrgResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.accountTypeForOrg==null && other.getAccountTypeForOrg()==null) || 
             (this.accountTypeForOrg!=null &&
              java.util.Arrays.equals(this.accountTypeForOrg, other.getAccountTypeForOrg())));
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getAccountTypeForOrg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountTypeForOrg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountTypeForOrg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveOrgResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveOrgResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrganizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTypeForOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountTypeForOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountTypeForOrg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
