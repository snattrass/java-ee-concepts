package com.avaloq.javaeeconcepts.to;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credit-card")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardTO {

  @XmlElement(required = true)
  private String number;

  @XmlElement(name = "expiry-date", required = true)
  private Date expiryDate;

  @XmlElement(required = true)
  private String type;

  public CreditCardTO () {
  }

  public CreditCardTO (String number, Date expiryDate, String type) {
    this.number = number;
    this.expiryDate = expiryDate;
    this.type = type;
  }

  public String getNumber() {
    return number;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public String getType() {
    return type;
  }
}