package org.example.services;

import java.util.LinkedList;
import java.util.Queue;

public class NSKRestarunt {

    private int capacity = 5;

    Queue<Integer> orders = new LinkedList();


    public synchronized void produce(String order, int orderInNumber) throws InterruptedException {

        while (orders.size() + orderInNumber > capacity) {
            System.out.println("Chef cannot process " + orderInNumber + "at a time, the min order is 1 and Max is " + capacity);
            wait();
        }
        orders.add(orderInNumber);
        System.out.println("Order is Processing");
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {

        while (orders.isEmpty()) {
            System.out.println("Waiter is waiting for to take the order from customer");
            wait();
        }
        int order = orders.poll();
        System.out.println("waiter served the order :" + order);
        notifyAll();
    }


}
