package com.avaloq.javaeeconcepts.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

import com.avaloq.javaeeconcepts.to.CreditCardTO;

@WebContext(contextRoot = "ws")
@WebService
public class CardValidator {

  @WebMethod
  public boolean validate(CreditCardTO creditCard) {
    Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);
    int n = Integer.parseInt(lastDigit.toString());
    return isEven(n);
  }

  private boolean isEven(int n) {
    return n % 2 == 0;
  }
}