/**
 * ForgottenPassword.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ForgottenPassword  implements java.io.Serializable {
    private tews6.wsdl.ForgottenPasswordSearch forgottenPasswordSearch;

    private tews6.wsdl.ForgottenPasswordForgottenPasswordTab forgottenPasswordForgottenPasswordTab;

    public ForgottenPassword() {
    }

    public ForgottenPassword(
           tews6.wsdl.ForgottenPasswordSearch forgottenPasswordSearch,
           tews6.wsdl.ForgottenPasswordForgottenPasswordTab forgottenPasswordForgottenPasswordTab) {
           this.forgottenPasswordSearch = forgottenPasswordSearch;
           this.forgottenPasswordForgottenPasswordTab = forgottenPasswordForgottenPasswordTab;
    }


    /**
     * Gets the forgottenPasswordSearch value for this ForgottenPassword.
     * 
     * @return forgottenPasswordSearch
     */
    public tews6.wsdl.ForgottenPasswordSearch getForgottenPasswordSearch() {
        return forgottenPasswordSearch;
    }


    /**
     * Sets the forgottenPasswordSearch value for this ForgottenPassword.
     * 
     * @param forgottenPasswordSearch
     */
    public void setForgottenPasswordSearch(tews6.wsdl.ForgottenPasswordSearch forgottenPasswordSearch) {
        this.forgottenPasswordSearch = forgottenPasswordSearch;
    }


    /**
     * Gets the forgottenPasswordForgottenPasswordTab value for this ForgottenPassword.
     * 
     * @return forgottenPasswordForgottenPasswordTab
     */
    public tews6.wsdl.ForgottenPasswordForgottenPasswordTab getForgottenPasswordForgottenPasswordTab() {
        return forgottenPasswordForgottenPasswordTab;
    }


    /**
     * Sets the forgottenPasswordForgottenPasswordTab value for this ForgottenPassword.
     * 
     * @param forgottenPasswordForgottenPasswordTab
     */
    public void setForgottenPasswordForgottenPasswordTab(tews6.wsdl.ForgottenPasswordForgottenPasswordTab forgottenPasswordForgottenPasswordTab) {
        this.forgottenPasswordForgottenPasswordTab = forgottenPasswordForgottenPasswordTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForgottenPassword)) return false;
        ForgottenPassword other = (ForgottenPassword) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forgottenPasswordSearch==null && other.getForgottenPasswordSearch()==null) || 
             (this.forgottenPasswordSearch!=null &&
              this.forgottenPasswordSearch.equals(other.getForgottenPasswordSearch()))) &&
            ((this.forgottenPasswordForgottenPasswordTab==null && other.getForgottenPasswordForgottenPasswordTab()==null) || 
             (this.forgottenPasswordForgottenPasswordTab!=null &&
              this.forgottenPasswordForgottenPasswordTab.equals(other.getForgottenPasswordForgottenPasswordTab())));
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
        if (getForgottenPasswordSearch() != null) {
            _hashCode += getForgottenPasswordSearch().hashCode();
        }
        if (getForgottenPasswordForgottenPasswordTab() != null) {
            _hashCode += getForgottenPasswordForgottenPasswordTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForgottenPassword.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPassword"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgottenPasswordSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgottenPasswordForgottenPasswordTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordForgottenPasswordTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordForgottenPasswordTab"));
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
