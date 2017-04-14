package com.avaloq.javaeeconcepts.cdi.producer;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.avaloq.javaeeconcepts.cdi.DeutscheName;
import com.avaloq.javaeeconcepts.cdi.EnglishName;
import com.avaloq.javaeeconcepts.cdi.Name;
import com.avaloq.javaeeconcepts.cdi.qualifiers.StereotypicalName;

@ApplicationScoped
public class NameProducer implements Serializable{
  @Produces @StereotypicalName
  public Name nameProvider () {
    int random = new Random().nextInt(10 - 1) + 1;
    return isEven(random) ? new EnglishName() : new DeutscheName();
  }

  private static boolean isEven(int n) {
    return n / 2 == 0;
  }
}

