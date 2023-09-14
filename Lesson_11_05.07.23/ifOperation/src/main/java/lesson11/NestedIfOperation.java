package lesson11;

import java.util.Random;

public class NestedIfOperation {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(200);
        System.out.println("Число сгенерировано = " +number);

        if(number>120) {
            System.out.println("Человек нарушил правила!");

            if(number>130) {
                System.out.println("Человек злостно нарушил, штраф увеличен!");
                if(number>170) {
                    System.out.println("Человек лишен прав!");

                }

                // использование диапазона
                if(number>100 && number <130) System.out.println("Человек нарушил правила - предупредить!");

                if(number>130 && number <170) System.out.println("Человек злостно нарушил правила - выписать штраф!");
                if(number>170) System.out.println("Лишение прав!");
            }



        }

    }


}
