package SuperHero;

import java.util.Random;

public class SuperHero {

    public static void main(String[] args) {
        String[] names = {"BatMan", "Superman", "Spiderman", "Joker", "Hitman", "Rossamaha", "Invisibleman", "Robocop"};

        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String randomName = names[randomIndex];

        System.out.println("Случайный герой: " + randomName);
    }
}


