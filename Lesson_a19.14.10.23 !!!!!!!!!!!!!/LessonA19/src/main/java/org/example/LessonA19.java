package org.example;

import java.util.Random;

public class LessonA19 {

    // Генерация номера карты
    public static String generateCreditCardNumber(String type) {
        String cardNumber = "";
        Random rand = new Random();

        if (type.equals("Visa")) {
            cardNumber += "4"; // Номер Visa начинается с 4
            for (int i = 0; i < 15; i++) {
                cardNumber += rand.nextInt(10);
            }
        } else if (type.equals("Mastercard")) {
            cardNumber += "5"; // Номер Mastercard начинается с 5
            for (int i = 0; i < 15; i++) {
                cardNumber += rand.nextInt(10);
            }
        } else if (type.equals("American Express")) {
            cardNumber += "3"; // Номер American Express начинается с 3
            cardNumber += (rand.nextInt(2) + 4); // Вторая цифра - либо 4, либо 7
            for (int i = 0; i < 13; i++) {
                cardNumber += rand.nextInt(10);
            }
        }

        return cardNumber;
    }

    // Генерация срока действия карты (месяц и год)
    public static String generateExpirationDate() {
        Random rand = new Random();
        int currentYear = 2023; // Текущий год
        int expirationYear = currentYear + rand.nextInt(5); // Генерация года от текущего до +10 лет
        int expirationMonth = rand.nextInt(12) + 1; // Генерация месяца от 1 до 12

        return String.format("%02d/%d", expirationMonth, expirationYear);
    }

    // Генерация CVV кода (Card Verification Value)
    public static String generateCVV() {
        Random rand = new Random();
        StringBuilder cvv = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            cvv.append(rand.nextInt(10));
        }

        return cvv.toString();
    }

    // Проверка правильности данных карты (простая демонстрация)
    public static boolean validateCreditCard(String cardNumber, String expirationDate, String cvv) {
        // Простая проверка: просто возвращает true
        return true;
    }

    public static void main(String[] args) {
        // Пример использования:

        String cardType = "Visa"; // Можно выбрать тип карты: "Visa", "Mastercard", "American Express"
        String generatedCardNumber = generateCreditCardNumber(cardType);
        String generatedExpirationDate = generateExpirationDate();
        String generatedCVV = generateCVV();

        System.out.println("Сгенерированные данные для карты:");
        System.out.println("Номер карты: " + generatedCardNumber);
        System.out.println("Срок действия: " + generatedExpirationDate);
        System.out.println("CVV: " + generatedCVV);

        // Пример проверки данных карты
        boolean isValid = validateCreditCard(generatedCardNumber, generatedExpirationDate, generatedCVV);
        if (isValid) {
            System.out.println("Данные карты верные.");
        } else {
            System.out.println("Данные карты неверные.");
        }
    }
}