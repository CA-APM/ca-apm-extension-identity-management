/**
 * ObjectsFeeder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ObjectsFeeder  implements java.io.Serializable {
    private tews6.wsdl.ObjectsFeederSearch objectsFeederSearch;

    private tews6.wsdl.ObjectsFeederRecordsDetailsTab objectsFeederRecordsDetailsTab;

    private tews6.wsdl.ObjectsFeederFeederActionsMappingTab objectsFeederFeederActionsMappingTab;

    public ObjectsFeeder() {
    }

    public ObjectsFeeder(
           tews6.wsdl.ObjectsFeederSearch objectsFeederSearch,
           tews6.wsdl.ObjectsFeederRecordsDetailsTab objectsFeederRecordsDetailsTab,
           tews6.wsdl.ObjectsFeederFeederActionsMappingTab objectsFeederFeederActionsMappingTab) {
           this.objectsFeederSearch = objectsFeederSearch;
           this.objectsFeederRecordsDetailsTab = objectsFeederRecordsDetailsTab;
           this.objectsFeederFeederActionsMappingTab = objectsFeederFeederActionsMappingTab;
    }


    /**
     * Gets the objectsFeederSearch value for this ObjectsFeeder.
     * 
     * @return objectsFeederSearch
     */
    public tews6.wsdl.ObjectsFeederSearch getObjectsFeederSearch() {
        return objectsFeederSearch;
    }


    /**
     * Sets the objectsFeederSearch value for this ObjectsFeeder.
     * 
     * @param objectsFeederSearch
     */
    public void setObjectsFeederSearch(tews6.wsdl.ObjectsFeederSearch objectsFeederSearch) {
        this.objectsFeederSearch = objectsFeederSearch;
    }


    /**
     * Gets the objectsFeederRecordsDetailsTab value for this ObjectsFeeder.
     * 
     * @return objectsFeederRecordsDetailsTab
     */
    public tews6.wsdl.ObjectsFeederRecordsDetailsTab getObjectsFeederRecordsDetailsTab() {
        return objectsFeederRecordsDetailsTab;
    }


    /**
     * Sets the objectsFeederRecordsDetailsTab value for this ObjectsFeeder.
     * 
     * @param objectsFeederRecordsDetailsTab
     */
    public void setObjectsFeederRecordsDetailsTab(tews6.wsdl.ObjectsFeederRecordsDetailsTab objectsFeederRecordsDetailsTab) {
        this.objectsFeederRecordsDetailsTab = objectsFeederRecordsDetailsTab;
    }


    /**
     * Gets the objectsFeederFeederActionsMappingTab value for this ObjectsFeeder.
     * 
     * @return objectsFeederFeederActionsMappingTab
     */
    public tews6.wsdl.ObjectsFeederFeederActionsMappingTab getObjectsFeederFeederActionsMappingTab() {
        return objectsFeederFeederActionsMappingTab;
    }


    /**
     * Sets the objectsFeederFeederActionsMappingTab value for this ObjectsFeeder.
     * 
     * @param objectsFeederFeederActionsMappingTab
     */
    public void setObjectsFeederFeederActionsMappingTab(tews6.wsdl.ObjectsFeederFeederActionsMappingTab objectsFeederFeederActionsMappingTab) {
        this.objectsFeederFeederActionsMappingTab = objectsFeederFeederActionsMappingTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectsFeeder)) return false;
        ObjectsFeeder other = (ObjectsFeeder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectsFeederSearch==null && other.getObjectsFeederSearch()==null) || 
             (this.objectsFeederSearch!=null &&
              this.objectsFeederSearch.equals(other.getObjectsFeederSearch()))) &&
            ((this.objectsFeederRecordsDetailsTab==null && other.getObjectsFeederRecordsDetailsTab()==null) || 
             (this.objectsFeederRecordsDetailsTab!=null &&
              this.objectsFeederRecordsDetailsTab.equals(other.getObjectsFeederRecordsDetailsTab()))) &&
            ((this.objectsFeederFeederActionsMappingTab==null && other.getObjectsFeederFeederActionsMappingTab()==null) || 
             (this.objectsFeederFeederActionsMappingTab!=null &&
              this.objectsFeederFeederActionsMappingTab.equals(other.getObjectsFeederFeederActionsMappingTab())));
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
        if (getObjectsFeederSearch() != null) {
            _hashCode += getObjectsFeederSearch().hashCode();
        }
        if (getObjectsFeederRecordsDetailsTab() != null) {
            _hashCode += getObjectsFeederRecordsDetailsTab().hashCode();
        }
        if (getObjectsFeederFeederActionsMappingTab() != null) {
            _hashCode += getObjectsFeederFeederActionsMappingTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectsFeeder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeeder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectsFeederSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectsFeederRecordsDetailsTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederRecordsDetailsTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederRecordsDetailsTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectsFeederFeederActionsMappingTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederFeederActionsMappingTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederFeederActionsMappingTab"));
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
