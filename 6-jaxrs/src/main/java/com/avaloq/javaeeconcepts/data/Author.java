package com.avaloq.javaeeconcepts.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.google.common.base.MoreObjects;

@Entity(name = "authors")
public class Author {
  @Id
  @GeneratedValue
  @XmlAttribute
  private Long id;

  @XmlElement
  private String name;

  public Author() {
  }

  public Author(String name) {
    this.name = name;
  }

  public Long getId () {
    return id;
  }

  public String getName () {
    return name;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .toString();
  }
}
