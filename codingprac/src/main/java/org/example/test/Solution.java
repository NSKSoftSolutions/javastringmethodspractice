package org.example.test;

import org.example.test.DigitalWallet;
import org.example.test.DigitalWalletTransaction;
import org.example.test.TransactionException;

import java.util.*;
import java.io.*;

public class Solution {
    private static final Scanner inputReader = new Scanner(System.in);
    private static final DigitalWalletTransaction digitalWalletTransaction = new DigitalWalletTransaction();
    private static final Map<String, DigitalWallet> digitalWallets = new HashMap<>();

    public static void main(String[] args) {
        // Step 1: Read the number of wallets
        int numberOfWallets = Integer.parseInt(inputReader.nextLine());

        // Step 2: Initialize wallets
        while (numberOfWallets-- > 0) {
            String[] walletData = inputReader.nextLine().split("");
            DigitalWallet digitalWallet;

            if (walletData.length == 2) {
                digitalWallet = new DigitalWallet(walletData[0], walletData[1]);
            } else {
                digitalWallet = new DigitalWallet(walletData[0], walletData[1], walletData[2]);
            }

            digitalWallets.put(walletData[0], digitalWallet);
        }

        // Step 3: Process transactions
        int numberOfTransactions = Integer.parseInt(inputReader.nextLine());

        while (numberOfTransactions-- > 0) {
            String[] transactionData = inputReader.nextLine().split("");
            DigitalWallet digitalWallet = digitalWallets.get(transactionData[0]);

            try {
                if ("add".equalsIgnoreCase(transactionData[1])) {
                    digitalWalletTransaction.addMoney(digitalWallet, Integer.parseInt(transactionData[2]));
                    System.out.println("Amount successfully credited.");
                } else if ("pay".equalsIgnoreCase(transactionData[1])) {
                    digitalWalletTransaction.payMoney(digitalWallet, Integer.parseInt(transactionData[2]));
                    System.out.println("Amount successfully debited.");
                }
            } catch (TransactionException ex) {
                System.out.println(ex.getErrorCode() + ": " + ex.getMessage() + ".");
            }
        }

        // Step 4: Print final wallet balances
        for (DigitalWallet wallet : digitalWallets.values()) {
            System.out.println(wallet.getWalletId() + " " + wallet.getUsername() + " " + wallet.getBalance());
        }
    }
}
