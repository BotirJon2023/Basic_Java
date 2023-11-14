package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        String text = "BODY\tDimensions\t159.9 x 76.7 x 8.3 mm (6.30 x 3.02 x 0.33 in)\n" +
                "Weight\t221 g (7.80 oz)\n" +
                "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), titanium frame (grade 5)\n" +
                "SIM\tNano-SIM and eSIM - International\n" +
                "Dual eSIM with multiple numbers - USA";

        try (FileWriter writer = new FileWriter("write.txt", true)) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
                }

            System.out.println("***DONE***");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
