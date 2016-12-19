package com.avaloq.javaeeconcepts.cdi.interceptors;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import com.avaloq.javaeeconcepts.cdi.Greeting;

public class GreetingServiceWithInterceptor {
  @Inject
  private Greeting greeting;

  @Interceptors(BeforeAndAfterLoggingInterceptor.class)
  public void greet(String name) {
    System.out.println(greeting.greet(name));
  }
}
