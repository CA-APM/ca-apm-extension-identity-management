/**
 * OnboardAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccount  implements java.io.Serializable {
    private tews6.wsdl.OnboardAccountEndpointExploreTab onboardAccountEndpointExploreTab;

    public OnboardAccount() {
    }

    public OnboardAccount(
           tews6.wsdl.OnboardAccountEndpointExploreTab onboardAccountEndpointExploreTab) {
           this.onboardAccountEndpointExploreTab = onboardAccountEndpointExploreTab;
    }


    /**
     * Gets the onboardAccountEndpointExploreTab value for this OnboardAccount.
     * 
     * @return onboardAccountEndpointExploreTab
     */
    public tews6.wsdl.OnboardAccountEndpointExploreTab getOnboardAccountEndpointExploreTab() {
        return onboardAccountEndpointExploreTab;
    }


    /**
     * Sets the onboardAccountEndpointExploreTab value for this OnboardAccount.
     * 
     * @param onboardAccountEndpointExploreTab
     */
    public void setOnboardAccountEndpointExploreTab(tews6.wsdl.OnboardAccountEndpointExploreTab onboardAccountEndpointExploreTab) {
        this.onboardAccountEndpointExploreTab = onboardAccountEndpointExploreTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccount)) return false;
        OnboardAccount other = (OnboardAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onboardAccountEndpointExploreTab==null && other.getOnboardAccountEndpointExploreTab()==null) || 
             (this.onboardAccountEndpointExploreTab!=null &&
              this.onboardAccountEndpointExploreTab.equals(other.getOnboardAccountEndpointExploreTab())));
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
        if (getOnboardAccountEndpointExploreTab() != null) {
            _hashCode += getOnboardAccountEndpointExploreTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onboardAccountEndpointExploreTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OnboardAccountEndpointExploreTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccountEndpointExploreTab"));
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
