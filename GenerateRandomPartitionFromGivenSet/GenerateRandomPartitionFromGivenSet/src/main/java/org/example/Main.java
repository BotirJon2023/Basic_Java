package org.example;

import java.util.Random;
import java.util.Scanner;

import static org.example.GenerateRandomPartitionFromGivenSet.Random_Partition.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Random Partition Program! Please enter the number of elements for the sequence (e.g., 10): ");

        int N = sc.nextInt();

        sc.nextLine();

        boolean generateInteger = shouldGenerateInteger(random);

        if (generateInteger) {

            generateIntegerSequence(N, random);

        } else {

            generateCharacterSequence(N, random);
        }


        System.out.print("Would you like to specify a custom partition index? (y/n): ");

        String response = sc.nextLine().trim().toLowerCase();

        if (response.equals("y")) {

            System.out.print("Enter your custom partition index (0 to " + N + "): ");

            int customPartitionIndex = sc.nextInt();

            sc.nextLine();

            if (customPartitionIndex >= 0 && customPartitionIndex <= N) {

                System.out.println("Using custom partition index: " + customPartitionIndex);

                if (generateInteger) {

                    int[] sequence = new int[N];

                    for (int i = 0; i < N; i++) {

                        sequence[i] = Math.abs(random.nextInt(100));
                    }

                    printPartitionedSequence(sequence, customPartitionIndex);
                } else {

                    char[] sequence = new char[N];

                    for (int i = 0; i < N; i++) {

                        sequence[i] = (char) (random.nextInt(26) + 97);
                    }

                    printPartitionedSequence(sequence, customPartitionIndex);
                }
            } else {

                System.out.println("Invalid partition index. Proceeding with the randomly generated index.");

            }
        }

        sc.close();
    }

    private static void printPartitionedSequence(char[] sequence, int customPartitionIndex) {
    }
}
