package com.avaloq.javaeeconcepts.ejb;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;

@Singleton
public class OperationCacheEJB {
  private Map<String, Integer> operations = new HashMap<>();

  public void update(String operation) {
    Integer operationCount = operations.get(operation);
    operations.replace(operation, operationCount++);
  }
}
