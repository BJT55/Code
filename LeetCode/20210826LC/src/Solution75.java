public class Solution75 {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int bound = nums[i];
            int j = i-1;
            for (; j >= 0 && nums[j] > bound; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = bound;
        }
    }
}
