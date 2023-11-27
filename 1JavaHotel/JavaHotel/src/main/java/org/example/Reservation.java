package org.example;

public class Reservation {
    private String name;
    private int roomNumber;

    public Reservation(String person) {
        name = person;
    }

    public Reservation(String person, int room) {
        name = person;
        roomNumber = room;
    }

    public void setRoom(int newroom) {
        roomNumber = newroom;
    }

    public void setName(String newname) {
        name = newname;
    }

    public String toString() {
        return (name + "   " + roomNumber);
    }

    public int getRoom() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }
}
