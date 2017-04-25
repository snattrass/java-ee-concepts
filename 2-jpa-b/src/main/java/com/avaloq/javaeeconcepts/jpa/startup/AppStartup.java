package com.avaloq.javaeeconcepts.jpa.startup;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.avaloq.javaeeconcepts.jpa.data.Address;
import com.avaloq.javaeeconcepts.jpa.data.Author;
import com.avaloq.javaeeconcepts.jpa.data.Book;
import com.avaloq.javaeeconcepts.jpa.data.Genre;

@Startup
@Singleton
public class AppStartup {

  @PersistenceContext
  private EntityManager em;

  @PostConstruct
  public void postConstruct() {
    findBooks();

    Author georgeOrwell = new Author("George Orwell", Genre.SCI_FI);
    georgeOrwell.setAddress(new Address("Jura", "Scotland"));
    Book book = new Book("1984", georgeOrwell, "Dystopian political sci-fi", 6.97F);
    createBook(book);

    findBooks();
  }

  public void findBooks() {
    TypedQuery<Book> query = em.createNamedQuery("findAll", Book.class);
    System.out.println(query.getResultList().size() + " books found.");

    for (Book book: query.getResultList()) {
      System.out.println("Found book: " + book);
    }
  }

  public void createBook(Book book) {
    System.out.println("Creating book: " + book);
    em.persist(book);
  }
}
