package com.avaloq.javaeeconcepts.cdi.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

  @AroundInvoke
  public Object applyLogging (InvocationContext context) throws Exception {
    System.out.println("--- Before calling method " + context.getMethod().getName() + "() ---");
    Object response  = context.proceed();
    System.out.println("--- After calling method " + context.getMethod().getName() + "() ---");

    return response;
  }
}
