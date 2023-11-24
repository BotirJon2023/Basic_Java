package org.example;

import java.util.Arrays;

public class LessonA26 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MIN_VALUE;
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}

