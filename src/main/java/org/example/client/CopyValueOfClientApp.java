package org.example.client;

public class CopyValueOfClientApp {
    public static void main(String[] args) {

        //char[] ch={'H','E','L','L','O'};
        char[] ch={'H','E','L','L','O'};
        String convertedString=String.copyValueOf(ch);
        System.out.println(convertedString);
    }
}
