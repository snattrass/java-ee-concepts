package com.avaloq.javaeeconcepts.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.MoreObjects;

@Entity(name = "books")
@NamedQueries({
        @NamedQuery(name = "findAll", query = "SELECT b FROM books b"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM books b WHERE b.title ='H2G2'")
})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
  @Id
  @GeneratedValue
  @XmlAttribute
  private Long id;

  @XmlElement
  private String title;

  @XmlElement
  private Float price;

  @XmlElement
  private String description;

  @OneToOne(cascade = CascadeType.PERSIST)
  @XmlElement
  private Author author;

  public Book () {
  }

  public Book (String title, Author author, String description, Float price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.description = description;
  }

  public Long getId () {
    return id;
  }

  public String getTitle () {
    return title;
  }

  public String getDescription () {
    return description;
  }

  public Author getAuthor () {
    return author;
  }

  public Float getPrice () {
    return price;
  }

  public void setPrice (Float price) {
    this.price = price;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("title", title)
            .add("author", author)
            .add("description", description)
            .add("price", price)
            .toString();
  }
}