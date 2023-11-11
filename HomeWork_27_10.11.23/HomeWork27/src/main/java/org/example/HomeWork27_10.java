package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork27_10 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        String[] contacts = readContactsFromFile(fileName);

        if (contacts != null) {
            String minName = findMinLengthContact(contacts);
            String maxName = findMaxLengthContact(contacts);

            System.out.println("Контакт с минимальной длиной имени: " + minName);
            System.out.println("Контакт с максимальной длиной имени: " + maxName);
        }
    }

    public static String[] readContactsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder sb = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                sb.append(line).append(",");
            }

            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString().split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String findMinLengthContact(String[] contacts) {
        String minName = contacts[0];

        for (String contact : contacts) {
            if (contact.length() < minName.length()) {
                minName = contact;
            }
        }

        return minName;
    }

    public static String findMaxLengthContact(String[] contacts) {
        String maxName = contacts[0];

        for (String contact : contacts) {
            if (contact.length() > maxName.length()) {
                maxName = contact;
            }
        }

        return maxName;
    }
}
