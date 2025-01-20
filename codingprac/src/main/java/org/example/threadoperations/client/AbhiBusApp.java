package org.example.threadoperations.client;

import org.example.services.TicketBookingService;

public class AbhiBusApp {
    public static void main(String[] args) throws InterruptedException {

        TicketBookingService ticketBookingService = new TicketBookingService(10);
        Thread user1 = new Thread(() -> ticketBookingService.bookTicket("User1", "Bangalore", "GOA", 6));
        Thread user2 = new Thread(() -> ticketBookingService.bookTicket("User2", "Bangalore", "GOA", 2));
        Thread user3 = new Thread(() -> ticketBookingService.bookTicket("User3", "Bangalore", "GOA", 1));
        Thread user4 = new Thread(() -> ticketBookingService.bookTicket("User4", "Bangalore", "GOA", 2));

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
