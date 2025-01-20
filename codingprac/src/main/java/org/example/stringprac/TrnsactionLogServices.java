package org.example.stringprac;

import java.util.Scanner;

//Banking systems often store transaction data as a single line of
// text with delimiters like commas or pipes (|).
public class TrnsactionLogServices {

    public void processLogs(String transactionData) {
        String[] pattern = {"Timestamp", "Transaction ID", "Type", "Amount", "Status"};
        if (transactionData.length() < 5) {
            System.out.println("Tx data should not be less than 5 ");
        }
        String[] data = transactionData.split("\\|");
        for (int i = 0; i < data.length; i++) {
            System.out.println(pattern[i] + ":" + data[i]);
        }
    }


}
