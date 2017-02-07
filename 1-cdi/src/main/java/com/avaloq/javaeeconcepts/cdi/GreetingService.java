package com.avaloq.javaeeconcepts.cdi;

import javax.inject.Inject;

import com.avaloq.javaeeconcepts.cdi.qualifiers.Deutsche;

public class GreetingService {
  // comment qualifier back in to demo them
  @Inject //@Deutsche
  private Greeting greeting;

  public void greet(String name) {
    System.out.println(greeting.greet(name));
  }
}
