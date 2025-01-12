package org.example.services;

import java.util.Scanner;

public class NSKArray {

    public int[] createAndAddElementsToAnArray() {
        System.out.println("Enter the size of array u want to create");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + "value");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    public int[] sortTheGivenArrayInASC(int[] elementsOfArray) {
        //using bubble sort to sort array of given elements
        for (int i = 0; i < elementsOfArray.length - 1; i++) {
            for (int j = 0; j < elementsOfArray.length - 1 - i; j++) {
                if (elementsOfArray[j] > elementsOfArray[j + 1]) {
                    System.out.println("Swaping The Elements -->" + elementsOfArray[j] + "-->and-->" + elementsOfArray[j + 1]);
                    int temp = elementsOfArray[j];
                    elementsOfArray[j] = elementsOfArray[j + 1];
                    elementsOfArray[j + 1] = temp;
                }
            }
        }
        return elementsOfArray;
    }
}
