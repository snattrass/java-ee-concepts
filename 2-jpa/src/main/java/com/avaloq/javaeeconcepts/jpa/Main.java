package com.avaloq.javaeeconcepts.jpa;

import java.util.concurrent.TimeUnit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.h2.tools.Server;

import com.avaloq.javaeeconcepts.jpa.data.Author;
import com.avaloq.javaeeconcepts.jpa.data.Book;

public class Main {

  public static void main(String[] args) throws Exception {

    Server webServer = Server.createWebServer("-webAllowOthers","-webPort","8082").start();
    Server server = Server.createTcpServer("-tcpAllowOthers","-tcpPort","9092").start();

    // 1-Creates an instance of book
    Book book = new Book("H2G2", new Author("Douglas Adams"), "The Hitchhiker's Guide to the Galaxy", 12.5F);

    // 2-Obtains an entity manager and a transaction
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-sample-pu");
    EntityManager em = emf.createEntityManager();

    // 3-Persists the book to the database
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(book);
    tx.commit();

    // 4-Executes the named query
    Book hg2g = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
    System.out.println(">>> " + hg2g);

    // 5-Closes the entity manager and the factory
    em.close();
    emf.close();

    TimeUnit.MINUTES.sleep(5);
    webServer.stop();
    server.stop();
  }
}
