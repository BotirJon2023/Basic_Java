package lesson9.practise;

public class logicTask {

    public static void main(String[] args) {
        int a=1, b=2, c=3, d=0;

        // Ложное выражение:

        if((a < b) && (b == c)) {
            d = a+b+c;
            System.out.println("Сумма d = " +d);
        }

        else {
            System.out.println("Ложное значение!!!");

        }

        // Истинное выражение :

        if((a < b) || (b == c)) {
            d = a+b+c;
            System.out.println("Сумма d = " +d);
        }

        else {
            System.out.println("Ложное значение!!!");

        }


    }
}
