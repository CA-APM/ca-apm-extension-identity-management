/**
 * ArcotWebFortBulkOperationsAPISOAP12BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl;

public class ArcotWebFortBulkOperationsAPISOAP12BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPIPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadOATHTokens");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "UploadOATHTokensRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">UploadOATHTokensRequest"), com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">UploadOATHTokensResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "UploadOATHTokensResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AssignCredentials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "AssignCredentialsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">AssignCredentialsRequest"), com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.AssignCredentialsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">CommonBulkOperationsResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "CommonBulkOperationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchOATHTokens");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "FetchOATHTokensRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensRequest"), com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensResponse"));
        oper.setReturnClass(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "FetchOATHTokensResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public ArcotWebFortBulkOperationsAPISOAP12BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotWebFortBulkOperationsAPISOAP12BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotWebFortBulkOperationsAPISOAP12BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">AssignCredentialsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.AssignCredentialsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">CommonBulkOperationsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">UploadOATHTokensRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">UploadOATHTokensResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">WebFortBulkOperationsFault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.WebFortBulkOperationsFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "AssignCredentialsRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.AssignCredentialsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "AssignCredentialsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFCredMgmt._7_0.CredContainer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "CredContainer");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "credContainer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BaseBulkOperationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BaseBulkOperationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BaseBulkOperationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BaseBulkOperationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BulkCredentialsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkCredentialsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BulkOATHTokensType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkOATHTokensType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "OATHTokenInfoType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "TokenStatusFilterType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.TokenStatusFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "UploadOATHTokensRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "UploadOATHTokensType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInHSM");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInHSM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInP12");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInP12.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">OrgDetails>isGlobal");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetailsIsGlobal.class;
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

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ErrorDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "IntegerList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ListType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "NameValueType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.NameValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ResponseDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.ResponseDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "StringList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "Validity");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity.class;
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

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", ">ArCredContainer");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFCredMgmt._7_0.CredContainer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "CredContainer");
            qName2 = new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "credentials");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "CredContainer");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFCredMgmt._7_0.CredContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "AdditionalInfo");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "ArKeyContainer");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.ArKeyContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "EncryptionMethod");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.EncryptionMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Key");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.Key.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "OTPFormat");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.OTPFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Token");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "TokenInfo");
            cachedSerQNames.add(qName);
            cls = com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo.class;
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

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse uploadOATHTokens(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensRequest uploadOATHTokensRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UploadOATHTokens");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UploadOATHTokens"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uploadOATHTokensRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse assignCredentials(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.AssignCredentialsRequest assignCredentialsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:AssignCredentials");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AssignCredentials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignCredentialsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse fetchOATHTokens(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensRequest fetchOATHTokensRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:FetchOATHTokens");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FetchOATHTokens"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fetchOATHTokensRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
