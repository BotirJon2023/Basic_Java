package lesson3.lesson3;


    public class PracticeMain {
        static int myValueClass = 3;

        public static void main(String[] args) {
            int myInt2;
            myInt2 = 2;
            our();
            System.out.println(myInt2);
            System.out.println(myValueClass+1);

            Test myTest = new Test();
            myTest.run();
            System.out.println(myTest.myInTest + " - " + Test.myInStatic);
            Test.myInStatic = 999;
            Test myTest1 = new Test();
            myTest1.myInTest = 88;
            System.out.println(myTest1.myInTest + " - " + Test.myInStatic);
            Test myTest2 = new Test();
            myTest2.myInTest = 99;
            System.out.println(myTest2.myInTest + " - " + Test.myInStatic);

            System.out.println(myTest.myInTest + " - " + Test.myInStatic);
        }

        static void our() {
            int myInt = 1;
            System.out.println("I method our()");
            System.out.println(myInt);
            System.out.println(myValueClass+2);
        }
    }