package com.avaloq.javaeeconcepts.cdi.scopes;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestScopedBean {

  private static final String NAME = RequestScopedBean.class.getSimpleName();

  public RequestScopedBean() {
    System.out.println("in constructor for " + NAME);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("in @PostConstruct for " + NAME);
  }

  public void foo() {}
}
