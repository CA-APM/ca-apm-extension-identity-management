/**
 * ModifyUseCaseQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ModifyUseCaseQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.ModifyUseCaseDeploymentXpressProfileTab modifyUseCaseDeploymentXpressProfileTab;

    private tews6.wsdl.ModifyUseCaseElementTabTab modifyUseCaseElementTabTab;

    public ModifyUseCaseQueryResult() {
    }

    public ModifyUseCaseQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.ModifyUseCaseDeploymentXpressProfileTab modifyUseCaseDeploymentXpressProfileTab,
           tews6.wsdl.ModifyUseCaseElementTabTab modifyUseCaseElementTabTab) {
           this.imsStatus = imsStatus;
           this.modifyUseCaseDeploymentXpressProfileTab = modifyUseCaseDeploymentXpressProfileTab;
           this.modifyUseCaseElementTabTab = modifyUseCaseElementTabTab;
    }


    /**
     * Gets the imsStatus value for this ModifyUseCaseQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this ModifyUseCaseQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the modifyUseCaseDeploymentXpressProfileTab value for this ModifyUseCaseQueryResult.
     * 
     * @return modifyUseCaseDeploymentXpressProfileTab
     */
    public tews6.wsdl.ModifyUseCaseDeploymentXpressProfileTab getModifyUseCaseDeploymentXpressProfileTab() {
        return modifyUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Sets the modifyUseCaseDeploymentXpressProfileTab value for this ModifyUseCaseQueryResult.
     * 
     * @param modifyUseCaseDeploymentXpressProfileTab
     */
    public void setModifyUseCaseDeploymentXpressProfileTab(tews6.wsdl.ModifyUseCaseDeploymentXpressProfileTab modifyUseCaseDeploymentXpressProfileTab) {
        this.modifyUseCaseDeploymentXpressProfileTab = modifyUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Gets the modifyUseCaseElementTabTab value for this ModifyUseCaseQueryResult.
     * 
     * @return modifyUseCaseElementTabTab
     */
    public tews6.wsdl.ModifyUseCaseElementTabTab getModifyUseCaseElementTabTab() {
        return modifyUseCaseElementTabTab;
    }


    /**
     * Sets the modifyUseCaseElementTabTab value for this ModifyUseCaseQueryResult.
     * 
     * @param modifyUseCaseElementTabTab
     */
    public void setModifyUseCaseElementTabTab(tews6.wsdl.ModifyUseCaseElementTabTab modifyUseCaseElementTabTab) {
        this.modifyUseCaseElementTabTab = modifyUseCaseElementTabTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyUseCaseQueryResult)) return false;
        ModifyUseCaseQueryResult other = (ModifyUseCaseQueryResult) obj;
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
            ((this.modifyUseCaseDeploymentXpressProfileTab==null && other.getModifyUseCaseDeploymentXpressProfileTab()==null) || 
             (this.modifyUseCaseDeploymentXpressProfileTab!=null &&
              this.modifyUseCaseDeploymentXpressProfileTab.equals(other.getModifyUseCaseDeploymentXpressProfileTab()))) &&
            ((this.modifyUseCaseElementTabTab==null && other.getModifyUseCaseElementTabTab()==null) || 
             (this.modifyUseCaseElementTabTab!=null &&
              this.modifyUseCaseElementTabTab.equals(other.getModifyUseCaseElementTabTab())));
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
        if (getModifyUseCaseDeploymentXpressProfileTab() != null) {
            _hashCode += getModifyUseCaseDeploymentXpressProfileTab().hashCode();
        }
        if (getModifyUseCaseElementTabTab() != null) {
            _hashCode += getModifyUseCaseElementTabTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyUseCaseQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyUseCaseDeploymentXpressProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseDeploymentXpressProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseDeploymentXpressProfileTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyUseCaseElementTabTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseElementTabTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseElementTabTab"));
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
