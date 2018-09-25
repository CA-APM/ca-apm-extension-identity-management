/**
 * ViewUseCaseQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUseCaseQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab;

    private tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab;

    public ViewUseCaseQueryResult() {
    }

    public ViewUseCaseQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab,
           tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab) {
           this.imsStatus = imsStatus;
           this.viewUseCaseDeploymentXpressProfileTab = viewUseCaseDeploymentXpressProfileTab;
           this.viewUseCaseElementTabTab = viewUseCaseElementTabTab;
    }


    /**
     * Gets the imsStatus value for this ViewUseCaseQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this ViewUseCaseQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the viewUseCaseDeploymentXpressProfileTab value for this ViewUseCaseQueryResult.
     * 
     * @return viewUseCaseDeploymentXpressProfileTab
     */
    public tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab getViewUseCaseDeploymentXpressProfileTab() {
        return viewUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Sets the viewUseCaseDeploymentXpressProfileTab value for this ViewUseCaseQueryResult.
     * 
     * @param viewUseCaseDeploymentXpressProfileTab
     */
    public void setViewUseCaseDeploymentXpressProfileTab(tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab) {
        this.viewUseCaseDeploymentXpressProfileTab = viewUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Gets the viewUseCaseElementTabTab value for this ViewUseCaseQueryResult.
     * 
     * @return viewUseCaseElementTabTab
     */
    public tews6.wsdl.ViewUseCaseElementTabTab getViewUseCaseElementTabTab() {
        return viewUseCaseElementTabTab;
    }


    /**
     * Sets the viewUseCaseElementTabTab value for this ViewUseCaseQueryResult.
     * 
     * @param viewUseCaseElementTabTab
     */
    public void setViewUseCaseElementTabTab(tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab) {
        this.viewUseCaseElementTabTab = viewUseCaseElementTabTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUseCaseQueryResult)) return false;
        ViewUseCaseQueryResult other = (ViewUseCaseQueryResult) obj;
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
            ((this.viewUseCaseDeploymentXpressProfileTab==null && other.getViewUseCaseDeploymentXpressProfileTab()==null) || 
             (this.viewUseCaseDeploymentXpressProfileTab!=null &&
              this.viewUseCaseDeploymentXpressProfileTab.equals(other.getViewUseCaseDeploymentXpressProfileTab()))) &&
            ((this.viewUseCaseElementTabTab==null && other.getViewUseCaseElementTabTab()==null) || 
             (this.viewUseCaseElementTabTab!=null &&
              this.viewUseCaseElementTabTab.equals(other.getViewUseCaseElementTabTab())));
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
        if (getViewUseCaseDeploymentXpressProfileTab() != null) {
            _hashCode += getViewUseCaseDeploymentXpressProfileTab().hashCode();
        }
        if (getViewUseCaseElementTabTab() != null) {
            _hashCode += getViewUseCaseElementTabTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUseCaseQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewUseCaseDeploymentXpressProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseDeploymentXpressProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseDeploymentXpressProfileTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewUseCaseElementTabTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseElementTabTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseElementTabTab"));
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
