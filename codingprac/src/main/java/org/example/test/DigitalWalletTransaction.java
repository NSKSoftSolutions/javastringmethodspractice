package org.example.test;

public class DigitalWalletTransaction {

    public static void addMoney(DigitalWallet wallet, int amount) throws TransactionException {
        if (wallet.getUserAccessToken() == null || wallet.getUserAccessToken().isEmpty()) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        }
        if (amount <= 0) {
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        }
        wallet.setBalance(wallet.getBalance() + amount);
    }

    public static void payMoney(DigitalWallet wallet, int amount) throws TransactionException {
        if (wallet.getUserAccessToken() == null || wallet.getUserAccessToken().isEmpty()) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        }
        if (amount <= 0) {
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        }
        if (wallet.getBalance() < amount) {
            throw new TransactionException("Insufficient balance", "INSUFFICIENT_BALANCE");
        }
        wallet.setBalance(wallet.getBalance() - amount);
    }
}

