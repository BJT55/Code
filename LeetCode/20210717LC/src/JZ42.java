public class JZ42 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; ++i){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }
    public int maxSubArray02(int[] nums) {
        int res = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            res = Math.max(res,max);
            if (max < 0){
                max = 0;
            }
        }
        return res;
    }
}
