/**
 * ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd  implements java.io.Serializable {
    private java.lang.String UID;

    private java.lang.String uniqueName;

    private int index;  // attribute

    public ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd() {
    }

    public ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd(
           java.lang.String UID,
           java.lang.String uniqueName,
           int index) {
           this.UID = UID;
           this.uniqueName = uniqueName;
           this.index = index;
    }


    /**
     * Gets the UID value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the uniqueName value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the index value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd)) return false;
        ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd other = (ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
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
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>RoleOwners>add"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UID"));
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
