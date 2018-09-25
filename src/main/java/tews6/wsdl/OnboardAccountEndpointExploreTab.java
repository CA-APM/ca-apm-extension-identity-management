/**
 * OnboardAccountEndpointExploreTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccountEndpointExploreTab  implements java.io.Serializable {
    private tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetails endpointDetails;

    private tews6.wsdl.OnboardAccountEndpointExploreTabAccounts accounts;

    private java.lang.String correlate;

    private java.lang.String createGU;

    public OnboardAccountEndpointExploreTab() {
    }

    public OnboardAccountEndpointExploreTab(
           tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetails endpointDetails,
           tews6.wsdl.OnboardAccountEndpointExploreTabAccounts accounts,
           java.lang.String correlate,
           java.lang.String createGU) {
           this.endpointDetails = endpointDetails;
           this.accounts = accounts;
           this.correlate = correlate;
           this.createGU = createGU;
    }


    /**
     * Gets the endpointDetails value for this OnboardAccountEndpointExploreTab.
     * 
     * @return endpointDetails
     */
    public tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetails getEndpointDetails() {
        return endpointDetails;
    }


    /**
     * Sets the endpointDetails value for this OnboardAccountEndpointExploreTab.
     * 
     * @param endpointDetails
     */
    public void setEndpointDetails(tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }


    /**
     * Gets the accounts value for this OnboardAccountEndpointExploreTab.
     * 
     * @return accounts
     */
    public tews6.wsdl.OnboardAccountEndpointExploreTabAccounts getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this OnboardAccountEndpointExploreTab.
     * 
     * @param accounts
     */
    public void setAccounts(tews6.wsdl.OnboardAccountEndpointExploreTabAccounts accounts) {
        this.accounts = accounts;
    }


    /**
     * Gets the correlate value for this OnboardAccountEndpointExploreTab.
     * 
     * @return correlate
     */
    public java.lang.String getCorrelate() {
        return correlate;
    }


    /**
     * Sets the correlate value for this OnboardAccountEndpointExploreTab.
     * 
     * @param correlate
     */
    public void setCorrelate(java.lang.String correlate) {
        this.correlate = correlate;
    }


    /**
     * Gets the createGU value for this OnboardAccountEndpointExploreTab.
     * 
     * @return createGU
     */
    public java.lang.String getCreateGU() {
        return createGU;
    }


    /**
     * Sets the createGU value for this OnboardAccountEndpointExploreTab.
     * 
     * @param createGU
     */
    public void setCreateGU(java.lang.String createGU) {
        this.createGU = createGU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccountEndpointExploreTab)) return false;
        OnboardAccountEndpointExploreTab other = (OnboardAccountEndpointExploreTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endpointDetails==null && other.getEndpointDetails()==null) || 
             (this.endpointDetails!=null &&
              this.endpointDetails.equals(other.getEndpointDetails()))) &&
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              this.accounts.equals(other.getAccounts()))) &&
            ((this.correlate==null && other.getCorrelate()==null) || 
             (this.correlate!=null &&
              this.correlate.equals(other.getCorrelate()))) &&
            ((this.createGU==null && other.getCreateGU()==null) || 
             (this.createGU!=null &&
              this.createGU.equals(other.getCreateGU())));
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
        if (getEndpointDetails() != null) {
            _hashCode += getEndpointDetails().hashCode();
        }
        if (getAccounts() != null) {
            _hashCode += getAccounts().hashCode();
        }
        if (getCorrelate() != null) {
            _hashCode += getCorrelate().hashCode();
        }
        if (getCreateGU() != null) {
            _hashCode += getCreateGU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccountEndpointExploreTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccountEndpointExploreTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpointDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "EndpointDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccountEndpointExploreTab>EndpointDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccountEndpointExploreTab>Accounts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Correlate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createGU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateGU"));
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
