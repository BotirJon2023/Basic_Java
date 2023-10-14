package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Exersice {
    /*
        Уровень сложности 5 из 10:
        Найти сумму всех элементов ArrayList<Integer>.
        Найти среднее значение элементов LinkedList<Integer>.
        Перебрать ArrayList<String> и вывести все элементы на экран.
        Перебрать LinkedList<String> и найти самую длинную строку.
        Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    */
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }

    public int getAverage(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum / list.size();
    }

    public void ArrayList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public String getLongestElement(List<String> list) {
        int longestElementIndex = 0;
        int elementLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > elementLength) {
                longestElementIndex = i;
                elementLength = list.get(i).length();
            }
        }
        return list.get(longestElementIndex);
    }
    // Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

    public void getArrayList(List<Object> list) {


        // Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
        public void doOwnClassList(){
            Employee employee1 = new Employee("Name 1", "Surname 1", 1000);
            Employee employee2 = new Employee("Name 2", "Surname 2", 2000);
            Employee employee3 = new Employee("Name 3", "Surname 3", 3000);
            Employee employee4 = new Employee("Name 4", "Surname 4", 4000);

            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(employee1);
            employeeList.add(employee2);
            employeeList.add(employee3);
            employeeList.add(employee4);

            System.out.println(employeeList);
        }
    }
}

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String s, String s1, int i) {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}
