package org.example.services;

import org.example.domain.Customer;

import java.util.*;

public class BankingServices {

    private static final String DEFAULT_MESSAGE_BALANCE_CHECK = "Dear %s, the current Balance is %.2f in your Account-Number %d";
    private static final String LOAN_INTREST_RATE_NOTIFICATION = "Dear %s, Ur loan intreast Rate is reduced from old Rate %.1f to newRate %.1f";

    //finding the 5digit number in a bank account
    public void accountTypeValidation() {
        System.out.println("Enter the BankAccount Type");
        String accountType = new Scanner(System.in).next();
        if (accountType.indexOf('s') != -1) {
            System.out.println("Savings account Number");
        } else if (accountType.indexOf('c') != -1) {
            System.out.println("Current Account Number");
        }
    }

    public String checkBalance(Customer customer) {
        return String.format(DEFAULT_MESSAGE_BALANCE_CHECK, customer.getCustomerName(), customer.getExisitingBalance(), customer.getCustomerAccountNumber());
    }

    public String loanIntresetRateNotification(Customer customer, float oldRate, float newRate) {
        System.out.println("Checking the Latest Interast rate For Loan");
        String newLoanRates = String.format(LOAN_INTREST_RATE_NOTIFICATION, customer.getCustomerName(), oldRate, newRate);
        System.out.println(newLoanRates);
        return newLoanRates;
    }
}
