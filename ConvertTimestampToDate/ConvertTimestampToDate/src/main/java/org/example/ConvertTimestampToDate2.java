package org.example;

import java.sql.Timestamp;
import java.util.Date;

public class ConvertTimestampToDate2 {

    public static void main(String args[]) {

        Timestamp ts = new Timestamp(System.currentTimeMillis());

        Date date = ts;

        System.out.println(date);
    }
}
