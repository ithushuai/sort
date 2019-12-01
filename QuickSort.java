package sort;

import java.util.Arrays;

/**
 * created by it_hushuai
 * 2019/12/1 16:22
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5, 0};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end) {//在调用quickSort时，start为0，end为数组长度减一
        int i = start;
        int j = end;
        int temp = nums[start];
        while (i < j) {
            while (i < j && nums[j] >= temp) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] <= temp) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = temp;//当i==j时，i就是基准数应该摆放的位置
        if (i > start + 1) {
            //为什么要start+1？因为如果是i>start，有可能是i刚好比start大1，此时就没有必要进行快排，因为i和start位置的俩元素必然有序
            quickSort(nums, start, i - 1);
        }
        if (j < end - 1) {//end-1原理同上
            quickSort(nums, j + 1, end);
        }
    }
}
