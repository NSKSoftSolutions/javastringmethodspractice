package org.example.client;

import org.example.services.FormatStringServcies;

public class FomattingGivenStringClient {
    public static void main(String[] args) {

        FormatStringServcies formatStringServcies = new FormatStringServcies();
        String formattedString = formatStringServcies.greeting("Sufiyan");
        System.out.println(formattedString);

    }
}
