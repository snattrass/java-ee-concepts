package com.avaloq.javaeeconcepts.cdi;

import javax.inject.Inject;

import com.avaloq.javaeeconcepts.cdi.qualifiers.StereotypicalName;

public class GreetingService {
  @Inject //@Deutsche
  private Greeting greeting;

//  @Inject @StereotypicalName
//  private Name name;

  public void greet(String name) {
    System.out.println(greeting.greet(name));
  }

//  public void greet() {
//    System.out.println(greeting.greet(name.givenName() + " " + name.surname()));
//  }
}
