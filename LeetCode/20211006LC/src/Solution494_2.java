public class Solution494_2 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums){
            sum += n;
        }

        int diff = sum-target;
        if (diff < 0 || diff%2 != 0){
            return 0;
        }

        int len = nums.length, neg = diff/2;
        int[][] dp = new int[len+1][neg+1];
        dp[0][0] = 1;
        for (int i = 1; i <= len; i++){
            int num = nums[i-1];
            for (int j = 0; j <= neg; j++){
                dp[i][j] = dp[i-1][j];
                if (j >= num){
                    dp[i][j] += dp[i-1][j-num];
                }
            }
        }
        return dp[len][neg];
    }
}
