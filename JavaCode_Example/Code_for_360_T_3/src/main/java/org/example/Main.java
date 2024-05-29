package org.example;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.sendMessage(player2, "Hello");
    }
}