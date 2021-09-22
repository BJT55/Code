package select_sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90,0};
        selectSort(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    swap(nums,i,j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
