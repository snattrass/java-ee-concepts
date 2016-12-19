package com.avaloq.javaeeconcepts.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.avaloq.javaeeconcepts.data.Book;

@Remote
public interface BookEJBRemote {

  List<Book> findBooks ();

  Book createBook (Book book);

  void deleteBook (Book book);

  Book updateBook (Book book);
}