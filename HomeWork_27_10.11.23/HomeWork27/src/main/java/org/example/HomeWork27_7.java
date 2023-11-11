package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork27_7 {

    public static void main(String[] args) {
        convertData();
    }

    public static void convertData() {
        // Путь к файлу 1.txt
        String filePath = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        // Путь к файлу, в который будет записано преобразованное содержимое
        String outputFilePath = "converted_data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             FileWriter writer = new FileWriter(outputFilePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разделяем строку на имя и номер по символу "="
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String number = parts[1].trim();
                    // Записываем преобразованную строку "имя=номер" в файл
                    writer.write(name + "=" + number + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
