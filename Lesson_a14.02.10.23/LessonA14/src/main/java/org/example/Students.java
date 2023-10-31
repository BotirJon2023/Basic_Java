package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Students {
    public static void main(String[] args) {
        // Создаем коллекцию имен студентов
        ArrayList<String> students = new ArrayList<>();
        students.add("Иванов");
        students.add("Петров");
        students.add("Сидоров");
        students.add("Смирнов");
        students.add("Козлов");
        students.add("Васильев");

        // Перемешиваем имена студентов
        Collections.shuffle(students);

        // Разбиваем на подгруппы
        int groupSize = 2; // размер подгруппы
        int numGroups = students.size() / groupSize; // количество подгрупп
        int remainingStudents = students.size() % groupSize; // количество оставшихся студентов

        for (int i = 0; i < numGroups; i++) {
            System.out.println("Подгруппа " + (i + 1) + ":");
            for (int j = 0; j < groupSize; j++) {
                System.out.println(students.get(i * groupSize + j));
            }
            System.out.println();
        }

        // Если остались студенты, добавляем их в последнюю подгруппу
        if (remainingStudents > 0) {
            System.out.println("Подгруппа " + (numGroups + 1) + ":");
            for (int i = 0; i < remainingStudents; i++) {
                System.out.println(students.get(numGroups * groupSize + i));
            }
        }
    }
}
