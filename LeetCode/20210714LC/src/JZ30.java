public class JZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        int[] dp = new int[len];
        dp[0] = array[0];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < len; ++i){
            dp[i] = Math.max(array[i],dp[i-1]+array[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
