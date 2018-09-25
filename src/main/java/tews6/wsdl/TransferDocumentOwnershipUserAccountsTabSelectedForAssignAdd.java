/**
 * TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd  implements java.io.Serializable {
    private java.lang.String userAccountName;

    private java.lang.String endPointName;

    private int index;  // attribute

    public TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd() {
    }

    public TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd(
           java.lang.String userAccountName,
           java.lang.String endPointName,
           int index) {
           this.userAccountName = userAccountName;
           this.endPointName = endPointName;
           this.index = index;
    }


    /**
     * Gets the userAccountName value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @return userAccountName
     */
    public java.lang.String getUserAccountName() {
        return userAccountName;
    }


    /**
     * Sets the userAccountName value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @param userAccountName
     */
    public void setUserAccountName(java.lang.String userAccountName) {
        this.userAccountName = userAccountName;
    }


    /**
     * Gets the endPointName value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @return endPointName
     */
    public java.lang.String getEndPointName() {
        return endPointName;
    }


    /**
     * Sets the endPointName value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @param endPointName
     */
    public void setEndPointName(java.lang.String endPointName) {
        this.endPointName = endPointName;
    }


    /**
     * Gets the index value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd)) return false;
        TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd other = (TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd) obj;
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
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign>add"));
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
