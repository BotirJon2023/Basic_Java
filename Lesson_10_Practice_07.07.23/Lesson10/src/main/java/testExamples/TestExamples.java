package testExamples;

public class TestExamples {
    public static int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }
    public static void assertNumberEquals(int currentNumber, int expectedNumber) {
        if (currentNumber == expectedNumber) System.out.println("test was successful");
        else {
            System.err.println("This number aren't equal \n");
            System.out.println();
            System.out.println("Current: "+currentNumber);
            System.out.println("Current: "+expectedNumber);

    }

}

}
