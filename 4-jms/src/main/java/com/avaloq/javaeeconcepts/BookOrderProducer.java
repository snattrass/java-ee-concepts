package com.avaloq.javaeeconcepts;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;

import com.avaloq.javaeeconcepts.to.BookOrderTO;

@Stateless
public class BookOrderProducer {
  @Resource(lookup = "java:/ConnectionFactory") // in-VM connection factory
  private ConnectionFactory connectionFactory;

  @Resource(lookup = "java:/jms/javaee-concepts/queue/BookOrderQueue")
  private Queue queue;

  public void sendOrder(BookOrderTO bookOrder) {
    try (JMSContext context = connectionFactory.createContext()) {
      // send message to the queue
      JMSProducer producer = context.createProducer();
      producer.send(queue, bookOrder);
      System.out.println("Internal order sent : " + bookOrder.toString());
    }
  }
}

//"java:/jms/javaee-concepts/queue/BookOrderQueue"),
