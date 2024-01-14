package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task2 {

    public class MultithreadedArraySum {
        private static final int THREAD_COUNT = 4; // Количество потоков

        public static int sumArray(int[] array) {
            int chunkSize = array.length / THREAD_COUNT;
            ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
            int result = 0;

            try {
                for (int i = 0; i < THREAD_COUNT; i++) {
                    int startIndex = i * chunkSize;
                    int endIndex = (i == THREAD_COUNT - 1) ? array.length : (i + 1) * chunkSize;

                    int[] subArray = new int[endIndex - startIndex];
                    System.arraycopy(array, startIndex, subArray, 0, subArray.length);

                    Future<Integer> futureResult = threadPool.submit(new SumTask(subArray));
                    result += futureResult.get();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                threadPool.shutdown();
            }

            return result;
        }

        private static class SumTask implements java.util.concurrent.Callable<Integer> {
            private final int[] subArray;

            SumTask(int[] subArray) {
                this.subArray = subArray;
            }

            @Override
            public Integer call() {
                int sum = 0;
                for (int value : subArray) {
                    sum += value;
                }
                return sum;
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int result = sumArray(array);
            System.out.println("Sum of the array: " + result);
        }
    }
}
