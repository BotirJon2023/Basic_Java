import com.sun.source.util.SourcePositions;

import javax.annotation.processing.SupportedOptions;
import javax.swing.*;

public class Lesson15 {

    public class TestClass {
        public static void main(String[] args) {
            Box box1; //null
            box1 = new Box();
            box1.width = 5;
            box1.length = 10;
            box1.height = 3;
            System.out.println(box1.calcVolume());

            Box box2 = new Box(5, 4, 3);
            System.out.println(box2.calcVolume());

        }
    }

    class Box {
        int width, height, length; //переменные принадлежащие классу

        //конструктор


        public Box() {
        }

        public Box(int width, int height, int length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        // методы
        int calcVolume() {
            return width * height * length;
        }
    }
}

