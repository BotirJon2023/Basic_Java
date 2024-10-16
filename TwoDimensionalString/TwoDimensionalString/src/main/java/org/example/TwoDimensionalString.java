package org.example;

public class TwoDimensionalString {

    public static void main(String[] args)

    {

        String[][] str = new String[][]{{"one", "two"}, {"three", "four"},{"five","six"}};

        System.out.println("Two dimensional string array elements are :\n");

        for (int i = 0; i < 3; i++)

        {

            for (int j = 0; j < 2; j++)

            {

                System.out.println("str["+i+"]["+j+"]:"+str[i][j]);

            }
        }
    }
}