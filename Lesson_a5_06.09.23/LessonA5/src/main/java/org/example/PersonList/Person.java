package org.example.PersonList;

import java.util.Comparator;

public class Person {

    Person[] people = {p1, p2, p3, p4};
    System.out.print();



}

class SalaryComparator implements Comparator <Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
Collection.sort(personList, new SalaryComparator);
System.out.println(personList)