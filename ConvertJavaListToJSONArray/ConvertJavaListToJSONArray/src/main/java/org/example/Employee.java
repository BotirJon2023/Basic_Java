package org.example;

import java.util.List;

public class Employee {

    private String id;
    private String name;
    private int age;


    private List<String> languages;

    public Employee(String id, String name, int age, List<String> languages) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.languages = languages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
