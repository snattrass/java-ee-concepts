package com.avaloq.javaeeconcepts.jpa.data;

import javax.persistence.Embeddable;

import com.google.common.base.MoreObjects;

@Embeddable
public class Address {

  private String city;
  private String country;

  public Address () {
  }

  public Address (String city, String country) {
    this.city = city;
    this.country = country;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("city", city)
            .add("country", country)
            .toString();
  }
}
