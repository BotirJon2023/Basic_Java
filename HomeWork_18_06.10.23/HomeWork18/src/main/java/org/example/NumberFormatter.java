package org.example;

import java.util.function.Function;

public class NumberFormatter {

    public static void main(String[] args) {
        Function<Integer, String> addSignAndToString = number -> {
            String sign = number >= 0 ? "+" : "-";
            return sign + Integer.toString(Math.abs(number));
        };

        Function<Integer, String> formattedNumber = addSignAndToString
                .andThen(str -> str + " degrees Celsius")
                .compose(Math::abs);

        int temperature1 = -150;
        int temperature2 = 150;

        System.out.println(formattedNumber.apply(temperature1)); // "-150 degrees Celsius"
        System.out.println(formattedNumber.apply(temperature2)); // "+150 degrees Celsius"
    }
}

