import java.util.Scanner;

public class HomeWorkCutter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        System.out.println("Введите первое слово ");
        String wort1 = scanner.nextLine();        System.out.println("Введите второе слово ");
        String wort2 = scanner.nextLine();        if (wort1.length()%2 != 0) {
            System.err.println("Первое введенное вами слово нечнетное");        } else if (wort2.length()%2 !=0) {
            System.err.println("Второе введенное вами слово нечнетное");        } else {
            System.out.println(                    cutTwoWordInHalfAndMerge(wort1, wort2)
            );        }
    }    public static String cutTwoWordInHalfAndMerge(String wort1, String wort2) {
        String wort1Half = wort1.substring(0, wort1.length()/2);        String wort2Half = wort2.substring(wort2.length()/2);
        return wort1Half+wort2Half;    }
}

