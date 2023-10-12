package org.example;

/*
 Дан список строк. Необходимо найти количество строк, которые содержат заданное подстроку.

private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
 */

import java.util.Arrays;
import java.util.List;

public class Task1CountStringsContainingSubstring {

    private static int CountStringsContainingSubstring(List<String> list, String substring) {
        int count = 0;
        for (String str : list) {
            if (str.contains(substring)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        String substringToFind = "Java"; // Заданная подстрока
        int count = CountStringsContainingSubstring(list, substringToFind);
        System.out.println("Количество строк, содержащих подстроку '" + substringToFind + "': " + count);
    }

}
