class Solution198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len <= 0){
            return 0;
        }

        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < len; ++i){
            if (i > 3){
                dp[i] = Math.max(dp[i] + dp[i-2],dp[i]+dp[i-3]);
            }else {
                dp[i] = dp[i] + dp[i-2];
            }
        }
        return dp[len-1] > dp[len-2] ? dp[len-1] : dp[len-2];
    }
}