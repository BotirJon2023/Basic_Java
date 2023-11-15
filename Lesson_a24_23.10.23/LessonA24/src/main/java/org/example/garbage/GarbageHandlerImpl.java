package org.example.garbage;

import org.example.Garbage;
import org.example.recycle.PaperHandleMethod;

public class GarbageHandlerImpl<T extends Garbage, S extends HandleMethod> implements GarbageHandler<T, S> {

    @Override
    public void handle(Garbage what, PaperHandleMethod how) {
        System.out.println("Перерабатываем мусор " + what + " используя цикл переработки " + how);
    }

    @Override
    public <E> void transfer(E dangerousWaste) {
        System.out.println("Мы не можем переработаеть " + dangerousWaste + ", поэтому перевозим ее на другое предприятие!");
    }

}
