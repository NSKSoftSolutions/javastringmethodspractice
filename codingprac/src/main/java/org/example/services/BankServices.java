package org.example.services;

import org.example.custom.exceptions.InsuffiencetBalanceException;
import org.example.custom.exceptions.NegativeBalanceException;

public class BankServices {

    double existingBalance = 10000.00;

    public void fundTransfer(String fromAccount, String toAccount, double amount) {
        try {
            if (amount < 0) {
                throw new NegativeBalanceException("Dont Enter -ve value for amoun --" + amount);
            }
            if (existingBalance < amount) {
                throw new InsuffiencetBalanceException("Insufficient Funds, Please add funds to transfer");
            }
            existingBalance = existingBalance - amount;
            System.out.println("The Amount " + amount + "is Debited from ----" + fromAccount);
            System.out.println("The Amount " + amount + "is credited to ----" + toAccount);
        } catch (NegativeBalanceException nb) {
            nb.printStackTrace();
        } catch (InsuffiencetBalanceException ib) {
            ib.printStackTrace();
        } finally {
            System.out.println("Transaction is successfull");
        }
    }


}
