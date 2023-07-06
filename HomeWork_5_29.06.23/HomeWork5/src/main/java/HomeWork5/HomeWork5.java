package HomeWork5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1-е слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите 2-е слово: ");
        String word2 = scanner.nextLine();

        if (isEvenLength(word1) && isEvenLength(word2)) {
            String combinedWord = combineWords(word1, word2);
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны содержать четное количество букв.");
        }
    }

    public static boolean isEvenLength(String word) {
        return word.length() % 2 == 0;
    }

    public static String combineWords(String word1, String word2) {
        int halfLength = word1.length() / 2;
        String firstHalf = word1.substring(0, halfLength);
        String secondHalf = word2.substring(halfLength);

        return firstHalf + secondHalf;
    }
}