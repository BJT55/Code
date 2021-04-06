class Solution63 {
    public int maxProfit(int[] prices) {
        int max= 0;
        for(int i = 0; i < prices.length-1; ++i){
            for(int j = i+1; j < prices.length; ++j){
                if(prices[j] - prices[i] > 0){
                    max = Math.max(max, prices[j]-prices[i]);
                }else {
                    break;
                }
            }
        }
        return max;
    }
}