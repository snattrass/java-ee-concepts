//package com.avaloq.javaeeconcepts.jpa.data;
//
//import javax.persistence.Embedded;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//
//@MappedSuperclass
//public class Person {
//
//  @Id @GeneratedValue
//  protected Long id;
//
//  private String name;
//
//  @Embedded
//  private Address address;
//
//  public Person () {
//  }
//
//  public Person (String name, Address address) {
//    this.name = name;
//    this.address = address;
//  }
//}
