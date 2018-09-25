/**
 * IssuanceAPISOAP12BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl;

public class IssuanceAPISOAP12BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPIPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnableCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DownloadCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReissueCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetCredentialNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetCredentialValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteArcotIDUnsignedAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "DeleteArcotIDUnsignedAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">DeleteArcotIDUnsignedAttributes"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.DeleteArcotIDUnsignedAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">TransactionDetails"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "TransactionDetails"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetArcotIDUnsignedAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "SetArcotIDUnsignedAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">SetArcotIDUnsignedAttributes"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.SetArcotIDUnsignedAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">TransactionDetails"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "TransactionDetails"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchQnAConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "FetchQnAConfigurationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">FetchQnAConfigurationRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">FetchQnAConfigurationResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "FetchQnAConfigurationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnableCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReissueCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetCustomCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetCustomCredentialValidity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CustomResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArcotIDKeyBagGetElements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagGetElementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagGetElementsRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagGetElementsResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagGetElementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArcotIDKeyBagAddElements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagAddElementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagAddElementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArcotIDKeyBagDeleteElements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagDeleteElementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsRequest"), com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "ArcotIDKeyBagDeleteElementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

    }

    public IssuanceAPISOAP12BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IssuanceAPISOAP12BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IssuanceAPISOAP12BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagGetElementsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagGetElementsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">DeleteArcotIDUnsignedAttributes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.DeleteArcotIDUnsignedAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">FetchQnAConfigurationRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">FetchQnAConfigurationResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">SetArcotIDUnsignedAttributes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.SetArcotIDUnsignedAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">TransactionDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">WebFortIssuanceFault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.WebFortIssuanceFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertAndDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagElementSelection");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagElementSet");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagP12Representation");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "p12Representations");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagP12Representation");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagReqParams");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagReqParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotOTPInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotOTPOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "BaseIssuanceRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "BaseIssuanceResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "CredentialInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "CredentialOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "EMVInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "EMVOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OATHOTPInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OATHOTPOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OTPInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OTPOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAOutputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAResetType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAResetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnQType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QuestionType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "UPInputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "UPOutputType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPOutputType.class;
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

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse createCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest createCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:CreateCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse deleteCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest deleteCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DeleteCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse disableCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest disableCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DisableCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisableCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {disableCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse enableCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest enableCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EnableCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EnableCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enableCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse fetchCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest fetchCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:FetchCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FetchCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fetchCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse downloadCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest downloadCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DownloadCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DownloadCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {downloadCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse reissueCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest reissueCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ReissueCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReissueCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reissueCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResetCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredentialNotes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialNotesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResetCredentialNotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetCredentialNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetCredentialNotesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredentialValidity(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialValidityRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResetCredentialValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetCredentialValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetCredentialValidityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails deleteArcotIDUnsignedAttributes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.DeleteArcotIDUnsignedAttributes deleteArcotIDUnsignedAttributesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DeleteArcotIDUnsignedAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteArcotIDUnsignedAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteArcotIDUnsignedAttributesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails setArcotIDUnsignedAttributes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.SetArcotIDUnsignedAttributes setArcotIDUnsignedAttributesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:SetArcotIDUnsignedAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetArcotIDUnsignedAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setArcotIDUnsignedAttributesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse fetchQnAConfiguration(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationRequest fetchQnAConfigurationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:FetchQnAConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FetchQnAConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fetchQnAConfigurationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse createCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest createCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:CreateCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse deleteCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest deleteCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DeleteCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse disableCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest disableCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:DisableCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisableCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {disableCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse enableCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest enableCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:EnableCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EnableCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enableCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse fetchCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest fetchCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:FetchCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FetchCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fetchCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse reissueCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest reissueCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ReissueCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReissueCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reissueCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse resetCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest resetCustomCredentialRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResetCustomCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetCustomCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetCustomCredentialRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse resetCustomCredentialValidity(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest resetCustomCredentialValidityRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ResetCustomCredentialValidity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetCustomCredentialValidity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetCustomCredentialValidityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse arcotIDKeyBagGetElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsRequest arcotIDKeyBagGetElementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ArcotIDKeyBagGetElements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ArcotIDKeyBagGetElements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arcotIDKeyBagGetElementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse arcotIDKeyBagAddElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsRequest arcotIDKeyBagAddElementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ArcotIDKeyBagAddElements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ArcotIDKeyBagAddElements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arcotIDKeyBagAddElementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse arcotIDKeyBagDeleteElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsRequest arcotIDKeyBagDeleteElementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ArcotIDKeyBagDeleteElements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ArcotIDKeyBagDeleteElements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arcotIDKeyBagDeleteElementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
