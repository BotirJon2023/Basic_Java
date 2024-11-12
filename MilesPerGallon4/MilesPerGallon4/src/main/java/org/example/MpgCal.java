package org.example;

public class MpgCal {

    double mpg;

    MpgCal(double k, double g) {

        double m = k / 1.609344;

        mpg = m / g;

    }
}
