package org.example;

import java.util.List;

import com.google.gson.Gson;

public class ConvertJSONArrayToList {

    public static void main(String[] args) {

        String jsonData = "{\"id\": \"EMP001\",\"name\": \"Bob\",\"age\": 22,\"languages\": [\"English\", \"Spanish\"]}";


        Gson gsonObject = new Gson();

        Employee employee = gsonObject.fromJson(jsonData, Employee.class);

        for (String language : employee.getLanguages()) {
            System.out.println(language);
        }
    }
}


class Employee {

    private String id;
    private String name;
    private int age;

    private List<String> languages;

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
