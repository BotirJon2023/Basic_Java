package org.example;

public class Monkey {
    private final String name;
    private final int age;
    private final String colour;
    private final boolean isHungry;
    private final double weight;

    // Конструктор класса Monkey
    public Monkey(String name, int age, String colour, boolean isHungry, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    // Геттеры для получения полей

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }


    public int getAge() {
        return age;
    }
}
