package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 345;
        int digit1 = number / 100;  // Получаем первую цифру путем деления на 100
        int digit2 = (number / 10) % 10;  // Получаем вторую цифру путем деления на 10 и взятия остатка от деления на 10
        int digit3 = number % 10;  // Получаем третью цифру путем взятия остатка от деления на 10

        System.out.println("Первая цифра: " + digit1);
        System.out.println("Вторая цифра: " + digit2);
        System.out.println("Третья цифра: " + digit3);

        }
}