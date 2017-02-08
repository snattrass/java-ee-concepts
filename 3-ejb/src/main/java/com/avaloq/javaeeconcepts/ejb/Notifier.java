package com.avaloq.javaeeconcepts.ejb;

import java.util.concurrent.TimeUnit;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class Notifier {

  @Asynchronous
  public void send () {
    try {
      System.out.println("We've created a book, sending an email...");
      // some long running task
      TimeUnit.SECONDS.sleep(10);
    } catch (InterruptedException e) {
      // it's just demo code, we'll swallow the exception
    }

    System.out.println("... sent.");
  }
}
