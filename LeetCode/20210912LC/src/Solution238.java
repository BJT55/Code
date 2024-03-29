public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1]*nums[i-1];
        }

        int tmp = 1;
        for (int i = nums.length-1; i >= 0; i--){
            dp[i] *= tmp;
            tmp *= nums[i];
        }
        return dp;
    }
}
