package org.example;

import java.util.Arrays;
import java.util.List;

public class Cat {

    private String name;
    private int age;
    private String colour;
    private boolean isHungry;
    private double size;

    public Cat(String name, int age, String colour, boolean isHungry, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
        this.size = size;

    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    private static List<String> catList = Arrays.asList("Cat1", "Cat2", "Cat3","Cat4","Cat5");

    public static void feed(List<Cat> catList) {
        catList.stream()
                .filter(Cat::isHungry) // Отфильтровать только голодных кошек
                .forEach(cat -> cat.setHungry(false)); // Установить флаг голода в false
    }


}

