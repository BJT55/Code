class Solution198 {
    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < len; i++) {
            if (i >= 3) {
                dp[i] = Math.max(nums[i] + dp[i-2], nums[i] + dp[i-2]);
            }else {
                dp[i] = nums[i] + dp[i-2];
            }
        }
        return dp[len-1] > dp[len-2] ? dp[len-1] : dp[len-2];
    }
}