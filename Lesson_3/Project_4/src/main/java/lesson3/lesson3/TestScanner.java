package lesson3.lesson3;

import java.util.Scanner;
public class TestScanner {
     public static void main(String[] args) {
         int myInt;
         Scanner myScanner = new Scanner(System.in);


             // целое число
             System.out.print("Input number = ");
             myInt = myScanner.nextInt();
             System.out.println("Output number = "+myInt);


             // строка
             Scanner myScannerString = new Scanner(System.in);
             String myStr;
             System.out.print("Input string = ");
             myStr = myScannerString.nextLine();
             System.out.println("Output string = "+myStr);

             // boolean
             Scanner myScannerBoolean = new Scanner(System.in);
             boolean myBool;
             System.out.print("Input boolean = ");
             myBool = myScannerBoolean.nextBoolean();
             System.out.println("Output boolean = "+myBool);

             //double
             Scanner myScannerDouble = new Scanner(System.in);
             double myDouble;
             System.out.print("Input double = ");
             myDouble = myScannerDouble.nextDouble();
             System.out.println("Output double = "+myDouble);

         }
}