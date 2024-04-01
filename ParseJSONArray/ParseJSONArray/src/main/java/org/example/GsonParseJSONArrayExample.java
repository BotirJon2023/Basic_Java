package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class GsonParseJSONArrayExample {

    public static void main(String[] args) {

        String jsonData = "["
                + "{\"rollNumber\": 1,\"name\": \"Alex\"},"
                + "{\"rollNumber\": 2,\"name\": \"John\"},"
                + "{\"rollNumber\": 4,\"name\": \"June\"}"
                + "]";


        Gson gson = new Gson();


        Type listType = new TypeToken<List<Student>>() {
        }.getType();


        List<Student> listStudents = gson.fromJson(jsonData, listType);

        System.out.println("There are " + listStudents.size() + " students");

        //print JSON array elements
        for (Student student : listStudents) {
            System.out.println(student.getRollNumber() + " => " + student.getName());
        }
    }
}


class Student {

    private int rollNumber;
    private String name;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
