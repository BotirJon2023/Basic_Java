package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class GsonHashMapToJSONExample {

    public static void main(String[] args) {


        Map<String, Student> mapStudents = new HashMap<String, Student>();
        mapStudents.put("1", new Student(1, "John", Arrays.asList("Maths", "Chemistry")));
        mapStudents.put("2", new Student(2, "Jason", Arrays.asList("Physics", "Biology")));
        mapStudents.put("3", new Student(3, "Carl", Arrays.asList("Music", "English")));


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();


        String json = gson.toJson(mapStudents);

        System.out.println(json);

    }
}


class Student {

    private int rollNumber;
    private String name;
    private List<String> subjects;

    public Student(int rollNumber, String name, List<String> subjects) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

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
