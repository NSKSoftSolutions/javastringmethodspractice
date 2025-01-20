package org.example.services;

public class TicketBookingService {

    private int availableTickets;

    public TicketBookingService(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(String userName, String destination, String source, int ticketsYouwantToBook) {
        System.out.println(userName + "-- User is trying to Book " + ticketsYouwantToBook + " -- ticket from --" + source + "to Destination --" + destination);
        if (ticketsYouwantToBook <= availableTickets) {
            System.out.println(userName + " Successfully Booked " + ticketsYouwantToBook + " -- ticket from --" + source + " to " + destination);
            availableTickets = availableTickets - ticketsYouwantToBook;
        } else {
            System.out.println(userName + " failed to Book tickets " + availableTickets);
        }
        System.out.println("Tickets Remaining --" + availableTickets);
    }
}

