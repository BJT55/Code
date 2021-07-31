package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6,13,15,15,19,43,41,93,52};
        mergeSort(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }

    private static void mergeSort(int[] nums) {
        _mergeSort(nums,0,nums.length);
    }

    private static void _mergeSort(int[] nums, int left, int right) {
        if (right - left <= 1){
            return;
        }

        int mid = (left+right)/2;
        _mergeSort(nums,left,mid);
        _mergeSort(nums,mid,right);
        merge(nums,left,mid,right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[right-left];

        int index = 0;
        int i = left, j = mid;
        while (i < mid && j < right){
            if (nums[i] <= nums[j]){
                tmp[index++] = nums[i++];
            }
            else {
                tmp[index++] = nums[j++];
            }
        }

        while (i < mid){
            tmp[index++] = nums[i++];
        }
        while (j < right){
            tmp[index++] = nums[j++];
        }

        for (int k = 0; k < tmp.length; k++){
            nums[left+k] = tmp[k];
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
