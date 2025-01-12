package org.example.services;

public class UserServices {

    public boolean validatePassword(String password) {
        return password.matches("[A-Za-z0-9]{10,16}");
    }

    public boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Za-z]{4,10}");
    }


}
