package org.example;

import org.example.services.UserServices;

public class UserClientApp {
    public static void main(String[] args) {

        UserServices userServices = new UserServices();
        if (userServices.validatePassword("Saj")) {
            System.out.println("password is within the parameter");
        } else {
            System.out.println("password isn't in the range");
        }

        if (userServices.validateFirstName("Sajj")) {
            System.out.println("UserName is with in the given Range");
        } else {
            System.out.println("UserName should be at least 4 chars long");
        }

    }
}
