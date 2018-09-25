/**
 * QnAIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * QnAIssuanceConfig is the structure used to
 * 				represent QnA issuance configuration. These
 * 				configuration settings will be used while
 * 				issuing a new Qna credential to user.
 */
public class QnAIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig  implements java.io.Serializable {
    /* Maximum number of questions can be configured
     * 								for each user. */
    private java.lang.Integer maxQuestions;

    /* Minimum number of questions can be configured
     * 								for each user. */
    private java.lang.Integer minQuestions;

    /* Questions can be configured for each user. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList questions;

    /* Flag that indicates whether answers are case
     * 								sensitive or not. */
    private java.lang.Boolean isCaseSensitive;

    /* Question return mode has the following values.
     * 								1 for STATIC and 2 for RANDOM. */
    private java.lang.Integer questionReturnMode;

    public QnAIssuanceConfig() {
    }

    public QnAIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes,
           java.lang.Integer maxQuestions,
           java.lang.Integer minQuestions,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList questions,
           java.lang.Boolean isCaseSensitive,
           java.lang.Integer questionReturnMode) {
        super(
            name,
            status,
            multipleUsageCount,
            usageType,
            validity,
            userCheck,
            customAttributes);
        this.maxQuestions = maxQuestions;
        this.minQuestions = minQuestions;
        this.questions = questions;
        this.isCaseSensitive = isCaseSensitive;
        this.questionReturnMode = questionReturnMode;
    }


    /**
     * Gets the maxQuestions value for this QnAIssuanceConfig.
     * 
     * @return maxQuestions   * Maximum number of questions can be configured
     * 								for each user.
     */
    public java.lang.Integer getMaxQuestions() {
        return maxQuestions;
    }


    /**
     * Sets the maxQuestions value for this QnAIssuanceConfig.
     * 
     * @param maxQuestions   * Maximum number of questions can be configured
     * 								for each user.
     */
    public void setMaxQuestions(java.lang.Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }


    /**
     * Gets the minQuestions value for this QnAIssuanceConfig.
     * 
     * @return minQuestions   * Minimum number of questions can be configured
     * 								for each user.
     */
    public java.lang.Integer getMinQuestions() {
        return minQuestions;
    }


    /**
     * Sets the minQuestions value for this QnAIssuanceConfig.
     * 
     * @param minQuestions   * Minimum number of questions can be configured
     * 								for each user.
     */
    public void setMinQuestions(java.lang.Integer minQuestions) {
        this.minQuestions = minQuestions;
    }


    /**
     * Gets the questions value for this QnAIssuanceConfig.
     * 
     * @return questions   * Questions can be configured for each user.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this QnAIssuanceConfig.
     * 
     * @param questions   * Questions can be configured for each user.
     */
    public void setQuestions(com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList questions) {
        this.questions = questions;
    }


    /**
     * Gets the isCaseSensitive value for this QnAIssuanceConfig.
     * 
     * @return isCaseSensitive   * Flag that indicates whether answers are case
     * 								sensitive or not.
     */
    public java.lang.Boolean getIsCaseSensitive() {
        return isCaseSensitive;
    }


    /**
     * Sets the isCaseSensitive value for this QnAIssuanceConfig.
     * 
     * @param isCaseSensitive   * Flag that indicates whether answers are case
     * 								sensitive or not.
     */
    public void setIsCaseSensitive(java.lang.Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }


    /**
     * Gets the questionReturnMode value for this QnAIssuanceConfig.
     * 
     * @return questionReturnMode   * Question return mode has the following values.
     * 								1 for STATIC and 2 for RANDOM.
     */
    public java.lang.Integer getQuestionReturnMode() {
        return questionReturnMode;
    }


    /**
     * Sets the questionReturnMode value for this QnAIssuanceConfig.
     * 
     * @param questionReturnMode   * Question return mode has the following values.
     * 								1 for STATIC and 2 for RANDOM.
     */
    public void setQuestionReturnMode(java.lang.Integer questionReturnMode) {
        this.questionReturnMode = questionReturnMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QnAIssuanceConfig)) return false;
        QnAIssuanceConfig other = (QnAIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxQuestions==null && other.getMaxQuestions()==null) || 
             (this.maxQuestions!=null &&
              this.maxQuestions.equals(other.getMaxQuestions()))) &&
            ((this.minQuestions==null && other.getMinQuestions()==null) || 
             (this.minQuestions!=null &&
              this.minQuestions.equals(other.getMinQuestions()))) &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              this.questions.equals(other.getQuestions()))) &&
            ((this.isCaseSensitive==null && other.getIsCaseSensitive()==null) || 
             (this.isCaseSensitive!=null &&
              this.isCaseSensitive.equals(other.getIsCaseSensitive()))) &&
            ((this.questionReturnMode==null && other.getQuestionReturnMode()==null) || 
             (this.questionReturnMode!=null &&
              this.questionReturnMode.equals(other.getQuestionReturnMode())));
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
        if (getMaxQuestions() != null) {
            _hashCode += getMaxQuestions().hashCode();
        }
        if (getMinQuestions() != null) {
            _hashCode += getMinQuestions().hashCode();
        }
        if (getQuestions() != null) {
            _hashCode += getQuestions().hashCode();
        }
        if (getIsCaseSensitive() != null) {
            _hashCode += getIsCaseSensitive().hashCode();
        }
        if (getQuestionReturnMode() != null) {
            _hashCode += getQuestionReturnMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QnAIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "maxQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "StringList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCaseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isCaseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionReturnMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "questionReturnMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
