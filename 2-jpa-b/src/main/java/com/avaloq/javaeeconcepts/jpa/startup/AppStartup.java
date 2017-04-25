package com.avaloq.javaeeconcepts.jpa.startup;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
    findBookByNamedQuery();

    Author georgeOrwell = new Author("George Orwell", Genre.SCI_FI);
    georgeOrwell.setAddress(new Address("Jura", "Scotland"));
    Book book = new Book("1984", georgeOrwell, "Dystopian political sci-fi", 6.97F);
    createBook(book);

    findBookByNamedQuery();
    findBooksByCriteriaQuery();
    findBooksByJpqlQuery();
    findBooksByNativeQuery();
  }

  private void createBook(Book book) {
    System.out.println("Creating book: " + book);
    em.persist(book);
  }

  private void findBookByNamedQuery() {
    TypedQuery<Book> query = em.createNamedQuery("findAll", Book.class);
    List<Book> books = query.getResultList();

    System.out.println("Named Query returns " + books.size() + "books");
  }

  private void findBooksByNativeQuery() {
    List<Book> books = em.createNativeQuery("SELECT * FROM BOOKS", Book.class).getResultList();
    System.out.println("Native Query returns " + books.size() + " books");
  }

  private void findBooksByJpqlQuery() {
    List<Book> books = em.createQuery("SELECT b FROM books b WHERE b.author.genre = '" + Genre.SCI_FI + "'", Book.class).getResultList();
    System.out.println("JPQL Query returns " + books.size() + " books");

    for (Book book: books) {
      System.out.println("Found book: " + book);
    }
  }

  private void findBooksByCriteriaQuery() {
    CriteriaBuilder builder = em.getCriteriaBuilder();
    CriteriaQuery<Book> bookQuery = builder.createQuery(Book.class);
    Root<Book> b = bookQuery.from(Book.class);
    bookQuery.select(b).where(builder.equal(b.get("author").get("name"),  "George Orwell"));
    List<Book> books = em.createQuery(bookQuery).getResultList();
    System.out.println("Criteria Query returns " + books.size() + " books");

    for (Book book: books) {
      System.out.println("Found book: " + book);
    }
  }


}
