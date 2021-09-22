package quick_sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90,0};
        quickSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void quickSort(int[] nums) {
        _quickSort(nums,0,nums.length-1);
    }

    private static void _quickSort(int[] nums, int i, int j) {
        if (i >= j){
            return;
        }

        int left = i, right = j;
        int tmp = nums[left];
        while (left < right){
            while (left < right && nums[right] > tmp){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < tmp){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = tmp;
        _quickSort(nums,i,left-1);
        _quickSort(nums,left+1,j);
    }

}
