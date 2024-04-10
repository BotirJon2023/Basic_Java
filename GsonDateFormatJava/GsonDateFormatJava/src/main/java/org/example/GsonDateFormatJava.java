package org.example;

import java.util.Calendar;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonDateFormatJava {

    public static void main(String[] args) {

        Employee emp = new Employee("EMP001", "Bob", Calendar.getInstance().getTime());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(gson.toJson(emp));

    }
}

class Employee{

    private String id;
    private String name;
    private Date dateOfJoining;

    public Employee(String id, String name, Date dateofJoining) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateofJoining;
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
    public Date getDateOfJoining() {
        return dateOfJoining;
    }
    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
