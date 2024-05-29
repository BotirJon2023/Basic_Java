package org.example;

public class Player {

    private final String name;
    private int messageCounter;

    public Player(String name) {
        this.name = name;
        this.messageCounter = 0;
    }

    public void sendMessage(Player receiver, String message) {
        receiver.receiveMessage(this, message);
    }

    public void receiveMessage(Player sender, String message) {
        messageCounter++;
        String newMessage = message + " " + messageCounter;
        System.out.println(name + " received message from " + sender.name + ": " + newMessage);

        if (messageCounter < 10) {
            sendMessage(sender, newMessage);
        } else {
            System.out.println("Both Players has sent and received 10 messages. Program finalized.");
        }
    }

}
