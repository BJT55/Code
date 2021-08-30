public class Solution55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int i = 0; i < n; i++){
            if (i <= right){
                right = Math.max(right,i+nums[i]);
                if (right >= n-1){
                    return true;
                }
            }
        }
        return false;
    }
}