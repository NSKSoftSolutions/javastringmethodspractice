package org.example.oopspractices;

public class Customer {

    private int customerId;
    private String customerName;
    private long accountNumber;
    private double balance;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdrawal(long accNumber, double amountToWithdraw) {
        if (accountNumber == accNumber || accountNumber != 0) {
            if (amountToWithdraw < balance || amountToWithdraw < 0) {
                System.out.println("Withdrawing " + amountToWithdraw + "from --->" + accountNumber);
                balance = balance - amountToWithdraw;
                System.out.println("After Withdrawl the account Balance is -->"+balance);
            } else {
                System.out.println("Dont have sufficent funds, please add funds");
            }
        }
    return balance;
    }


}
