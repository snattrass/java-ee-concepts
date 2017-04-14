//package com.avaloq.javaeeconcepts.cdi.rest;
//
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//
//import com.avaloq.javaeeconcepts.cdi.scopes.ApplicationScopedBean;
//import com.avaloq.javaeeconcepts.cdi.scopes.RequestScopedBean;
//
//@Stateless
//@Path("/scope")
//public class ScopeController {
//
//  @Inject
//  private RequestScopedBean requestScopedBean;
//
//  @Inject
//  private ApplicationScopedBean applicationScopedBean;
//
//  @GET
//  @Path("/request")
//  public void runRequestScopedBean() {
//    requestScopedBean.foo();
//  }
//
//  @GET
//  @Path("/application")
//  public void runApplicationScopedBean() {
//    applicationScopedBean.foo();
//  }
//}