/**
 * CreateOwnerPoliciesForProvisioningRolesQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateOwnerPoliciesForProvisioningRolesQuery  implements java.io.Serializable {
    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch createOwnerPoliciesForProvisioningRolesSearch;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab;

    public CreateOwnerPoliciesForProvisioningRolesQuery() {
    }

    public CreateOwnerPoliciesForProvisioningRolesQuery(
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch createOwnerPoliciesForProvisioningRolesSearch,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab) {
           this.createOwnerPoliciesForProvisioningRolesSearch = createOwnerPoliciesForProvisioningRolesSearch;
           this.createOwnerPoliciesForProvisioningRolesOwnersTab = createOwnerPoliciesForProvisioningRolesOwnersTab;
    }


    /**
     * Gets the createOwnerPoliciesForProvisioningRolesSearch value for this CreateOwnerPoliciesForProvisioningRolesQuery.
     * 
     * @return createOwnerPoliciesForProvisioningRolesSearch
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch getCreateOwnerPoliciesForProvisioningRolesSearch() {
        return createOwnerPoliciesForProvisioningRolesSearch;
    }


    /**
     * Sets the createOwnerPoliciesForProvisioningRolesSearch value for this CreateOwnerPoliciesForProvisioningRolesQuery.
     * 
     * @param createOwnerPoliciesForProvisioningRolesSearch
     */
    public void setCreateOwnerPoliciesForProvisioningRolesSearch(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch createOwnerPoliciesForProvisioningRolesSearch) {
        this.createOwnerPoliciesForProvisioningRolesSearch = createOwnerPoliciesForProvisioningRolesSearch;
    }


    /**
     * Gets the createOwnerPoliciesForProvisioningRolesOwnersTab value for this CreateOwnerPoliciesForProvisioningRolesQuery.
     * 
     * @return createOwnerPoliciesForProvisioningRolesOwnersTab
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab getCreateOwnerPoliciesForProvisioningRolesOwnersTab() {
        return createOwnerPoliciesForProvisioningRolesOwnersTab;
    }


    /**
     * Sets the createOwnerPoliciesForProvisioningRolesOwnersTab value for this CreateOwnerPoliciesForProvisioningRolesQuery.
     * 
     * @param createOwnerPoliciesForProvisioningRolesOwnersTab
     */
    public void setCreateOwnerPoliciesForProvisioningRolesOwnersTab(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab createOwnerPoliciesForProvisioningRolesOwnersTab) {
        this.createOwnerPoliciesForProvisioningRolesOwnersTab = createOwnerPoliciesForProvisioningRolesOwnersTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOwnerPoliciesForProvisioningRolesQuery)) return false;
        CreateOwnerPoliciesForProvisioningRolesQuery other = (CreateOwnerPoliciesForProvisioningRolesQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createOwnerPoliciesForProvisioningRolesSearch==null && other.getCreateOwnerPoliciesForProvisioningRolesSearch()==null) || 
             (this.createOwnerPoliciesForProvisioningRolesSearch!=null &&
              this.createOwnerPoliciesForProvisioningRolesSearch.equals(other.getCreateOwnerPoliciesForProvisioningRolesSearch()))) &&
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
        if (getCreateOwnerPoliciesForProvisioningRolesSearch() != null) {
            _hashCode += getCreateOwnerPoliciesForProvisioningRolesSearch().hashCode();
        }
        if (getCreateOwnerPoliciesForProvisioningRolesOwnersTab() != null) {
            _hashCode += getCreateOwnerPoliciesForProvisioningRolesOwnersTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOwnerPoliciesForProvisioningRolesQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createOwnerPoliciesForProvisioningRolesSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesSearch"));
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
