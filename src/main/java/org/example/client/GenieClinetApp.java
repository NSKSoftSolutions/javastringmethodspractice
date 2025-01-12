package org.example.client;

import org.example.services.GenieServices;

public class GenieClinetApp {

    public static void main(String[] args) {

        String text = "Can you Help Me?";

        GenieServices genieServices = new GenieServices();
        if (genieServices.chatValidator(text, '?') != -1) {
            System.out.println("Genie found your Question and it is processing the res");
        } else {
            System.out.println("Please tryAgain");
        }

    }

}
