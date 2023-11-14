package org.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExeption {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("222 txt");
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);

        }
    }
}
