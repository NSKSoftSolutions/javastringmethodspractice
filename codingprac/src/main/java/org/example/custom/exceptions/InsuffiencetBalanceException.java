package org.example.custom.exceptions;

public class InsuffiencetBalanceException extends RuntimeException {

    public InsuffiencetBalanceException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
