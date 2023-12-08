package org.example;


public class Practice1 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "a#aaa###aaa";

        System.out.println(s1);
        System.out.println(s2);

        boolean result = compareStrings(s1, s2);
        System.out.println(result);
    }

    public static boolean compareStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s2.toCharArray();

        for (char c : chars) {
            if (c == '#') {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(c);
            }
        }

        String modifiedS2 = sb.toString();
        return s1.equals(modifiedS2);
    }
}