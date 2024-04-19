package org.example;

import java.util.List;

public class Employee {

    private String id;
    private String name;
    private int age;
    private boolean isManager;
    private String reservedParking;
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
    public boolean isManager() {
        return isManager;
    }
    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }
    public String getReservedParking() {
        return reservedParking;
    }
    public void setReservedParking(String reservedParking) {
        this.reservedParking = reservedParking;
    }
    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String toString() {

        return "[" + this.getId() + ", "
                + this.getName() + ", "
                + this.getAge() + ", "
                + this.isManager + ", "
                + this.getReservedParking() + ", "
                + this.getLanguages() + "]";
    }
}
