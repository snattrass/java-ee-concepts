package com.avaloq.javaeeconcepts.cdi.scopes;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScopedBean {

  private static final String NAME = RequestScopedBean.class.getSimpleName();

  public RequestScopedBean () {
    System.out.println("In constructor for " + NAME);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("Creating " + NAME);
  }

  public void foo() {}
}
