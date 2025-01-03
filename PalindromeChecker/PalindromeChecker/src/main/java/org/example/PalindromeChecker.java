package org.example;

public class PalindromeChecker {
    public static void main(String[] args) {

        String input = "racecar";

        if (isPalindrome(input)) {

            System.out.println(input + " is a palindrome.");

        } else {

            System.out.println(input + " is not a palindrome.");

        }
    }

    public static boolean isPalindrome(String str) {

        int left = 0, right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                return false;
            }

            left++;

            right--;
        }

        return true;
    }
}
