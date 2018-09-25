/**
 * OnboardAccountEndpointExploreTabEndpointDetailsAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccountEndpointExploreTabEndpointDetailsAdd  implements java.io.Serializable {
    private java.lang.String endpointType;

    private java.lang.String endpointName;

    private tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainers containers;

    private int index;  // attribute

    public OnboardAccountEndpointExploreTabEndpointDetailsAdd() {
    }

    public OnboardAccountEndpointExploreTabEndpointDetailsAdd(
           java.lang.String endpointType,
           java.lang.String endpointName,
           tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainers containers,
           int index) {
           this.endpointType = endpointType;
           this.endpointName = endpointName;
           this.containers = containers;
           this.index = index;
    }


    /**
     * Gets the endpointType value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @return endpointType
     */
    public java.lang.String getEndpointType() {
        return endpointType;
    }


    /**
     * Sets the endpointType value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @param endpointType
     */
    public void setEndpointType(java.lang.String endpointType) {
        this.endpointType = endpointType;
    }


    /**
     * Gets the endpointName value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @return endpointName
     */
    public java.lang.String getEndpointName() {
        return endpointName;
    }


    /**
     * Sets the endpointName value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @param endpointName
     */
    public void setEndpointName(java.lang.String endpointName) {
        this.endpointName = endpointName;
    }


    /**
     * Gets the containers value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @return containers
     */
    public tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainers getContainers() {
        return containers;
    }


    /**
     * Sets the containers value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @param containers
     */
    public void setContainers(tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainers containers) {
        this.containers = containers;
    }


    /**
     * Gets the index value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this OnboardAccountEndpointExploreTabEndpointDetailsAdd.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccountEndpointExploreTabEndpointDetailsAdd)) return false;
        OnboardAccountEndpointExploreTabEndpointDetailsAdd other = (OnboardAccountEndpointExploreTabEndpointDetailsAdd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endpointType==null && other.getEndpointType()==null) || 
             (this.endpointType!=null &&
              this.endpointType.equals(other.getEndpointType()))) &&
            ((this.endpointName==null && other.getEndpointName()==null) || 
             (this.endpointName!=null &&
              this.endpointName.equals(other.getEndpointName()))) &&
            ((this.containers==null && other.getContainers()==null) || 
             (this.containers!=null &&
              this.containers.equals(other.getContainers()))) &&
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
        if (getEndpointType() != null) {
            _hashCode += getEndpointType().hashCode();
        }
        if (getEndpointName() != null) {
            _hashCode += getEndpointName().hashCode();
        }
        if (getContainers() != null) {
            _hashCode += getContainers().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccountEndpointExploreTabEndpointDetailsAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>EndpointDetails>add"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpointType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "EndpointType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpointName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "EndpointName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Containers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>EndpointDetails>add>Containers"));
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
