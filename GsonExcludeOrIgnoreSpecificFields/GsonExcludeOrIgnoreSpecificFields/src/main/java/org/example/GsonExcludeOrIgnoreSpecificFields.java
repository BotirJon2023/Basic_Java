package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class GsonExcludeOrIgnoreSpecificFields {

    public static void main(String[] args) {

        Employee employee = new Employee("EMP001", "Bob", 23);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(employee);

        System.out.println(json);

    }
}
