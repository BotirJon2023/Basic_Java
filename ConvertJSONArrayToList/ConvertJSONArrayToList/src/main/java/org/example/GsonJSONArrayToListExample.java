package org.example;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class GsonJSONArrayToListExample {

    public static void main(String[] args) {

        String jsonData = "["
                + "{\"id\": \"EMP001\",name\": \"Bob\",\"age\": 22,\"languages\": [\"English\", \"Spanish\"]},"
                + "{\"id\": \"EMP002\",\"name\": \"June\",\"age\": 27,\"languages\": [\"English\", \"French\", \"German\"]},"
                + "{\"id\": \"EMP003\",\"name\": \"Raj\",\"age\": 32,\"languages\": [\"English\", \"Hindi\", \"Tamil\"]}"
                + "]";


        Gson gsonObject = new Gson();


        Type listType = new TypeToken<List<Employee2>>() {
        }.getType();


        List<Employee2> listEmployee2 = gsonObject.fromJson(jsonData, listType);


        for (Employee2 employee2 : listEmployee2) {
            System.out.println(employee2.getId() + " => " + employee2.getLanguages());
        }

    }
}


class Employee2 {

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
