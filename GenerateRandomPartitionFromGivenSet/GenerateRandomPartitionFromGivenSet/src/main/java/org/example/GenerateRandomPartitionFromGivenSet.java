package org.example;

import java.util.Random;


public class GenerateRandomPartitionFromGivenSet {


    public class Random_Partition {

        public static void generateIntegerSequence(int N, Random random) {

            Integer[] sequence = new int[N];

            System.out.println("The Original set of numbers are:");

            for (int i = 0; i < N; i++) {

                sequence[i] = Math.abs(random.nextInt(100));

                System.out.print(sequence[i] + " ");
            }

            System.out.println();

            int partitionIndex = random.nextInt(N + 1);

            System.out.println("The two sequences are:");


            printPartitionedSequence(sequence, partitionIndex);
        }


        public static void generateCharacterSequence(int N, Random random) {

            Character[] sequence = new Character[N];

            System.out.println("The Original set of characters are:");

            for (int i = 0; i < N; i++) {

                sequence[i] = (char) (random.nextInt(26) + 97);

                System.out.print(sequence[i] + " ");
            }

            System.out.println();


            int partitionIndex = random.nextInt(N + 1);

            System.out.println("The two sequences are:");


            printPartitionedSequence(sequence, partitionIndex);
        }


        public static <T> void printPartitionedSequence(T[] sequence, int partitionIndex) {

            System.out.print("{ ");

            for (int i = 0; i < sequence.length; i++) {

                if (i == partitionIndex)

                    System.out.print(" } and { ");

                System.out.print(sequence[i] + " ");
            }

            System.out.print("}");

            System.out.println("\nPartitioning around index " + partitionIndex);
        }


        public static boolean shouldGenerateInteger(Random random) {

            return random.nextBoolean();
        }

    }

}
