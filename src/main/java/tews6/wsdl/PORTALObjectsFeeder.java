/**
 * PORTALObjectsFeeder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PORTALObjectsFeeder  implements java.io.Serializable {
    private tews6.wsdl.PORTALObjectsFeederSearch PORTALObjectsFeederSearch;

    private tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab;

    private tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab;

    public PORTALObjectsFeeder() {
    }

    public PORTALObjectsFeeder(
           tews6.wsdl.PORTALObjectsFeederSearch PORTALObjectsFeederSearch,
           tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab,
           tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab) {
           this.PORTALObjectsFeederSearch = PORTALObjectsFeederSearch;
           this.PORTALObjectsFeederRecordsDetailsTab = PORTALObjectsFeederRecordsDetailsTab;
           this.PORTALObjectsFeederFeederActionsMappingTab = PORTALObjectsFeederFeederActionsMappingTab;
    }


    /**
     * Gets the PORTALObjectsFeederSearch value for this PORTALObjectsFeeder.
     * 
     * @return PORTALObjectsFeederSearch
     */
    public tews6.wsdl.PORTALObjectsFeederSearch getPORTALObjectsFeederSearch() {
        return PORTALObjectsFeederSearch;
    }


    /**
     * Sets the PORTALObjectsFeederSearch value for this PORTALObjectsFeeder.
     * 
     * @param PORTALObjectsFeederSearch
     */
    public void setPORTALObjectsFeederSearch(tews6.wsdl.PORTALObjectsFeederSearch PORTALObjectsFeederSearch) {
        this.PORTALObjectsFeederSearch = PORTALObjectsFeederSearch;
    }


    /**
     * Gets the PORTALObjectsFeederRecordsDetailsTab value for this PORTALObjectsFeeder.
     * 
     * @return PORTALObjectsFeederRecordsDetailsTab
     */
    public tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab getPORTALObjectsFeederRecordsDetailsTab() {
        return PORTALObjectsFeederRecordsDetailsTab;
    }


    /**
     * Sets the PORTALObjectsFeederRecordsDetailsTab value for this PORTALObjectsFeeder.
     * 
     * @param PORTALObjectsFeederRecordsDetailsTab
     */
    public void setPORTALObjectsFeederRecordsDetailsTab(tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab) {
        this.PORTALObjectsFeederRecordsDetailsTab = PORTALObjectsFeederRecordsDetailsTab;
    }


    /**
     * Gets the PORTALObjectsFeederFeederActionsMappingTab value for this PORTALObjectsFeeder.
     * 
     * @return PORTALObjectsFeederFeederActionsMappingTab
     */
    public tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab getPORTALObjectsFeederFeederActionsMappingTab() {
        return PORTALObjectsFeederFeederActionsMappingTab;
    }


    /**
     * Sets the PORTALObjectsFeederFeederActionsMappingTab value for this PORTALObjectsFeeder.
     * 
     * @param PORTALObjectsFeederFeederActionsMappingTab
     */
    public void setPORTALObjectsFeederFeederActionsMappingTab(tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab) {
        this.PORTALObjectsFeederFeederActionsMappingTab = PORTALObjectsFeederFeederActionsMappingTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PORTALObjectsFeeder)) return false;
        PORTALObjectsFeeder other = (PORTALObjectsFeeder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PORTALObjectsFeederSearch==null && other.getPORTALObjectsFeederSearch()==null) || 
             (this.PORTALObjectsFeederSearch!=null &&
              this.PORTALObjectsFeederSearch.equals(other.getPORTALObjectsFeederSearch()))) &&
            ((this.PORTALObjectsFeederRecordsDetailsTab==null && other.getPORTALObjectsFeederRecordsDetailsTab()==null) || 
             (this.PORTALObjectsFeederRecordsDetailsTab!=null &&
              this.PORTALObjectsFeederRecordsDetailsTab.equals(other.getPORTALObjectsFeederRecordsDetailsTab()))) &&
            ((this.PORTALObjectsFeederFeederActionsMappingTab==null && other.getPORTALObjectsFeederFeederActionsMappingTab()==null) || 
             (this.PORTALObjectsFeederFeederActionsMappingTab!=null &&
              this.PORTALObjectsFeederFeederActionsMappingTab.equals(other.getPORTALObjectsFeederFeederActionsMappingTab())));
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
        if (getPORTALObjectsFeederSearch() != null) {
            _hashCode += getPORTALObjectsFeederSearch().hashCode();
        }
        if (getPORTALObjectsFeederRecordsDetailsTab() != null) {
            _hashCode += getPORTALObjectsFeederRecordsDetailsTab().hashCode();
        }
        if (getPORTALObjectsFeederFeederActionsMappingTab() != null) {
            _hashCode += getPORTALObjectsFeederFeederActionsMappingTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PORTALObjectsFeeder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeeder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PORTALObjectsFeederSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PORTALObjectsFeederRecordsDetailsTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederRecordsDetailsTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederRecordsDetailsTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PORTALObjectsFeederFeederActionsMappingTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederFeederActionsMappingTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederFeederActionsMappingTab"));
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
