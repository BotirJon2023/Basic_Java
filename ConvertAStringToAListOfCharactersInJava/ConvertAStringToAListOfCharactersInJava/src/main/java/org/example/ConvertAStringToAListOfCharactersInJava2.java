package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertAStringToAListOfCharactersInJava2 {

    public static List<Character>
    convertStringToCharList(String str)
    {


        List<Character> chars = str

                .chars()

                .mapToObj(e -> (char)e)


                .collect(Collectors.toList());


        return chars;
    }


    public static void main(String[] args)
    {

        String str = "Geek";

        List<Character>
                chars = convertStringToCharList(str);

        System.out.println(chars);
    }

}
