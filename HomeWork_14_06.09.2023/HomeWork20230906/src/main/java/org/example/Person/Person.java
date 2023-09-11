package org.example.Person;

import lombok.Getter;

@Getter
public abstract class Person {
    private final String nameOfPerson;
    private final int ageOfPerson;

    protected abstract String getDescription();

    public Person(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }
}