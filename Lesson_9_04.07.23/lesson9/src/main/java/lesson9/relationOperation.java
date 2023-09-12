package lesson9;

public class relationOperation {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("Val1 == val2 " + (val1==val2));
        System.out.println("Val1 == val4 " + (val1==val4));

        System.out.println("Val1 != val2 " + (val1!=val2));
        System.out.println("Val1 != val4 " + (val1!=val4));

// оператор >
        System.out.println("Val1 > val2 " + (val1>val2));
        System.out.println("Val1 > val4 " + (val1>val4));
        System.out.println("Val1 > val3 " + (val1>val3));

// оператор <
        System.out.println("Val1 < val2 " + (val1<val2));
        System.out.println("Val1 < val4 " + (val1<val4));
        System.out.println("Val1 < val3 " + (val1<val3));

// оператор >=
        System.out.println("Val1 >= val2 " + (val1>=val2));
        System.out.println("Val1 >= val4 " + (val1>=val4));
        System.out.println("Val1 >= val3 " + (val1>=val3));

// оператор <=
        System.out.println("Val1 <= val2 " + (val1<=val2));
        System.out.println("Val1 <= val4 " + (val1<=val4));
        System.out.println("Val1 <= val3 " + (val1<=val3));

double dbValue = 10.5;
System.out.println();
System.out.println("val1 >= dbValue "+ (val1>=dbValue));
System.out.println("val1 <= dbValue "+ (val1<=dbValue));

        System.out.println("val1 >= (int)dbValue "+ (val1>=(int)dbValue));


        System.out.println("val1 >= (int)dbValue "+ (val1>=(int)dbValue));
        System.out.println("Округление double bdValue = "+ Math.round(dbValue));
        System.out.println("Преобразование double bdValue = "+ (int)dbValue);


    }
}
