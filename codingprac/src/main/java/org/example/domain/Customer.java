package org.example.domain;

public class Customer {
    private int customerAccountNumber;
    private String accountType;
    private double exisitingBalance;

    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(int customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getExisitingBalance() {
        return exisitingBalance;
    }

    public void setExisitingBalance(double exisitingBalance) {
        this.exisitingBalance = exisitingBalance;
    }
}
