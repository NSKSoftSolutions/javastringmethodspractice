package org.example.services;

public class BookingService {

    PaymentService paymentService;

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void buyProduct(double amount) {
        boolean isProcessed = paymentService.processPayment(amount);
        if (isProcessed) {
            System.out.println("Payment is Processed Successfully");
        } else {
            System.out.println("Payment is failed, Please try Again");
        }
    }


}
