package sort;

import java.util.Arrays;

/**
 * created by it_hushuai
 * 2019/12/15 20:24
 */
public class MergeSort {
//    public static void main(String[] args) {
//        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
//        int[] temp = new int[arr.length];
//        mergeSort(arr, 0, arr.length - 1, temp);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    //分解合并
//    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(arr, left, mid, temp);
//            mergeSort(arr, mid + 1, right, temp);
//            merge(arr, left, right, temp);
//        }
//    }
//
//    //合并
//    public static void merge(int[] arr, int left, int right, int[] temp) {
//        System.out.println("merge("+ left+", "+right+")");
//        int i = left;
//        int mid = (left + right) / 2;
//        int j = mid + 1;
//        int t = 0;
//        while (i <= mid && j <= right) {
//            if (arr[i] < arr[j]) {
//                temp[t++] = arr[i++];
//            } else {
//                temp[t++] = arr[j++];
//            }
//        }
//        //如果数组arr某半边已经比较完毕，则另半边以后的元素都追加到temp
//        while (i <= mid) {
//            temp[t++] = arr[i++];
//        }
//        while (j <= right) {
//            temp[t++] = arr[j++];
//        }
//
//        //将temp中的元素拷贝到原数组
//        t = 0;
//        int n = left;
//        while (n <= right) {
//            arr[n++] = temp[t++];
//        }
//        System.out.println(Arrays.toString(temp));
//        System.out.println("------------------");
//    }
}
