package com.avaloq.javaeeconcepts.ejb;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;

import com.google.common.base.Joiner;

@Singleton
public class OperationCacheEJB {
  private Map<String, Integer> operations = new HashMap<>();

  public void update (String operation) {
    if (!operations.containsKey(operation)) {
      operations.put(operation, 0);
    }

    Integer operationCount = operations.get(operation);

    operations.replace(operation, ++operationCount);
    System.out.println("Updating operations cache to " + operations);
  }

  @Override
  public String toString() {
    return "[" + Joiner.on(",").withKeyValueSeparator(":").join(operations) + "]";
  }
}
