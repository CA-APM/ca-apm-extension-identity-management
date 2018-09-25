/**
 * ViewUserGroupsTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserGroupsTab  implements java.io.Serializable {
    private tews6.wsdl.ViewUserGroupsTabUserMemberGroups userMemberGroups;

    private tews6.wsdl.ViewUserGroupsTabUserAdminGroups userAdminGroups;

    public ViewUserGroupsTab() {
    }

    public ViewUserGroupsTab(
           tews6.wsdl.ViewUserGroupsTabUserMemberGroups userMemberGroups,
           tews6.wsdl.ViewUserGroupsTabUserAdminGroups userAdminGroups) {
           this.userMemberGroups = userMemberGroups;
           this.userAdminGroups = userAdminGroups;
    }


    /**
     * Gets the userMemberGroups value for this ViewUserGroupsTab.
     * 
     * @return userMemberGroups
     */
    public tews6.wsdl.ViewUserGroupsTabUserMemberGroups getUserMemberGroups() {
        return userMemberGroups;
    }


    /**
     * Sets the userMemberGroups value for this ViewUserGroupsTab.
     * 
     * @param userMemberGroups
     */
    public void setUserMemberGroups(tews6.wsdl.ViewUserGroupsTabUserMemberGroups userMemberGroups) {
        this.userMemberGroups = userMemberGroups;
    }


    /**
     * Gets the userAdminGroups value for this ViewUserGroupsTab.
     * 
     * @return userAdminGroups
     */
    public tews6.wsdl.ViewUserGroupsTabUserAdminGroups getUserAdminGroups() {
        return userAdminGroups;
    }


    /**
     * Sets the userAdminGroups value for this ViewUserGroupsTab.
     * 
     * @param userAdminGroups
     */
    public void setUserAdminGroups(tews6.wsdl.ViewUserGroupsTabUserAdminGroups userAdminGroups) {
        this.userAdminGroups = userAdminGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserGroupsTab)) return false;
        ViewUserGroupsTab other = (ViewUserGroupsTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userMemberGroups==null && other.getUserMemberGroups()==null) || 
             (this.userMemberGroups!=null &&
              this.userMemberGroups.equals(other.getUserMemberGroups()))) &&
            ((this.userAdminGroups==null && other.getUserAdminGroups()==null) || 
             (this.userAdminGroups!=null &&
              this.userAdminGroups.equals(other.getUserAdminGroups())));
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
        if (getUserMemberGroups() != null) {
            _hashCode += getUserMemberGroups().hashCode();
        }
        if (getUserAdminGroups() != null) {
            _hashCode += getUserAdminGroups().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUserGroupsTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserGroupsTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMemberGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserMemberGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserGroupsTab>UserMemberGroups"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAdminGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserAdminGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserGroupsTab>UserAdminGroups"));
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
