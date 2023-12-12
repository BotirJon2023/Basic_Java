package org.example;

public class ParentStream<T, M extends ParentStream<T>> {

    public MyStream<T> sequential() {
        return null;
    }

    public MyStream<T> parallel() {
        return null;
    }


}
