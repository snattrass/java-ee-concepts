package com.avaloq.javaeeconcepts.jpa.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.google.common.base.MoreObjects;

@Entity(name = "books")
@NamedQueries({
        @NamedQuery(name = "findAll", query = "SELECT b FROM books b"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM books b WHERE b.title ='H2G2'")
})
public class Book {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private Float price;
  private String description;

  @OneToOne(cascade = CascadeType.PERSIST)
  private Author author;

  public Book () {
  }

  public Book (String title, Author author, String description, Float price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.description = description;
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