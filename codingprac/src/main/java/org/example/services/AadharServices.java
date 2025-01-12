package org.example.services;

public class AadharServices {

    public String maskedAadhar(String aadharNumber) {
        return aadharNumber.replaceAll("\\d(?=(\\d| ){4})", "*");
    }

    public String maskedPanCardServices(String panCard) {
        return panCard.replaceAll("\\d(?=.{0,4}$)", "*");
    }
}
