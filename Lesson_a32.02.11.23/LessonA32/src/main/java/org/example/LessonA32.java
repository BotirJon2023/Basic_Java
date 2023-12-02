package org.example;


class Student {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private Degree degree;

    public Student(int id, String name, int age, Degree degree) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Degree getDegree() {
        return degree;
    }
}

