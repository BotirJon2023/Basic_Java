package org.example;

import java.io.*;

public class LessonA28 {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, world!";

        writeStringToFile(fileName, content);

        String readContent = readStringFromFile(fileName);
        System.out.println("Read content: " + readContent);
    }

    public static void writeStringToFile(String fileName, String content) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(content);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readStringFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis);
            int c;
            while ((c = isr.read()) != -1) {
                sb.append((char) c);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
