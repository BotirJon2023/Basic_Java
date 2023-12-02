package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentService {

    private int studentID = 1;
    private Map<Integer, Student> studentsMap = new HashMap<>();

    public Student createStudent(String name, int age, Degree degree) {
        Student student = new Student(studentID++, name, age, degree);
        studentsMap.put(student.getId(), student);
        return student;
    }
        public List<Student> getAllStudents() {
            return new ArrayList<>(studentsMap.values());
        }

    public int getStudentCount() {
        return studentsMap.size();
    }

    public int getDegreeStudentCount(Degree degree) {
        return (int) studentsMap.values().stream()
                .filter(student -> student.getDegree() == degree)
                .count();
    }

    public double getAverageAgeOfAllStudents() {
        return studentsMap.values().stream()
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0.0);
    }

    public double getAverageAgeOfDegreeStudents(Degree degree) {
        return studentsMap.values().stream()
                .filter(student -> student.getDegree() == degree)
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0.0);
    }

    public List<Student> getStudentsByDegree(Degree degree) {
        return studentsMap.values().stream()
                .filter(student -> student.getDegree() == degree)
                .collect(Collectors.toList());
    }
}
