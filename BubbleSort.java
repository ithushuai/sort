package sort;

import java.util.Arrays;
import java.util.Date;

/**
 * created by it_hushuai
 * 2019/11/5 22:05
 */
public class BubbleSort {
    /**
     * 未优化，常规冒泡排序
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {//3,1,4,2,5
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {//
            for (int j = 0; j < nums.length - i - 1; j++) {//n-1,n-2,n-3,...,1 = [(n-1)+1]*(n-1)/2=1/2n^2-1/2n=O(n^2)
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 优化后
     *
     * @param nums
     */
    public static void bubbleSort2(int[] nums) {//3,1,4,2,5
        int temp;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {//
            for (int j = 0; j < nums.length - i - 1; j++) {//n-1,n-2,n-3,...,1 = [(n-1)+1]*(n-1)/2=1/2n^2-1/2n=O(n^2)
                if (nums[j] > nums[j + 1]) {
                    flag = true;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (!flag) {//这一轮没有进行任何交换
                break;
            } else {
                flag = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        Long start = System.currentTimeMillis();
        bubbleSort(nums);
//        bubbleSort2(nums);
        Long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(nums) + "执行了" + (end - start) + "ms");
    }
}
