package org.example;

import org.example.services.BookingService;
import org.example.services.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

public class BookingServicesTest {

    BookingService bookingService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        bookingService=new BookingService();
    }

    @Test
    public void testBuyProduct() {

        // stubbing the PaymentService class
        PaymentService mockedPaymentService = Mockito.mock(PaymentService.class);
        bookingService.setPaymentService(mockedPaymentService);
        // setting the expectations
        when(mockedPaymentService.processPayment(anyDouble())).thenReturn(true);
        //verify the call
        bookingService.buyProduct(1000);
        verify(mockedPaymentService, atLeastOnce()).processPayment(anyDouble());
    }


}
