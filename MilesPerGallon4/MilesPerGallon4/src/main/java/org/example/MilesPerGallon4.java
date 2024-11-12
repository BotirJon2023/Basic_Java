package org.example;

import java.util.Scanner;

public class MilesPerGallon4 {

    public static void main(String arg[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter kilo meters travelled : ");

        double km = scan.nextDouble();

        System.out.println("Enter gallons : ");

        double gallons = scan.nextDouble();

        MpgCal n = new MpgCal(km, gallons);

        System.out.println("miles per gallons = " + Math.round(n.mpg));
    }
}
