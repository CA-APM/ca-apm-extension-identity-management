/**
 * TransferDocumentOwnershipQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipQuery  implements java.io.Serializable {
    private tews6.wsdl.TransferDocumentOwnershipSearch transferDocumentOwnershipSearch;

    private tews6.wsdl.TransferDocumentOwnershipUserAccountsTab transferDocumentOwnershipUserAccountsTab;

    private tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTab transferDocumentOwnershipTransferDocumentOwnershipTab;

    public TransferDocumentOwnershipQuery() {
    }

    public TransferDocumentOwnershipQuery(
           tews6.wsdl.TransferDocumentOwnershipSearch transferDocumentOwnershipSearch,
           tews6.wsdl.TransferDocumentOwnershipUserAccountsTab transferDocumentOwnershipUserAccountsTab,
           tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTab transferDocumentOwnershipTransferDocumentOwnershipTab) {
           this.transferDocumentOwnershipSearch = transferDocumentOwnershipSearch;
           this.transferDocumentOwnershipUserAccountsTab = transferDocumentOwnershipUserAccountsTab;
           this.transferDocumentOwnershipTransferDocumentOwnershipTab = transferDocumentOwnershipTransferDocumentOwnershipTab;
    }


    /**
     * Gets the transferDocumentOwnershipSearch value for this TransferDocumentOwnershipQuery.
     * 
     * @return transferDocumentOwnershipSearch
     */
    public tews6.wsdl.TransferDocumentOwnershipSearch getTransferDocumentOwnershipSearch() {
        return transferDocumentOwnershipSearch;
    }


    /**
     * Sets the transferDocumentOwnershipSearch value for this TransferDocumentOwnershipQuery.
     * 
     * @param transferDocumentOwnershipSearch
     */
    public void setTransferDocumentOwnershipSearch(tews6.wsdl.TransferDocumentOwnershipSearch transferDocumentOwnershipSearch) {
        this.transferDocumentOwnershipSearch = transferDocumentOwnershipSearch;
    }


    /**
     * Gets the transferDocumentOwnershipUserAccountsTab value for this TransferDocumentOwnershipQuery.
     * 
     * @return transferDocumentOwnershipUserAccountsTab
     */
    public tews6.wsdl.TransferDocumentOwnershipUserAccountsTab getTransferDocumentOwnershipUserAccountsTab() {
        return transferDocumentOwnershipUserAccountsTab;
    }


    /**
     * Sets the transferDocumentOwnershipUserAccountsTab value for this TransferDocumentOwnershipQuery.
     * 
     * @param transferDocumentOwnershipUserAccountsTab
     */
    public void setTransferDocumentOwnershipUserAccountsTab(tews6.wsdl.TransferDocumentOwnershipUserAccountsTab transferDocumentOwnershipUserAccountsTab) {
        this.transferDocumentOwnershipUserAccountsTab = transferDocumentOwnershipUserAccountsTab;
    }


    /**
     * Gets the transferDocumentOwnershipTransferDocumentOwnershipTab value for this TransferDocumentOwnershipQuery.
     * 
     * @return transferDocumentOwnershipTransferDocumentOwnershipTab
     */
    public tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTab getTransferDocumentOwnershipTransferDocumentOwnershipTab() {
        return transferDocumentOwnershipTransferDocumentOwnershipTab;
    }


    /**
     * Sets the transferDocumentOwnershipTransferDocumentOwnershipTab value for this TransferDocumentOwnershipQuery.
     * 
     * @param transferDocumentOwnershipTransferDocumentOwnershipTab
     */
    public void setTransferDocumentOwnershipTransferDocumentOwnershipTab(tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTab transferDocumentOwnershipTransferDocumentOwnershipTab) {
        this.transferDocumentOwnershipTransferDocumentOwnershipTab = transferDocumentOwnershipTransferDocumentOwnershipTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipQuery)) return false;
        TransferDocumentOwnershipQuery other = (TransferDocumentOwnershipQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transferDocumentOwnershipSearch==null && other.getTransferDocumentOwnershipSearch()==null) || 
             (this.transferDocumentOwnershipSearch!=null &&
              this.transferDocumentOwnershipSearch.equals(other.getTransferDocumentOwnershipSearch()))) &&
            ((this.transferDocumentOwnershipUserAccountsTab==null && other.getTransferDocumentOwnershipUserAccountsTab()==null) || 
             (this.transferDocumentOwnershipUserAccountsTab!=null &&
              this.transferDocumentOwnershipUserAccountsTab.equals(other.getTransferDocumentOwnershipUserAccountsTab()))) &&
            ((this.transferDocumentOwnershipTransferDocumentOwnershipTab==null && other.getTransferDocumentOwnershipTransferDocumentOwnershipTab()==null) || 
             (this.transferDocumentOwnershipTransferDocumentOwnershipTab!=null &&
              this.transferDocumentOwnershipTransferDocumentOwnershipTab.equals(other.getTransferDocumentOwnershipTransferDocumentOwnershipTab())));
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
        if (getTransferDocumentOwnershipSearch() != null) {
            _hashCode += getTransferDocumentOwnershipSearch().hashCode();
        }
        if (getTransferDocumentOwnershipUserAccountsTab() != null) {
            _hashCode += getTransferDocumentOwnershipUserAccountsTab().hashCode();
        }
        if (getTransferDocumentOwnershipTransferDocumentOwnershipTab() != null) {
            _hashCode += getTransferDocumentOwnershipTransferDocumentOwnershipTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDocumentOwnershipSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDocumentOwnershipUserAccountsTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipUserAccountsTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipUserAccountsTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDocumentOwnershipTransferDocumentOwnershipTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipTransferDocumentOwnershipTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipTransferDocumentOwnershipTab"));
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
