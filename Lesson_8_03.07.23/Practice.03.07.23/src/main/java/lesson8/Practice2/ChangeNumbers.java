package lesson8.Practice2;

public class ChangeNumbers {
    public static void main(String[] args) {
        changeWithTemp(10, 25);
        changeWithOutTemp(10, 25);

    }

    static void changeWithTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 = "+arg2);
        int tempArg = arg1;
        arg1 = arg2;
        arg2 = tempArg;
        System.out.println("После обмена: arg1 = "+arg1+" arg2 = "+arg2);


    }

    static void changeWithOutTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 = "+arg2);
        arg1 = arg1 + arg2;
        arg2 = arg1 - arg2;
        arg1 = arg1 - arg2;

        System.out.println("После обмена: arg1 = "+arg1+" arg2 = "+arg2);


    }


}
