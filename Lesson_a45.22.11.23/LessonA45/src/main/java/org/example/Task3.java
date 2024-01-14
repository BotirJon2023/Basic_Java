package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task3 {
    public class MultithreadedPiCalculator {
        private static final int THREAD_COUNT = 4; // Количество потоков
        private static final int ITERATIONS = 1000000; // Количество итераций для приближенного вычисления

        public static double calculatePi() {
            ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
            double pi = 0.0;

            try {
                for (int i = 0; i < THREAD_COUNT; i++) {
                    int start = i * ITERATIONS / THREAD_COUNT;
                    int end = (i == THREAD_COUNT - 1) ? ITERATIONS : (i + 1) * ITERATIONS / THREAD_COUNT;

                    Future<Double> futureResult = threadPool.submit(new PiTask(start, end));
                    pi += futureResult.get();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                threadPool.shutdown();
            }

            return pi;
        }

        private static class PiTask implements java.util.concurrent.Callable<Double> {
            private final int start;
            private final int end;

            PiTask(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public Double call() {
                double result = 0.0;
                for (int i = start; i < end; i++) {
                    double term = (i % 2 == 0) ? 1.0 : -1.0;
                    result += term / (2 * i + 1);
                }
                return result;
            }
        }

        public static void main(String[] args) {
            double piApproximation = calculatePi();
            System.out.println("Approximation of Pi: " + (4 * piApproximation));
        }
    }
}
