/**
 * ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter  implements java.io.Serializable {
    private java.lang.String field;

    private tews6.wsdl.OperatorType op;

    private java.lang.String value;

    private tews6.wsdl.ConjunctionType conj;

    private java.math.BigInteger index;  // attribute

    public ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter() {
    }

    public ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter(
           java.lang.String field,
           tews6.wsdl.OperatorType op,
           java.lang.String value,
           tews6.wsdl.ConjunctionType conj,
           java.math.BigInteger index) {
           this.field = field;
           this.op = op;
           this.value = value;
           this.conj = conj;
           this.index = index;
    }


    /**
     * Gets the field value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the op value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @return op
     */
    public tews6.wsdl.OperatorType getOp() {
        return op;
    }


    /**
     * Sets the op value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @param op
     */
    public void setOp(tews6.wsdl.OperatorType op) {
        this.op = op;
    }


    /**
     * Gets the value value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the conj value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @return conj
     */
    public tews6.wsdl.ConjunctionType getConj() {
        return conj;
    }


    /**
     * Sets the conj value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @param conj
     */
    public void setConj(tews6.wsdl.ConjunctionType conj) {
        this.conj = conj;
    }


    /**
     * Gets the index value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @return index
     */
    public java.math.BigInteger getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.
     * 
     * @param index
     */
    public void setIndex(java.math.BigInteger index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter)) return false;
        ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter other = (ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.op==null && other.getOp()==null) || 
             (this.op!=null &&
              this.op.equals(other.getOp()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.conj==null && other.getConj()==null) || 
             (this.conj!=null &&
              this.conj.equals(other.getConj()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getOp() != null) {
            _hashCode += getOp().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getConj() != null) {
            _hashCode += getConj().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>add>Filter"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", "OperatorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Conj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", "ConjunctionType"));
        elemField.setNillable(true);
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
