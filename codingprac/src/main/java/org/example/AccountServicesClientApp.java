package org.example;

import org.example.oopsfeatures.polypractice.AccountServices;
import org.example.oopsfeatures.polypractice.CurrentRate;
import org.example.oopsfeatures.polypractice.FixedDespoiAccount;
import org.example.oopsfeatures.polypractice.SavingsAccount;

public class AccountServicesClientApp {
    public static void main(String[] args) {

        AccountServices accountServices = new AccountServices();
        accountServices.getIntresetRate();


        AccountServices savingAccount = new SavingsAccount();
        AccountServices fixedAccount = new FixedDespoiAccount();
        AccountServices currentAccount = new CurrentRate();

        System.out.println("Savings Account Intreast rate" + savingAccount.getIntresetRate());
        System.out.println("Fixed Account Intreast rate" + fixedAccount.getIntresetRate());
        System.out.println("Current Account Intreast rate" + currentAccount.getIntresetRate());


    }

}
