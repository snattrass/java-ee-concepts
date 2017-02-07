//package com.avaloq.javaeeconcepts.cdi.startup;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//import javax.inject.Inject;
//
//import com.avaloq.javaeeconcepts.cdi.GreetingService;
//import com.avaloq.javaeeconcepts.cdi.lifecycle.LifecycleBean;
//
//@Startup
//@Singleton
//public class AppStartupDemoLifecycle {
//
//  @Inject
//  private GreetingService greetingService;
//
//  @Inject
//  private LifecycleBean lifecycleBean;
//
//  @PostConstruct
//  public void postConstruct() {
//    greetingService.greet("Simon");
//
//    //lifecycleBean.foo();
//  }
//}
