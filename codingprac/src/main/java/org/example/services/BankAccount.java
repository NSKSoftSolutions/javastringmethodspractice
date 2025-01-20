package org.example.services;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(String depositor, double depositingAmount) {
        System.out.println(depositor+"is depositing Rupees "+depositingAmount);
        balance=balance+depositingAmount;
        System.out.println("Completed deposit and the udpated Balance is --"+balance);
    }
}
