package Practice;

public class SumNumbers {

    public static void main(String[] args) {
        System.out.println("Сумма всех чисел от 0 до Макс = " + sumMaxNumbers(4, 3));

    }

    static int sumMaxNumbers(int number1, int number2) {
        int sum = 0;

        int maxNamber = (number1 > number2) ? number1 : number2;

        System.out.println("Максимальное число - " + maxNamber);

        for (int val = 1; val <= maxNamber; val++) {
            sum += val; // sum = sum + val;
        }


        return sum;
    }
}