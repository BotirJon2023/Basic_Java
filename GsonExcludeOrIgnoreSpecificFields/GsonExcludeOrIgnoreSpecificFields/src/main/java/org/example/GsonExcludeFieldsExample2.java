package org.example;

import java.util.Arrays;
import java.util.List;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class GsonExcludeFieldsExample2 {

    public static void main(String[] args) {

        Employee3 employee3 = new Employee3("EMP001", "Bob", Arrays.asList(
                new Company("Wipro", 2, "Pune"),
                new Company("Infosys", 5, "Delhi"))
        );


        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setExclusionStrategies(new EmployeeExclusionStretegy())
                .create();

        String json = gson.toJson(employee3);

        System.out.println(json);

    }
}


class EmployeeExclusionStretegy implements ExclusionStrategy{

    public boolean shouldSkipClass(Class<?> arg0) {
        return false;
    }



    public boolean shouldSkipField(FieldAttributes attr) {



        return attr.getName().equals("name");
    }
}

class Employee3{

    private String id;
    private String name;
    private List<Company> companies;

    public Employee3(String id, String name, List<Company> companies) {
        this.id = id;
        this.name = name;
        this.companies = companies;
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
    public List<Company> getCompanies() {
        return companies;
    }
    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}

class Company{

    private String name;
    private int numberOfYears;
    private String location;

    public Company(String name, int numberOfYears, String location) {
        this.name = name;
        this.numberOfYears = numberOfYears;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}
