package sort;

/**
 * created by it_hushuai
 * 2019/11/14 22:29
 */

import java.util.Arrays;

/**
 * 希尔排序，快速将后面较小的数移动到前面
 */
public class ShellSort {
    public static void shellSort(int[] nums) {
        int compareVal = 0;
        int insertIndex = 0;
        for (int i = nums.length / 2; i > 0; i /= 2) {
            for (int j = i; j < nums.length; j++) {
                compareVal = nums[j];
                insertIndex = j - i;
                while (insertIndex >= 0 && compareVal < nums[insertIndex]) {
                    nums[insertIndex + i] = nums[insertIndex];
                    insertIndex -= i;
                }
                nums[insertIndex + i] = compareVal;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
