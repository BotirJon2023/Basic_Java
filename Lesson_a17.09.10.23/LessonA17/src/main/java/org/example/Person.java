package org.example;

public class Person {

    public String getName() {
        return name;
    }

    String name;



    int age;

    public int getAge() {
        return age;
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

}
