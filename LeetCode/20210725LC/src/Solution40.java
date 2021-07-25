import java.util.Arrays;

public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0){
            return new int[0];
        }

        return quickSort(arr,0,arr.length-1,k-1);
    }

    private int[] quickSort(int[] arr, int left, int right, int k) {
        int j = partition(arr,left,right);
        if (j == k){
            return Arrays.copyOf(arr,j+1);
        }

        return j > k ? quickSort(arr,left,j-1,k) : quickSort(arr,j+1,right,k);
    }

    // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边
    private int partition(int[] num, int left, int right) {
        int v = num[left];
        int i = left, j = right+1;
        while (true){
            while (++i <= right && num[i] < v);
            while (--j >= left && num[j] > v);

            if (i >= j){
                break;
            }

            int t = num[j];
            num[j] = num[i];
            num[i] = t;
        }
        num[left] = num[j];
        num[j] = v;
        return j;
    }
}
