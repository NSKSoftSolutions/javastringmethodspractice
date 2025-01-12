package org.example.services;

public class CreditCardServices {
    //masked credit card
    public String maskedCc(String creditCard) {
        return creditCard.replaceAll("\\d(?=(\\d| ){4})", "*");
    }

    public String maskedDbCard(String debitCard) {
        return debitCard.replaceAll("\\d(?=(\\d| ){4})", "*");
    }
}
