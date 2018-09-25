/**
 * ResetUserPasswordQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetUserPasswordQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.ResetUserPasswordProfileTab resetUserPasswordProfileTab;

    public ResetUserPasswordQueryResult() {
    }

    public ResetUserPasswordQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.ResetUserPasswordProfileTab resetUserPasswordProfileTab) {
           this.imsStatus = imsStatus;
           this.resetUserPasswordProfileTab = resetUserPasswordProfileTab;
    }


    /**
     * Gets the imsStatus value for this ResetUserPasswordQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this ResetUserPasswordQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the resetUserPasswordProfileTab value for this ResetUserPasswordQueryResult.
     * 
     * @return resetUserPasswordProfileTab
     */
    public tews6.wsdl.ResetUserPasswordProfileTab getResetUserPasswordProfileTab() {
        return resetUserPasswordProfileTab;
    }


    /**
     * Sets the resetUserPasswordProfileTab value for this ResetUserPasswordQueryResult.
     * 
     * @param resetUserPasswordProfileTab
     */
    public void setResetUserPasswordProfileTab(tews6.wsdl.ResetUserPasswordProfileTab resetUserPasswordProfileTab) {
        this.resetUserPasswordProfileTab = resetUserPasswordProfileTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetUserPasswordQueryResult)) return false;
        ResetUserPasswordQueryResult other = (ResetUserPasswordQueryResult) obj;
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
            ((this.resetUserPasswordProfileTab==null && other.getResetUserPasswordProfileTab()==null) || 
             (this.resetUserPasswordProfileTab!=null &&
              this.resetUserPasswordProfileTab.equals(other.getResetUserPasswordProfileTab())));
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
        if (getResetUserPasswordProfileTab() != null) {
            _hashCode += getResetUserPasswordProfileTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetUserPasswordQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetUserPasswordProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPasswordProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordProfileTab"));
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
