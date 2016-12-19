package com.avaloq.javaeeconcepts.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.avaloq.javaeeconcepts.data.Book;
import com.avaloq.javaeeconcepts.ejb.BookEJB;

@RequestScoped
@Path("/books")
@Produces("application/json")
@Consumes("application/json")
public class BookController {

  @Inject
  private BookEJB bookEJB;

  @POST
  public Book create(Book book) {
    return bookEJB.createBook(book);
  }

  @GET
  public List<Book> find() {
    return bookEJB.findBooks();
  }

  @PUT
  public Book update(Book book) {
    return bookEJB.updateBook(book);
  }

  @DELETE
  public void remove(Book book) {
    bookEJB.deleteBook(book);
  }
}