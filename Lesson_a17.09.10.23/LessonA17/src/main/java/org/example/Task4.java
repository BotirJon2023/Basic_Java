package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));
        people.add(new Person("David", 35));

        List<String> names = people.stream()
                .map(Person::getName) // Преобразование в список имен
                .filter(person -> 30 < person.getAge()) // Фильтрация по возрасту
                .collect(Collectors.toList());

        System.out.println(names);
    }
}