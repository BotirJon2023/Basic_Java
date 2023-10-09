package org.example;

import java.util.Objects;

public class EHex1 {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.name = "BMW";

        Auto auto1 = new Auto();
        auto1.setName("AUDI");

        System.out.println(auto.hashCode());
        System.out.println(auto1.hashCode());

    }
}

class Auto {
    String name;
    private boolean isSportCar;
    private double horsePower;

    public Auto(String name, boolean isSportCar, double horsePower) {
        this.name = name;
        this.isSportCar = isSportCar;
        this.horsePower = horsePower;
    }

    public Auto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    // o1.equals(o)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return isSportCar() == auto.isSportCar() && Double.compare(auto.getHorsePower(), getHorsePower()) == 0 && Objects.equals(getName(), auto.getName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isSportCar(), getHorsePower());
    }
}
