package com.avaloq.javaeeconcepts.cdi;

public class SimpleGreeting implements Greeting {
  public String greet (String name) {
    return "Hello there " + name;
  }
}
