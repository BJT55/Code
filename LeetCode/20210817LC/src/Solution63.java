public class Solution63 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int res = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }else {
                res = Math.max(res,prices[i]-min);
            }
        }
        return res;
    }

    public int maxProfit02(int[] prices) {
        if (prices.length < 2) return 0;

        int[] dp = new int[prices.length];
        dp[0] = 0;
        int cost = prices[0];
        for (int i = 1; i < prices.length; i++){
            dp[i] = Math.max(dp[i-1],prices[i]-cost);
            cost = Math.min(cost,prices[i]);
        }
        return dp[prices.length-1];
    }
}
