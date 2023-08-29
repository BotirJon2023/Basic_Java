package HomeWork12;

public class HomeWork12 {

    public static int findMaxSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 5, 6, -7, 8, 9, 10, 11, -12, 13, 14, 15, -16, 17, 18, 19, 20, -21, 22, 23, 24, 25, -26, 27, 28, 29, -30};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое положительных элементов массива: " + average);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 != 0) {
                sum += array[i];
            }
        }

        System.out.println("Сумма элементов, которые делятся на 3 и не делятся на 5: " + sum);

        int maxSum = findMaxSubarraySum(array);
        System.out.println("Наибольшая сумма подряд идущих элементов: " + maxSum);
    }
}
