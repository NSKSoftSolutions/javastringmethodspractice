package org.example.services;

//Realtime : Booking Tickets for Event where multiple users try to book the tickets for an event.
//Constraints:
//    you shouldn't allow multiple users to book the ticket simutensiouly.
public class EventTicketBookingServices {

    private int availableTicket = 100;

    private PaymentGateway paymentGateway;

    public void setAvailableTicket(int availableTicket) {
        this.availableTicket = availableTicket;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void bookTicket(String user, int noOfTicketsToBook, int amountForATicket) {

        paymentGateway = new PaymentGateway();

        System.out.println(user + "-- is trying to book " + noOfTicketsToBook + "--tickets");
        synchronized (this) {
            if (availableTicket >= noOfTicketsToBook) {
                System.out.println("Ticket booking Under process");
                int totalAmount = noOfTicketsToBook * amountForATicket;
                availableTicket = availableTicket - noOfTicketsToBook;
                boolean result = paymentGateway.processPayMent(totalAmount);
                if (result) {
                    System.out.println("Payment is done Successfully");
                    System.out.println(noOfTicketsToBook + "-- booked for the Event");
                } else {
                    System.out.println("Payment Failed");
                }
            }
        }
    }
}

