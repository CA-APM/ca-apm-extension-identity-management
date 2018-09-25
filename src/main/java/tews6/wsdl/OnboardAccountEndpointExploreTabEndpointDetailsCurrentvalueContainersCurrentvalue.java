/**
 * OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue  implements java.io.Serializable {
    private java.lang.String container;

    private java.lang.String exploreMethod;

    private int index;  // attribute

    public OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue() {
    }

    public OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue(
           java.lang.String container,
           java.lang.String exploreMethod,
           int index) {
           this.container = container;
           this.exploreMethod = exploreMethod;
           this.index = index;
    }


    /**
     * Gets the container value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @return container
     */
    public java.lang.String getContainer() {
        return container;
    }


    /**
     * Sets the container value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @param container
     */
    public void setContainer(java.lang.String container) {
        this.container = container;
    }


    /**
     * Gets the exploreMethod value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @return exploreMethod
     */
    public java.lang.String getExploreMethod() {
        return exploreMethod;
    }


    /**
     * Sets the exploreMethod value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @param exploreMethod
     */
    public void setExploreMethod(java.lang.String exploreMethod) {
        this.exploreMethod = exploreMethod;
    }


    /**
     * Gets the index value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue)) return false;
        OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue other = (OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            ((this.exploreMethod==null && other.getExploreMethod()==null) || 
             (this.exploreMethod!=null &&
              this.exploreMethod.equals(other.getExploreMethod()))) &&
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
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        if (getExploreMethod() != null) {
            _hashCode += getExploreMethod().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>EndpointDetails>currentvalue>Containers>currentvalue"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Container"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exploreMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ExploreMethod"));
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
