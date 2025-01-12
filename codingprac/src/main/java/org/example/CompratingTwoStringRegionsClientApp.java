package org.example;

public class CompratingTwoStringRegionsClientApp {

    public static void main(String[] args) {


        String str1 = "Hello World";
        String str2 = "World Hello";

        boolean result = str1.regionMatches(6, str2, 0, 5);
        if (result) {
            System.out.println("Both Strings " + str1 + " and str2 -->" + str2 + "Macthes");
        } else {
            System.out.println("Not Matching");
        }


    }
}
