package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.io.Serializable;
@Getter
@AllArgsConstructor

public class Student implements Serializable {
    private transient final int id;
    private String name;
    private int age;
    private double grade;
    @Override
public String toString() {
        return id + ": " + name +
                " - " + age +
                " - " + grade;   } }


