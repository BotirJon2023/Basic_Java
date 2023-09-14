package practice;

import java.util.Random;

public class ifElseOperation {

    public static void main(String[] args) {

        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        System.out.println("Our generated number = "+number);

        if(number>0 && number<2) System.out.println("Small rain");
        if(number>2 && number<5) System.out.println("Strong rain");
        if(number>5 && number<7) System.out.println("Shower rain");
        if(number>=7) System.out.println("Thander! Sit at home!");

        if(number<5) System.out.println("Small rain");
        else
        if(number<5) System.out.println("Strong rain");
        else
            if(number<7) System.out.println("Strong shower in outside!");
            else
            System.out.println("Thander! Sit at home!");


    }

    // работа со строкой

    static void isDarkOrLight(String color) {

        if(color.equalsIgnoreCase(color.equalsIgnoreCase("белый")) {
            System.out.println(color + "светлый");
        }
            else if (color.equalsIgnoreCase("Черный")) {
            System.out.println(color + "темный");
        }

        else if (color.equalsIgnoreCase("Зеленый")) {
            System.out.println(color + "светный");
        }

        else if (color.equalsIgnoreCase("коричныевый")) {
            System.out.println(color + "темный");
        }
        else {
            System.out.println(color + "Не возможно определить цвет!");
        }

    }



}
