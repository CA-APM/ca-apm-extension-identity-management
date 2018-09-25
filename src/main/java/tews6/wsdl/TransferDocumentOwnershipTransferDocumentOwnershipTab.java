/**
 * TransferDocumentOwnershipTransferDocumentOwnershipTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipTransferDocumentOwnershipTab  implements java.io.Serializable {
    private tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts selectedAccounts;

    private java.lang.String selectedTargetUser;

    public TransferDocumentOwnershipTransferDocumentOwnershipTab() {
    }

    public TransferDocumentOwnershipTransferDocumentOwnershipTab(
           tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts selectedAccounts,
           java.lang.String selectedTargetUser) {
           this.selectedAccounts = selectedAccounts;
           this.selectedTargetUser = selectedTargetUser;
    }


    /**
     * Gets the selectedAccounts value for this TransferDocumentOwnershipTransferDocumentOwnershipTab.
     * 
     * @return selectedAccounts
     */
    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts getSelectedAccounts() {
        return selectedAccounts;
    }


    /**
     * Sets the selectedAccounts value for this TransferDocumentOwnershipTransferDocumentOwnershipTab.
     * 
     * @param selectedAccounts
     */
    public void setSelectedAccounts(tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts selectedAccounts) {
        this.selectedAccounts = selectedAccounts;
    }


    /**
     * Gets the selectedTargetUser value for this TransferDocumentOwnershipTransferDocumentOwnershipTab.
     * 
     * @return selectedTargetUser
     */
    public java.lang.String getSelectedTargetUser() {
        return selectedTargetUser;
    }


    /**
     * Sets the selectedTargetUser value for this TransferDocumentOwnershipTransferDocumentOwnershipTab.
     * 
     * @param selectedTargetUser
     */
    public void setSelectedTargetUser(java.lang.String selectedTargetUser) {
        this.selectedTargetUser = selectedTargetUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipTransferDocumentOwnershipTab)) return false;
        TransferDocumentOwnershipTransferDocumentOwnershipTab other = (TransferDocumentOwnershipTransferDocumentOwnershipTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectedAccounts==null && other.getSelectedAccounts()==null) || 
             (this.selectedAccounts!=null &&
              this.selectedAccounts.equals(other.getSelectedAccounts()))) &&
            ((this.selectedTargetUser==null && other.getSelectedTargetUser()==null) || 
             (this.selectedTargetUser!=null &&
              this.selectedTargetUser.equals(other.getSelectedTargetUser())));
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
        if (getSelectedAccounts() != null) {
            _hashCode += getSelectedAccounts().hashCode();
        }
        if (getSelectedTargetUser() != null) {
            _hashCode += getSelectedTargetUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipTransferDocumentOwnershipTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipTransferDocumentOwnershipTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "SelectedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedTargetUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "SelectedTargetUser"));
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
