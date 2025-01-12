package org.example;


import org.example.domain.Customer;
import org.example.services.BankingServices;

import java.util.*;

public class BankClientApp {
    public static void main(String[] args) {

        BankingServices bankingServices = new BankingServices();
        //bankingServices.accountTypeValidation();
        Customer customer = new Customer();
        customer.setCustomerAccountNumber(12345678);
        customer.setCustomerName("Sajjad Ali khan Navab");
        customer.setAccountType("Salary Account");
        customer.setExisitingBalance(100000);

        boolean wantsToContinue = true;
        while (wantsToContinue) {
            System.out.println("Choose the Option");
            System.out.println("1. Check Balance");
            System.out.println("2. check current loanIntresetRate");
            System.out.println("3. ATM Pin change");
            System.out.println("4. Mobile Number change");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bankingServices.checkBalance(customer);
                    break;
                case 2:
                    System.out.println("Enter Old Rate");
                    float oldRate = scanner.nextFloat();
                    System.out.println("Enter New Rate");
                    float newRate = scanner.nextFloat();
                    bankingServices.loanIntresetRateNotification(customer, oldRate, newRate);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("completed the TX");
            }
            if (wantsToContinue) {
                System.out.println("if you want continue (yes/no)");
                String input = scanner.next();
                wantsToContinue = input.equalsIgnoreCase("yes");
            }
        }


/*
        String res = bankingServices.checkBalance(customer);
        System.out.println(res);
*/
    }
}
