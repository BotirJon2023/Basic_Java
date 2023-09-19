package Practice17lesson;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestArray {



    public static void main(String[] args) {

        // Работа со строками
        String[] arrStr = new String[3];
        arrStr[0] = "Строка1";
        arrStr[2] = "Строка3";
        for (String val : arrStr) System.out.println(val);


        String[] arrStrLiteral = {"Str1", "Str2", "Str3"};
        System.out.println("--------- arrStrLiteral-------------");
        for (String val : arrStrLiteral) System.out.println(val);
// Работа с объектами

        Pen[] pens = new Pen[4];
        pens[0] = new Pen("Red");
        pens[1] = new Pen();
        pens[1].setColor("Blue");
        pens[2] = new Pen("Green");

        // 3rd Element
      Pen pen = new Pen("Black");
      pens[3] = pen;


        System.out.println("--------- Pens-------------");
        for (Pen val : pens) System.out.println(val);
        System.out.println(pens[0].getColor());
        System.out.println(pens[1].getColor());
        System.out.println(pens[2].getColor());


        // вывод информации о цветах через "for"

        for (Pen val : pens) System.out.println(val.getColor());

        // Creating New Massiv


        Pen[] pensLitteral = {new Pen("yelow"),
                              new Pen("braun")};
System.out.println("-------pensLitteral---------");
        for (Pen val : pensLitteral) System.out.println(val.getColor());


    }

}
