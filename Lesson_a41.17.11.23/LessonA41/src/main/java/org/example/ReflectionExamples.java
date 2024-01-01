package org.example;

public class ReflectionExamples {

    public static void main(String[] args) {
        Object o1 = "123";
        Object o2 = 123;
        Object o3 = new String()[]{"A","B","C"}

        Class<?> o1Class = o1.getClass();
        System.out.println(o1Class.getSuperclass());
        System.out.println(o1Class.getSimpleName());
        System.out.println(o1Class.getCanonicalName());
        System.out.println(o1Class.getName());

    }Class<?> o3Class = o3.getClass();
        System.out.println(o3Class.getSuperclass());
        System.out.println(o3Class.getSimpleName());
        System.out.println(o3Class.getCanonicalName());
        System.out.println(o3Class.getName());


}
