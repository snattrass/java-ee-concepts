package com.avaloq.javaeeconcepts.jaxws.client;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.avaloq.javaeeconcepts.ws.CardValidator;
import com.avaloq.javaeeconcepts.ws.CardValidatorService;
import com.avaloq.javaeeconcepts.ws.CreditCardTO;

public class Main {
  public static void main (String[] args) throws  Exception {
    CardValidator cardValidator = new CardValidatorService().getCardValidatorPort();

    CreditCardTO creditCardTO = new CreditCardTO();
    creditCardTO.setType("Amex");
    creditCardTO.setExpiryDate(oneYearFromNow());
    creditCardTO.setNumber("1234");

    System.out.println("Result: " + cardValidator.validate(creditCardTO));
  }

  private static XMLGregorianCalendar oneYearFromNow() throws DatatypeConfigurationException {
    LocalDate oneYearFromNow = LocalDate.now().plusYears(1);
    GregorianCalendar gcal = GregorianCalendar.from(oneYearFromNow.atStartOfDay(ZoneId.systemDefault()));
    return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
  }
}
