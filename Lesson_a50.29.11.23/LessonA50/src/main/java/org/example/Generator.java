package org.example;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Generator {

    private final static Faker FAKER = new Faker();

    private final static Exchanger<Position> positionExchanger = new Exchanger<>();

    public static List<Player> playerGenerator() {

        List<Player> players = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            players.add(new Player(FAKER.name().name(), positionGenerator(), positionExchanger));
        }
        return players;
    }

    private static List<Position> positionGenerator() {

        List<Position> positions = new ArrayList<>();
        Position[] arrayPosition = Position.values();
        for (int i = 0; i < 10; i++) {
            positions.add(arrayPosition[new Random().nextInt(3)]);
        }
        return positions;
    }
}
