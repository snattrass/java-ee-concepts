package com.avaloq.javaeeconcepts.jaxws.client;

import com.avaloq.javaeeconcepts.ws.CardValidator;
import com.avaloq.javaeeconcepts.ws.CardValidatorService;
import com.avaloq.javaeeconcepts.ws.CreditCardTO;

public class Main {
  public static void main (String[] args) {
    CardValidator cardValidator = new CardValidatorService().getCardValidatorPort();

    CreditCardTO creditCardTO = new CreditCardTO();
    creditCardTO.setType("Amex");
    creditCardTO.setExpiryDate("foo");
    creditCardTO.setNumber("1234");

    System.out.println("Result: " + cardValidator.validate(creditCardTO));
  }
}
