package org.example;

import java.util.Scanner;
import java.util.Random;

public class GenerateAllPossibleSubsets {


    public static class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Random rand = new Random();


            long seconds = System.currentTimeMillis() / 1000;

            rand.setSeed(seconds);


            System.out.print("Enter the number of elements in the set: ");

            int N = sc.nextInt();

            int[] sequence = new int[N];


            for (int i = 0; i < N; i++) {

                sequence[i] = rand.nextInt(50) + 1; // Random numbers from 1 to 50
            }


            System.out.print("The elements in the set: ");

            for (int i = 0; i < N; i++) {

                System.out.print(sequence[i] + " ");
            }

            System.out.println();


            System.out.print("Enter the number of elements in the subset: ");

            int n = sc.nextInt();


            int totalSubsets = (int) Math.pow(2, N);

            for (int i = 0; i < totalSubsets; i++) {

                int count = Integer.bitCount(i);

                if (count == n) {

                    System.out.print("{ ");

                    for (int j = 0; j < N; j++) {

                        if ((i & (1 << j)) != 0) {

                            System.out.print(sequence[j] + " ");
                        }
                    }

                    System.out.println("}");
                }
            }

            sc.close();
        }
    }
}
