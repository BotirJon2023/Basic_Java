import java.util.Scanner;

public class TestFor {

    public static void main(String[] args) {
        printWord(5);

        printNumberWithCount(5634, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новое число = ");
        printNumber(scanner.nextInt());
    }

    private static void printWord(int i) {
    }


    private static void printNumber(int number) {
        for (; ; ) {
            System.out.println(number % 10);
            number = number / 10;
            if (number == 0) break;
        }

    }

    private static void printNumberWithCount(int number, int count) {
        for (int i = 0; 1 < count; i++) {
            System.out.println(number % 10);
            number = number / 10;

        }
    }
}






