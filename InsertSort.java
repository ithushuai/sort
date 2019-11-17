package sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * created by it_hushuai
 * 2019/11/10 17:50
 */
public abstract class InsertSort {
    public static void insertSort(int[] nums){
        int insertIndex = 0;
        int compareVal = 0;
        for (int i = 1; i < nums.length; i++) {
            compareVal = nums[i];
            insertIndex = i - 1;
            while (insertIndex>=0 && compareVal < nums[insertIndex]){//在未找到插入位置之前，依次将前的元素往后挪
                nums[insertIndex+1] = nums[insertIndex];
                insertIndex--;
            }
            //直到找到插入位置，将待插入元素插入到指定位置
            nums[insertIndex+1] = compareVal;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
//        int[] nums = new int[10000];
//        for (int i = 0; i < 10000; i++) {
//            nums[i] = (int)(Math.random()*100000);
//        }
//        Long start = System.currentTimeMillis();
//        insertSort(nums);
//        Long end = System.currentTimeMillis();
//        System.out.println("执行了" + (end - start) + "ms");
    }
}
