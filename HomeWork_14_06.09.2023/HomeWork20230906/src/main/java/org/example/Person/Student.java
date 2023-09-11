package org.example.Person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person implements Graded, Comparable<Student>{

    private Grade grade;

    public Student(String nameOfPerson, int ageOfPerson) {
        super(nameOfPerson, ageOfPerson);
    }

    @Override
    public String getDescription() {
        return "Name student " + getNameOfPerson() + ", age student " + getAgeOfPerson();
    }

    @Override
    public String getGrade() {
        return " grade " + grade + " }";
    }

    @Override
    public int compareTo(Student o) {
        return this.getGrade().compareTo(o.getGrade());
    }
}