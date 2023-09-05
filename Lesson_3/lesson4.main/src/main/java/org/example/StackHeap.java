package org.example;

public class StackHeap {

    public static void main(String[] args) {
        int myInt1 = 10;
        Test test1 = new Test();

        String myStr1 = new String("My String");
        String myStr2 = "My String";

        int myInt2 = myInt1;
        System.out.println(myInt1 + " ---- "+myInt2);
        myInt2 = 20;
        System.out.println(myInt1 + " ---- "+myInt2);

        Test test2 = test1;
        System.out.println(test1.myInTest + " ---- "+test2.myInTest);
        test1.myInTest = 55;
        System.out.println(test1.myInTest + " ---- "+test2.myInTest);
        test2.myInTest = 99;
        System.out.println(test1.myInTest + " ---- "+test2.myInTest);



    }





}
