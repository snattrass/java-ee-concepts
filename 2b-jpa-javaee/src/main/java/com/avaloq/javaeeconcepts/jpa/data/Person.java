package com.avaloq.javaeeconcepts.jpa.data;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

  @Id @GeneratedValue
  protected Long id;

  protected String name;

  @Embedded
  protected Address address;

  public Person () {
  }

  public Long getId () {
    return id;
  }

  public void setId (Long id) {
    this.id = id;
  }

  public String getName () {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }

  public Address getAddress () {
    return address;
  }

  public void setAddress (Address address) {
    this.address = address;
  }
}
