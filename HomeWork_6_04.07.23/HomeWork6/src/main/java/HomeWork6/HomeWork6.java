package HomeWork6;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double differenceM = Math.abs(10 - m);
        double differenceN = Math.abs(10 - n);

        if (differenceM < differenceN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (differenceN < differenceM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
        }
    }

    public static class WorkdayCountdown {
        public static void main(String[] args) {
            Random random = new Random();
            int secondsRemaining = random.nextInt(28801); // Генерация случайного числа от 0 до 28800

            System.out.println("Осталось " + secondsRemaining + " секунд");

            int hoursRemaining = secondsRemaining / 3600; // Количество полных часов
            if (hoursRemaining > 0) {
                System.out.println("Осталось " + hoursRemaining + " часов");
            } else {
                System.out.println("Осталось менее часа");
            }
        }
    }
}


