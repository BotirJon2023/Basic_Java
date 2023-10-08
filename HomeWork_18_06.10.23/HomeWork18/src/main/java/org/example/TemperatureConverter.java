package org.example;

import java.util.function.Function;

public class TemperatureConverter {
    public static void main(String[] args) {
        Function<Integer, String> convertToCelsius = temperature -> {
            temperature = Math.max(-100, Math.min(100, temperature));
            String sign = temperature >= 0 ? "+" : "-";
            return sign + temperature + " degrees Celsius";
        };

        System.out.println(convertToCelsius.apply(-150)); // "-100 degrees Celsius"
        System.out.println(convertToCelsius.apply(150));  // "+100 degrees Celsius"
        System.out.println(convertToCelsius.apply(50));   // "+50 degrees Celsius"
    }
}
