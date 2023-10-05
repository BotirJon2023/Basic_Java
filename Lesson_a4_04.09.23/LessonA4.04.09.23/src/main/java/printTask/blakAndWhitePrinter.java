package printTask;

public class blakAndWhitePrinter extends Printer {

    @Override
    void print(String string) {
        System.out.println("Струйный принтер: " + string);
    }
}
