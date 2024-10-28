package org.example;

public class CalDis {

    double dis;

    CalDis(int x1,int y1,int x2,int y2)
    {
        dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }

}
