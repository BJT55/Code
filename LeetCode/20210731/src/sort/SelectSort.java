package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,7,9,5,8,4,6};
        select_2(nums);
        for (int n : nums){
            System.out.print(n+" ");
        }
    }

    private static void select_2(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    swap(nums,i,j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void select(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    swap(nums,i,j);
                }
            }
        }
    }
}
