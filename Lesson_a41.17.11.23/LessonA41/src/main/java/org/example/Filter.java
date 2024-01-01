package org.example;

@FunctionalInterface
public class Filter<T> {

    boolean apply(T t) {
        return false;
    }


}
