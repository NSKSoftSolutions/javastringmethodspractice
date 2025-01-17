package org.example.threadoperations;

public class DeliveryGuy extends Thread {

    // Imagine we have an online delivery system where drivers deliver the order
    //kitchen staff will prepare the order
    public void run() {
        deliveryIn5min();
    }

    private void deliveryIn5min() {
        System.out.println("the Driver Took the Parcel and he is on the way your Food parcel will be dispatched soon");
        try {
            Thread.sleep(5000);
            System.out.println("Driver at the Door Step....Please accept the Food");
            System.out.println("Delivered the Food Successfully");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
