package com.avaloq.javaeeconcepts.cdi;

import com.avaloq.javaeeconcepts.cdi.qualifiers.Deutsche;

@Deutsche
public class DeutscheGreeting implements Greeting {
  public String greet (String name) {
    return "Hallo " + name;
  }
}
