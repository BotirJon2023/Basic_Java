package testExamples;


public class Main {


    public static void main(String[] args) {
        int result = TestExamples.sum(15, 21);
        int expected = 36;


        TestExamples.assertNumberEquals(result, expected);
    }

}
