package com.avaloq.javaeeconcepts.cdi;

public class EnglishName implements Name {

  @Override
  public String givenName () {
    return "John";
  }

  @Override
  public String surname () {
    return "Smith";
  }
}
