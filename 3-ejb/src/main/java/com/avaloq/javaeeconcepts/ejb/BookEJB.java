package com.avaloq.javaeeconcepts.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.avaloq.javaeeconcepts.data.Book;

@Stateless
@LocalBean
public class BookEJB implements BookEJBRemote {

  @PersistenceContext
  private EntityManager em;

  @Inject
  private OperationCacheEJB operationCache;

  public List<Book> findBooks() {
    TypedQuery<Book> query = em.createNamedQuery("findAll", Book.class);
    System.out.println(query.getResultList().size() + " books found.");

    operationCache.update("find");
    return query.getResultList();
  }

  public Book createBook(Book book) {
    System.out.println("Creating book: " + book);
    em.persist(book);
    operationCache.update("create");
    return book;
  }

  public Book updateBook(Book book) {
    System.out.println("Updating book: " + book);
    operationCache.update("update");
    return em.merge(book);
  }

  public void deleteBook(Book book) {
    em.remove(em.merge(book));
    operationCache.update("delete");
  }
}
