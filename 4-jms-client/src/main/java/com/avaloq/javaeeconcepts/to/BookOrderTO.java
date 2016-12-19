package com.avaloq.javaeeconcepts.to;

import java.io.Serializable;
import java.util.Date;

public class BookOrderTO implements Serializable {

  private Long orderId;
  private Date creationDate;
  private String customerName;
  private Float totalAmount;

  public BookOrderTO (Long orderId, Date creationDate, String customerName, Float totalAmount) {
    this.orderId = orderId;
    this.creationDate = creationDate;
    this.customerName = customerName;
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString () {
    return com.google.common.base.MoreObjects.toStringHelper(this)
            .add("orderId", orderId)
            .add("creationDate", creationDate)
            .add("customerName", customerName)
            .add("totalAmount", totalAmount)
            .toString();
  }
}