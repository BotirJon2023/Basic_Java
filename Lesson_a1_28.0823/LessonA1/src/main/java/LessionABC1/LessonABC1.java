package LessionABC1;

public class LessonABC1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(new LessonABC1().sumArray(array));
    }

    private int sumArray(int[] array) {
        if (array.length == 0) {
            return 0;

        }
        int left = 0;
        int right = array.length - 1;
        int sum = 0;

        while (left < right) {
            if (left == right) {
                sum += array[left];
                break;
            } else {
                sum = array[left] + array[right];
                left++;
                right--;
            }
        }
        return sum;
    }
}
