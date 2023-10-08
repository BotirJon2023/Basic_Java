package org.example;

public class Robot  implements Playable, Workable {

    @Override
    public void play() {
        System.out.println("Robot plays");

    }

    @Override
    public void play(Playable playable) {
        System.out.println("Robot plays with " + playable);
    }

    @Override
    public void work() {
        System.out.println("Robot works");
    }
}