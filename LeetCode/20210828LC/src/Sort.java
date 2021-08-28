public class Sort {
    public static void main(String[] args) {
        int[] nums = {1,23,454,231,985,34};
        bubble(nums);
        for (int n : nums){
            System.out.print(n + " ");
        }
    }

    private static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
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
