//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//设计一个算法来计算你所能获取的最大利润。
//你可以尽可能地完成更多的交易（多次买卖一支股票）。
//注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

public class test122 {
    public static void main(String[] args) {
        Solution122 s = new Solution122();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}

//官方：
class Solution122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i + 1] > prices[i]) {
                max = max + prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}


/*
// 自己：（速度内存差不多）
class Solution122 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }else {
                max = max + prices[i] - min;
                min = prices[i];
            }
        }
        return max;
    }
}*/
