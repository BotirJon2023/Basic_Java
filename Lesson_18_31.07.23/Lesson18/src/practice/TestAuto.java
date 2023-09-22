package practice;

import java.util.Arrays;

public class TestAuto {

    public static void main(String[] args) {
        Car[] cars = {new Car(30000, "BMW"),
                     new Car(25000, "WolksVagen-Golf"),
                     new Car(50000, "Tesla"),
                             new Car(15000, "Nissan-Leaf")};

                System.out.println(cars.length);
        for(Car car: cars) System.out.println(cars);

        Arrays.sort(cars);
        System.out.println("После стандартной сортировки: ");


        Utils.sortBubblePrice(cars);
        System.out.println("Posle sortirovki po Zene: ");
        for(Car car: cars) System.out.println(cars);

        Utils.sortBubbleName(cars);
        System.out.println("Posle sortirovki po Marke: ");
        for(Car car: cars) System.out.println(cars);



    }

}
