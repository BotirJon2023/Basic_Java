
package org.example;

import java.util.Scanner;

public class AreaOfRhombus2 {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("diagonal 1 Value:");

        int d1= 15;

        System.out.println("diagonal 2 value:");

        int d2= 18;

        int  area=(d1*d2)/2;

        System.out.println("Area of Rhombus is: " + area);
    }
}
