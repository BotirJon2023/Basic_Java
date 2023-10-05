package PracticeLesson4;

public abstract class Hero {
    String name;
    abstract void Walk();
    abstract void attack();

    void shot() {
        System.out.println("****");
    }


}

interface Flyable {
    void fly();
}

interface Flyable2 {
    void fly2();
}

class H1 extends Hero implements Flyable {

    @Override
    void Walk() {
        System.out.println("H1 walk");
    }

    @Override
    void attack() {
        System.out.println("H1 attack");

    }

    @Override
    public void fly() {
        System.out.println("H1 fly");

    }
}

class H2 extends Hero implements Flyable2{


    @Override
    void Walk() {
        System.out.println("Walk");

    }

    @Override
    void attack() {
        System.out.println("Attack");
    }

    @Override
    public void fly2() {
        System.out.println("H2 fly2");
    }
}


