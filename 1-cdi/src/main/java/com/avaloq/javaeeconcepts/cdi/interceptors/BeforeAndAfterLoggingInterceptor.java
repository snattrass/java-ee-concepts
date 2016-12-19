package com.avaloq.javaeeconcepts.cdi.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class BeforeAndAfterLoggingInterceptor {

  @AroundInvoke
  public Object logBeforeAndAfter(InvocationContext context) throws Exception {
    System.out.println("--- Before calling method " + context.getMethod().getName() + "() ---");
    Object response  = context.proceed();
    System.out.println("--- After calling method " + context.getMethod().getName() + "() ---");

    return response;
  }
}
