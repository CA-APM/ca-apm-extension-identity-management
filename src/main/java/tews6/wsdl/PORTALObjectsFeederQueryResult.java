/**
 * PORTALObjectsFeederQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PORTALObjectsFeederQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab;

    private tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab;

    public PORTALObjectsFeederQueryResult() {
    }

    public PORTALObjectsFeederQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab,
           tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab) {
           this.imsStatus = imsStatus;
           this.PORTALObjectsFeederRecordsDetailsTab = PORTALObjectsFeederRecordsDetailsTab;
           this.PORTALObjectsFeederFeederActionsMappingTab = PORTALObjectsFeederFeederActionsMappingTab;
    }


    /**
     * Gets the imsStatus value for this PORTALObjectsFeederQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this PORTALObjectsFeederQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the PORTALObjectsFeederRecordsDetailsTab value for this PORTALObjectsFeederQueryResult.
     * 
     * @return PORTALObjectsFeederRecordsDetailsTab
     */
    public tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab getPORTALObjectsFeederRecordsDetailsTab() {
        return PORTALObjectsFeederRecordsDetailsTab;
    }


    /**
     * Sets the PORTALObjectsFeederRecordsDetailsTab value for this PORTALObjectsFeederQueryResult.
     * 
     * @param PORTALObjectsFeederRecordsDetailsTab
     */
    public void setPORTALObjectsFeederRecordsDetailsTab(tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab PORTALObjectsFeederRecordsDetailsTab) {
        this.PORTALObjectsFeederRecordsDetailsTab = PORTALObjectsFeederRecordsDetailsTab;
    }


    /**
     * Gets the PORTALObjectsFeederFeederActionsMappingTab value for this PORTALObjectsFeederQueryResult.
     * 
     * @return PORTALObjectsFeederFeederActionsMappingTab
     */
    public tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab getPORTALObjectsFeederFeederActionsMappingTab() {
        return PORTALObjectsFeederFeederActionsMappingTab;
    }


    /**
     * Sets the PORTALObjectsFeederFeederActionsMappingTab value for this PORTALObjectsFeederQueryResult.
     * 
     * @param PORTALObjectsFeederFeederActionsMappingTab
     */
    public void setPORTALObjectsFeederFeederActionsMappingTab(tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab PORTALObjectsFeederFeederActionsMappingTab) {
        this.PORTALObjectsFeederFeederActionsMappingTab = PORTALObjectsFeederFeederActionsMappingTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PORTALObjectsFeederQueryResult)) return false;
        PORTALObjectsFeederQueryResult other = (PORTALObjectsFeederQueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imsStatus==null && other.getImsStatus()==null) || 
             (this.imsStatus!=null &&
              this.imsStatus.equals(other.getImsStatus()))) &&
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
        if (getImsStatus() != null) {
            _hashCode += getImsStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(PORTALObjectsFeederQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
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
