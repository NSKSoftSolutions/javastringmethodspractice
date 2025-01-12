package org.example;

import org.example.services.CreditCardServices;

public class CreditCardClientApp {
    public static void main(String[] args) {

        CreditCardServices creditCardServices = new CreditCardServices();
        String maskedCard = creditCardServices.maskedCc("1234 5678 9810 1112");
        System.out.println("my masked CreditCard is --" + maskedCard);

        String maskedDebitCard = creditCardServices.maskedDbCard("9876 5432 1234 5678");
        System.out.println("masked Debit Card -" + maskedDebitCard);

    }
}
