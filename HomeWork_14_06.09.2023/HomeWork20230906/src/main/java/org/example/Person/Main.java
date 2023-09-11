package org.example.Person;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jorge", 32);
        Teacher teacher2 = new Teacher("Kamilla", 42);
        Teacher teacher3 = new Teacher("Sabrina", 53);

        Student student1 = new Student("Arnold", 19);
        Student student2 = new Student("Jason", 21);
        Student student3 = new Student("Silvestor", 18);

        Student[] students = {student1, student2, student3};
        Teacher[] teachers = {teacher1, teacher2, teacher3};

        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem(students, teachers);

        System.out.println();
        gradeManagementSystem.processTeachers();
        System.out.println("--------------------------------------------------");

        gradeManagementSystem.gradeStudents(teacher3, students);
        gradeManagementSystem.processStudents(teacher3, students);
        gradeManagementSystem.processStudents(students);
        Arrays.sort(students);
        gradeManagementSystem.processStudents(teacher3, students);
        System.out.println("--------------------------------------------------");

        gradeManagementSystem.gradeStudents(teacher2, students);
        gradeManagementSystem.processStudents(teacher2, students);
        gradeManagementSystem.processStudents(students);
        Arrays.sort(students);

        gradeManagementSystem.processStudents(teacher2, students);
        System.out.println("--------------------------------------------------");

        gradeManagementSystem.gradeStudents(teacher1, students);
        gradeManagementSystem.processStudents(teacher1, students);
        gradeManagementSystem.processStudents(students);
        Arrays.sort(students);
        gradeManagementSystem.processStudents(teacher1, students);
    }
}

