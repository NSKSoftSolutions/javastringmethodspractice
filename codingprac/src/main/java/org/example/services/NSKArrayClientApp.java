package org.example.services;

public class NSKArrayClientApp {
    public static void main(String[] args) {

        NSKArray nskArray = new NSKArray();
        int[] elementsOfArray = nskArray.createAndAddElementsToAnArray();
        for (int number : elementsOfArray) {
            System.out.print(number + " ");
        }

        //sort the elements
        int[] sortedArray = nskArray.sortTheGivenArrayInASC(elementsOfArray);
        for (int number : sortedArray) {
            System.out.print(number + " ");
        }

    }
}
