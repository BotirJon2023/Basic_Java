package lesson12.lesson12;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of a weekday:");
        String outNameDay = "";
        outNameDay = getNameDayOfWeekIfElse(scanner.nextInt());
        System.out.println("The name of the weekday:" + outNameDay);

        System.out.println("\n Введите число дня недели =");
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt());
        System.out.println("Имя дня недели = " + outNameDay);
    }

    static String getNameDayOfWeekIfElse(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("" + dayOfWeek);
            return "Day of week must be from 1 ...7";
        }
        String nameDayOfWeek = "";
        if (dayOfWeek == 1) nameDayOfWeek = "monday";
        else if (dayOfWeek == 2) nameDayOfWeek = "tuesday";
        else if (dayOfWeek == 3) nameDayOfWeek = "wednesday";
        else if (dayOfWeek == 4) nameDayOfWeek = "thursday";
        else if (dayOfWeek == 5) nameDayOfWeek = "friday";
        else if (dayOfWeek == 6) nameDayOfWeek = "saturday";
        else if (dayOfWeek == 7) nameDayOfWeek = "sunday";
        else nameDayOfWeek = "Not correct number";

        return nameDayOfWeek;
    }

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящее число!" + dayOfWeek);
            return "День недели должен от 1 .. 7";
        }

        String nameDayOfWeek = "";
        switch (dayOfWeek) {

            case 1:
                nameDayOfWeek = "Понедельник";
                break;
            case 2:
                nameDayOfWeek = "Вторник";
                break;
            case 3:
                nameDayOfWeek = "Среда";
                break;
            case 4:
                nameDayOfWeek = "Четверг";
                break;
            case 5:
                nameDayOfWeek = "Пятница";
                break;
            case 6:
                nameDayOfWeek = "Суббота";
                break;
            case 7:
                nameDayOfWeek = "Воскресенье";
                break;
            default:
                nameDayOfWeek = "Не корректно введенный день";

        }
        return nameDayOfWeek;
    }
}
