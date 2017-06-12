package com.avaloq.javaeeconcepts.client;

import java.io.IOException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class Environment {
  static Context getContext () throws NamingException, IOException {
    Properties properties = new Properties();
    properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
    properties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
    return new InitialContext(properties);
  }
}
