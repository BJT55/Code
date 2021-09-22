package merge_sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90,0};
        mergeSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] nums) {
        _mergeSort(nums,0,nums.length);
    }

    private static void _mergeSort(int[] nums, int left, int right) {
        if (right - left <= 1){
            return;
        }

        int mid = left + (right-left)/2;
        _mergeSort(nums,left,mid);
        _mergeSort(nums,mid,right);
        merge(nums,left,mid,right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] res = new int[right-left];
        int index = 0;


        int i = left, j = mid;
        while (i < mid && j < right){
            if (nums[i] < nums[j]){
                res[index++] = nums[i++];
            }else {
                res[index++] = nums[j++];
            }
        }

        while (i < mid){
            res[index++] = nums[i++];
        }
        while (j < right){
            res[index++] = nums[j++];
        }

        for (int k = 0; k < res.length; k++){
            nums[k+left] = res[k];
        }
    }

}
