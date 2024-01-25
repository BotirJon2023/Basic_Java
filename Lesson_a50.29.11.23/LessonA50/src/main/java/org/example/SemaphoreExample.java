package org.example;

import com.github.javafaker.Faker;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private final static Faker FAKER = new Faker();
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);

        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);
        new Person(FAKER.name().name(), semaphore);

    }


}

class Person extends Thread {
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();

    }
    @Override
    public void run() {
        try {
            sleep(3000);
            System.out.println("[" + name + "] waiting for ....");
            semaphore.acquire();
            sleep(3000);
            System.out.println("[" + name + "] is using the PhoneBox");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
            System.out.println("[" + name + "] OUT");
        }
    }

}