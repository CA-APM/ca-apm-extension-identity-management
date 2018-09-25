/**
 * ViewUserProvisioningRolesTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserProvisioningRolesTab  implements java.io.Serializable {
    private tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRoles userAdminProvisioningRoles;

    private tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRoles userMemberProvisioningRoles;

    public ViewUserProvisioningRolesTab() {
    }

    public ViewUserProvisioningRolesTab(
           tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRoles userAdminProvisioningRoles,
           tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRoles userMemberProvisioningRoles) {
           this.userAdminProvisioningRoles = userAdminProvisioningRoles;
           this.userMemberProvisioningRoles = userMemberProvisioningRoles;
    }


    /**
     * Gets the userAdminProvisioningRoles value for this ViewUserProvisioningRolesTab.
     * 
     * @return userAdminProvisioningRoles
     */
    public tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRoles getUserAdminProvisioningRoles() {
        return userAdminProvisioningRoles;
    }


    /**
     * Sets the userAdminProvisioningRoles value for this ViewUserProvisioningRolesTab.
     * 
     * @param userAdminProvisioningRoles
     */
    public void setUserAdminProvisioningRoles(tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRoles userAdminProvisioningRoles) {
        this.userAdminProvisioningRoles = userAdminProvisioningRoles;
    }


    /**
     * Gets the userMemberProvisioningRoles value for this ViewUserProvisioningRolesTab.
     * 
     * @return userMemberProvisioningRoles
     */
    public tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRoles getUserMemberProvisioningRoles() {
        return userMemberProvisioningRoles;
    }


    /**
     * Sets the userMemberProvisioningRoles value for this ViewUserProvisioningRolesTab.
     * 
     * @param userMemberProvisioningRoles
     */
    public void setUserMemberProvisioningRoles(tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRoles userMemberProvisioningRoles) {
        this.userMemberProvisioningRoles = userMemberProvisioningRoles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserProvisioningRolesTab)) return false;
        ViewUserProvisioningRolesTab other = (ViewUserProvisioningRolesTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userAdminProvisioningRoles==null && other.getUserAdminProvisioningRoles()==null) || 
             (this.userAdminProvisioningRoles!=null &&
              this.userAdminProvisioningRoles.equals(other.getUserAdminProvisioningRoles()))) &&
            ((this.userMemberProvisioningRoles==null && other.getUserMemberProvisioningRoles()==null) || 
             (this.userMemberProvisioningRoles!=null &&
              this.userMemberProvisioningRoles.equals(other.getUserMemberProvisioningRoles())));
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
        if (getUserAdminProvisioningRoles() != null) {
            _hashCode += getUserAdminProvisioningRoles().hashCode();
        }
        if (getUserMemberProvisioningRoles() != null) {
            _hashCode += getUserMemberProvisioningRoles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUserProvisioningRolesTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserProvisioningRolesTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAdminProvisioningRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserAdminProvisioningRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMemberProvisioningRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserMemberProvisioningRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles"));
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
