package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
public class MakeFileHidden2 {

    public static void main(String[] args) throws IOException {

        String strFilePath = "C:/dir_1/data.txt";

        File file = new File(strFilePath);

        if (file.isHidden())

            System.out.println("File is hidden");

        else

            System.out.println("File is visible");


        Path path = Paths.get("C:/dir_1/data.txt");


        Files.setAttribute(path, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);


        if (file.isHidden())

            System.out.println("File is hidden");

        else

            System.out.println("File is visible");
    }
}
