package com.avaloq.javaeeconcepts.cdi;

public class EnglishGreeting implements Greeting {
  public String greet (String name) {
    return "Hello " + name;
  }
}
