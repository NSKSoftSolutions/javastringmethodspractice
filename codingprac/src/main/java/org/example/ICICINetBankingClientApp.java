package org.example;

import org.example.services.ICICIBankServices;

public class ICICINetBankingClientApp {

    public static void main(String[] args) {

        ICICIBankServices bankServices = new ICICIBankServices();
        String maskedAccountNumber = bankServices.maskingAccountNumber("022210858533");
        System.out.println("masked accountNumber is -->" + maskedAccountNumber);

        String maskedCCAcNumber = bankServices.maskedCurrentAccountNumber("022210858533");
        System.out.println(maskedCCAcNumber);

        System.out.println(bankServices.replaceDigitToChar("9848022338"));
        System.out.println(bankServices.maskingPassword("9848022338"));
        System.out.println(bankServices.maskingSixDigitsOfPhoneNumber("9848022338"));


    }


}
