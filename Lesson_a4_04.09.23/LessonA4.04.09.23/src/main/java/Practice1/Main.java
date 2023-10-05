package Practice1;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Animal1 cat = new Cat();
        System.out.println(cat.getClass().getSuperclass());
    }

}
