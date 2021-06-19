import java.util.Arrays;

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2){
            return len;
        }
        int[] dp = new int[len];
        Arrays.fill(dp,1);

        int res = dp[0];
        for (int i = 1; i < len; i++) {
            // 在 i 之前比他小的, 则可以在后面形成一个更长的子序列
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}