package org.example;
import java.util.*;

public class GenericExamples {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3);
        method(list);


        List<Integer> integerData = Arrays.asList(10, 20);
        List<Double> doubleData = Arrays.asList(10.0, 20.0);
        List<? extends Number> data1;
        data1 = integerData;
        data1 = doubleData;
        processNumber(integerData);
        processNumber(doubleData);

        List<? super Number> data2;
        List<Number> data3;


        // PECS = Producer Extends Consumer Super
        List<BMW> bmws = new ArrayList<>();
        List<Volvo> volvos = new ArrayList<>();
        List<? extends Car> carsInShop = bmws;
        carsInShop = volvos;

//        carsInShop.add(new BMW());
//        carsInShop.add(new Volvo());
//        carsInShop.add(new Car());
//
        Car car = carsInShop.get(0);

        List<? super Car> carsOnTheParking = new ArrayList<>();
        carsOnTheParking.add(new Car());
        carsOnTheParking.add(new BMW());
        carsOnTheParking.add(new Volvo());

        Object o = carsOnTheParking.get(0);

        List<? super BMW> carsList = new ArrayList<>();
        carsList.add(new BMW());
//        carsList.add(new WhiteBMW());
//        carsList.add(new Car());
















    }

    public static void processNumber(List<? extends Number> data) {
    }


    // type erasure
    public static void method(List<String> strings) {

    }

//    public static void method(List<Integer> integers) {
//
//    }

}