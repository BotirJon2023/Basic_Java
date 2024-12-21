package org.example;

import java.util.Scanner;
public class StudentGradeManagement {

    class Student {
        String name;
        double[] grades;

        public Student(String name, int numberOfSubjects) {

            this.name = name;

            this.grades = new double[numberOfSubjects];
        }

        public void inputGrades() {

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < grades.length; i++) {

                System.out.print("Enter grade for subject " + (i + 1) + ": ");

                grades[i] = scanner.nextDouble();
            }
        }

        public double calculateAverage() {

            double sum = 0;

            for (double grade : grades) {

                sum += grade;
            }

            return sum / grades.length;
        }
    }

    public class GradeManagement {
        public void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");

            int numberOfStudents = scanner.nextInt();

            System.out.print("Enter the number of subjects: ");

            int numberOfSubjects = scanner.nextInt();

            Student[] students = new Student[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {

                System.out.print("Enter name of student " + (i + 1) + ": ");

                String name = scanner.next();

                students[i] = new Student(name, numberOfSubjects);

                System.out.println("Enter grades for " + name + ":");

                students[i].inputGrades();
            }

            System.out.println("\nStudent Grades and Averages:");

            for (Student student : students) {

                System.out.println(student.name + "'s average grade: " + student.calculateAverage());
            }

            scanner.close();
        }
    }
}
