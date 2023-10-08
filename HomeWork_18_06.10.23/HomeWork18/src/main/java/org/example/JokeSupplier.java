package org.example;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class JokeSupplier {
    private static final List<String> jokes = List.of(
            "Joke 1",
            "Joke 2",
            "Joke 3",
            "Joke 4"
            // Можно добавьте здесь другие анекдоты
    );

    public static void main(String[] args) {
        Supplier<String> randomJoke = () -> {
            Random random = new Random();
            int index = random.nextInt(jokes.size());
            return jokes.get(index);
        };

        System.out.println("Случайный анекдот: " + randomJoke.get());
    }
}
