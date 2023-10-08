package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем список экземпляров класса Monkey
        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("Monkey1", 5, "Brown", true, 10.5));
        monkeys.add(new Monkey("Monkey2", 3, "Black", false, 8.2));
        monkeys.add(new Monkey("Monkey3", 4, "Brown", true, 9.0));
        monkeys.add(new Monkey("Monkey4", 2, "Gray", false, 7.5));

        // 1. Получить Map имя / информация, голодна ли обезьянка;
        Map<String, Boolean> nameHungryMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            nameHungryMap.put(monkey.getName(), monkey.isHungry());
        }

        // 2. Получить Map цвет / количество обезьян данного цвета;
        Map<String, Integer> colourCountMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String colour = monkey.getColour();
            colourCountMap.put(colour, colourCountMap.getOrDefault(colour, 0) + 1);
        }

        // 3. Получить Map цвет / список имен обезьян данного цвета;
        Map<String, List<String>> colourNamesMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String colour = monkey.getColour();
            colourNamesMap.computeIfAbsent(colour, k -> new ArrayList<>()).add(monkey.getName());
        }

        // 4. Создать компаратор и отсортировать исходный список по весу и имени.
        Comparator<Monkey> comparator = Comparator.comparingDouble(Monkey::getWeight)
                .thenComparing(Monkey::getName);
        monkeys.sort(comparator);

        // Вывод результатов
        System.out.println("1. Map имя / информация, голодна ли обезьянка:");
        System.out.println(nameHungryMap);

        System.out.println("\n2. Map цвет / количество обезьян данного цвета:");
        System.out.println(colourCountMap);

        System.out.println("\n3. Map цвет / список имен обезьян данного цвета:");
        System.out.println(colourNamesMap);

        System.out.println("\n4. Отсортированный список обезьян по весу и имени:");
        for (Monkey monkey : monkeys) {
            System.out.println(monkey.getName() + " - Вес: " + monkey.getWeight());
        }
    }
}
