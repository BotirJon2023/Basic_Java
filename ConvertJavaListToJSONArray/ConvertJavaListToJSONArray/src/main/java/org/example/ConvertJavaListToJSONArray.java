package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class ConvertJavaListToJSONArray {

    public static void main(String[] args) {

        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add( new Employee("EMP01", "Bob", 23, Arrays.asList("English", "French")) );
        listEmployees.add( new Employee("EMP02", "May", 21, Arrays.asList("English", "German")) );
        listEmployees.add( new Employee("EMP03", "Raj", 32, Arrays.asList("English", "Hindi")) );


        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(listEmployees);
        System.out.println(json);
    }
}
