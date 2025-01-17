package org.example.stringprac.clientapps;

import org.example.stringprac.WebsiteWithVipContactNumbers;

import java.util.Scanner;

public class WebSiteVipContactsClientAppp {
    public static void main(String[] args) {

        WebsiteWithVipContactNumbers numbers = new WebsiteWithVipContactNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter repalcement String");
        String replacement = scanner.nextLine();
        System.out.println("Enter the inputString");
        String inputString = scanner.nextLine();

        String repalcedString = numbers.formattingPhoneNumbers(inputString, replacement);
        System.out.println("replacedString --" + repalcedString);



    }
}
