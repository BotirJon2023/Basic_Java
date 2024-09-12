package org.example;

import java.util.Scanner;

public class AreaCalculation {


    double area;

    void circle(double r) {

        area = (22 * r * r) / 7;

    }
}

class AreaOfCircle extends AreaCalculation {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");

        double rad = s.nextDouble();

        AreaOfCircle a = new AreaOfCircle();

        a.circle(rad);

        System.out.println("Area of Circle is: " + a.area);

    }
}
