package org.example.threadoperations;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        printNumbers();
    }

    private void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
