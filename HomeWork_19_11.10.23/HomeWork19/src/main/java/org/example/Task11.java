package org.example;

/*
Задача 2: Разбить список на подсписки заданного размера
      * Дан список элементов и размер подсписков. Необходимо разбить список
      * на подсписки указанного размера.
 */

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public class ListSplitter {
        public static <T> List<List<T>> splitList(List<T> sourceList, int chunkSize) {
            List<List<T>> result = new ArrayList<>();
            for (int i = 0; i < sourceList.size(); i += chunkSize) {
                int end = Math.min(sourceList.size(), i + chunkSize);
                result.add(sourceList.subList(i, end));
            }
            return result;
        }

        public static void main(String[] args) {
            List<Integer> myList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                myList.add(i);
            }

            int chunkSize = 3;
            List<List<Integer>> subLists = splitList(myList, chunkSize);

            for (List<Integer> subList : subLists) {
                System.out.println(subList);
            }
            private class ListSplitter {
                public static <T> List<List<T>> splitList(List<T> sourceList, int chunkSize) {
                    List<List<T>> result = new ArrayList<>();
                    List<T> subList = new ArrayList<>();

                    for (T item : sourceList) {
                        subList.add(item);
                        if (subList.size() == chunkSize) {
                            result.add(subList);
                            subList = new ArrayList<>();
                        }
                    }

                    if (!subList.isEmpty()) {
                        result.add(subList);
                    }

                    return result;
                }

                public static void main(String[] args) {
                    List<Integer> myList = new ArrayList<>();
                    for (int i = 1; i <= 10; i++) {
                        myList.add(i);
                    }

                    int chunkSize = 3;
                    List<List<Integer>> subLists = splitList(myList, chunkSize);

                    for (List<Integer> subList : subLists) {
                        System.out.println(subList);
                    }
                }
            }
        }
    }
}
