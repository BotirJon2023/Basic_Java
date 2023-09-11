package org.example.Person;

public class GradeManagementSystem {
    private Student[] students;
    private Teacher[] teachers;

    public GradeManagementSystem(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void gradeStudents(Teacher teacher, Student[] students) {
        for (Teacher teachers : teachers) {
            for (Student student : students) {
                teacher.gradeStudent(student);
            }
        }
    }

    public void processStudents(Teacher teacher, Student[] students) {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }

        for (Student student : students) {
            System.out.println(student.getDescription() + teacher.getDescription() + student.getGrade());
        }
    }

    public void processStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("Classroom empty");
        }
        for (Student student : students) {
            System.out.println(student.getDescription());
        }
    }

    public void processTeachers() {
        if (teachers.length == 0) {
            System.out.println("Teachers empty");
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getDescription());
        }

    }
}
