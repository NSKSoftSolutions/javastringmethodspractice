package org.example.oopspractices.client.apps;

import org.example.oopspractices.Customer;

public class CustomerClientApp {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setCustomerName("Ram");
        customer.setBalance(10000);
        customer.setAccountNumber(1234456789L);

        customer.withdrawal(1234456789L, 8000);



    }

}
