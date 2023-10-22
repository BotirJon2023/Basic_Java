package org.example;

public class HomeWork21AlgorithusLuna {

    public static boolean isValidCreditCardNumber(String cardNumber) {

        cardNumber = cardNumber.replaceAll("\\s", ""); // нет пробелов


        if (!cardNumber.matches("\\d+")) {
            return false; // только цифры
        }

        int sum = 0;
        boolean doubleDigit = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(cardNumber.substring(i, i + 1));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        if (isValidCreditCardNumber(cardNumber)) {
            System.out.println("Номер карты действителен.");
        } else {
            System.out.println("Номер карты недействителен.");
        }
    }
}