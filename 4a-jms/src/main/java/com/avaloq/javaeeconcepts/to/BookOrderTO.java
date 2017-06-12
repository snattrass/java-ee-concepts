package com.avaloq.javaeeconcepts.to;

import java.io.Serializable;
import java.util.Date;

import com.google.common.base.MoreObjects;

public class BookOrderTO implements Serializable {

  private Long orderId;
  private Date creationDate;
  private String customerName;
  private Float totalAmount;

  private BookOrderTO (Builder builder) {
    setOrderId(builder.orderId);
    setCreationDate(builder.creationDate);
    setCustomerName(builder.customerName);
    setTotalAmount(builder.totalAmount);
  }

  public static Builder newBuilder () {
    return new Builder();
  }

  public Long getOrderId () {
    return orderId;
  }

  public void setOrderId (Long orderId) {
    this.orderId = orderId;
  }

  public Date getCreationDate () {
    return creationDate;
  }

  public void setCreationDate (Date creationDate) {
    this.creationDate = creationDate;
  }

  public String getCustomerName () {
    return customerName;
  }

  public void setCustomerName (String customerName) {
    this.customerName = customerName;
  }

  public Float getTotalAmount () {
    return totalAmount;
  }

  public void setTotalAmount (Float totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public String toString () {
    return MoreObjects.toStringHelper(this)
            .add("orderId", orderId)
            .add("creationDate", creationDate)
            .add("customerName", customerName)
            .add("totalAmount", totalAmount)
            .toString();
  }


  public static final class Builder {
    private Long orderId;
    private Date creationDate;
    private String customerName;
    private Float totalAmount;

    private Builder () {
    }

    public Builder orderId (Long val) {
      orderId = val;
      return this;
    }

    public Builder creationDate (Date val) {
      creationDate = val;
      return this;
    }

    public Builder customerName (String val) {
      customerName = val;
      return this;
    }

    public Builder totalAmount (Float val) {
      totalAmount = val;
      return this;
    }

    public BookOrderTO build () {
      return new BookOrderTO(this);
    }
  }
}