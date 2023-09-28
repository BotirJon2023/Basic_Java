package UnitTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnitTest {

    public static void main(String[] args) {

        int[] arr = Units.getNumber();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println(arr[4]);

    }

}
