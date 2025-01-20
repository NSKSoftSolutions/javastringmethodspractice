package org.example.services.client;

import org.example.services.NSKRestarunt;

public class NSKRestroClientApp {
    public static void main(String[] args) throws InterruptedException {

        NSKRestarunt nskRestarunt = new NSKRestarunt();

        Thread chefThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) { // Produce 5 orders
                    nskRestarunt.produce("Fried Rice", 1);
                    Thread.sleep(1000); // Simulate cooking time
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread waiterThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) { // Consume 5 orders
                    nskRestarunt.consume();
                    Thread.sleep(500); // Simulate serving time
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        chefThread.start();
        waiterThread.start();
        chefThread.join();
        waiterThread.join();

        System.out.println("All orders have been processed!");
    }
}
