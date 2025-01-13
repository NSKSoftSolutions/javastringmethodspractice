package org.example.services;

public class NetBankingClientApp {

    public static void main(String[] args) throws Exception {


        FundTransferServices fundTransferServices = new FundTransferServices();
        fundTransferServices.fundTransfer("ABC123", "DEF345", 15000.00);


    }


}
