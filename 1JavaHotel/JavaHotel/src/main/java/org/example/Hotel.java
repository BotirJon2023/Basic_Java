package org.example;

import java.util.ArrayList;

public class Hotel {

    //instance variable, ArrayList tracks current reservations
    private ArrayList<Reservation> rooms;
    private int rnum = 1;


    Reservation reserveObj;

    /**
     * constructor.
     */
    public Hotel() {
        rooms = new ArrayList<Reservation>();
        rooms.ensureCapacity(5);
        for (int i = 0; i < 5; i++) {
            rooms.add(null);
        }
    }

    public Hotel(int numRooms) {
        rooms = new ArrayList<Reservation>();
        rooms.ensureCapacity(numRooms);
        for (int i = 0; i < numRooms; i++) {
            rooms.add(null);
        }
    }

        public boolean buildRooms(int num) {
        //make sure the parameter is valid
        if (num <= 0) {
            return false;
        }
        //increase the capacity of the Vector
        rooms.ensureCapacity(rooms.size() + num);
        for (int i = 0; i < num; i++) {
            rooms.add(null);
        }
        //report succes
        return true;
    }

    public int reserveRoom(String person) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) == null) {
                reserveObj = new Reservation(person);
                reserveObj.setRoom(rnum);
                rooms.set(i, reserveObj);
                rnum++;
                return rnum - 1;
            }
        }
        return -1;
    }

    public boolean reserveRoom(String person, int roomNum) {
        try {
            if (rooms.get(roomNum - 1) == null) {
                reserveObj = new Reservation(person, roomNum);
                rooms.set(roomNum - 1, reserveObj);
                rnum++;
                return true;
            }
        } catch (Exception vb) {
            return false;
        }
        return false;
    }

    public void cancelReservations(String person) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) != null) {
                if (rooms.get(i).getName().equals(person)) {
                    rooms.set(i, null);
                }
            }
        }
    }
    public void printReservations() {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) != null) {
                System.out.println(rooms.get(i));
            } else {
                System.out.println((i + 1) + " is not reserved");
            }
        }
    }
}
