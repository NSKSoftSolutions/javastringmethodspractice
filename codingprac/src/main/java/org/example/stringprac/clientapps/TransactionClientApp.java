package org.example.stringprac.clientapps;

import org.example.stringprac.TrnsactionLogServices;

import java.util.Scanner;

public class TransactionClientApp {
    public static void main(String[] args) {

        //"Timestamp", "Transaction ID", "Type", "Amount", "Status"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter TX Details in the below format");
        System.out.println("Timestamp|" + "Transaction ID|" + "Type|" + "Amount|" + "Status");
        String txData = scanner.nextLine();
        TrnsactionLogServices services = new TrnsactionLogServices();
        services.processLogs(txData);
    }

}
