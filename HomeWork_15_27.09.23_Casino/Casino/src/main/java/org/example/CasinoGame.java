package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter;
@Setter;


import java.util.Scanner;

public class CasinoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите игру:");
        System.out.println("1 - Рулетка");
        System.out.println("2 - Игра 777");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playRoulette();
                break;
            case 2:
                play777();
                break;
            default:
                System.out.println("Некорректный выбор игры.");
                break;
        }
    }


    public static void playRoulette() {
        // Логика игры в рулетку
        System.out.println("Игра в рулетку");
    }

    public static void play777() {
        // Логика игры в 777
        System.out.println("Игра 777");
    }
}