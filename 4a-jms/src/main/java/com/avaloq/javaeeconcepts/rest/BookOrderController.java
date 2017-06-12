package com.avaloq.javaeeconcepts.rest;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.avaloq.javaeeconcepts.BookOrderProducer;
import com.avaloq.javaeeconcepts.to.BookOrderTO;

@RequestScoped
@Path("/orders")
@Produces("application/json")
public class BookOrderController {

  @Inject
  private BookOrderProducer bookOrderProducer;

  @POST
  public BookOrderTO createOrder() {
    BookOrderTO bookOrder = BookOrderTO.newBuilder()
            .orderId(321L)
            .creationDate(new Date())
            .customerName("Simon Nattrass")
            .totalAmount(999.0F)
            .build();

    bookOrderProducer.sendOrder(bookOrder);
    return bookOrder;
  }
}
