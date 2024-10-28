package org.example;

import java.util.Scanner;
public class DistanceBwPoint5 {

    public static void main(String args[])

    {
        int x1,x2,y1,y2;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1 point");

        x1=sc.nextInt();

        System.out.println("enter y1 point");

        y1=sc.nextInt();

        System.out.println("enter x2point");

        x2=sc.nextInt();

        System.out.println("enter y2 point");

        y2=sc.nextInt();

        CalDis cd=new CalDis(x1,y1,x2,y2);

        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+cd.dis);

    }

}
