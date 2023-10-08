package PracticeLessonA5;

public class Animal {
    private String name;
    private int age;
    private boolean isHungry;

    public void feed() {
        System.out.println("Animal is not hungry anymore!");
        isHungry = false;
    }

}
