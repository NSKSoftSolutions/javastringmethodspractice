package org.example.custom.exceptions;

//write a java program to withdrawl amount from accountNumber , if the amount requested by
//			 the user -ve we have throw NegativeBalanceException, if the user requested amount is greater
//			 than the existingBalance then you should throw InsuffiencetBalanceException.
//
//
//
//			  1. NegativeBalanceException
//            2. InsuffiencetBalanceException
//            3. BankServices
//            4. BankClientServicesApp
//
//
public class NegativeBalanceException extends RuntimeException {

    public NegativeBalanceException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
