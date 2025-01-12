package org.example;

import org.example.services.AadharServices;

public class AadharCardClientApp {
    public static void main(String[] args) {

        AadharServices aadharServices = new AadharServices();
        String maskedAadharCard = aadharServices.maskedAadhar("1234 5678 9101 1213");
        System.out.println("Masked AadharCard -- " + maskedAadharCard);

        String maskedPanCard = aadharServices.maskedPanCardServices("ABCD0001N");
        System.out.println("maskedPancard -- " + maskedPanCard);
    }
}
