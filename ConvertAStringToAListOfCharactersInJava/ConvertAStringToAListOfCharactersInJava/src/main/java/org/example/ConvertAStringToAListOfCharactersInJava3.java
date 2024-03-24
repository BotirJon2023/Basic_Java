package org.example;

import java.util.AbstractList;
import java.util.List;

public class ConvertAStringToAListOfCharactersInJava3 {

    public static List<Character>
    convertStringToCharList(String str)
    {
        return new AbstractList<Character>() {

            @Override
            public Character get(int index)
            {
                return str.charAt(index);
            }

            @Override
            public int size()
            {
                return str.length();
            }
        };
    }

    // Driver code
    public static void main(String[] args)
    {


        String str = "Geek";


        List<Character>
                chars = convertStringToCharList(str);


        System.out.println(chars);
    }
}
