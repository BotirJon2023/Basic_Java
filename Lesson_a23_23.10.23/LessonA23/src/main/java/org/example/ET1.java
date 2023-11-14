package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ET1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input digit: ");
/**
 * try {code problems }
 */

            try {
                int digit = scanner.nextInt();
                System.out.println("Digit: " + digit);
                break;

            } catch (InputMismatchException exception) {
                System.out.println("It is not a digit!!!  Try again!");
                scanner.nextInt();
            } finally {
                System.out.println("!!!");
            }



        }

        System.out.println("END");
        scanner.close();
    }
}
