package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws FileNotFoundException {

        try (FileReader fileReader = new FileReader("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\Lesson_a23_23.10.23\\LessonA23\\src\\main\\java\\org\\example\\234.txt")) {
            int c;

            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n");
            System.out.println("***DONE***");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
