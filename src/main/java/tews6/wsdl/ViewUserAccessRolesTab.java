/**
 * ViewUserAccessRolesTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserAccessRolesTab  implements java.io.Serializable {
    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles[] userAdminAccessRoles;

    private tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles[] userMemberAccessRoles;

    public ViewUserAccessRolesTab() {
    }

    public ViewUserAccessRolesTab(
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles[] userAdminAccessRoles,
           tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles[] userMemberAccessRoles) {
           this.userAdminAccessRoles = userAdminAccessRoles;
           this.userMemberAccessRoles = userMemberAccessRoles;
    }


    /**
     * Gets the userAdminAccessRoles value for this ViewUserAccessRolesTab.
     * 
     * @return userAdminAccessRoles
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles[] getUserAdminAccessRoles() {
        return userAdminAccessRoles;
    }


    /**
     * Sets the userAdminAccessRoles value for this ViewUserAccessRolesTab.
     * 
     * @param userAdminAccessRoles
     */
    public void setUserAdminAccessRoles(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles[] userAdminAccessRoles) {
        this.userAdminAccessRoles = userAdminAccessRoles;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles getUserAdminAccessRoles(int i) {
        return this.userAdminAccessRoles[i];
    }

    public void setUserAdminAccessRoles(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles _value) {
        this.userAdminAccessRoles[i] = _value;
    }


    /**
     * Gets the userMemberAccessRoles value for this ViewUserAccessRolesTab.
     * 
     * @return userMemberAccessRoles
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles[] getUserMemberAccessRoles() {
        return userMemberAccessRoles;
    }


    /**
     * Sets the userMemberAccessRoles value for this ViewUserAccessRolesTab.
     * 
     * @param userMemberAccessRoles
     */
    public void setUserMemberAccessRoles(tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles[] userMemberAccessRoles) {
        this.userMemberAccessRoles = userMemberAccessRoles;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles getUserMemberAccessRoles(int i) {
        return this.userMemberAccessRoles[i];
    }

    public void setUserMemberAccessRoles(int i, tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles _value) {
        this.userMemberAccessRoles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserAccessRolesTab)) return false;
        ViewUserAccessRolesTab other = (ViewUserAccessRolesTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userAdminAccessRoles==null && other.getUserAdminAccessRoles()==null) || 
             (this.userAdminAccessRoles!=null &&
              java.util.Arrays.equals(this.userAdminAccessRoles, other.getUserAdminAccessRoles()))) &&
            ((this.userMemberAccessRoles==null && other.getUserMemberAccessRoles()==null) || 
             (this.userMemberAccessRoles!=null &&
              java.util.Arrays.equals(this.userMemberAccessRoles, other.getUserMemberAccessRoles())));
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
        if (getUserAdminAccessRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAdminAccessRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAdminAccessRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserMemberAccessRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserMemberAccessRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserMemberAccessRoles(), i);
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
        new org.apache.axis.description.TypeDesc(ViewUserAccessRolesTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserAccessRolesTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAdminAccessRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserAdminAccessRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAccessRolesTab>UserAdminAccessRoles"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMemberAccessRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserMemberAccessRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAccessRolesTab>UserMemberAccessRoles"));
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
