package Practice;

import java.util.Scanner;

public class BuildSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту = ");
        int height = scanner.nextInt();
        System.out.println("Введите ширину = ");
        int widht = scanner.nextInt();

        build(widht, height);
    }

    static void build(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
