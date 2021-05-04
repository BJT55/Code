class Solution55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightIndex = 0;
        for (int i = 0; i < n; ++i){
            if (i <= rightIndex){
                rightIndex = Math.max(rightIndex,i+nums[i]);
                if (rightIndex >= n-1){
                    return true;
                }
            }
        }
        return false;
    }
}