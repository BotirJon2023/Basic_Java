package lesson9;

public class LogicOperation {

    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("val1 < val2 " + (val1<val2));
        System.out.println("val1 == val2 " + (val1==val2));

        System.out.println("val1 < val2 && val1 == val4 " + (val1 < val2 && val1 == val4));
        System.out.println("val1 < val2 && val1 == val4 " + ((val1 < val2) && (val1 == val4)));

        System.out.println("val1 < val2 && val1 == val3 " + ((val1 < val2) && (val1 == val3)));


        System.out.println("val1 < val2 && val1 == val3 " + ((val1 < val2) && (val1 == val3))); //10<15 && 10==-5
        System.out.println("val1 < val2 && val1 == val4 && val1 > val3"
                + ((val1 < val2) && (val1 == val4)  && (val1 > val3))); //10<15 && 10==10 && 10>-5


        // логический оператор || (ИЛИ)
        System.out.println("val1 < val2 || val1 == val4 " + ((val1 < val2) || (val1 == val4))); //10<15 || 10==10
        System.out.println("val1 < val2 || val1 == val3 " + ((val1 < val2) || (val1 == val3))); //10<15 || 10==-5

        System.out.println("val1 < val2 || val1 == val4 || val1 > val3"
                + ((val1 < val2) || (val1 == val4)  || (val1 > val3))); //10<15 || 10==10 @@ 10>-5


// логический оператор ! (НЕ)
        System.out.println("");
        System.out.println("val1 < val2 " + (val1 < val2)); //10<15
        System.out.println("!(val1 < val2) " + !(val1 < val2)); //!(10<15)
        System.out.println("!(val1 > val2) " + !(val1 > val2)); //!(10>15)
        System.out.println("!(val1 < val2 && val1 == val4 && val1 > val3) "
                + !((val1 < val2) && (val1 == val4)  && (val1 > val3))); //!(10<15 && 10==10 && 10>-5)

        System.out.println("!(val1 < val2 || val2 == val4 || val1 <= val3) "
                + !((val1 < val2) || (val2 == val4)  || (val1 <= val3))); //!(10<15 || 15==10 || 10<=-5)

        System.out.println("!val1 < val2 || val2 == val4 || val1 <= val3 "
                + (!(val1 < val2) || (val2 == val4)  || !(val1 <= val3))); //!10<15 || 15==10 || !10<=-5


    }


}
