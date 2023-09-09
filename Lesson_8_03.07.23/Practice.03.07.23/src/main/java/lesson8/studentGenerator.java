package lesson8;

import java.util.Random;

public class studentGenerator {
    public static void main(String[] args) {


        Random random = new Random();
        int numStudent = random.nextInt(25) + 1;
        System.out.println("Номера студента = " + numStudent);

        System.out.println("Cумма номеров студентов = " + sumTwoNumbers(numStudent, 5));

        System.out.println("Поделим номера студента = " + devideTwoNumbers(numStudent, 2));

        System.out.println("Поделим номера студента через Double = " + devideTwoDoubleInt(numStudent, 2));

        System.out.println("Поделим номера студента на 0 = " + devideTwoDoubleInt(numStudent, 0));
        findEvenOdd(2);
        findEvenOdd(5);
        findEvenOdd(numStudent);


    }


        static int sumTwoNumbers(int arg1, int arg2) {
        int  sumLocal = arg1 + arg2;
        return sumLocal;
    }


    static double devideTwoNumbers (int arg1, int arg2) {

        double devLocal = (double)arg1 / arg2;
        return devLocal;

    }

    static double devideTwoDoubleInt (int arg1, int arg2) {

        double devLocal = (double)arg1 / arg2;
        return devLocal;

    }

    static void findEvenOdd(int arg) {
        if(arg % 2 == 0 == true) {
            System.out.println(arg+" четное");
        }
        else {
            System.out.println(arg+" нечетное");
        }
    }

}
