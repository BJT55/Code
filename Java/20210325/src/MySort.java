import java.util.Arrays;

public class MySort {

    // 归并排序：
    public static void mergeSort(int[] arr){
        _mergeSort(arr, 0, arr.length);
    }
    public static void _mergeSort(int[] arr, int left, int right){
        if (right - left <= 1){
            return;
        }

        int mid = (left + right) / 2;
        _mergeSort(arr, left, mid);
        _mergeSort(arr, mid, right);
        // 合并左右两个有序数组
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int[] tmp = new int[right - left]; // 临时数组，用来存放合并后的结果
        int tmpSize = 0;
        int l = left;
        int r = mid;
        while (l < mid && r < right){
            if (arr[l] <= arr[r]){
                tmp[tmpSize] = arr[l];
                tmpSize++;
                l++;
            }else{
                tmp[tmpSize] = arr[r];
                tmpSize++;
                r++;
            }
        }

        while (l < mid){
            tmp[tmpSize] = arr[l];
            tmpSize++;
            l++;
        }
        while (r < right){
            tmp[tmpSize] = arr[r];
            tmpSize++;
            r++;
        }
        for (int i = 0; i < tmp.length; ++i){
            arr[left+i] = tmp[i];
        }
    }

    //非递归归并排序
    public static void mergeSortByLoop(int[] arr){
        // 外层循环
        // 第一次是将长度为 1 的有序数组两两合并
        // 第二次是将长度为 2 的有序数组两两合并
        // 第三次是将长度为 4 的有序数组两两合并
        for (int gap = 1; gap < arr.length; gap *= 2){
            // 里层循环
            // 让两个相邻的数组合并
            for (int i = 0; i < arr.length; i += 2*gap){
                int left = i;
                int mid = i + gap;
                if (mid >= arr.length){
                    mid = arr.length;
                }
                int right = i + 2*gap;
                if (right >= arr.length){
                    right = arr.length;
                }
                merge(arr,left,mid,right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,6,3,6,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
