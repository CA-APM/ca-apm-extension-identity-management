/**
 * ResetProvisioningRoleOwnersOwnersTabPolicyAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetProvisioningRoleOwnersOwnersTabPolicyAdd  implements java.io.Serializable {
    private java.lang.String OID;

    private java.lang.String owner;

    private int index;  // attribute

    public ResetProvisioningRoleOwnersOwnersTabPolicyAdd() {
    }

    public ResetProvisioningRoleOwnersOwnersTabPolicyAdd(
           java.lang.String OID,
           java.lang.String owner,
           int index) {
           this.OID = OID;
           this.owner = owner;
           this.index = index;
    }


    /**
     * Gets the OID value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the owner value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the index value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ResetProvisioningRoleOwnersOwnersTabPolicyAdd.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetProvisioningRoleOwnersOwnersTabPolicyAdd)) return false;
        ResetProvisioningRoleOwnersOwnersTabPolicyAdd other = (ResetProvisioningRoleOwnersOwnersTabPolicyAdd) obj;
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
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
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
        if (getOID() != null) {
            _hashCode += getOID().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetProvisioningRoleOwnersOwnersTabPolicyAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>Policy>add"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Owner"));
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
