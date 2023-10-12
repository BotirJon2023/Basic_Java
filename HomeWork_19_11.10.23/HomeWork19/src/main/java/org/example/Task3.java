package org.example;

/*
      * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
      * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
private static void m3() {
        List<Person> people = Arrays.asList(
        new Person("John", 20),
        new Person("Jane", 25),
        new Person("Jack", 30),
        new Person("James", 35),
        new Person("Jill", 40)
        );
*/

import java.util.Arrays;
import java.util.List;

public class Task3 {

    private static double findAverageAgeWithJ(List<Person> people, char startLetter) {
        int count = 0;
        int totalAge = 0;

        for (Person person : people) {
            if (person.getName().charAt(0) == startLetter) {
                totalAge += person.getAge();
                count++;
            }
        }

        if (count == 0) {
            return 0; // В случае, если нет людей с именами на букву "J".
        }

        return (double) totalAge / count;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Jill", 40)
        );

        char startLetter = 'J';

        double averageAge = findAverageAgeWithJ(people, startLetter);

        System.out.println("Средний возраст людей с именами, начинающимися на " + startLetter + ": " + averageAge);
    }

    private static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
