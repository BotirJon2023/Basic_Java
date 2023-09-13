package TemperatureConverter;

public class TemperatureConverter {

    public static double convertCelsiusToKelvin(int celsiusValue) {
        return celsiusValue + 273.15;
    }

    public static double convertCelsiusToFahrenheit(int celsiusValue) {
        return 1.8 * celsiusValue + 32;
    }
}