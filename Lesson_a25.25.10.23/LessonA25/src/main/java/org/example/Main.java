package org.example;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Person777 person777 = new Person777(new Faker().name().name(), 25);
        System.out.println("Before serial: ");
        System.out.println("Nane: " + person777.getName());
        System.out.println("Age: " + person777.getAge());

        // Serial Object to file

        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person777);
            out.close();
            fileOut.close();
            System.out.println("Serialization");

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

        Person777 newPerson = null;

        // Deserialization


        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            newPerson = (Person777) in.readObject();
            in.close();
            System.out.println("Deserialization");
        } catch (ClassNotFoundException |
                 IOException e) {
            e.printStackTrace();
        }
    }
}
