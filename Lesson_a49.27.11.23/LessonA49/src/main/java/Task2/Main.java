package Task2;

public class Main {
    public static void main(String[] args) {
        Bow bow = new Bow();
        new Thread(bow::shotTarget).start();
        new Thread(bow::addArrows).start();
    }
}
