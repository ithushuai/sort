package sort;

import java.util.Arrays;

/**
 * created by it_hushuai
 * 2019/11/6 22:06
 */
public class SelectSort {
    public static void main(String[] args) {
//        int[] nums = new int[10000];
//        for (int i = 0; i < 10000; i++) {
//            nums[i] = (int)(Math.random()*100000);
//        }
//        Long start = System.currentTimeMillis();
//        selectSort(nums);
//        Long end = System.currentTimeMillis();
//        System.out.println("执行了" + (end - start) + "ms");
        int[] nums = {3, 1, 2, 5, 4};
        selectSort2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums) {//3,1,4,2,5
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void selectSort2(int[] nums) {//3,1,4,2,5
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
