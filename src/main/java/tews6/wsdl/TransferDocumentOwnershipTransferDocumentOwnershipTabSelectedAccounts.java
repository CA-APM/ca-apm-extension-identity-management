/**
 * TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts  implements java.io.Serializable {
    private tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd[] add;

    private tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue[] currentvalue;

    public TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts() {
    }

    public TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts(
           tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd[] add,
           tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue[] currentvalue) {
           this.add = add;
           this.currentvalue = currentvalue;
    }


    /**
     * Gets the add value for this TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.
     * 
     * @return add
     */
    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd[] getAdd() {
        return add;
    }


    /**
     * Sets the add value for this TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.
     * 
     * @param add
     */
    public void setAdd(tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd[] add) {
        this.add = add;
    }

    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd getAdd(int i) {
        return this.add[i];
    }

    public void setAdd(int i, tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd _value) {
        this.add[i] = _value;
    }


    /**
     * Gets the currentvalue value for this TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.
     * 
     * @return currentvalue
     */
    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue[] getCurrentvalue() {
        return currentvalue;
    }


    /**
     * Sets the currentvalue value for this TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.
     * 
     * @param currentvalue
     */
    public void setCurrentvalue(tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue[] currentvalue) {
        this.currentvalue = currentvalue;
    }

    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue getCurrentvalue(int i) {
        return this.currentvalue[i];
    }

    public void setCurrentvalue(int i, tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue _value) {
        this.currentvalue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts)) return false;
        TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts other = (TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.add==null && other.getAdd()==null) || 
             (this.add!=null &&
              java.util.Arrays.equals(this.add, other.getAdd()))) &&
            ((this.currentvalue==null && other.getCurrentvalue()==null) || 
             (this.currentvalue!=null &&
              java.util.Arrays.equals(this.currentvalue, other.getCurrentvalue())));
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
        if (getAdd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentvalue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentvalue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentvalue(), i);
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
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts>add"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts>currentvalue"));
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
