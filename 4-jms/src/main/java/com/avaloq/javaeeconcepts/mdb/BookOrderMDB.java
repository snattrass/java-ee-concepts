package com.avaloq.javaeeconcepts.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import com.avaloq.javaeeconcepts.to.BookOrderTO;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/javaee-concepts/queue/BookOrderQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
})
public class BookOrderMDB implements MessageListener {

  public void onMessage(Message message) {
    try {
      BookOrderTO bookOrder = message.getBody(BookOrderTO.class);
      System.out.println("Received book order " + bookOrder);
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }
}
