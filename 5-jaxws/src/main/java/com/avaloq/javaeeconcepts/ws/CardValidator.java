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
    int lastDigit = getLastDigitFromCardNumber(creditCard.getNumber());
    return isEven(lastDigit);
  }

  private static int getLastDigitFromCardNumber(String cardNumber) {
    Character lastCharacterFromCardNumber = cardNumber.charAt(cardNumber.length() - 1);
    return Integer.parseInt(lastCharacterFromCardNumber.toString());
  }

  private static boolean isEven(int n) {
    return n % 2 == 0;
  }
}
