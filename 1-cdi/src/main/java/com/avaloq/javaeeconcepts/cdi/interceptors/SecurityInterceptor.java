package com.avaloq.javaeeconcepts.cdi.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class SecurityInterceptor {

  @AroundInvoke
  public Object applySecurity(InvocationContext context) throws Exception {
    System.out.println("--- Applying security " + context.getMethod().getName() + "() ---");
    Object response  = context.proceed();
    System.out.println("--- Removing security" + context.getMethod().getName() + "() ---");

    return response;
  }
}
