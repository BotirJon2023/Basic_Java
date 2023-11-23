package org.example;

import java.io.Serializable;

public class Person777 implements Serializable {

    private String name;
    private transient int age; // скрывает данные после сериализации

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person777 (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
