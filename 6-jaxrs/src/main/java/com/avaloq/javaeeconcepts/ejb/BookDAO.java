package com.avaloq.javaeeconcepts.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.avaloq.javaeeconcepts.data.Book;

@Stateless
public class BookDAO {

  @PersistenceContext
  private EntityManager em;

  public List<Book> findAllBooks() {
    System.out.println("Finding all books");
    TypedQuery<Book> query = em.createNamedQuery("findAll", Book.class);
    System.out.println(query.getResultList().size() + " books found.");
    return query.getResultList();
  }

  public Book findBookById (Long id) {
    System.out.println("Finding book id: " + id);
    return em.find(Book.class, id);
  }

  public Book createBook(Book book) {
    System.out.println("Creating book: " + book);
    em.persist(book);
    return book;
  }

  public Book updateBook(Book book) {
    System.out.println("Updating book: " + book);
    return em.merge(book);
  }

  public void deleteBook(Long id) {
    System.out.println("Deleting book id: " + id);
    em.remove(findBookById(id));
  }
}