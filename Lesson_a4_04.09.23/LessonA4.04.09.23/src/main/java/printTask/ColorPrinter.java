package printTask;

public class ColorPrinter extends Printer {

    @Override
    void print(String string) {
        System.out.println("Цветная печать: " + string);
    }
}
