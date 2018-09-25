/**
 * UserAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * Users may be identified by additional alternate ID besides the
 * User Name.  
 * 					The notion of alternate ID is termed as Account.  A given user
 * may have one or more accounts.  
 * 					An account is usually qualified by another attribute, which provides
 * additional context about the usage of the account.
 * 					We will term this as "Account Type".  A given user can have multiple
 * accounts based on one or more account types.
 * 					Example: Account Type: Netbanking : AccountID - <CustomerID>
 * 					Example: Account Type: Mobile Banking: AccountID - <Mobile Number>
 * 					An account may have "dependency" on attribute(s), which we would
 * term as AccountIDAttribute.
 * 					An AccountIDAttribute is not an independent account - however,
 * the accountID and the 
 * 					AccountIDAttribute co-exists where it  make sense.  Therefore,
 * the status field applies to the 
 * 					AccountID + AccountIDAttribute combination.  The combination
 * of "AccountType + AccountID + AccountIDAttribute" 
 * 					can be thought of as an actual account having a status.
 * 
 * 					The Account Status in an integer that signify the status depending
 * on a range of values - 
 * 
 * 					INITIAL =    0-9 
 * 					ACTIVE  =    10-19
 * 					DISABLED =   20-29
 * 					DELETED =    30 - 39
 * 					UNKNOWN =    greater than 39
 * 
 * 					The interpretation of the account status values may differ from
 * one account type to another.
 */
public class UserAccountType  implements java.io.Serializable {
    private java.lang.String accountType;

    private java.lang.String accountID;

    private java.lang.Integer accountStatus;

    private com.arcot.ws.UserSchema._1_0.AccountIDAttribute[] accountIDAttribute;

    private java.util.Calendar dateCreated;

    private java.util.Calendar dateModified;

    private com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType[] accountCustomAttribute;

    public UserAccountType() {
    }

    public UserAccountType(
           java.lang.String accountType,
           java.lang.String accountID,
           java.lang.Integer accountStatus,
           com.arcot.ws.UserSchema._1_0.AccountIDAttribute[] accountIDAttribute,
           java.util.Calendar dateCreated,
           java.util.Calendar dateModified,
           com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType[] accountCustomAttribute) {
           this.accountType = accountType;
           this.accountID = accountID;
           this.accountStatus = accountStatus;
           this.accountIDAttribute = accountIDAttribute;
           this.dateCreated = dateCreated;
           this.dateModified = dateModified;
           this.accountCustomAttribute = accountCustomAttribute;
    }


    /**
     * Gets the accountType value for this UserAccountType.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this UserAccountType.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountID value for this UserAccountType.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this UserAccountType.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the accountStatus value for this UserAccountType.
     * 
     * @return accountStatus
     */
    public java.lang.Integer getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this UserAccountType.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.Integer accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accountIDAttribute value for this UserAccountType.
     * 
     * @return accountIDAttribute
     */
    public com.arcot.ws.UserSchema._1_0.AccountIDAttribute[] getAccountIDAttribute() {
        return accountIDAttribute;
    }


    /**
     * Sets the accountIDAttribute value for this UserAccountType.
     * 
     * @param accountIDAttribute
     */
    public void setAccountIDAttribute(com.arcot.ws.UserSchema._1_0.AccountIDAttribute[] accountIDAttribute) {
        this.accountIDAttribute = accountIDAttribute;
    }

    public com.arcot.ws.UserSchema._1_0.AccountIDAttribute getAccountIDAttribute(int i) {
        return this.accountIDAttribute[i];
    }

    public void setAccountIDAttribute(int i, com.arcot.ws.UserSchema._1_0.AccountIDAttribute _value) {
        this.accountIDAttribute[i] = _value;
    }


    /**
     * Gets the dateCreated value for this UserAccountType.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this UserAccountType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateModified value for this UserAccountType.
     * 
     * @return dateModified
     */
    public java.util.Calendar getDateModified() {
        return dateModified;
    }


    /**
     * Sets the dateModified value for this UserAccountType.
     * 
     * @param dateModified
     */
    public void setDateModified(java.util.Calendar dateModified) {
        this.dateModified = dateModified;
    }


    /**
     * Gets the accountCustomAttribute value for this UserAccountType.
     * 
     * @return accountCustomAttribute
     */
    public com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType[] getAccountCustomAttribute() {
        return accountCustomAttribute;
    }


    /**
     * Sets the accountCustomAttribute value for this UserAccountType.
     * 
     * @param accountCustomAttribute
     */
    public void setAccountCustomAttribute(com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType[] accountCustomAttribute) {
        this.accountCustomAttribute = accountCustomAttribute;
    }

    public com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType getAccountCustomAttribute(int i) {
        return this.accountCustomAttribute[i];
    }

    public void setAccountCustomAttribute(int i, com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType _value) {
        this.accountCustomAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAccountType)) return false;
        UserAccountType other = (UserAccountType) obj;
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
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accountIDAttribute==null && other.getAccountIDAttribute()==null) || 
             (this.accountIDAttribute!=null &&
              java.util.Arrays.equals(this.accountIDAttribute, other.getAccountIDAttribute()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateModified==null && other.getDateModified()==null) || 
             (this.dateModified!=null &&
              this.dateModified.equals(other.getDateModified()))) &&
            ((this.accountCustomAttribute==null && other.getAccountCustomAttribute()==null) || 
             (this.accountCustomAttribute!=null &&
              java.util.Arrays.equals(this.accountCustomAttribute, other.getAccountCustomAttribute())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getAccountIDAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountIDAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountIDAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateModified() != null) {
            _hashCode += getDateModified().hashCode();
        }
        if (getAccountCustomAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountCustomAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountCustomAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(UserAccountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAccountType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountIDAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountIDAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountIDAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCustomAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountCustomAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountCustomAttributeType"));
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
