package com.avaloq.javaeeconcepts.client;

import java.io.IOException;
import java.util.Date;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.naming.Context;
import javax.naming.NamingException;

import com.avaloq.javaeeconcepts.to.BookOrderTO;

public class BoodOrderProducer {

  public static void main(String[] args) throws NamingException, IOException {
    BookOrderTO bookOrder = BookOrderTO.newBuilder()
            .orderId(123L)
            .creationDate(new Date())
            .customerName("Simon Nattrass")
            .totalAmount(23.00F)
            .build();

    // grab the JNDI context
    Context jndiContext = Environment.getContext();

    // lookup the administered objects
    ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup("jms/RemoteConnectionFactory");
    Destination queue = (Destination) jndiContext.lookup("jms/javaee-concepts/queue/BookOrderQueue");

    try (JMSContext jmsContext = connectionFactory.createContext("jms-user", "novell")) {
      // send message to the queue
      JMSProducer producer = jmsContext.createProducer();
      producer.send(queue, bookOrder);
      System.out.println("Order sent : " + bookOrder.toString());
    }
  }
}
