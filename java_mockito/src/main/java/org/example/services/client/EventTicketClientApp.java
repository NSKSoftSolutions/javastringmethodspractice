package org.example.services.client;

import org.example.services.EventTicketBookingServices;

public class EventTicketClientApp {

    public static void main(String[] args) {

        EventTicketBookingServices bookingServices = new EventTicketBookingServices();

        Runnable runnable1 = () -> bookingServices.bookTicket("ABC", 2, 50);
        Runnable runnable2 = () -> bookingServices.bookTicket("ABCD", 2, 50);

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();


    }

}
