package SuperHero;

import java.util.Random;
public class Protection {
    private String name;
    private int force;


    public Protection (String name, int force) {
        this.name = name;
        this.force = force;
    }

    public Protection
    public static void main(String[] args) {

        String[] Protection = {"Jacket", "Cloak", "Body armor", "Helmet", "Umbrella", "Gloves"};

        Random random = new Random();
        int randomIndex = random.nextInt(Protection.length);
        String ProtectionName = Protection[randomIndex];

        System.out.println("Выбранная защита: " + ProtectionName);
    }
}


