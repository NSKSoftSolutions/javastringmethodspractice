package org.example;

import org.example.services.BankAccount;

public class ANDBClientApp {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);
        Thread t1 = new Thread(() -> bankAccount.deposit("SreRam", 5000.00));
        Thread t2 = new Thread(() -> bankAccount.deposit("Hayath", 5000.00));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
