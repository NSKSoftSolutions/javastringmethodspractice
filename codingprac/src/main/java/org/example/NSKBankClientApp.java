package org.example;

import org.example.services.BankServices;

import java.util.Scanner;

public class NSKBankClientApp {
    public static void main(String[] args) {

        BankServices bankServices = new BankServices();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the FromAccount Numbers");
        String fromAccount = scanner.nextLine();
        System.out.println("Enter the toAccount Numbers");
        String toAccount = scanner.nextLine();
        System.out.println("Enter the Amount u want to send");
        double amount = scanner.nextDouble();

        bankServices.fundTransfer(fromAccount, toAccount, amount);


    }
}
