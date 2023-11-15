package org.example.garbage;

import org.example.Garbage;
import org.example.recycle.PaperHandleMethod;

interface GarbageHandler<T extends Garbage, S extends HandleMethod> {
    //    interface GarbageHandler<T, S> {
    void handle(Garbage what, PaperHandleMethod how);

    <E> void transfer(E dangerousWaste);
}

