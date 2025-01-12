package org.example.oopspractices;

public class DiscountOrder extends Order {

    @Override
    public double calculateOrderTotal(double price, int quantity) {
        System.out.println("Invoked DiscountOrder class--> calculateOrderTotal method of Order class");
        double discount = 0.1;//10%
        double orderTotal = super.calculateOrderTotal(price, quantity);
        System.out.println("The Order Total is -->" + orderTotal);
        System.out.println("Applying 10% discount on Order total -->" + discount);
        double discountAmount = orderTotal * discount;
        System.out.println("After cal discount the discount amount is -->" + discountAmount);
        double totAmount = orderTotal - discountAmount;
        System.out.println("total Amount after discount --" + totAmount);
        return totAmount;
    }
}
