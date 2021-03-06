/**
 * BaseAdminReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * BaseAdminReq is base class of all admin requests.
 */
public class BaseAdminReq  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.BaseRequestType  implements java.io.Serializable {
    /* This element contains the additional inputs
     * 								that may be needed for different operations.
     * 
     * 								Following are some
     * 								of the pre-defined additional
     * 								input parameters:
     * 								AR_WF_LOCALE_ID
     * 								identifier for the locale that
     * 								WebFort will use in returning the messages.
     * 								AR_WF_CALLER_ID identifier for the transaction in the
     * 								calling application. This
     * 								is useful for tracking the
     * 								transaction end-to-end. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput;

    public BaseAdminReq() {
    }

    public BaseAdminReq(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        super(
            clientTxnId);
        this.additionalInput = additionalInput;
    }


    /**
     * Gets the additionalInput value for this BaseAdminReq.
     * 
     * @return additionalInput   * This element contains the additional inputs
     * 								that may be needed for different operations.
     * 
     * 								Following are some
     * 								of the pre-defined additional
     * 								input parameters:
     * 								AR_WF_LOCALE_ID
     * 								identifier for the locale that
     * 								WebFort will use in returning the messages.
     * 								AR_WF_CALLER_ID identifier for the transaction in the
     * 								calling application. This
     * 								is useful for tracking the
     * 								transaction end-to-end.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this BaseAdminReq.
     * 
     * @param additionalInput   * This element contains the additional inputs
     * 								that may be needed for different operations.
     * 
     * 								Following are some
     * 								of the pre-defined additional
     * 								input parameters:
     * 								AR_WF_LOCALE_ID
     * 								identifier for the locale that
     * 								WebFort will use in returning the messages.
     * 								AR_WF_CALLER_ID identifier for the transaction in the
     * 								calling application. This
     * 								is useful for tracking the
     * 								transaction end-to-end.
     */
    public void setAdditionalInput(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        this.additionalInput = additionalInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseAdminReq)) return false;
        BaseAdminReq other = (BaseAdminReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalInput==null && other.getAdditionalInput()==null) || 
             (this.additionalInput!=null &&
              java.util.Arrays.equals(this.additionalInput, other.getAdditionalInput())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdditionalInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseAdminReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseAdminReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "additionalInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "pairs"));
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
