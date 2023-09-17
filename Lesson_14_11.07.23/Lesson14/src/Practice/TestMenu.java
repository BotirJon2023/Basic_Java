package Practice;

import java.util.Scanner;

public class TestMenu {

    public static void main(String[] args) {

        runMenu();
        runMenuWhile();


    }

    static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        char choice;
do {
    System.out.println("Кем Вы хотите играть:");
    System.out.println("1. Эльф");
    System.out.println("2. Орк");
    System.out.println("q. Выход");


    System.out.println("Сделайте свой выбор");

    choice = scanner.next().charAt(0);
}
while (choice != '1' && choice != '2' && choice != 'q');



        System.out.println("Ваш выбор: "+choice);
    }

    static void runMenuWhile() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        System.out.println("Кем Вы хотите играть:");
        System.out.println("1. Эльф");
        System.out.println("2. Орк");
        System.out.println("q. Выход");
        System.out.println("Сделайте свой выбор");
        choice = scanner.next().charAt(0);
        while (choice != '1' && choice != '2' && choice != 'q') {
            System.out.println("Кем Вы хотите играть:");
            System.out.println("1. Эльф");
            System.out.println("2. Орк");
            System.out.println("q. Выход");
            System.out.println("Сделайте свой выбор");
            choice = scanner.next().charAt(0);


        }

        System.out.println("Ваш выбор: "+choice);


    }

}
