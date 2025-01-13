package org.example.oopsfeatures.polypractice;

public class ATMServices {

    // Imagine an ATM Machine where users can perform different types of withdrawals. The machine supports withdrawals in different ways:
    //
    //Withdrawal by entering amount and PIN
    //Withdrawal by swiping card and entering amount
    //Withdrawal by specifying amount, PIN, and account type (savings or current)

    public void withdrawl(double amount, int pin) {
        System.out.println("Withdrawing Rupees" + amount + " using PIN --" + pin);
    }

    public void withdrwal(String cardNumber, double amount) {
        System.out.println("Withdrwaing Ruppes -- " + amount + " using Card " + cardNumber);
    }

    public void withdrwal(String accountType, int pin, double amount) {
        System.out.println("Withdrawing Rupees --" + amount + " from" + accountType + " using Pin -" + pin);
    }


}
