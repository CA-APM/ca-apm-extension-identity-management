/**
 * Tews6PublicSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class Tews6PublicSoapBindingStub extends org.apache.axis.client.Stub implements tews6.wsdl.Tews6PublicPortType {
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
        oper.setName("ForgottenPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PublicTaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PublicTaskContext"), tews6.wsdl.PublicTaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPassword"), tews6.wsdl.ForgottenPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ForgottenPasswordQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PublicTaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PublicTaskContext"), tews6.wsdl.PublicTaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordQuery"), tews6.wsdl.ForgottenPasswordQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordQueryResult"));
        oper.setReturnClass(tews6.wsdl.ForgottenPasswordQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ForgottenPasswordSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PublicTaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PublicTaskContext"), tews6.wsdl.PublicTaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordSearch"), tews6.wsdl.ForgottenPasswordSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordSearchResult"));
        oper.setReturnClass(tews6.wsdl.ForgottenPasswordSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ForgottenPasswordSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public Tews6PublicSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Tews6PublicSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Tews6PublicSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ForgottenPasswordSearchResult>ResultItem>_BAR_VerifyAnswer_BAR_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem_BAR_VerifyAnswer_BAR_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ForgottenPasswordSearchResult>ResultItem>_BAR_VerifyQuestion_BAR_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem_BAR_VerifyQuestion_BAR_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ForgottenPasswordSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ForgottenPasswordSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ForgottenPasswordSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ForgottenPasswordSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ForgottenPasswordSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ForgottenPasswordSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ImsException>exception");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsExceptionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPassword");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordForgottenPasswordTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordForgottenPasswordTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ForgottenPasswordSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ForgottenPasswordSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PublicTaskContext");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PublicTaskContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "ConjunctionType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ConjunctionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "OperatorType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "PermissionType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PermissionType.class;
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

    public tews6.wsdl.ImsStatus forgottenPassword(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPassword forgottenPasswordPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ForgottenPasswordSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ForgottenPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {publicTaskContextPart, forgottenPasswordPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ForgottenPasswordQueryResult forgottenPasswordQuery(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPasswordQuery forgottenPasswordQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ForgottenPasswordQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ForgottenPasswordQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {publicTaskContextPart, forgottenPasswordQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ForgottenPasswordQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ForgottenPasswordQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ForgottenPasswordQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ForgottenPasswordSearchResult forgottenPasswordSearch(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPasswordSearch forgottenPasswordSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ForgottenPasswordSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ForgottenPasswordSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {publicTaskContextPart, forgottenPasswordSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ForgottenPasswordSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ForgottenPasswordSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ForgottenPasswordSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
