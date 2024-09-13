package org.example;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double rad= s.nextDouble();
        Area  a=new Area(rad);
        System.out.println("Area of Circle is: " + a.area);
    }

}
