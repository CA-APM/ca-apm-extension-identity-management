/**
 * CreateOwnerPoliciesForProvisioningRolesOwnersTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateOwnerPoliciesForProvisioningRolesOwnersTab  implements java.io.Serializable {
    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicy policy;

    public CreateOwnerPoliciesForProvisioningRolesOwnersTab() {
    }

    public CreateOwnerPoliciesForProvisioningRolesOwnersTab(
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicy policy) {
           this.policy = policy;
    }


    /**
     * Gets the policy value for this CreateOwnerPoliciesForProvisioningRolesOwnersTab.
     * 
     * @return policy
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this CreateOwnerPoliciesForProvisioningRolesOwnersTab.
     * 
     * @param policy
     */
    public void setPolicy(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicy policy) {
        this.policy = policy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOwnerPoliciesForProvisioningRolesOwnersTab)) return false;
        CreateOwnerPoliciesForProvisioningRolesOwnersTab other = (CreateOwnerPoliciesForProvisioningRolesOwnersTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOwnerPoliciesForProvisioningRolesOwnersTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesOwnersTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesOwnersTab>Policy"));
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
