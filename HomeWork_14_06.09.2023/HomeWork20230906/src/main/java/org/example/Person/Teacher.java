package org.example.Person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person {

    private Grade teacherGrade;

    public Teacher(String nameOfPerson, int ageOfPerson) {
        super(nameOfPerson, ageOfPerson);
    }


    public void gradeStudent(Student student) {
        Grade[] myGrade = {
                Grade.A,
                Grade.B,
                Grade.C,
                Grade.D,
                Grade.E,
                Grade.F
        };
        int n = (int) (Math.random() * myGrade.length);
        student.setGrade(myGrade[n]);
    }

    @Override
    public String getDescription() {
        return " { Name teacher " + getNameOfPerson() + ", age teacher " + getAgeOfPerson() + " } ";
    }
}

