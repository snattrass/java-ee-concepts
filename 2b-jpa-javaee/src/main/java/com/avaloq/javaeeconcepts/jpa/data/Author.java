package com.avaloq.javaeeconcepts.jpa.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.google.common.base.MoreObjects;

@Entity(name = "authors")
public class Author extends Person {

  @Enumerated(EnumType.STRING)
  private Genre genre;

  public Author() {
  }

  public Author(String name, Genre genre) {
    this.name = name;
    this.genre = genre;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .add("genre", genre)
            .add("address", address)
            .toString();
  }
}
