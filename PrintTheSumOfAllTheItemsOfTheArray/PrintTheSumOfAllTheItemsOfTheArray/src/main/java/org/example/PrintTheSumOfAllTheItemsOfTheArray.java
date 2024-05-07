package org.example;

public class PrintTheSumOfAllTheItemsOfTheArray {

    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
