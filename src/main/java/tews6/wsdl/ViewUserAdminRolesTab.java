/**
 * ViewUserAdminRolesTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserAdminRolesTab  implements java.io.Serializable {
    private tews6.wsdl.ViewUserAdminRolesTabResults results;

    private tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles[] userAdminAdminRoles;

    private tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles[] userMemberAdminRoles;

    public ViewUserAdminRolesTab() {
    }

    public ViewUserAdminRolesTab(
           tews6.wsdl.ViewUserAdminRolesTabResults results,
           tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles[] userAdminAdminRoles,
           tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles[] userMemberAdminRoles) {
           this.results = results;
           this.userAdminAdminRoles = userAdminAdminRoles;
           this.userMemberAdminRoles = userMemberAdminRoles;
    }


    /**
     * Gets the results value for this ViewUserAdminRolesTab.
     * 
     * @return results
     */
    public tews6.wsdl.ViewUserAdminRolesTabResults getResults() {
        return results;
    }


    /**
     * Sets the results value for this ViewUserAdminRolesTab.
     * 
     * @param results
     */
    public void setResults(tews6.wsdl.ViewUserAdminRolesTabResults results) {
        this.results = results;
    }


    /**
     * Gets the userAdminAdminRoles value for this ViewUserAdminRolesTab.
     * 
     * @return userAdminAdminRoles
     */
    public tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles[] getUserAdminAdminRoles() {
        return userAdminAdminRoles;
    }


    /**
     * Sets the userAdminAdminRoles value for this ViewUserAdminRolesTab.
     * 
     * @param userAdminAdminRoles
     */
    public void setUserAdminAdminRoles(tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles[] userAdminAdminRoles) {
        this.userAdminAdminRoles = userAdminAdminRoles;
    }

    public tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles getUserAdminAdminRoles(int i) {
        return this.userAdminAdminRoles[i];
    }

    public void setUserAdminAdminRoles(int i, tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles _value) {
        this.userAdminAdminRoles[i] = _value;
    }


    /**
     * Gets the userMemberAdminRoles value for this ViewUserAdminRolesTab.
     * 
     * @return userMemberAdminRoles
     */
    public tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles[] getUserMemberAdminRoles() {
        return userMemberAdminRoles;
    }


    /**
     * Sets the userMemberAdminRoles value for this ViewUserAdminRolesTab.
     * 
     * @param userMemberAdminRoles
     */
    public void setUserMemberAdminRoles(tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles[] userMemberAdminRoles) {
        this.userMemberAdminRoles = userMemberAdminRoles;
    }

    public tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles getUserMemberAdminRoles(int i) {
        return this.userMemberAdminRoles[i];
    }

    public void setUserMemberAdminRoles(int i, tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles _value) {
        this.userMemberAdminRoles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserAdminRolesTab)) return false;
        ViewUserAdminRolesTab other = (ViewUserAdminRolesTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              this.results.equals(other.getResults()))) &&
            ((this.userAdminAdminRoles==null && other.getUserAdminAdminRoles()==null) || 
             (this.userAdminAdminRoles!=null &&
              java.util.Arrays.equals(this.userAdminAdminRoles, other.getUserAdminAdminRoles()))) &&
            ((this.userMemberAdminRoles==null && other.getUserMemberAdminRoles()==null) || 
             (this.userMemberAdminRoles!=null &&
              java.util.Arrays.equals(this.userMemberAdminRoles, other.getUserMemberAdminRoles())));
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
        if (getResults() != null) {
            _hashCode += getResults().hashCode();
        }
        if (getUserAdminAdminRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAdminAdminRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAdminAdminRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserMemberAdminRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserMemberAdminRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserMemberAdminRoles(), i);
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
        new org.apache.axis.description.TypeDesc(ViewUserAdminRolesTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserAdminRolesTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>Results"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAdminAdminRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserAdminAdminRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>UserAdminAdminRoles"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMemberAdminRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UserMemberAdminRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>UserMemberAdminRoles"));
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
