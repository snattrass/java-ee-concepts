//package com.avaloq.javaeeconcepts.cdi.startup;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//import javax.inject.Inject;
//
//import com.avaloq.javaeeconcepts.cdi.interceptors.GreetingServiceWithInterceptor;
//
//@Startup
//@Singleton
//public class AppStartupDemoInterceptor {
//
//  @Inject
//  private GreetingServiceWithInterceptor greetingService;
//
//  @PostConstruct
//  public void postConstruct() {
//    greetingService.greet("Simon");
//  }
//}
