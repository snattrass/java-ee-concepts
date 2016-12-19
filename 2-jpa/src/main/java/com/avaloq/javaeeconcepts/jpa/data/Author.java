package com.avaloq.javaeeconcepts.jpa.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.common.base.MoreObjects;

@Entity(name = "authors")
public class Author {
  @Id
  @GeneratedValue
  private Long id;
  private String name;

  public Author() {
  }

  public Author(String name) {
    this.name = name;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .toString();
  }
}
