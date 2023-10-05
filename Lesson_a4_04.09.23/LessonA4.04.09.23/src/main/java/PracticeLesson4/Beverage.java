package PracticeLesson4;

public abstract class Beverage {

    abstract void consume();

}

class Tea extends Beverage {


    @Override
    void consume() {
        System.out.println("Tea");
    }
}

class Coffee extends Beverage{


    @Override
    void consume() {
        System.out.println("Cofee");

    }
}
class Main {



}
