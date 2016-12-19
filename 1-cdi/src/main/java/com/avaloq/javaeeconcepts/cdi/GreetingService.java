package com.avaloq.javaeeconcepts.cdi;

import javax.inject.Inject;

public class GreetingService {
  @Inject
  private Greeting greeting;

  public void greet(String name) {
    System.out.println(greeting.greet(name));
  }
}
