/**
 * QnAAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * QnAAuthConfig is the structure used to
 * 				represent QnA
 * 				authentication configuration.
 * 				These configuration settings will be
 * 				used while
 * 				authenticating with QnA by the user.
 */
public class QnAAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig  implements java.io.Serializable {
    /* The number of questions to be asked for
     * 								authentication. */
    private java.lang.Integer numQuestionsToChallenge;

    /* The minimum number of correct answers required
     * 								for successful authentication. */
    private java.lang.Integer minAnswersRequired;

    /* Question challenge mode has the following
     * 								values.
     * 								1 for RANDOM and 2 for ALTERNATIVE. */
    private java.lang.Integer questionsChallengeMode;

    /* Question set change option has the following
     * 								values.
     * 								1 for STATIC and 2 for RANDOM. */
    private java.lang.Integer questionSetChangeOption;

    /* Flag that indicates whether caller side
     * 								verification is enabled or not. */
    private java.lang.Boolean isCVMEnabled;

    /* Validity time in seconds for challenge sent
     * 								while QnA authentication. */
    private java.lang.Integer challengeTimeout;

    public QnAAuthConfig() {
    }

    public QnAAuthConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer maxStrikes,
           java.lang.Long warningPeriod,
           java.lang.Long gracePeriod,
           java.lang.Long autoUnlockPeriod,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           java.lang.Boolean matchAcrossUsageType,
           java.lang.String usageTypeToMatch,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions,
           java.lang.Integer numQuestionsToChallenge,
           java.lang.Integer minAnswersRequired,
           java.lang.Integer questionsChallengeMode,
           java.lang.Integer questionSetChangeOption,
           java.lang.Boolean isCVMEnabled,
           java.lang.Integer challengeTimeout) {
        super(
            name,
            status,
            maxStrikes,
            warningPeriod,
            gracePeriod,
            autoUnlockPeriod,
            userCheck,
            matchAcrossUsageType,
            usageTypeToMatch,
            adProcConditions);
        this.numQuestionsToChallenge = numQuestionsToChallenge;
        this.minAnswersRequired = minAnswersRequired;
        this.questionsChallengeMode = questionsChallengeMode;
        this.questionSetChangeOption = questionSetChangeOption;
        this.isCVMEnabled = isCVMEnabled;
        this.challengeTimeout = challengeTimeout;
    }


    /**
     * Gets the numQuestionsToChallenge value for this QnAAuthConfig.
     * 
     * @return numQuestionsToChallenge   * The number of questions to be asked for
     * 								authentication.
     */
    public java.lang.Integer getNumQuestionsToChallenge() {
        return numQuestionsToChallenge;
    }


    /**
     * Sets the numQuestionsToChallenge value for this QnAAuthConfig.
     * 
     * @param numQuestionsToChallenge   * The number of questions to be asked for
     * 								authentication.
     */
    public void setNumQuestionsToChallenge(java.lang.Integer numQuestionsToChallenge) {
        this.numQuestionsToChallenge = numQuestionsToChallenge;
    }


    /**
     * Gets the minAnswersRequired value for this QnAAuthConfig.
     * 
     * @return minAnswersRequired   * The minimum number of correct answers required
     * 								for successful authentication.
     */
    public java.lang.Integer getMinAnswersRequired() {
        return minAnswersRequired;
    }


    /**
     * Sets the minAnswersRequired value for this QnAAuthConfig.
     * 
     * @param minAnswersRequired   * The minimum number of correct answers required
     * 								for successful authentication.
     */
    public void setMinAnswersRequired(java.lang.Integer minAnswersRequired) {
        this.minAnswersRequired = minAnswersRequired;
    }


    /**
     * Gets the questionsChallengeMode value for this QnAAuthConfig.
     * 
     * @return questionsChallengeMode   * Question challenge mode has the following
     * 								values.
     * 								1 for RANDOM and 2 for ALTERNATIVE.
     */
    public java.lang.Integer getQuestionsChallengeMode() {
        return questionsChallengeMode;
    }


    /**
     * Sets the questionsChallengeMode value for this QnAAuthConfig.
     * 
     * @param questionsChallengeMode   * Question challenge mode has the following
     * 								values.
     * 								1 for RANDOM and 2 for ALTERNATIVE.
     */
    public void setQuestionsChallengeMode(java.lang.Integer questionsChallengeMode) {
        this.questionsChallengeMode = questionsChallengeMode;
    }


    /**
     * Gets the questionSetChangeOption value for this QnAAuthConfig.
     * 
     * @return questionSetChangeOption   * Question set change option has the following
     * 								values.
     * 								1 for STATIC and 2 for RANDOM.
     */
    public java.lang.Integer getQuestionSetChangeOption() {
        return questionSetChangeOption;
    }


    /**
     * Sets the questionSetChangeOption value for this QnAAuthConfig.
     * 
     * @param questionSetChangeOption   * Question set change option has the following
     * 								values.
     * 								1 for STATIC and 2 for RANDOM.
     */
    public void setQuestionSetChangeOption(java.lang.Integer questionSetChangeOption) {
        this.questionSetChangeOption = questionSetChangeOption;
    }


    /**
     * Gets the isCVMEnabled value for this QnAAuthConfig.
     * 
     * @return isCVMEnabled   * Flag that indicates whether caller side
     * 								verification is enabled or not.
     */
    public java.lang.Boolean getIsCVMEnabled() {
        return isCVMEnabled;
    }


    /**
     * Sets the isCVMEnabled value for this QnAAuthConfig.
     * 
     * @param isCVMEnabled   * Flag that indicates whether caller side
     * 								verification is enabled or not.
     */
    public void setIsCVMEnabled(java.lang.Boolean isCVMEnabled) {
        this.isCVMEnabled = isCVMEnabled;
    }


    /**
     * Gets the challengeTimeout value for this QnAAuthConfig.
     * 
     * @return challengeTimeout   * Validity time in seconds for challenge sent
     * 								while QnA authentication.
     */
    public java.lang.Integer getChallengeTimeout() {
        return challengeTimeout;
    }


    /**
     * Sets the challengeTimeout value for this QnAAuthConfig.
     * 
     * @param challengeTimeout   * Validity time in seconds for challenge sent
     * 								while QnA authentication.
     */
    public void setChallengeTimeout(java.lang.Integer challengeTimeout) {
        this.challengeTimeout = challengeTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QnAAuthConfig)) return false;
        QnAAuthConfig other = (QnAAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numQuestionsToChallenge==null && other.getNumQuestionsToChallenge()==null) || 
             (this.numQuestionsToChallenge!=null &&
              this.numQuestionsToChallenge.equals(other.getNumQuestionsToChallenge()))) &&
            ((this.minAnswersRequired==null && other.getMinAnswersRequired()==null) || 
             (this.minAnswersRequired!=null &&
              this.minAnswersRequired.equals(other.getMinAnswersRequired()))) &&
            ((this.questionsChallengeMode==null && other.getQuestionsChallengeMode()==null) || 
             (this.questionsChallengeMode!=null &&
              this.questionsChallengeMode.equals(other.getQuestionsChallengeMode()))) &&
            ((this.questionSetChangeOption==null && other.getQuestionSetChangeOption()==null) || 
             (this.questionSetChangeOption!=null &&
              this.questionSetChangeOption.equals(other.getQuestionSetChangeOption()))) &&
            ((this.isCVMEnabled==null && other.getIsCVMEnabled()==null) || 
             (this.isCVMEnabled!=null &&
              this.isCVMEnabled.equals(other.getIsCVMEnabled()))) &&
            ((this.challengeTimeout==null && other.getChallengeTimeout()==null) || 
             (this.challengeTimeout!=null &&
              this.challengeTimeout.equals(other.getChallengeTimeout())));
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
        if (getNumQuestionsToChallenge() != null) {
            _hashCode += getNumQuestionsToChallenge().hashCode();
        }
        if (getMinAnswersRequired() != null) {
            _hashCode += getMinAnswersRequired().hashCode();
        }
        if (getQuestionsChallengeMode() != null) {
            _hashCode += getQuestionsChallengeMode().hashCode();
        }
        if (getQuestionSetChangeOption() != null) {
            _hashCode += getQuestionSetChangeOption().hashCode();
        }
        if (getIsCVMEnabled() != null) {
            _hashCode += getIsCVMEnabled().hashCode();
        }
        if (getChallengeTimeout() != null) {
            _hashCode += getChallengeTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QnAAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAAuthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numQuestionsToChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "numQuestionsToChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAnswersRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minAnswersRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionsChallengeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "questionsChallengeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionSetChangeOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "questionSetChangeOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCVMEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isCVMEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "challengeTimeout"));
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
