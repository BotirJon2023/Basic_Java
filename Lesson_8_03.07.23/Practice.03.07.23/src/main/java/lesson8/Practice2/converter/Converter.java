package lesson8.Practice2.converter;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах по Цельсию = ");
       int tempNumber = scanner.nextInt();
       System.out.println("Температура в Кельвинах = "+runKelvinConverter(tempNumber));
       System.out.println("Температура в Фаренгейтах ="+runFahrengeitConverter(tempNumber));


    }


    public static double runKelvinConverter(double baseValue) {
        return baseValue + 273;


    }

    static double runFahrengeitConverter(double baseValue) {
        return 1.8 * baseValue + 32;

    }

}
