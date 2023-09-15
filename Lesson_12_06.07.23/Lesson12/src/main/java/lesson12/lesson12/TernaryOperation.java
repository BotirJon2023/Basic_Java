package lesson12.lesson12;

import java.util.Scanner;

public class TernaryOperation {

    public static void main(String[] args) {
        int start1, end1, start2, end2, currentTime = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("\n Старт работы первого магазина =");
        start1 = scanner.nextInt(24);
        System.out.println("\n Окончание работы первого магазина =");
        end1 = scanner.nextInt(24);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Старт работы второго магазина =");
        start2 = scanner.nextInt(24);
        System.out.println("\n Окончание рабты второго магазина =");
        end2 = scanner.nextInt(24);

        System.out.println("\n Введите текущее время =");
        currentTime = scanner.nextInt(24);

    }

    static boolean workingShop1(int start1, int end1, int currentTime) {
        boolean isWorking = false;
        if(currentTime>=start1 && currentTime<=end1)
            isWorking = true;
        else isWorking = false;
        return isWorking;

    }

    static boolean workingShop2(int start2, int end2, int currentTime) {
                if(currentTime>=start2 && currentTime<=end2)
                    System.out.println("Ьфгфзин 1 работает!");

                      else isWorking = false;
        return isWorking;

    }
    static void workingShop(int start, int end, int currentTime) {]
    String oneMessage = (currentTime >= current )

    }
}
