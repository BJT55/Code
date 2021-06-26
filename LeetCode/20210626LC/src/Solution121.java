class Solution121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int i = 0, j = prices.length-1;
        while (i < j){
            if (prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > max){
                max = prices[i];
            }
        }
        return max - min;
    }
}