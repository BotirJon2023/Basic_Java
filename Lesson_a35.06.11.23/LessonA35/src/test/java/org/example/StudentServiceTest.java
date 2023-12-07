package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    public void init() {
        service = new StudentService();
        service.createStudent("John Walker", 19, Degree.BACHELOR);


    }

    @Test
    public void checkAddNewStudent() {
        Student student = service.getStudentById(1);
        assertNotNull(student);
    }

    @Test
    public void checkStudentProperties() {
        Student student = service.getAllStudents().get(0);
        assertEquals("John Walker", student.getName());
        assertEquals(19, student.getAge());
        assertEquals(Degree.BACHELOR, student.getDegree());

    }

    @Test
    public void checkStudentsEquality() {
        Student expectedStudent = new Student(1, "John Walker", 19, Degree.BACHELOR);
        Student actualStudent = service.getStudentById(1);
        assertEquals(expectedStudent, actualStudent);

    }

    @Test
    public void checkStudentsCount() {
        service.createStudent("Garry Trumen", 22, Degree.BACHELOR);
        service.createStudent("Donald Trump", 25, Degree.MASTER);
        int expectedSize = 3;
        int actualSize = service.getStudentsCount();
        assertEquals(expectedSize, actualSize);

    }

    @Test
    public void checkGetStudentsCountByDegree() {
        service.createStudent("Michael Jackson", 22, Degree.BACHELOR);
        service.createStudent("Donald Duck", 25, Degree.MASTER);
        service.createStudent("Micky Mouse", 23, Degree.BACHELOR);
        service.createStudent("Dog Pluto", 24, Degree.MASTER);
        service.createStudent("Dog Pluto", 20, Degree.MASTER);
        long expectedDegreeCount = 3;
        long actualDegreeCount = service.getStudentsCountByDegree(Degree.MASTER);
        assertEquals(expectedDegreeCount, actualDegreeCount);

    }

    @Test
    public void checkValidAge() {
        try {
            service.createStudent("Michael Jackson", 122, Degree.BACHELOR);
        } catch (IllegalArgumentException e) {
         return;
        }
        fail();


    }


}