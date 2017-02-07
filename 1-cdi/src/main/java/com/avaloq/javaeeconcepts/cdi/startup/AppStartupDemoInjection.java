package com.avaloq.javaeeconcepts.cdi.startup;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.avaloq.javaeeconcepts.cdi.GreetingService;

@Startup
@Singleton
public class AppStartupDemoInjection {

  @Inject
  private GreetingService greetingService;

  @PostConstruct
  public void postConstruct() {
    greetingService.greet("Simon");
  }
}
