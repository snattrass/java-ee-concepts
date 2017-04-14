package com.avaloq.javaeeconcepts.cdi;

public class DeutscheName implements Name {

  @Override
  public String givenName () {
    return "Florian";
  }

  @Override
  public String surname () {
    return "Aydt";
  }
}
