/**
 * SearchUsersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class SearchUsersRequest  implements java.io.Serializable {
    private java.lang.String orgPattern;

    private java.lang.String[] orgName;

    private java.lang.String searchExpression;

    private java.lang.Integer count;

    private com.arcot.ws.UserSchema._1_0.UserFilterType filter;

    private com.arcot.ws.UserSchema._1_0.UserStatusType[] status;

    private com.arcot.ws.UserSchema._1_0.UserAccountType[] account;

    private java.lang.String[] repositoryUserAttributes;

    private java.lang.String clientTxId;

    public SearchUsersRequest() {
    }

    public SearchUsersRequest(
           java.lang.String orgPattern,
           java.lang.String[] orgName,
           java.lang.String searchExpression,
           java.lang.Integer count,
           com.arcot.ws.UserSchema._1_0.UserFilterType filter,
           com.arcot.ws.UserSchema._1_0.UserStatusType[] status,
           com.arcot.ws.UserSchema._1_0.UserAccountType[] account,
           java.lang.String[] repositoryUserAttributes,
           java.lang.String clientTxId) {
           this.orgPattern = orgPattern;
           this.orgName = orgName;
           this.searchExpression = searchExpression;
           this.count = count;
           this.filter = filter;
           this.status = status;
           this.account = account;
           this.repositoryUserAttributes = repositoryUserAttributes;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the orgPattern value for this SearchUsersRequest.
     * 
     * @return orgPattern
     */
    public java.lang.String getOrgPattern() {
        return orgPattern;
    }


    /**
     * Sets the orgPattern value for this SearchUsersRequest.
     * 
     * @param orgPattern
     */
    public void setOrgPattern(java.lang.String orgPattern) {
        this.orgPattern = orgPattern;
    }


    /**
     * Gets the orgName value for this SearchUsersRequest.
     * 
     * @return orgName
     */
    public java.lang.String[] getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this SearchUsersRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String[] orgName) {
        this.orgName = orgName;
    }

    public java.lang.String getOrgName(int i) {
        return this.orgName[i];
    }

    public void setOrgName(int i, java.lang.String _value) {
        this.orgName[i] = _value;
    }


    /**
     * Gets the searchExpression value for this SearchUsersRequest.
     * 
     * @return searchExpression
     */
    public java.lang.String getSearchExpression() {
        return searchExpression;
    }


    /**
     * Sets the searchExpression value for this SearchUsersRequest.
     * 
     * @param searchExpression
     */
    public void setSearchExpression(java.lang.String searchExpression) {
        this.searchExpression = searchExpression;
    }


    /**
     * Gets the count value for this SearchUsersRequest.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this SearchUsersRequest.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the filter value for this SearchUsersRequest.
     * 
     * @return filter
     */
    public com.arcot.ws.UserSchema._1_0.UserFilterType getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this SearchUsersRequest.
     * 
     * @param filter
     */
    public void setFilter(com.arcot.ws.UserSchema._1_0.UserFilterType filter) {
        this.filter = filter;
    }


    /**
     * Gets the status value for this SearchUsersRequest.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.UserStatusType[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchUsersRequest.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.UserStatusType[] status) {
        this.status = status;
    }

    public com.arcot.ws.UserSchema._1_0.UserStatusType getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, com.arcot.ws.UserSchema._1_0.UserStatusType _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the account value for this SearchUsersRequest.
     * 
     * @return account
     */
    public com.arcot.ws.UserSchema._1_0.UserAccountType[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SearchUsersRequest.
     * 
     * @param account
     */
    public void setAccount(com.arcot.ws.UserSchema._1_0.UserAccountType[] account) {
        this.account = account;
    }

    public com.arcot.ws.UserSchema._1_0.UserAccountType getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.arcot.ws.UserSchema._1_0.UserAccountType _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the repositoryUserAttributes value for this SearchUsersRequest.
     * 
     * @return repositoryUserAttributes
     */
    public java.lang.String[] getRepositoryUserAttributes() {
        return repositoryUserAttributes;
    }


    /**
     * Sets the repositoryUserAttributes value for this SearchUsersRequest.
     * 
     * @param repositoryUserAttributes
     */
    public void setRepositoryUserAttributes(java.lang.String[] repositoryUserAttributes) {
        this.repositoryUserAttributes = repositoryUserAttributes;
    }


    /**
     * Gets the clientTxId value for this SearchUsersRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this SearchUsersRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchUsersRequest)) return false;
        SearchUsersRequest other = (SearchUsersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgPattern==null && other.getOrgPattern()==null) || 
             (this.orgPattern!=null &&
              this.orgPattern.equals(other.getOrgPattern()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              java.util.Arrays.equals(this.orgName, other.getOrgName()))) &&
            ((this.searchExpression==null && other.getSearchExpression()==null) || 
             (this.searchExpression!=null &&
              this.searchExpression.equals(other.getSearchExpression()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.repositoryUserAttributes==null && other.getRepositoryUserAttributes()==null) || 
             (this.repositoryUserAttributes!=null &&
              java.util.Arrays.equals(this.repositoryUserAttributes, other.getRepositoryUserAttributes()))) &&
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
        if (getOrgPattern() != null) {
            _hashCode += getOrgPattern().hashCode();
        }
        if (getOrgName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchExpression() != null) {
            _hashCode += getSearchExpression().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepositoryUserAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepositoryUserAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepositoryUserAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(SearchUsersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">searchUsersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "orgPattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "searchExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserFilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryUserAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "RepositoryUserAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeName"));
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
