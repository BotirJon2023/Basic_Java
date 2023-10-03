package SuperHero;

import java.util.Random;
public class Weapon {

    public static void main(String[] args) {
        String[] Weapons = {"AK-47", "Sword", "Arrow", "Stick", "Stown", "Ice", "Flame", "Pistol"};

        Random random = new Random();
        int randomIndex = random.nextInt(Weapons.length);
        String WeaponName = Weapons[randomIndex];

        System.out.println("Выбранное оружие: " + WeaponName);
    }
}


