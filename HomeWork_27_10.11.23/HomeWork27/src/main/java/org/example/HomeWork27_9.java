package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class HomeWork27_9 {

    public static void main(String[] args) {
        // Создание карты
        Map<String, String> phoneBook = createPhoneBook();

        // Вывод карты
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Номер телефона: " + entry.getKey() + ", Имя: " + entry.getValue());
        }
    }

    public static Map<String, String> createPhoneBook() {
        Map<String, String> phoneBook = new HashMap<>();

        // Чтение файла "1.txt"
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(" "); // Предполагается, что в файле имена и номера разделены пробелом

            if (values.length >= 2) {
                String phoneNumber = values[0];
                String name = values[1];

                phoneBook.put(phoneNumber, name);
            }
        }

        scanner.close();

        return phoneBook;
    }
}
