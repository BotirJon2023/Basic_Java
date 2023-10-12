package org.example;

/*
 * Дан список сотрудников, у каждого из которых есть поле "salary".
 * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
 * в компаниях, которые находятся в городах, начинающихся на букву "M".

 */

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    class Employee {
        String name;
        String jobPosition;
        double salary;
        String location;

        public Employee(String name, String jobPosition, double salary, String location) {
            this.name = name;
            this.jobPosition = jobPosition;
            this.salary = salary;
            this.location = location;
        }
    }

    public class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            // Заполните список сотрудников данными
            employees.add(new Employee("Сотрудник1", "developer", 45000, "Москва"));
            employees.add(new Employee("Сотрудник2", "developer", 62000, "Санкт-Петербург"));
            employees.add(new Employee("Сотрудник3", "counter", 38000, "Магадан"));
            employees.add(new Employee("Сотрудник4", "developer", 57000, "Москва"));
            employees.add(new Employee("Сотрудник5", "supervisor", 46000, "Санкт-Петербург"));
            employees.add(new Employee("Сотрудник6", "manager", 58000, "Магадан"));
            employees.add(new Employee("Сотрудник7", "manchendaiser", 53000, "Москва"));
            employees.add(new Employee("Сотрудник8", "developer", 54000, "Санкт-Петербург"));
            employees.add(new Employee("Сотрудник9", "HR", 51000, "Магадан"));


            // Добавьте еще сотрудников

            double averageSalary = employees.stream()
                    .filter(e -> e.jobPosition.equals("developer"))
                    .filter(e -> e.location.startsWith("M"))
                    .mapToDouble(e -> e.salary)
                    .average()
                    .orElse(0.0);

            System.out.println("Средняя зарплата разработчиков в городах, начинающихся с 'M': " + averageSalary);
        }
    }
}
