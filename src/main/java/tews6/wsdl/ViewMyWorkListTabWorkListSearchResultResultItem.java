/**
 * ViewMyWorkListTabWorkListSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewMyWorkListTabWorkListSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemName name;

    private tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemInitiator initiator;

    public ViewMyWorkListTabWorkListSearchResultResultItem() {
    }

    public ViewMyWorkListTabWorkListSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemName name,
           tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemInitiator initiator) {
           this.OID = OID;
           this.name = name;
           this.initiator = initiator;
    }


    /**
     * Gets the OID value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the name value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @return name
     */
    public tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemName getName() {
        return name;
    }


    /**
     * Sets the name value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @param name
     */
    public void setName(tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemName name) {
        this.name = name;
    }


    /**
     * Gets the initiator value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @return initiator
     */
    public tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemInitiator getInitiator() {
        return initiator;
    }


    /**
     * Sets the initiator value for this ViewMyWorkListTabWorkListSearchResultResultItem.
     * 
     * @param initiator
     */
    public void setInitiator(tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemInitiator initiator) {
        this.initiator = initiator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewMyWorkListTabWorkListSearchResultResultItem)) return false;
        ViewMyWorkListTabWorkListSearchResultResultItem other = (ViewMyWorkListTabWorkListSearchResultResultItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OID==null && other.getOID()==null) || 
             (this.OID!=null &&
              this.OID.equals(other.getOID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.initiator==null && other.getInitiator()==null) || 
             (this.initiator!=null &&
              this.initiator.equals(other.getInitiator())));
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
        if (getOID() != null) {
            _hashCode += getOID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getInitiator() != null) {
            _hashCode += getInitiator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewMyWorkListTabWorkListSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem>name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "initiator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem>initiator"));
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
