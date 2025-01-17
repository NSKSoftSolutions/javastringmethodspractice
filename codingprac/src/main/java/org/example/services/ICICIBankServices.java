package org.example.services;

public class ICICIBankServices {

    public String maskingAccountNumber(String accountNumber) {
        return accountNumber.replaceFirst("\\d{8}", "********");
    }

    //"\\d(?=(\\d| ){4})"
    public String maskedCurrentAccountNumber(String currentAccountNumber) {
        return currentAccountNumber.replaceAll("\\d(?=(\\d| ){4})", "*");
    }

    public String replaceDigitToChar(String contactNumber) {
        return contactNumber.replaceAll("\\d", "S");
    }

    public String maskingPassword(String password) {
        return password.replaceAll("\\d", "*");
    }

    public String maskingSixDigitsOfPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("\\d(?=(\\d| ){4})", "*");
    }


}
