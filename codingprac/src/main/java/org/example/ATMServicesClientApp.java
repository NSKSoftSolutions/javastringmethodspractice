package org.example;

import org.example.oopsfeatures.polypractice.ATMServices;

import java.util.*;

public class ATMServicesClientApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ATMServices atmServices = new ATMServices();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Withdrawal by entering amount and PIN");
            System.out.println("Withdrawal by swiping card and entering amount");
            System.out.println("Withdrawal by specifying amount, PIN, and account type (savings or current)");
            System.out.println("Enter Choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atmServices.withdrawl(5000.00, 1234);
                    break;
                case 2:
                    atmServices.withdrwal("12345678910", 5000.00);
                    break;
                case 3:
                    atmServices.withdrwal("savings", 1234, 500.00);
                    break;
                default:
                    System.out.println("Please Enter a Valid Choice");
            }
            System.out.println("Want to Perform Another Operation");
            isContinue = scanner.next().equals("yes");
            if (!isContinue) {
                break;
            }
        }
    }

}
