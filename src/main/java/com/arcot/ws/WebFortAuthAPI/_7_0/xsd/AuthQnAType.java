/**
 * AuthQnAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.xsd;


/**
 * This type is used while doing QnA
 * 				authentication.
 * 				Holds QuestionIDs and Answers
 * 				for QnA authentication. QuestionIDs are
 * 				returned
 * 				as output for the operation GetQuestions as an
 * 				array of
 * 				GetQnAType objects. questionID - The
 * 				identifier with which the server
 * 				recognizes the
 * 				asked question. answer - Answer corresponding to
 * 				the
 * 				question(ID). verificationStatus - When
 * 				answer verification is
 * 				happening at client side,
 * 				it indicates status like answered
 * 				correctly,
 * 				answered incorrectly etc.
 */
public class AuthQnAType  implements java.io.Serializable {
    private java.lang.String questionID;

    private java.lang.String answer;

    private java.lang.Integer verificationStatus;

    public AuthQnAType() {
    }

    public AuthQnAType(
           java.lang.String questionID,
           java.lang.String answer,
           java.lang.Integer verificationStatus) {
           this.questionID = questionID;
           this.answer = answer;
           this.verificationStatus = verificationStatus;
    }


    /**
     * Gets the questionID value for this AuthQnAType.
     * 
     * @return questionID
     */
    public java.lang.String getQuestionID() {
        return questionID;
    }


    /**
     * Sets the questionID value for this AuthQnAType.
     * 
     * @param questionID
     */
    public void setQuestionID(java.lang.String questionID) {
        this.questionID = questionID;
    }


    /**
     * Gets the answer value for this AuthQnAType.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this AuthQnAType.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the verificationStatus value for this AuthQnAType.
     * 
     * @return verificationStatus
     */
    public java.lang.Integer getVerificationStatus() {
        return verificationStatus;
    }


    /**
     * Sets the verificationStatus value for this AuthQnAType.
     * 
     * @param verificationStatus
     */
    public void setVerificationStatus(java.lang.Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthQnAType)) return false;
        AuthQnAType other = (AuthQnAType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionID==null && other.getQuestionID()==null) || 
             (this.questionID!=null &&
              this.questionID.equals(other.getQuestionID()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.verificationStatus==null && other.getVerificationStatus()==null) || 
             (this.verificationStatus!=null &&
              this.verificationStatus.equals(other.getVerificationStatus())));
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
        if (getQuestionID() != null) {
            _hashCode += getQuestionID().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getVerificationStatus() != null) {
            _hashCode += getVerificationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthQnAType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "AuthQnAType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "questionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "verificationStatus"));
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
