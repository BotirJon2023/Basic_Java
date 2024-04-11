package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class GsonExcludeFieldsExample {

    public static void main(String[] args) {

        Employee1 employee1 = new Employee1("EMP001", "Bob", 23);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        String json = gson.toJson(employee1);

        System.out.println(json);

    }
}

class Employee1{

    @Expose
    private String id;

    @Expose
    private String name;

    private int age;

    public Employee1(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
}
