class Solution309 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 0){
            return 0;
        }
        int[] have = new int[len];
        int[] no = new int[len];
        have[0] = -prices[0];
        no[0] = 0;
        for (int i = 1; i < len; i++) {
            have[i] = Math.max(have[i-1],i >= 2 ? no[i-2] - prices[i] : -prices[i]);
            no[i] = Math.max(no[i-1],have[i-1]+prices[i]);
        }
        return no[len-1];
    }
}