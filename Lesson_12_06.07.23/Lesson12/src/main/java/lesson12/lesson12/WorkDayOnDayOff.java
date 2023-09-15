package lesson12.lesson12;


import java.util.Scanner;

public class WorkDayOnDayOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число дня недели = ");
        String outNameDay = "";
        outNameDay = getNameWorkDayOrDayOff(scanner.nextInt());
        System.out.println("Статус дня = " + outNameDay);
    }

    static String getNameWorkDayOrDayOff(int dayOfWeek) {
        //проверка числа на диапазон 1...7
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящее число! - " + dayOfWeek);
            return "День недели должен быть от 1...7";
        }
        // анализ на рабочий день или выходной
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1:   // аналог (dayOfWeek==1 || dayOfWeek==2 || dayOfWeek==3 ...)
            case 2:
            case 3:
            case 4:
            case 5:
                nameDayOfWeek = "рабочий день";
                break;
            case 6:
            case 7:  //аналог (dayOfWeek==6 || dayOfWeek==7)
                nameDayOfWeek = "выходной день";
                break;
            default:
                nameDayOfWeek = "Не корректное число";
        }

        return nameDayOfWeek;
    }
}