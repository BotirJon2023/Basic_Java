package Practice2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class fixLift {

    public static void main(String[] args) {
        int h, n, m;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите этажность дома h =");
            h = scanner.nextInt();
            System.out.print("Введите шаг подьема лифта n =");
            n = scanner.nextInt();
            System.out.print("Введите шаг спуска лифта m =");
            m = scanner.nextInt();
            if (m > n) System.out.println("Введите корректное значение");
        }
        while (m > n);

        int currentFloor = 0;
        while (currentFloor < h) {
            System.out.println("Teкущий этаж - " + currentFloor);
            currentFloor = numberOfLift(currentFloor, n, m);
        }
        System.out.println("Мы достигли последнего этажа " + h);
    }

    static int numberOfLift(int floor, int stepUp, int stepDown) {
        return floor + stepUp - stepDown;
    }
}


