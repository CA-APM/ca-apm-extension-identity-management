/**
 * ArcotWebFortAdminSvcSOAP12BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl;

public class ArcotWebFortAdminSvcSOAP12BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "CreateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">CreateRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.CreateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "UpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">UpdateRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.UpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "FetchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "FetchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "DeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">DeleteRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.DeleteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignDefault");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "AssignDefaultRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">AssignDefaultRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.AssignDefaultRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fetchEventDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "FetchEventDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchEventDetailsRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchEventDetailsResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "FetchEventDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isKeyAvailableInHSM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "IsKeyAvailableInHSMRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">IsKeyAvailableInHSMRequest"), com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.IsKeyAvailableInHSMRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response"));
        oper.setReturnClass(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public ArcotWebFortAdminSvcSOAP12BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotWebFortAdminSvcSOAP12BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotWebFortAdminSvcSOAP12BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">>FetchRequest>isFetchOnlyNames");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequestIsFetchOnlyNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">>FetchResponse>configurations");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponseConfigurations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">AssignDefaultRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.AssignDefaultRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">CreateRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.CreateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">DeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.DeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchEventDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchEventDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">IsKeyAvailableInHSMRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.IsKeyAvailableInHSMRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">Response");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">UpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.UpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">WebFortAdminFault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.WebFortAdminFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigFilter>isAllConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilterIsAllConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDDomainKeyConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDDomainKeyConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPMasterKeyConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPMasterKeyConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>asspConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>asspCredTypeResolutionConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspCredTypeResolutionConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>calloutConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCalloutConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>credTypeResolutionConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCredTypeResolutionConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvOTPMasterKeyConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvOTPMasterKeyConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>keyConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListKeyConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>miscellaneousConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListMiscellaneousConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathOTPMasterKeyConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathOTPMasterKeyConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>passwordAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>passwordIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>pluginConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPluginConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>qnaAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>qnaIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusClientConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusClientConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusCredTypeResolutionConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusCredTypeResolutionConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusServerConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusServerConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>samlTokenConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListSamlTokenConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>serverOTPAuthConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPAuthConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>serverOTPIssuanceConfigs");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPIssuanceConfigs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "AssignDefault");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.AssignDefault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPConfigRes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfigRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPMechanism");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanism.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPMechanismList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanismList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseAdminReq");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseAdminRes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CalloutConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CalloutConfigRes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfigRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigStatus");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNames");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNamesList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNamesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationObjectList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationsInput");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationsInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredentialHistoryConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredTypeResolutionConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EAPAuthTypeConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EAPAuthTypeDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EMVAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EMVIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetailsList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ExtModuleEvents");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "KeyConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "MiscellaneousConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OATHAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OATHIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OTPCounterTolerance");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OTPCounterTolerance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordStrengthParameters");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfigElement");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfigElementList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElementList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClient");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClientConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClientConfigRes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfigRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServer");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLAdditionalAttribute");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLAdditionalAttributeList");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttributeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenAttributes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenConfigRes");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfigRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ServerOTPAuthConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ServerOTPIssuanceConfig");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "UserCheck");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "WebFortAdminErrorDetails");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.WebFortAdminErrorDetails.class;
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

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response create(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.CreateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response update(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.UpdateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse fetch(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:fetch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "fetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response delete(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.DeleteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response assignDefault(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.AssignDefaultRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:assignDefault");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "assignDefault"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse fetchEventDetails(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:fetchEventDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "fetchEventDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response isKeyAvailableInHSM(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.IsKeyAvailableInHSMRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:isKeyAvailableInHSM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "isKeyAvailableInHSM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
