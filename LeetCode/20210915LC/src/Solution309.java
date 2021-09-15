public class Solution309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int len = prices.length;
        // dp[i][0] : 手上持有的最大股票
        // dp[i][1] : 手上不持有股, 并且处于冷却期中的累计最大收益
        // dp[i][2] : 手上持有股, 并且不在冷静期中的累计最大收益
        int[][] dp = new int[len][3];
        dp[0][0] = -prices[0];
        for (int i = 1; i < len; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2]-prices[i]);
            dp[i][1] = dp[i-1][0] + prices[i];
            dp[i][2] = Math.max(dp[i-1][1], dp[i-1][2]);
        }
        return Math.max(dp[len-1][1], dp[len-1][2]);
    }
}
