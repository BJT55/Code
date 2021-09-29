import java.util.Arrays;

public class Solution416 {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int n : nums){
            sum += n;
        }

        if ( sum%2 != 0) return false;
        int weight = sum/2;  // 其中一方的重量
        int[] dp = new int[weight+1];
        dp[0] = 1;
        for (int n : nums){
            for (int i = weight; i >= n; i--){
                dp[i] += dp[i-n];
            }
        }
        return dp[weight] != 0;
    }
}
