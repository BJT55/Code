package bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3,54,6,12,32,89,23,44,90};
        bubble(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
}
