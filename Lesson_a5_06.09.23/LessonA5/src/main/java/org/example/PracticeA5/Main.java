package org.example.PracticeA5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        House house1 = new House(21, 50,5, "Moscow");
        House house2 = new House(16, 80,15, "Berlin");
        House house3 = new House(241, 90,25, "Paris");
        House house4 = new House(621, 150,35, "New-York");

        House[] houses = {house1, house2, house3, house4};
        Arrays.sort(houses);

        for (House h: houses) {
            System.out.println(h);
        }

    }

}
