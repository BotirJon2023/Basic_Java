package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GsonJSONToHashMapExample2 {

    public static void main(String[] args) {

        String jsonData = "{"
                + "\"student1\": {\"rollNumber\": 1, \"name\": \"Bob\", \"marks\": 90},"
                + "\"student2\": {\"rollNumber\": 2, \"name\": \"John\", \"marks\": 90},"
                + "\"student3\": {\"rollNumber\": 3, \"name\": \"Rama\", \"marks\": 90}"
                + "}";


        Gson gson = new Gson();


        Type studentMapType = new TypeToken<HashMap<String, Student>>() {
        }.getType();


        HashMap<String, Student> mapStudents = gson.fromJson(jsonData, studentMapType);

        System.out.println("There are " + mapStudents.size() + " students in map");


        for (Map.Entry<String, Student> entry : mapStudents.entrySet()) {

            System.out.println(
                    entry.getKey() + " => "
                            + "["
                            + entry.getValue().getRollNumber() + ", "
                            + entry.getValue().getName() + ", "
                            + entry.getValue().getMarks()
                            + "]"
            );
        }
    }
}


class Student {

    private int rollNumber;
    private String name;
    private int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
