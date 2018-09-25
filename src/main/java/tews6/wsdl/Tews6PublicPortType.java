/**
 * Tews6PublicPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public interface Tews6PublicPortType extends java.rmi.Remote {
    public tews6.wsdl.ForgottenPasswordSearchResult forgottenPasswordSearch(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPasswordSearch forgottenPasswordSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException;
    public tews6.wsdl.ImsStatus forgottenPassword(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPassword forgottenPasswordPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException;
    public tews6.wsdl.ForgottenPasswordQueryResult forgottenPasswordQuery(tews6.wsdl.PublicTaskContext publicTaskContextPart, tews6.wsdl.ForgottenPasswordQuery forgottenPasswordQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException;
}
