/**
 * ResetProvisioningRoleOwners.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetProvisioningRoleOwners  implements java.io.Serializable {
    private tews6.wsdl.ResetProvisioningRoleOwnersSearch resetProvisioningRoleOwnersSearch;

    private tews6.wsdl.ResetProvisioningRoleOwnersOwnersTab resetProvisioningRoleOwnersOwnersTab;

    public ResetProvisioningRoleOwners() {
    }

    public ResetProvisioningRoleOwners(
           tews6.wsdl.ResetProvisioningRoleOwnersSearch resetProvisioningRoleOwnersSearch,
           tews6.wsdl.ResetProvisioningRoleOwnersOwnersTab resetProvisioningRoleOwnersOwnersTab) {
           this.resetProvisioningRoleOwnersSearch = resetProvisioningRoleOwnersSearch;
           this.resetProvisioningRoleOwnersOwnersTab = resetProvisioningRoleOwnersOwnersTab;
    }


    /**
     * Gets the resetProvisioningRoleOwnersSearch value for this ResetProvisioningRoleOwners.
     * 
     * @return resetProvisioningRoleOwnersSearch
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearch getResetProvisioningRoleOwnersSearch() {
        return resetProvisioningRoleOwnersSearch;
    }


    /**
     * Sets the resetProvisioningRoleOwnersSearch value for this ResetProvisioningRoleOwners.
     * 
     * @param resetProvisioningRoleOwnersSearch
     */
    public void setResetProvisioningRoleOwnersSearch(tews6.wsdl.ResetProvisioningRoleOwnersSearch resetProvisioningRoleOwnersSearch) {
        this.resetProvisioningRoleOwnersSearch = resetProvisioningRoleOwnersSearch;
    }


    /**
     * Gets the resetProvisioningRoleOwnersOwnersTab value for this ResetProvisioningRoleOwners.
     * 
     * @return resetProvisioningRoleOwnersOwnersTab
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersOwnersTab getResetProvisioningRoleOwnersOwnersTab() {
        return resetProvisioningRoleOwnersOwnersTab;
    }


    /**
     * Sets the resetProvisioningRoleOwnersOwnersTab value for this ResetProvisioningRoleOwners.
     * 
     * @param resetProvisioningRoleOwnersOwnersTab
     */
    public void setResetProvisioningRoleOwnersOwnersTab(tews6.wsdl.ResetProvisioningRoleOwnersOwnersTab resetProvisioningRoleOwnersOwnersTab) {
        this.resetProvisioningRoleOwnersOwnersTab = resetProvisioningRoleOwnersOwnersTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetProvisioningRoleOwners)) return false;
        ResetProvisioningRoleOwners other = (ResetProvisioningRoleOwners) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resetProvisioningRoleOwnersSearch==null && other.getResetProvisioningRoleOwnersSearch()==null) || 
             (this.resetProvisioningRoleOwnersSearch!=null &&
              this.resetProvisioningRoleOwnersSearch.equals(other.getResetProvisioningRoleOwnersSearch()))) &&
            ((this.resetProvisioningRoleOwnersOwnersTab==null && other.getResetProvisioningRoleOwnersOwnersTab()==null) || 
             (this.resetProvisioningRoleOwnersOwnersTab!=null &&
              this.resetProvisioningRoleOwnersOwnersTab.equals(other.getResetProvisioningRoleOwnersOwnersTab())));
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
        if (getResetProvisioningRoleOwnersSearch() != null) {
            _hashCode += getResetProvisioningRoleOwnersSearch().hashCode();
        }
        if (getResetProvisioningRoleOwnersOwnersTab() != null) {
            _hashCode += getResetProvisioningRoleOwnersOwnersTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetProvisioningRoleOwners.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwners"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetProvisioningRoleOwnersSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetProvisioningRoleOwnersOwnersTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersOwnersTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersOwnersTab"));
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
