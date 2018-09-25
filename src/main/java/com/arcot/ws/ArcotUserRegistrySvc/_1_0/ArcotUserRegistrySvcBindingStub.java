/**
 * ArcotUserRegistrySvcBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0;

public class ArcotUserRegistrySvcBindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "authenticateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">authenticateUserRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">authenticateUserResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "authenticateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "searchUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">searchUsersRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SearchUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">searchUsersResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "searchUsersResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.UserDetailsType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUsersResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listUsersForAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUsersForAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersForAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersForAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersForAccountResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUsersForAccountResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "retrieveUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "retrieveUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveUserAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "retrieveUserAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserAccountResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "retrieveUserAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listUserAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUserAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUserAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUserAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUserAccountResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.UserAccountType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "listUserAccountResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "account"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUserAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserAccountResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUserAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserAccountResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "createUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">createUserRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">createUserResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "createUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUserAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "addUserAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserAccountRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserAccountResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "addUserAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCustomAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "setCustomAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setCustomAttributesRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setCustomAttributesResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "setCustomAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPAM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "setPAMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setPAMRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setPAMResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "setPAMResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPAM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getPAMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getPAMRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getPAMResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getPAMResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUserStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getUserStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserStatusRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserStatusResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getUserStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getQnAAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getQnAAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAAttributesRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAAttributeResponse"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getQnAAttributeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performQnAVerification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "performQnAVerificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">performQnAVerificationRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.PerformQnAVerificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">performQnAVerificationResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "performQnAVerificationResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getQnAValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getQnAValuesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAValuesRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAValuesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAValuesResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getQnAValuesResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getUserDevicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserDevicesRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserDevicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserDevicesResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "getUserDevicesResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deviceDetails"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUserDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "addUserDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserDeviceRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserDeviceResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "addUserDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUserDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserDeviceRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserDeviceResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUserDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserDeviceRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserDeviceResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deleteUserDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disableUserDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "disableUserDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">disableUserDeviceRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">disableUserDeviceResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "disableUserDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enableUserDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "enableUserDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">enableUserDeviceRequest"), com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">enableUserDeviceResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "enableUserDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

    }

    public ArcotUserRegistrySvcBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotUserRegistrySvcBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotUserRegistrySvcBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">>getQnAValuesRequest>attributes");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">addUserDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">authenticateUserRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">authenticateUserResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">createUserRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">createUserResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">deleteUserResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">disableUserDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">disableUserDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">enableUserDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">enableUserDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getPAMRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getPAMResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAAttributeResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAValuesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAValuesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getQnAValuesResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnAValuesAttribute");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserDevicesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserDevicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserDevicesResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DeviceResponseAttrs");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "deviceDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">getUserStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUserAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUserAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUserAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserAccountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAccountType");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "account");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersForAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersForAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersForAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsTypeEx");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">listUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsType");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">performQnAVerificationRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.PerformQnAVerificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">performQnAVerificationResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnAResponseAttribute");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">retrieveUserResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">searchUsersRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SearchUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">searchUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsTypeEx");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "SearchResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setCustomAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setCustomAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setPAMRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setPAMResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserDeviceRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">QnARequestAttribute>attribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserAuthResultType>status");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserAuthResultTypeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserCredentialType>userCredential");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserCredentialTypeUserCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserDetailsType>emailId");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserDetailsType>telephoneNumber");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountCustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountCustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountIDAttribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountIDAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AttributeInfoStatusType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AttributeInfoStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AttributeInfoType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AttributeInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.CustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DeviceRequestAttrs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DeviceRequestAttrs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DeviceResponseAttrs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DeviceStatusType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DeviceStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnARequestAttribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">QnARequestAttribute>attribute");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnAResponseAttribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnAResponseAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnAValuesAttribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnAValuesAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "QnAVerificationResultType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.QnAVerificationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryUserAttributeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RetrieveUserIdentifierTypeEx");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.RetrieveUserIdentifierTypeEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UdsRegistrySuccessType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UpdateUserFlagType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UpdateUserFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAccountType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAuthResultType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserAuthResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserBaseFilterType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserBaseFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserCredentialType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserCredentialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsTypeEx");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserFilterType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserStatusType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UserStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse authenticateUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.AuthenticateUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authenticateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[] searchUsers(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SearchUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.SearchUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "searchUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.UserDetailsType[] listUsers(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.UserDetailsType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[] listUsersForAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersForAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListUsersForAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listUsersForAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse retrieveUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.RetrieveUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse retrieveUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.RetrieveUserAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveUserAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.UserAccountType[] listUserAccounts(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUserAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListUserAccounts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listUserAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.UserAccountType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.UserAccountType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.UserAccountType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse deleteUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DeleteUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse deleteUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DeleteUserAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUserAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse updateUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateUserAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUserAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse createUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.CreateUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse addUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.AddUserAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addUserAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse updateUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse setCustomAttributes(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.SetCustomAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setCustomAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse setPAM(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.SetPAM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setPAM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse getPAM(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.GetPAM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPAM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse updateUserStatus(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateUserStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUserStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse getUserStatus(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.GetUserStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getQnAAttributes(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAAttributesRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.GetQnAAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getQnAAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[] performQnAVerification(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.PerformQnAVerificationRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.PerformQnAVerification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "performQnAVerification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[] getQnAValues(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAValuesRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.GetQnAValues");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getQnAValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[] getUserDevices(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserDevicesRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.GetUserDevices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse addUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.AddUserDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addUserDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse updateUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateUserDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUserDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse deleteUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DeleteUserDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUserDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse disableUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DisableUserDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "disableUserDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse enableUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.EnableUserDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "enableUserDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
