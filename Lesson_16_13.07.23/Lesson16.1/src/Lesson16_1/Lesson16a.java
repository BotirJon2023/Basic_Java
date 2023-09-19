package Lesson16_1;

import java.util.Arrays;
import java.util.Random;

public class Lesson16a {

    int elemClass; // avtomatic null

    public static void main(String[] args) {
        int[] arrInt; // null
        arrInt = new int[10]; // first variant
        for (int val : arrInt) {
            System.out.println(val);
        } // foreach

        Random random = new Random();
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(100);
            System.out.println("arrInt[" + i + "] = " + arrInt[i]);
        }

        arrInt[5] = 333;
        arrInt[arrInt.length - 1] = 990;

        for (int val : arrInt) System.out.println(val);

        System.out.println();
        // ручное увеличение массивов
        arrInt = copyArray(arrInt, 15);
        for (int val : arrInt) System.out.println(val); // val - значение элемента Ж : - значение  arrInt Ж

        // аналогиченое увеличение
        arrInt = Arrays.copyOf(arrInt, 20);

        System.out.println(" -------- ArrInt --------------");

        for (int val : arrInt) System.out.println(val);

        // копирование массива
        int[] newArrInt = Arrays.copyOf(arrInt, arrInt.length); // копирование массивов библиотечным методом

        int[] newArrInt1 = copyArray(arrInt, arrInt.length); // копирование массивов ручным методом


        System.out.println("--- newArrInt --- ");
        for (int val : newArrInt) System.out.println(val);

        for (int i = 0; i < newArrInt.length; i++) newArrInt[i] = -1; //меняем все значения на -1 в копии
        System.out.println("--- newArrInt --- копия");
        for (int val : newArrInt) System.out.println(val);

        System.out.println("-- arrInt -- оригинал");
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива


        //    String[] arrString = new String[5];
        //    for (String val : arrString) {
        //        System.out.println(val);
        //    }

        //    System.out.println(arrInt);

        //    int[] arrIntInit = {1, 2, 3, 4, 5, 7}; // literals - new int[7] =
        //    for (int val : arrIntInit) {
        //        System.out.println(val);
        //    }


    }


    static int[] copyArray(int[] oldArr, int newSize) {
        if (oldArr.length > newSize) return null;

        int[] newArr = new int[newSize];
        for (int i = 0; i < oldArr.length; i++) newArr[i] = oldArr[i];
        return newArr;
    }

}
