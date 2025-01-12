package org.example.services;

public class MailServices {


    public boolean validateMails(String email) {
        String regex = "^[A-Za-z0-9]+@[a-z]+.[a-z]+$";
        return email.matches(regex);
    }

}
