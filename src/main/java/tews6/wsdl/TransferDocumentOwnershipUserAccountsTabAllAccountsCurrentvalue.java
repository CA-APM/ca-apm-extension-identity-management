/**
 * TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue  implements java.io.Serializable {
    private java.lang.String userAccountName;

    private java.lang.String endPointName;

    private java.lang.String accountType;

    private java.lang.String suspendedState;

    private java.lang.String lockedState;

    private java.lang.String password;

    private java.lang.String reasons;

    private java.lang.String uniqueName;

    private int index;  // attribute

    public TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue() {
    }

    public TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue(
           java.lang.String userAccountName,
           java.lang.String endPointName,
           java.lang.String accountType,
           java.lang.String suspendedState,
           java.lang.String lockedState,
           java.lang.String password,
           java.lang.String reasons,
           java.lang.String uniqueName,
           int index) {
           this.userAccountName = userAccountName;
           this.endPointName = endPointName;
           this.accountType = accountType;
           this.suspendedState = suspendedState;
           this.lockedState = lockedState;
           this.password = password;
           this.reasons = reasons;
           this.uniqueName = uniqueName;
           this.index = index;
    }


    /**
     * Gets the userAccountName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the endPointName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return endPointName
     */
    public java.lang.String getEndPointName() {
        return endPointName;
    }


    /**
     * Sets the endPointName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param endPointName
     */
    public void setEndPointName(java.lang.String endPointName) {
        this.endPointName = endPointName;
    }


    /**
     * Gets the accountType value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the suspendedState value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return suspendedState
     */
    public java.lang.String getSuspendedState() {
        return suspendedState;
    }


    /**
     * Sets the suspendedState value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param suspendedState
     */
    public void setSuspendedState(java.lang.String suspendedState) {
        this.suspendedState = suspendedState;
    }


    /**
     * Gets the lockedState value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return lockedState
     */
    public java.lang.String getLockedState() {
        return lockedState;
    }


    /**
     * Sets the lockedState value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param lockedState
     */
    public void setLockedState(java.lang.String lockedState) {
        this.lockedState = lockedState;
    }


    /**
     * Gets the password value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the reasons value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return reasons
     */
    public java.lang.String getReasons() {
        return reasons;
    }


    /**
     * Sets the reasons value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param reasons
     */
    public void setReasons(java.lang.String reasons) {
        this.reasons = reasons;
    }


    /**
     * Gets the uniqueName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the index value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue)) return false;
        TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue other = (TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userAccountName==null && other.getUserAccountName()==null) || 
             (this.userAccountName!=null &&
              this.userAccountName.equals(other.getUserAccountName()))) &&
            ((this.endPointName==null && other.getEndPointName()==null) || 
             (this.endPointName!=null &&
              this.endPointName.equals(other.getEndPointName()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.suspendedState==null && other.getSuspendedState()==null) || 
             (this.suspendedState!=null &&
              this.suspendedState.equals(other.getSuspendedState()))) &&
            ((this.lockedState==null && other.getLockedState()==null) || 
             (this.lockedState!=null &&
              this.lockedState.equals(other.getLockedState()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.reasons==null && other.getReasons()==null) || 
             (this.reasons!=null &&
              this.reasons.equals(other.getReasons()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            this.index == other.getIndex();
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
        if (getUserAccountName() != null) {
            _hashCode += getUserAccountName().hashCode();
        }
        if (getEndPointName() != null) {
            _hashCode += getEndPointName().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getSuspendedState() != null) {
            _hashCode += getSuspendedState().hashCode();
        }
        if (getLockedState() != null) {
            _hashCode += getLockedState().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getReasons() != null) {
            _hashCode += getReasons().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>AllAccounts>currentvalue"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPointName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "EndPointName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "SuspendedState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "LockedState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Reasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UniqueName"));
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
