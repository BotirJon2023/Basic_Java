import java.util.Random;

public class HW09Massiv {


    public static void main(String[] args) {

        int[] numbers = new int[8];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
        }

        // Вывод массива на консоль в строку
        System.out.print("Исходный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Замена элементов с нечетным индексом на ноль
        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        // Вывод измененного массива на консоль в строку
        System.out.print("Измененный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

