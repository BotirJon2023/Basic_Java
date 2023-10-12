package org.example;

/*

Подсчитать буквы в нижнем и верхнем регистре
            String ss = "KikJhYggfTgf";

 */

public class Task5 {

    static String ss = "KikJhYggfTgf";
    static int uppercaseCount = 0;
    static int lowercaseCount = 0;

    private static char c() {

        for (char c : ss.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        System.out.println("Букв в верхнем регистре: " + uppercaseCount);
        System.out.println("Букв в нижнем регистре: " + lowercaseCount);

        return 0;
    }
}
