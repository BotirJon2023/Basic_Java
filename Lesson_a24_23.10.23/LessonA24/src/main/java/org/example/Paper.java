package org.example;

import org.w3c.dom.ls.LSOutput;
public class Paper extends Garbage{
    @Override
    public String toString() {
        return "Paper{}";
    }

    @Override
    public double getWeight() {
        return 0.01;
    }
}