package org.example;

// @FunctionalInterface
public abstract class Filter<T> {

    abstract boolean apply(T t);

}
