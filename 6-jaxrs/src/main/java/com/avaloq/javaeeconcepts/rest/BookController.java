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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.avaloq.javaeeconcepts.data.Book;
import com.avaloq.javaeeconcepts.ejb.BookDAO;

@RequestScoped
@Path("/books")
@Produces({"application/json", "application/xml"})
@Consumes("application/json")
public class BookController {

  @Inject
  private BookDAO bookDao;

  @POST
  public Book create(Book book) {
    return bookDao.createBook(book);
  }

  @GET
  public List<Book> findAll() {
    return bookDao.findAllBooks();
  }

  @GET
  @Path("/{id}")
  public Book find(@PathParam("id") Long id) {
    return bookDao.findBookById(id);
  }

  @PUT
  public Book update(Book book) {
    return bookDao.updateBook(book);
  }

  @DELETE
  public void remove(@QueryParam("id") Long id) {
    bookDao.deleteBook(id);
  }
}
