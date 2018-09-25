/**
 * ListUsersForAccountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class ListUsersForAccountRequest  implements java.io.Serializable {
    private java.lang.String orgName;

    private java.lang.String accountType;

    private java.lang.String accountID;

    private java.lang.String accountIDAttribute;

    private com.arcot.ws.UserSchema._1_0.UserBaseFilterType filter;

    private java.lang.String clientTxId;

    public ListUsersForAccountRequest() {
    }

    public ListUsersForAccountRequest(
           java.lang.String orgName,
           java.lang.String accountType,
           java.lang.String accountID,
           java.lang.String accountIDAttribute,
           com.arcot.ws.UserSchema._1_0.UserBaseFilterType filter,
           java.lang.String clientTxId) {
           this.orgName = orgName;
           this.accountType = accountType;
           this.accountID = accountID;
           this.accountIDAttribute = accountIDAttribute;
           this.filter = filter;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the orgName value for this ListUsersForAccountRequest.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this ListUsersForAccountRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the accountType value for this ListUsersForAccountRequest.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ListUsersForAccountRequest.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountID value for this ListUsersForAccountRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this ListUsersForAccountRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the accountIDAttribute value for this ListUsersForAccountRequest.
     * 
     * @return accountIDAttribute
     */
    public java.lang.String getAccountIDAttribute() {
        return accountIDAttribute;
    }


    /**
     * Sets the accountIDAttribute value for this ListUsersForAccountRequest.
     * 
     * @param accountIDAttribute
     */
    public void setAccountIDAttribute(java.lang.String accountIDAttribute) {
        this.accountIDAttribute = accountIDAttribute;
    }


    /**
     * Gets the filter value for this ListUsersForAccountRequest.
     * 
     * @return filter
     */
    public com.arcot.ws.UserSchema._1_0.UserBaseFilterType getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this ListUsersForAccountRequest.
     * 
     * @param filter
     */
    public void setFilter(com.arcot.ws.UserSchema._1_0.UserBaseFilterType filter) {
        this.filter = filter;
    }


    /**
     * Gets the clientTxId value for this ListUsersForAccountRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this ListUsersForAccountRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListUsersForAccountRequest)) return false;
        ListUsersForAccountRequest other = (ListUsersForAccountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.accountIDAttribute==null && other.getAccountIDAttribute()==null) || 
             (this.accountIDAttribute!=null &&
              this.accountIDAttribute.equals(other.getAccountIDAttribute()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
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
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAccountIDAttribute() != null) {
            _hashCode += getAccountIDAttribute().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListUsersForAccountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersForAccountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIDAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "accountIDAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserBaseFilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "clientTxId"));
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
