package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6};
        bubble_2(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length-1-i; j++){
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    private static void bubble_2(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length-1-i; j++){
                if (nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }


}
