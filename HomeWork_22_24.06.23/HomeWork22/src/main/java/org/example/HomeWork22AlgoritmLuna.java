package org.example;

import java.time.YearMonth;
import java.util.Random;

public class HomeWork22AlgoritmLuna {

    public static void main(String[] args) {
        String cardNumber = generateCardNumber();
        String expirationDate = generateExpirationDate();
        String cvv = generateCVV();

        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("CVV: " + cvv);
    }

    public static String generateCardNumber() {
        StringBuilder cardNumber = new StringBuilder();
        Random random = new Random();

        // Генерация 15 чисел
        for (int i = 0; i < 15; i++) {
            int digit = random.nextInt(10);
            cardNumber.append(digit);
        }

        // Добавление последней цифры с помощью алгоритма Луна
        int lastDigit = getLuhnDigit(cardNumber.toString());
        cardNumber.append(lastDigit);

        return cardNumber.toString();
    }

    public static String generateExpirationDate() {
        YearMonth currentYearMonth = YearMonth.now();
        YearMonth expirationYearMonth = currentYearMonth.plusYears(4 + new Random().nextInt(2));

        int expirationYear = expirationYearMonth.getYear();
        int expirationMonth = expirationYearMonth.getMonthValue();

        return String.format("%02d%04d", expirationMonth, expirationYear);
    }

    public static String generateCVV() {
        Random random = new Random();
        int cvv = random.nextInt(900) + 100; // Генерация трехзначного числа от 100 до 999
        return String.valueOf(cvv);
    }

    public static int getLuhnDigit(String number) {
        int sum = 0;
        boolean alternate = false;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(number.substring(i, i + 1));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit % 10) + 1;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        int modulus = sum % 10;
        return (modulus == 0) ? 0 : 10 - modulus;
    }
}

