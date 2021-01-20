package Homework;
// 给定两个有序整数数组nums1 和 nums2， nums2 合并到 nums1 中， 使得 nums1 成为一个有序数组
import java.util.Arrays;

//给定两个有序整数数组num1 、nums2，将俩个数组合并到nums1中，使得nums1成为一个有序数组
public class test05 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[6];
        arr1[0] = 1;arr1[1] = 3;arr1[2] = 6;arr1[3] = 8;
        arr2[0] = 2;arr2[1] = 2;arr2[2] = 3;arr2[3] = 4;arr2[4] = 7;arr2[5] = 11;
        merge(arr1,4,arr2,6);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int len = m + n - 1;
        if ( n == 0 ){ // 如果nums2位空时，返回nums1
            return ;
        }
        if ( m == 0 ){ // 如果nums1位空时，将nums2中所有元素放入nums1中
            nums1[len--] = nums2[j--];
        }

        while ( i >= 0 && j >= 0){
            if (nums1[i] < nums2[j]){
                nums1[len] = nums2[j];
                len--;
                j--;
            }else {
                nums1[len] = nums1[i];
                len--;
                i--;
            }
        }

        while ( j >= 0 ){
            nums1[len] = nums2[j];
            len--;
            j--;
        }

        while ( i >= 0 ){
            nums1[len] = nums1[i];
            len--;
            i--;
        }
    }
}
