/**
 * CreateOwnerPoliciesForProvisioningRolesQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateOwnerPoliciesForProvisioningRolesQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab;

    public CreateOwnerPoliciesForProvisioningRolesQueryResult() {
    }

    public CreateOwnerPoliciesForProvisioningRolesQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab) {
           this.imsStatus = imsStatus;
           this.createOwnerPoliciesForProvisioningRolesOwnersTab = createOwnerPoliciesForProvisioningRolesOwnersTab;
    }


    /**
     * Gets the imsStatus value for this CreateOwnerPoliciesForProvisioningRolesQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this CreateOwnerPoliciesForProvisioningRolesQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the createOwnerPoliciesForProvisioningRolesOwnersTab value for this CreateOwnerPoliciesForProvisioningRolesQueryResult.
     * 
     * @return createOwnerPoliciesForProvisioningRolesOwnersTab
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab getCreateOwnerPoliciesForProvisioningRolesOwnersTab() {
        return createOwnerPoliciesForProvisioningRolesOwnersTab;
    }


    /**
     * Sets the createOwnerPoliciesForProvisioningRolesOwnersTab value for this CreateOwnerPoliciesForProvisioningRolesQueryResult.
     * 
     * @param createOwnerPoliciesForProvisioningRolesOwnersTab
     */
    public void setCreateOwnerPoliciesForProvisioningRolesOwnersTab(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab) {
        this.createOwnerPoliciesForProvisioningRolesOwnersTab = createOwnerPoliciesForProvisioningRolesOwnersTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOwnerPoliciesForProvisioningRolesQueryResult)) return false;
        CreateOwnerPoliciesForProvisioningRolesQueryResult other = (CreateOwnerPoliciesForProvisioningRolesQueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imsStatus==null && other.getImsStatus()==null) || 
             (this.imsStatus!=null &&
              this.imsStatus.equals(other.getImsStatus()))) &&
            ((this.createOwnerPoliciesForProvisioningRolesOwnersTab==null && other.getCreateOwnerPoliciesForProvisioningRolesOwnersTab()==null) || 
             (this.createOwnerPoliciesForProvisioningRolesOwnersTab!=null &&
              this.createOwnerPoliciesForProvisioningRolesOwnersTab.equals(other.getCreateOwnerPoliciesForProvisioningRolesOwnersTab())));
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
        if (getImsStatus() != null) {
            _hashCode += getImsStatus().hashCode();
        }
        if (getCreateOwnerPoliciesForProvisioningRolesOwnersTab() != null) {
            _hashCode += getCreateOwnerPoliciesForProvisioningRolesOwnersTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOwnerPoliciesForProvisioningRolesQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createOwnerPoliciesForProvisioningRolesOwnersTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesOwnersTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesOwnersTab"));
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
