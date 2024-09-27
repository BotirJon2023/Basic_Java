package org.example;

import java.util.Scanner;
public class FindAreaOfRectangle {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the length:");

        double l= s.nextDouble();

        System.out.println("Enter the breadth:");

        double b= s.nextDouble();


        double  area=l*b;

        System.out.println("Area of Rectangle is: " + area);
    }
}
