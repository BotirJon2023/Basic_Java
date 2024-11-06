package org.example;

import java.lang.*;

public class FutureInvestmentValue {

    public static void main(String args[]) {


        double p = Double.parseDouble(args[0]);

        System.out.println("present value is : " + p);

        double r = Double.parseDouble(args[1]);

        System.out.println("Interest rate is : " + r);

        double y = Double.parseDouble(args[2]);

        System.out.println("Time period in years is: " + y);

        double f = p * Math.pow((1 + r / 100), y);

        System.out.println("Future Investment Value is: " + f);
    }
}
