/**
 * AuthAPISOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.wsdl;

public class AuthAPISOAP11BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetArcotID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetArcotIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetArcotIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPAM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetPAMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPAMRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPAMResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetPAMResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetArcotIDChallenge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetArcotIDChallengeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDChallengeRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDChallengeResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetArcotIDChallengeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyArcotIDSignedChallenge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyArcotIDSignedChallenge"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyArcotIDSignedChallenge"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotIDSignedChallenge.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQuestions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetQuestionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetQuestionsRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetQuestionsResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetQuestionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPasswordChallenge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetPasswordChallengeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPasswordChallengeRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPasswordChallengeResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetPasswordChallengeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyAnswers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyAnswers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAnswers"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAnswers.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyPassword"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyOTP"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOTP.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyOATHOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyOATHOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyOATHOTP"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOATHOTP.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchronizeOATHOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "SynchronizeOATHOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeOATHOTP"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeOATHOTP.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyArcotOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyArcotOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyArcotOTP"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotOTP.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchronizeArcotOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "SynchronizeArcotOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeArcotOTP"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeArcotOTP.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyEMV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyEMV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyEMV"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyEMV.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchronizeEMV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "SynchronizeEMV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeEMV"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeEMV.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyPlain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyPlain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyPlain"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPlain.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "AuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyAuthToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyAuthTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAuthTokenRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAuthTokenResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyAuthTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomChallenge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetCustomChallengeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetCustomChallengeRequest"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetCustomChallengeResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "GetCustomChallengeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "VerifyCustomCredential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyCustomCredential"), com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyCustomCredential.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">CustomAuthResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "CustomAuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public AuthAPISOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AuthAPISOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AuthAPISOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">AuthResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">CustomAuthResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDChallengeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDChallengeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetArcotIDResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetCustomChallengeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetCustomChallengeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPAMRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPAMResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPasswordChallengeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetPasswordChallengeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetQuestionsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetQuestionsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeArcotOTP");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeArcotOTP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeEMV");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeEMV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">SynchronizeOATHOTP");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeOATHOTP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAnswers");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAnswers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyArcotIDSignedChallenge");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotIDSignedChallenge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyArcotOTP");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotOTP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAuthTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyAuthTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyCustomCredential");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyCustomCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyEMV");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyEMV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyOATHOTP");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOATHOTP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyOTP");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOTP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyPassword");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">VerifyPlain");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPlain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">WebFortAuthFault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.msgs.WebFortAuthFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "AuthQnAType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.xsd.AuthQnAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "BaseAuthRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.xsd.BaseAuthRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "BaseAuthResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.xsd.BaseAuthResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "GetQnAType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortAuthAPI._7_0.xsd.GetQnAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "AdditionalInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "pairs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "AdditionalOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "pairs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "BaseRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.BaseRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "BaseResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.BaseResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ErrorDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ResponseDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ResponseDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "WebFortFault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.WebFortFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse getArcotID(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDRequest getArcotIDRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetArcotID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetArcotID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getArcotIDRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse getPAM(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMRequest getPAMRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetPAM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPAM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPAMRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse getArcotIDChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeRequest getArcotIDChallengeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetArcotIDChallenge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetArcotIDChallenge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getArcotIDChallengeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyArcotIDSignedChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotIDSignedChallenge verifySignedChallengeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyArcotIDSignedChallenge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyArcotIDSignedChallenge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifySignedChallengeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse getQuestions(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsRequest getQuestionsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetQuestions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQuestions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getQuestionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse getPasswordChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeRequest getPasswordChallengeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetPasswordChallenge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPasswordChallenge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPasswordChallengeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyAnswers(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAnswers verifyAnswersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyAnswers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyAnswers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyAnswersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyPassword(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPassword verifyPasswordRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyPasswordRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOTP verifyOTPRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyOTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyOTPRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyOATHOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOATHOTP verifyOATHOTPRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyOATHOTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyOATHOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyOATHOTPRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeOATHOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeOATHOTP synchronizeOATHOTPRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SynchronizeOATHOTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SynchronizeOATHOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {synchronizeOATHOTPRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyArcotOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotOTP verifyArcotOTPRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyArcotOTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyArcotOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyArcotOTPRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeArcotOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeArcotOTP synchronizeArcotOTPRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SynchronizeArcotOTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SynchronizeArcotOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {synchronizeArcotOTPRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyEMV(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyEMV verifyEMVRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyEMV");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyEMV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyEMVRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeEMV(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeEMV synchronizeEMVRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SynchronizeEMV");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SynchronizeEMV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {synchronizeEMVRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyPlain(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPlain verifyPlainRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyPlain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyPlain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyPlainRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse verifyAuthToken(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenRequest verifyAuthTokenRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyAuthToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyAuthToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyAuthTokenRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse getCustomChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeRequest getCustomChallengeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:GetCustomChallenge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomChallenge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomChallengeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse verifyCustomCredential(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyCustomCredential verifyCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:VerifyCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
