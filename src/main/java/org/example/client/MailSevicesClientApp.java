package org.example.client;

import org.example.services.MailServices;

public class MailSevicesClientApp {
    public static void main(String[] args) {

        MailServices mailServices = new MailServices();
        if (mailServices.validateMails("sajjad@gmail.com")) {
            System.out.println("Hurrey!..Email is Validated");
        } else {
            System.out.println("Enter Valid Mail, and Please Try Again");
        }


    }
}
