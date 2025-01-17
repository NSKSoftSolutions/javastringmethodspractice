package org.example.threadoperations.client;

import org.example.threadoperations.MyFirstThread;

public class MyFirstThreadClientApp {

    public static void main(String[] args) {

        MyFirstThread firstThread = new MyFirstThread();
        System.out.println("my thread name is --" + firstThread.getName());
        firstThread.setName("Thread-1");
        System.out.println("My Thread name is--" + firstThread.getName());
        firstThread.start();
    }
}
