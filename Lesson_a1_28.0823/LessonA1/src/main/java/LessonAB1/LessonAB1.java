package LessonAB1;

import org.example.Main;

public class LessonAB1 {

    public static void main(String[] args) {
        LessonAB1 main = new LessonAB1();
        int[] arr = {
                4, 2, 1, 3, 7, 8, 1
        };
        System.out.println(main.returnMinValue(arr));
    }


    public int returnMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
                } else if(array[i] != min && array[i] < min2) {
            min2 = array[i];
            }

        }
        return min2;
    }


}


