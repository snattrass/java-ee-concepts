package com.avaloq.javaeeconcepts.cdi.scopes;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopedBean {

  private static final String NAME = ApplicationScopedBean.class.getSimpleName();

  public ApplicationScopedBean () {
    System.out.println("In constructor for " + NAME);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("Calling postConstruct for " + NAME);
  }

  public void foo() {}
}
