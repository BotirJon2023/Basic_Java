package org.example;

import java.util.Scanner;
public class PerimeterOfCircle1 {

    public static void main(String args[]) {

        double r = Double.parseDouble(args[1]);

        double c = (22 * 2 * r) / 7;

        System.out.println("Perimeter of Circle is: " + c);
    }
}
