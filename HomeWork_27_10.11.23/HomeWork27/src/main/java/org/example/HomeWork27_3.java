package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeWork27_3 {

    public static void main(String[] args) {
        List<Long> phoneList = createPhoneList();
        System.out.println(phoneList);
    }

    static List<Long> createPhoneList() {
        List<Long> phoneList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                long phoneNumber = Long.parseLong(line.replaceAll("[^0-9]", ""));
                phoneList.add(phoneNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phoneList;
    }
}