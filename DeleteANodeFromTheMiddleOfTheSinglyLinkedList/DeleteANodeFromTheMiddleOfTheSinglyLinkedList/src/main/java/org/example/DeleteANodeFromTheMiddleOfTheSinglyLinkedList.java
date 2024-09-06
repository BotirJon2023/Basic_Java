package org.example;

public class DeleteANodeFromTheMiddleOfTheSinglyLinkedList {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    List<Date> birthdays = new ArrayList<>();
birthdays.add(dateFormat.parse("2016-01-20"));
birthdays.add(dateFormat.parse("1998-12-03"));
birthdays.add(dateFormat.parse("2009-07-15"));
birthdays.add(dateFormat.parse("2012-04-30"));
System.out.println("Before sorting: ");
for (Date date : birthdays) {
        System.out.println(dateFormat.format(date));
    }
Collections.sort(birthdays);
System.out.println("After sorting: ");
for (Date date : birthdays) {
        System.out.println(dateFormat.format(date));
    }

}
