package org.example.oopspractices;

public class Order {

    public double calculateOrderTotal(double price, int quantity) {
        System.out.println("Invoked Order class--> calculateOrderTotal method");
        double orderAmount = price * quantity;
        System.out.println("After Calculating the amount is --->" + orderAmount);
        return orderAmount;
    }
}
