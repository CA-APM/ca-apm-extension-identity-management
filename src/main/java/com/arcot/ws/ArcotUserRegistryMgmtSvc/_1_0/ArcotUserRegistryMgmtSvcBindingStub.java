/**
 * ArcotUserRegistryMgmtSvcBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0;

public class ArcotUserRegistryMgmtSvcBindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.ArcotUserRegistryMgmtSvcPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "createOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">createOrgRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">createOrgResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "createOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "deleteOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">deleteOrgRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">deleteOrgResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "deleteOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listArcotAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listArcotAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listArcotAttributesRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listArcotAttributesResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listArcotAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "retrieveOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveOrgRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveOrgResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "retrieveOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refreshCache");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "refreshCacheRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">refreshCacheRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">refreshCacheResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "refreshCacheResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listRepositoryAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listRepositoryAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listRepositoryAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrgStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "updateOrgStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgStatusRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgStatusResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "updateOrgStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "updateOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "updateOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listOrgs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listOrgsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listOrgsRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListOrgsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listOrgsResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.OrganizationType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "listOrgsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "organization"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveDefaultOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "retrieveDefaultOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveDefaultOrgRequest"), com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveDefaultOrgResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", "retrieveDefaultOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public ArcotUserRegistryMgmtSvcBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotUserRegistryMgmtSvcBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotUserRegistryMgmtSvcBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">createOrgRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">createOrgResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">deleteOrgRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">deleteOrgResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listArcotAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listArcotAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listOrgsRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListOrgsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listOrgsResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.OrganizationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrganizationType");
            qName2 = new javax.xml.namespace.QName("", "organization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">refreshCacheRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">refreshCacheResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveDefaultOrgRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveDefaultOrgResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveOrgRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">retrieveOrgResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">AttributeMappingsType>mapping");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">ConnectionCredentialType>clientKeyStore");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeClientKeyStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">ConnectionCredentialType>ssl");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.ConnectionCredentialTypeSsl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">DNType>dnEntry");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DNTypeDnEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">LDAPRepositoryType>port");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountTypeForOrg");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountTypeForOrg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "ArcotAttributeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AttributeMappingsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">AttributeMappingsType>mapping");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "mapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "ConnectionCredentialType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.ConnectionCredentialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.CustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DNType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.DNTypeDnEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">DNType>dnEntry");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dnEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "LDAPRepositoryType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.LDAPRepositoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrganizationType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.OrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrgStatusType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.OrgStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryDetailsType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.RepositoryDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryOrgAttributeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UdsRegistrySuccessType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType.class;
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

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse createOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.CreateOrg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse deleteOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DeleteOrg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse listArcotAttributes(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListArcotAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listArcotAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse retrieveOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.RetrieveOrg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse refreshCache(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.RefreshCache");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "refreshCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse listRepositoryAttributes(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListRepositoryAttributes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listRepositoryAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse updateOrgStatus(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateOrgStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOrgStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse updateOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateOrg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.OrganizationType[] listOrgs(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListOrgsRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListOrgs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listOrgs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.OrganizationType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.OrganizationType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.OrganizationType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse retrieveDefaultOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.RetrieveDefaultOrg");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveDefaultOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
