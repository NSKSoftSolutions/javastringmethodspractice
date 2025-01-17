package org.example.test;

public class DigitalWallet {
    private String walletId;
    private String username;
    private String userAccessToken;
    private int balance;

    public DigitalWallet(String walletId, String username) {
        this.walletId = walletId;
        this.username = username;
        this.userAccessToken = null;
        this.balance = 0;
    }

    public DigitalWallet(String walletId, String username, String userAccessToken) {
        this.walletId = walletId;
        this.username = username;
        this.userAccessToken = userAccessToken;
        this.balance = 0;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

