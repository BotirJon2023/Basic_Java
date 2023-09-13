package HomeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();


        String secondWord = scanner.nextLine();

        if (firstWord.length() % 2 != 0) {
            System.out.println("Первое введенное Вами слово нечетное") {
        }
else if (secondWord.length() % 2 != 0)
                System.out.println("Второе введенное Вами слово нечетное");
        }
        else {
        System.out.println(
                    cutTwoWordInHalfAndMerge(firstWord, secondWord)
            );


    }

    public static String cutTwoWordInHalfAndMerge(String firstWord, String secondWord) {
            String firstHalf = firstWord.substring(0,firstWord.length()/2);

            String secondHalf = secondWord.substring(secondWord.length()/2);

            return firstHalf = secondHalf;
    }

}


