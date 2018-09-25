/**
 * PORTALObjectsFeederFeederActionsMappingTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PORTALObjectsFeederFeederActionsMappingTab  implements java.io.Serializable {
    private java.lang.String primaryObject;

    private java.lang.String action2TaskMapAsString;

    public PORTALObjectsFeederFeederActionsMappingTab() {
    }

    public PORTALObjectsFeederFeederActionsMappingTab(
           java.lang.String primaryObject,
           java.lang.String action2TaskMapAsString) {
           this.primaryObject = primaryObject;
           this.action2TaskMapAsString = action2TaskMapAsString;
    }


    /**
     * Gets the primaryObject value for this PORTALObjectsFeederFeederActionsMappingTab.
     * 
     * @return primaryObject
     */
    public java.lang.String getPrimaryObject() {
        return primaryObject;
    }


    /**
     * Sets the primaryObject value for this PORTALObjectsFeederFeederActionsMappingTab.
     * 
     * @param primaryObject
     */
    public void setPrimaryObject(java.lang.String primaryObject) {
        this.primaryObject = primaryObject;
    }


    /**
     * Gets the action2TaskMapAsString value for this PORTALObjectsFeederFeederActionsMappingTab.
     * 
     * @return action2TaskMapAsString
     */
    public java.lang.String getAction2TaskMapAsString() {
        return action2TaskMapAsString;
    }


    /**
     * Sets the action2TaskMapAsString value for this PORTALObjectsFeederFeederActionsMappingTab.
     * 
     * @param action2TaskMapAsString
     */
    public void setAction2TaskMapAsString(java.lang.String action2TaskMapAsString) {
        this.action2TaskMapAsString = action2TaskMapAsString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PORTALObjectsFeederFeederActionsMappingTab)) return false;
        PORTALObjectsFeederFeederActionsMappingTab other = (PORTALObjectsFeederFeederActionsMappingTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryObject==null && other.getPrimaryObject()==null) || 
             (this.primaryObject!=null &&
              this.primaryObject.equals(other.getPrimaryObject()))) &&
            ((this.action2TaskMapAsString==null && other.getAction2TaskMapAsString()==null) || 
             (this.action2TaskMapAsString!=null &&
              this.action2TaskMapAsString.equals(other.getAction2TaskMapAsString())));
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
        if (getPrimaryObject() != null) {
            _hashCode += getPrimaryObject().hashCode();
        }
        if (getAction2TaskMapAsString() != null) {
            _hashCode += getAction2TaskMapAsString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PORTALObjectsFeederFeederActionsMappingTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederFeederActionsMappingTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "PrimaryObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action2TaskMapAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Action2TaskMapAsString"));
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
