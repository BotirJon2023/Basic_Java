package org.example;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student1 = studentService.createStudent("Alice", 20, Degree.BACHELOR);
        Student student2 = studentService.createStudent("Bob", 25, Degree.MASTER);
        Student student3 = studentService.createStudent("Carol", 22, Degree.BACHELOR);

        // Вывод результатов
        System.out.println("All Students: " + studentService.getAllStudents());
        System.out.println("Student Count: " + studentService.getStudentCount());
        System.out.println("Bachelor Count: " + studentService.getDegreeStudentCount(Degree.BACHELOR));
        System.out.println("Master Count: " + studentService.getDegreeStudentCount(Degree.MASTER));
        System.out.println("Average Age of All Students: " + studentService.getAverageAgeOfAllStudents());
        System.out.println("Average Age of Bachelor Students: " + studentService.getAverageAgeOfDegreeStudents(Degree.BACHELOR));
        System.out.println("Bachelor Students: " + studentService.getStudentsByDegree(Degree.BACHELOR));
        System.out.println("Master Students: " + studentService.getStudentsByDegree(Degree.MASTER));
    }
}

