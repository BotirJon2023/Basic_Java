package org.example;

public class StringCheckIfUpperCase {

    public static void main(String[] args) {

        String str = "STRING123, TEST";

        System.out.println( "Is String uppercase?: " + isStringUpperCase(str) );

    }

    private static boolean isStringUpperCase(String str){


        char[] charArray = str.toCharArray();


        for(int i=0; i < charArray.length; i++){

            if( Character.isLetter(charArray[i]) ){


                if( !Character.isUpperCase( charArray[i] ))
                    return false;
            }
        }
        return true;
    }
}
