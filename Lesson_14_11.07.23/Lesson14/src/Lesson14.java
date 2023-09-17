public class Lesson14 {
    public static void main(String[] args) {
        runHelloFor();
        System.out.println("");
        runHelloWhile();
        runHelloWileTrue();
        runHelloDoWhileTrue();

        sum();

    }


    static void runHelloFor() {
        for (int count = 10; count > 0; count--) {
            System.out.println("Привет программист -" + count);
        }
    }

    static void runHelloWhile() {
        int count = 20;

        while (count > 11) {
            System.out.println("Привет программист - " + count);
            count--;
        }
    }

    static void runHelloWileTrue() {
        int count = 30;
        while (true) {
            System.out.println("Привет программист - " + count);
            count--;
            if (count < 1) break;
        }
    }

    static void runHelloDoWhileTrue() {
        int count = 40;
        do {
            System.out.println("Привет программист - " + count);
            count--;
        } while (count > 30);
    }

    static void sum() {
        int x = 10;
        int sum = 0;
        do {
            sum += x;
            x--;

        } while (x > 0);
        System.out.println("Сумма = " + sum);

    }

}


