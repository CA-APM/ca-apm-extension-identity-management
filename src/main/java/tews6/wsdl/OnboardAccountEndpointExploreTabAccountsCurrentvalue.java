/**
 * OnboardAccountEndpointExploreTabAccountsCurrentvalue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccountEndpointExploreTabAccountsCurrentvalue  implements java.io.Serializable {
    private tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilter filter;

    private int index;  // attribute

    public OnboardAccountEndpointExploreTabAccountsCurrentvalue() {
    }

    public OnboardAccountEndpointExploreTabAccountsCurrentvalue(
           tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilter filter,
           int index) {
           this.filter = filter;
           this.index = index;
    }


    /**
     * Gets the filter value for this OnboardAccountEndpointExploreTabAccountsCurrentvalue.
     * 
     * @return filter
     */
    public tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this OnboardAccountEndpointExploreTabAccountsCurrentvalue.
     * 
     * @param filter
     */
    public void setFilter(tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the index value for this OnboardAccountEndpointExploreTabAccountsCurrentvalue.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this OnboardAccountEndpointExploreTabAccountsCurrentvalue.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccountEndpointExploreTabAccountsCurrentvalue)) return false;
        OnboardAccountEndpointExploreTabAccountsCurrentvalue other = (OnboardAccountEndpointExploreTabAccountsCurrentvalue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            this.index == other.getIndex();
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
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccountEndpointExploreTabAccountsCurrentvalue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>Accounts>currentvalue"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>Accounts>currentvalue>Filter"));
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
