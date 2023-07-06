package org.example;

public class HomeWork3 {

        public static void main(String[] args) {
            String str = new String("Я учу основы Java!");

            printPenultimateCharacter(str);
            checkSubstring(str);
            removeSubstring(str);
            replaceCharacters(str);
            convertToUpperCase(str);
            convertToLowerCase(str);
        }

        public static void printPenultimateCharacter(String str) {
            char penultimateChar = str.charAt(str.length() - 2);
            System.out.println("The penultimate character is: " + penultimateChar);
        }

        public static void checkSubstring(String str) {
            boolean containsJava = str.contains("Java");
            System.out.println("The string contains 'Java': " + containsJava);
        }

        public static void removeSubstring(String str) {
            String substringRemoved = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4);
            System.out.println("String with 'Java' removed: " + substringRemoved);
        }

        public static void replaceCharacters(String str) {
            String replacedString = str.replace('a', 'o');
            System.out.println("String with 'a' replaced by 'o': " + replacedString);
        }

        public static void convertToUpperCase(String str) {
            String uppercaseString = str.toUpperCase();
            System.out.println("Uppercase string: " + uppercaseString);
        }

        public static void convertToLowerCase(String str) {
            String lowercaseString = str.toLowerCase();
            System.out.println("Lowercase string: " + lowercaseString);
        }
    }

