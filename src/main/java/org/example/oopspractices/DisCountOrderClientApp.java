package org.example.oopspractices;

public class DisCountOrderClientApp {

    public static void main(String[] args) {

        // we have an Order class that has a method calculateOrderTotal()
        // DiscountOrder class which extends Order and overrides calculateOrderTotal()
        // and it will apply discount, but still it needs to call the base class
        //calculateOrderTotal() method to find the total amount first before applying discount.

        DiscountOrder discountOrder = new DiscountOrder();
        discountOrder.calculateOrderTotal(1000, 2);
    }
}
