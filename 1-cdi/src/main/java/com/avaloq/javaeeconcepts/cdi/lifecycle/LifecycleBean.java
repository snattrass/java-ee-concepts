package com.avaloq.javaeeconcepts.cdi.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleBean {

  private static final String NAME = LifecycleBean.class.getSimpleName();

  public LifecycleBean() {
    System.out.println("In constructor for " + NAME);
  }

  @PostConstruct
  private void postConstruct() {
    System.out.println("Creating " + NAME);
  }

  @PreDestroy
  private void preDestroy () {
    System.out.println("Destroying " + NAME);
  }
}
