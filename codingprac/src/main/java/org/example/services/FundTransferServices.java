package org.example.services;

public class FundTransferServices {

    // A user initiates fundtransfer from his savings account to another account
    // in this process if a user enters -ve amount, we would throws exception

    double accountBalance = 1000;

    public void fundTransfer(String fromAccount, String toAccount, double amount) throws Exception {

        try {
            if (amount < 0) {
                throw new Exception("Dont Enter -ve Amount for funds" + amount);
            }
            if (accountBalance < amount) {
                throw new Exception("Insuffiecient Balance -- current Balance is " + accountBalance + " please add funds");
            }
            accountBalance = accountBalance - amount;
            System.out.println("Debited " + amount + " from " + fromAccount);
            System.out.println("Credited " + amount + "to" + toAccount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
