package org.example;

import java.util.*;

import org.example.services.EmailServices;

public class EmailClientApp {
    public static void main(String[] args) {

        EmailServices emailServices = new EmailServices();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter date");
        String date = scanner.nextLine();

        String resultantTemplate = emailServices.emailTemplate(EmailServices.EMAIL_TEMPLATE, name, date);
        System.out.println(resultantTemplate);

    }
}
