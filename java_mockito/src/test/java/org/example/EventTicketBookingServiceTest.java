package org.example;

import org.example.services.EventTicketBookingServices;
import org.example.services.PaymentGateway;
import org.example.services.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

public class EventTicketBookingServiceTest {


    PaymentGateway paymentGateway;

    EventTicketBookingServices eventTicketBookingServices;

    @BeforeEach
    public void setUp() {
        eventTicketBookingServices = new EventTicketBookingServices();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testBookTicket() {

        PaymentGateway mocked = Mockito.mock(PaymentGateway.class);
        eventTicketBookingServices.setPaymentGateway(mocked);

        //setting the expectations
        when(mocked.processPayMent(anyDouble())).thenReturn(true);

        eventTicketBookingServices.bookTicket("John", 2, 50);
        verify(mocked, atLeastOnce()).processPayMent(anyDouble());

    }

}
