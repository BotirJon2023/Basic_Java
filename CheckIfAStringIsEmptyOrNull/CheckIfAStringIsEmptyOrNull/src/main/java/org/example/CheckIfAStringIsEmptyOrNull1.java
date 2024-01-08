package org.example;

public class CheckIfAStringIsEmptyOrNull1 {

    public static void main(String[] args) {

        String str = "    ";

        System.out.println("str is " + isNullEmpty(str));
    }

    public static String isNullEmpty(String str) {

        if (str == null) {
            return "NULL";
        }

        else if (str.trim().isEmpty()){
            return "EMPTY";
        }

        else {
            return "neither NULL nor EMPTY";
        }
    }


}
