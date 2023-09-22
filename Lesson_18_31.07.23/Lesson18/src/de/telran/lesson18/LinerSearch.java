package de.telran.lesson18;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        int size = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();

        int[] arr = new int[size];

        //Генерим элементы массива
        Random random = new Random();
        for (int i=0; i<size; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        //Ищем информацию по search1
        System.out.println("Введите значение для поиска: ");
        int key = scanner.nextInt();

        int index = search1(arr, key);
        if(index >= 0) System.out.println("Нашли элемент с Index = "+index);
        else System.out.println("Элемент не найден");

        //Ищем информацию по search2
        System.out.println("Введите значение для поиска search2: ");
        key = scanner.nextInt();

        index = search2(arr, key);
        if(index >= 0) System.out.println("Нашли элемент с Index = "+index);
        else System.out.println("Элемент не найден");

        //Ищем информацию с помощью Arrays.binarySearch()
        System.out.println("Введите значение для поиска Arrays.binarySearch(): ");
        key = scanner.nextInt();

        index =  Arrays.binarySearch(arr, key);
        if(index >= 0) System.out.println("Нашли элемент с Index = "+index);
        else System.out.println("Элемент не найден");

        //Ищем все вхождения информации
        System.out.println("Введите значение для поиска searchAll: ");
        key = scanner.nextInt();

        int[] searchArr =  searchAll(arr, key);
        if(searchArr != null) System.out.println("Нашли элементы с Indexs = " + Arrays.toString(searchArr));
        else System.out.println("Элемент не найден");

    }

    static int search1(int[] searchArr, int key) {
        int i;
        for(i = 0; i < searchArr.length; i++) {
            if(searchArr[i] == key) break;
        }
        return (i == searchArr.length) ? -1 : i;
    }

    static int search2(int[] searchArr, int key) {
        for(int i = 0; i < searchArr.length; i++) {
            if(searchArr[i] == key) return i;
        }
        return -1;
    }

    static int search3(int[] searchArr, int key) {
        for(int i = searchArr.length-1; i >= 0 ; i--) {
            if(searchArr[i] == key) return i;
        }
        return -1;
    }

    static int[] searchAll(int[] searchArr, int key) {
        int[] findInd = null;
        for(int i = searchArr.length-1; i >= 0 ; i--) {
            if(searchArr[i] == key) {
                if(findInd == null) {
                    findInd = new int[1];
                    findInd[0]=i;
                } else {
                    findInd = Arrays.copyOf(findInd, findInd.length+1);
                    findInd[findInd.length-1] = i;
                }
            }
        }
        return findInd;
    }
}