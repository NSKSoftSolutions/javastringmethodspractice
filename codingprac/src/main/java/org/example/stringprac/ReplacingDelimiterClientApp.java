package org.example.stringprac;

public class ReplacingDelimiterClientApp {
    public static void main(String[] args) {

        String csvData = "Name,Age,Gender,mail";
        String newCsvData = csvData.replace(',', ' ');
        System.out.println(newCsvData);

    }
}
