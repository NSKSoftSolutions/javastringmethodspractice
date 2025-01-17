package org.example.test;

public class TransactionException extends Exception {
    private String errorCode;

    public TransactionException(String errorMessage, String errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
