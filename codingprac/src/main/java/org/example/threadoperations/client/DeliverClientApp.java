package org.example.threadoperations.client;

import org.example.threadoperations.DeliveryGuy;

public class DeliverClientApp {

    public static void main(String[] args) {
        DeliveryGuy deliveryGuy = new DeliveryGuy();
        deliveryGuy.start();
    }


}
