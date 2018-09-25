/**
 * TransferDocumentOwnershipUserAccountsTabSelectedForAssign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipUserAccountsTabSelectedForAssign  implements java.io.Serializable {
    private tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd[] add;

    private tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue[] currentvalue;

    public TransferDocumentOwnershipUserAccountsTabSelectedForAssign() {
    }

    public TransferDocumentOwnershipUserAccountsTabSelectedForAssign(
           tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd[] add,
           tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue[] currentvalue) {
           this.add = add;
           this.currentvalue = currentvalue;
    }


    /**
     * Gets the add value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssign.
     * 
     * @return add
     */
    public tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd[] getAdd() {
        return add;
    }


    /**
     * Sets the add value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssign.
     * 
     * @param add
     */
    public void setAdd(tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd[] add) {
        this.add = add;
    }

    public tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd getAdd(int i) {
        return this.add[i];
    }

    public void setAdd(int i, tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd _value) {
        this.add[i] = _value;
    }


    /**
     * Gets the currentvalue value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssign.
     * 
     * @return currentvalue
     */
    public tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue[] getCurrentvalue() {
        return currentvalue;
    }


    /**
     * Sets the currentvalue value for this TransferDocumentOwnershipUserAccountsTabSelectedForAssign.
     * 
     * @param currentvalue
     */
    public void setCurrentvalue(tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue[] currentvalue) {
        this.currentvalue = currentvalue;
    }

    public tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue getCurrentvalue(int i) {
        return this.currentvalue[i];
    }

    public void setCurrentvalue(int i, tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue _value) {
        this.currentvalue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipUserAccountsTabSelectedForAssign)) return false;
        TransferDocumentOwnershipUserAccountsTabSelectedForAssign other = (TransferDocumentOwnershipUserAccountsTabSelectedForAssign) obj;
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
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipUserAccountsTabSelectedForAssign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign>add"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign>currentvalue"));
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
