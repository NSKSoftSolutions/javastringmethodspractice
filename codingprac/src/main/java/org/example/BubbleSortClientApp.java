package org.example;

import java.util.*;

public class BubbleSortClientApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "st value");
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                int temp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = temp;
            }

        }

        for (int number : arr) {
            System.out.print(number  +" ");
        }
    }


}
