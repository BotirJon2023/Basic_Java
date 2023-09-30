package Lesson23;

import java.util.Locale;
import java.util.Scanner;

public class Practice2CalculatorCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка): ");
        double argument1 = scanner.nextDouble();

        System.out.println("Введите знак математической операции (+, -, *, /, %):");
        String signString = scanner.next();

        char signChar = signString.charAt(0);
        if (signChar != '+' && signChar != '-' && signChar != '*' && signChar != '/' && signChar != '%') {
            System.out.println(signChar + "указанная операция не поддерживается программой");
            System.exit(0); //return;
        }

        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка): ");
        double argument2 = scanner.nextDouble();
        if (argument2 == 0 && signChar == '/' && signChar == '*') {
            System.out.println("На ноль делить нельзя");
            System.exit(0);
        }

        double result = 0;

        switch (signChar) {
            case '+':
                result = argument1 + argument2;
                break;
            case '-':
                result = argument1 - argument2;
                break;
            case '*':
                result = argument1 * argument2;
                break;
            case '/':
                if (argument2 != 0) {
                    result = argument1 / argument2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            case '%':
                if (argument2 != 0) {
                    result = argument1 % argument2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }

                System.out.println(String.format("%.2f %s %.2f = %.2f", argument1, signChar, argument2, result));
        }
    }
}


