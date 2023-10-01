package LessonA1;

import org.example.Main;

public class LessonA1 {

    public static void main(String[] args) {
        int[] arr = {4, 76, 32, 8, 74, 6, 12, 86, 182, 318, 726, 487, 214};
        LessonA1 main = new LessonA1();
        System.out.println(main.returnMin(arr));
    }

    public int returnMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                min = arr[i];

            }

        }
        return min;


    }

}
