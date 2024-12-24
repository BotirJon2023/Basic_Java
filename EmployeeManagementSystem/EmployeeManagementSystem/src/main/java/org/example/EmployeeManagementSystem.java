package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    class Employee {
        String name;
        int id;
        double salary;

        public Employee(String name, int id, double salary) {

            this.name = name;

            this.id = id;

            this.salary = salary;
        }

        public void displayEmployeeDetails() {

            System.out.println("Employee ID: " + id);

            System.out.println("Employee Name: " + name);

            System.out.println("Employee Salary: $" + salary);
        }
    }

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\nEmployee Management System:");

            System.out.println("1. Add Employee");

            System.out.println("2. View Employees");

            System.out.println("3. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter employee name: ");

                scanner.nextLine(); // Consume the leftover newline

                String name = scanner.nextLine();

                System.out.print("Enter employee ID: ");

                int id = scanner.nextInt();

                System.out.print("Enter employee salary: ");

                double salary = scanner.nextDouble();

                employees.add(new Employee(name, id, salary));

                System.out.println("Employee added successfully!");

            } else if (choice == 2) {

                if (employees.isEmpty()) {

                    System.out.println("No employees to display.");

                } else {

                    for (Employee employee : employees) {

                        employee.displayEmployeeDetails();

                        System.out.println("-------------------------------");
                    }
                }

            } else if (choice == 3) {

                System.out.println("Exiting the system...");

                break;

            } else {

                System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }
}