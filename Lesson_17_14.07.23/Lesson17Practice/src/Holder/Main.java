package Holder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println(SwitchHolder.hold("Security"));
        System.out.println(SwitchHolder.hold("Password"));
        System.out.println(SwitchHolder.hold("Horror"));
        System.out.println(SwitchHolder.hold("Music123"));
        System.out.println(SwitchHolder.hold("1920"));
        System.out.println(SwitchHolder.hold("LeninStalin"));
        System.out.println(SwitchHolder.hold("Moscow"));
        System.out.println(SwitchHolder.hold("Piterburg"));
        System.out.println(SwitchHolder.hold("Berlin2023"));
        System.out.println(SwitchHolder.hold("TelRan54321"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя для доступа к ячейкам : ");
        String[] answer = SwitchHolder.checkName(scanner.nextLine());

        int index = 0;

        while (true) {
            if (index < answer.length) {
                System.out.println(answer[index]);
                index++;
            } else {
                break;
            }
        }
    }
}
