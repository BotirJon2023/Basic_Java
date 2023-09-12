package lesson9;

public class UnaryOperator {
    public static void main(String[] args) {
        int val1 = 10, val2 = 20;
        System.out.println("Сумма 2х чисел = "+ (val1+val2));

        System.out.println("Постфиксный инкремент числа = "+ (val1++));
        // val1 = val1 + 1;

        System.out.println("Постфиксный декремент числа = "+ (val2--));
        // val2 = val2 - 1;

        System.out.println("Префиксный инкремент числа = "+ (++val1));
        // val1 = val1 + 1;

        System.out.println("Префиксный декремент числа = "+ (--val2));
        // val2 = val2 - 1;

        val1++;

        System.out.println("Печать числа = "+ (val1));


        System.out.println("Меняем число на противоположное значение = " + (-val1));

        System.out.println("Ещё раз меняем число на противоположное значение = " + (-val1));

        int val3 = -val1;
        System.out.println("Печать числа val3 =" + val3);

        int val4 = -val3;
        System.out.println("Печать числа val4 =" + val4);

    }

}
