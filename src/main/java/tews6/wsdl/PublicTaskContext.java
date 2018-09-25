/**
 * PublicTaskContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PublicTaskContext  implements java.io.Serializable {
    private java.lang.String transaction_id;

    private java.lang.String connection_id;

    private java.lang.String no_namespace_on_soapfaults_header;

    public PublicTaskContext() {
    }

    public PublicTaskContext(
           java.lang.String transaction_id,
           java.lang.String connection_id,
           java.lang.String no_namespace_on_soapfaults_header) {
           this.transaction_id = transaction_id;
           this.connection_id = connection_id;
           this.no_namespace_on_soapfaults_header = no_namespace_on_soapfaults_header;
    }


    /**
     * Gets the transaction_id value for this PublicTaskContext.
     * 
     * @return transaction_id
     */
    public java.lang.String getTransaction_id() {
        return transaction_id;
    }


    /**
     * Sets the transaction_id value for this PublicTaskContext.
     * 
     * @param transaction_id
     */
    public void setTransaction_id(java.lang.String transaction_id) {
        this.transaction_id = transaction_id;
    }


    /**
     * Gets the connection_id value for this PublicTaskContext.
     * 
     * @return connection_id
     */
    public java.lang.String getConnection_id() {
        return connection_id;
    }


    /**
     * Sets the connection_id value for this PublicTaskContext.
     * 
     * @param connection_id
     */
    public void setConnection_id(java.lang.String connection_id) {
        this.connection_id = connection_id;
    }


    /**
     * Gets the no_namespace_on_soapfaults_header value for this PublicTaskContext.
     * 
     * @return no_namespace_on_soapfaults_header
     */
    public java.lang.String getNo_namespace_on_soapfaults_header() {
        return no_namespace_on_soapfaults_header;
    }


    /**
     * Sets the no_namespace_on_soapfaults_header value for this PublicTaskContext.
     * 
     * @param no_namespace_on_soapfaults_header
     */
    public void setNo_namespace_on_soapfaults_header(java.lang.String no_namespace_on_soapfaults_header) {
        this.no_namespace_on_soapfaults_header = no_namespace_on_soapfaults_header;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublicTaskContext)) return false;
        PublicTaskContext other = (PublicTaskContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transaction_id==null && other.getTransaction_id()==null) || 
             (this.transaction_id!=null &&
              this.transaction_id.equals(other.getTransaction_id()))) &&
            ((this.connection_id==null && other.getConnection_id()==null) || 
             (this.connection_id!=null &&
              this.connection_id.equals(other.getConnection_id()))) &&
            ((this.no_namespace_on_soapfaults_header==null && other.getNo_namespace_on_soapfaults_header()==null) || 
             (this.no_namespace_on_soapfaults_header!=null &&
              this.no_namespace_on_soapfaults_header.equals(other.getNo_namespace_on_soapfaults_header())));
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
        if (getTransaction_id() != null) {
            _hashCode += getTransaction_id().hashCode();
        }
        if (getConnection_id() != null) {
            _hashCode += getConnection_id().hashCode();
        }
        if (getNo_namespace_on_soapfaults_header() != null) {
            _hashCode += getNo_namespace_on_soapfaults_header().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublicTaskContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PublicTaskContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "transaction_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connection_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "connection_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_namespace_on_soapfaults_header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "no_namespace_on_soapfaults_header"));
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
