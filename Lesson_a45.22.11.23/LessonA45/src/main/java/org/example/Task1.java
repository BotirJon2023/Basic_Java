package org.example;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) {



    }

    public class MultithreadedArraySorter {
        private int[] array;
        private int threadsCount;

        public MultithreadedArraySorter(int[] array, int threadsCount) {
            this.array = array;
            this.threadsCount = threadsCount;
        }

        public void sort() {
            ExecutorService threadPool = Executors.newFixedThreadPool(threadsCount);

            int chunkSize = array.length / threadsCount;
            for (int i = 0; i < threadsCount; i++) {
                int startIndex = i * chunkSize;
                int endIndex = (i == threadsCount - 1) ? array.length : (i + 1) * chunkSize;

                int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
                threadPool.execute(new SortTask(subArray));
            }

            threadPool.shutdown();
            try {
                threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            mergeChunks();
        }

        private void mergeChunks() {
        }

        private class SortTask implements Runnable {
            private int[] subArray;

            SortTask(int[] subArray) {
                this.subArray = subArray;
            }

            @Override
            public void run() {
                Arrays.sort(subArray);
            }
        }
    }
}
