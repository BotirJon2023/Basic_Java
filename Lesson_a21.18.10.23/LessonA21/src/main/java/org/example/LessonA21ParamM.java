package org.example;

import java.util.ArrayList;
import java.util.List;

public class LessonA21ParamM {

    @Deprecated
    public static void m(){

    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        class Gen <T> {
            public static <T> T getFirst(List<T> list) {
                return list.get(0);
            }

            public static double sum(List<? extends Number> list) {
                double sum = 0.0d;
                for (Number n : list) {
                    sum = sum + n.doubleValue();

                }
                return sum;
            }

        }

    }

}
